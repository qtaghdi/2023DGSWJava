package com.example.projpsmperform3;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ListView<String> lvHistory;

    @FXML
    private ListView<String> lvJobQ;

    @FXML
    private TextField txtJob;

    @FXML
    void onAddClick(ActionEvent event) {
        // 해야할 일은 변수에 넣어준다
        String lJob = this.txtJob.getText();
        // 값이 있을 때 서버에 등록
        if(lJob.length() > 0){
            CServer objServer = new CServer();
            objServer.mSend(lJob);
            // 등록된 해야할 일들을 화면에 뿌려준다
            this.lvJobQ.getItems().setAll(CServer.mJobQ);
        }
        // 없으면 오류 메시지
        else {
            Alert objAlert = new Alert(Alert.AlertType.WARNING, "해야할 일 입력하기", ButtonType.CLOSE);
            objAlert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // 쓰레드 정의 하기
        Thread thClient = new Thread(()->{

            // CServer 오브젝트 선언
            CServer objServer = new CServer();

            // 계속반복하기
            while(true){

                // 1.서버오브젝트에서 일을 하나 가져온다.
                String lJob = objServer.mReceive();

                // 2. 가져온 일이 정당하면
                if(lJob.length()>0)
                {
                    // 화면 갱신한다.(쓰레드 방식)
                    Platform.runLater(()->{
                        //한 일 리스트뷰(lvJobHistory)에 추가하기
                        this.lvHistory.getItems().add(lJob);
                        // CServer.jobQ 내용을 리스트뷰 lvjobQ에 넣어준다.
                        this.lvJobQ.getItems().setAll(CServer.mJobQ);
                    });
                }
                // 3. 2초 기다린다.
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thClient.setName("threadClient");
        thClient.start();
    }
}
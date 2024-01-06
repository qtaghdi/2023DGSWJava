package com.example.projbsethreadfx;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.List;

public class HelloController {

    @FXML
    private ListView<String> lvJobs;

    @FXML
    private ListView<String> lvJobsWrk1;

    @FXML
    private ListView<String> lvJobsWrk2;

    @FXML
    private ListView<String> lvJobsWrk3;

    @FXML
    private TextField txtJobNm;

    @FXML
    void mAddJob(ActionEvent event) {
        CJobs.mGetJobNum(this.txtJobNm.getText());
        this.mShowList(CJobs.mArrJobs, this.lvJobs);
    }

    private static CWorker objWorker1 = new CWorker("준환");

    @FXML
    void mWork1(ActionEvent event) {
        //스레드
        Thread th1 = new Thread(() -> {
            objWorker1.mWork();
            this.mShowList(objWorker1.mJobHistory, this.lvJobsWrk1);
            this.mShowList(CJobs.mArrJobs, this.lvJobs);
            //준환이 MAXJOBCNT 번 만큼 일 시키기
            while(objWorker1.mJobHistory.size() < objWorker1.MAXJOBCNT);
            //한번 일하고 500ms sleep
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        objWorker1.mWork();
        this.mShowList(objWorker1.mJobHistory, this.lvJobsWrk1);
        this.mShowList(CJobs.mArrJobs, this.lvJobs);
    }

    @FXML
    void mWork2(ActionEvent event) {
        CWorker objWorker2 = new CWorker("2번");
        objWorker2.mWork();
    }

    @FXML
    void mWork3(ActionEvent event) {
        CWorker objWorker3 = new CWorker("3번");
        objWorker3.mWork();
        this.mShowList(objWorker3.mJobHistory, this.lvJobsWrk1);

    }
    void mShowList(List<String> pArrSrc, ListView pLv){
        Platform.runLater(() -> {
            ObservableList lObsLst = pLv.getItems();
            lObsLst.setAll(pArrSrc);
            pLv.setItems(lObsLst);
        });
    }

}


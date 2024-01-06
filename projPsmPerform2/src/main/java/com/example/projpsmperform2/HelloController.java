package com.example.projpsmperform2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private CheckBox chkMoring;

    @FXML
    private CheckBox chkNight;

    @FXML
    private CheckBox chkNoon;

    @FXML
    private ComboBox<String> cmbCondition;

    @FXML
    private DatePicker dtDate;

    @FXML
    private ListView<String> lvHistory;

    @FXML
    void onAddClick(ActionEvent event) {
        // 선택 날짜
        String lDate = this.dtDate.getValue().toString();
        // 약 복용 여부
        String lMedicine = this.chkMoring.isSelected()?"[O]":"[X]";
        lMedicine += (this.chkNoon.isSelected()?"[O]":"[X]");
        lMedicine += (this.chkNight.isSelected()?"[O]":"[X]");

        // 오늘의 컨디션
        String lCondition = this.cmbCondition.getValue();
        // 한 줄로 만들기
        String lRow = String.format("%10s %20s %10s",lDate,lMedicine,lCondition);
        // 한 줄을 리스트 뷰에 넣기
        this.lvHistory.getItems().add(lRow);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // 오늘 날짜 설정
        this.dtDate.setValue(LocalDate.now());
        // 콤보 박스 채우기
        this.cmbCondition.getItems().setAll("best", "so so", "bad");
    }
}

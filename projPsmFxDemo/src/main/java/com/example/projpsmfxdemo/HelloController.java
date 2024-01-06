package com.example.projpsmfxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label lblResult;

    @FXML
    private TextField txtA;

    @FXML
    private TextField txtB;

    @FXML
    private TextField txtC;

    @FXML
    void mAdd(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText());
        int lb = Integer.valueOf(this.txtB.getText());
        int lc = Integer.valueOf(this.txtC.getText());

        String lResult = String.valueOf(la+lb+lc);


        this.lblResult.setText(lResult);
    }
    @FXML
    void mMin(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText());
        int lb = Integer.valueOf(this.txtB.getText());
        int lc = Integer.valueOf(this.txtC.getText());

        String lResult = String.valueOf(la-lb-lc);

        this.lblResult.setText(lResult);
    }
    @FXML
    void mDev(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText());
        int lb = Integer.valueOf(this.txtB.getText());
        int lc = Integer.valueOf(this.txtC.getText());

        String lResult = String.valueOf(la/lb/lc);

        this.lblResult.setText(lResult);
    }
    @FXML
    void mMul(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText());
        int lb = Integer.valueOf(this.txtB.getText());
        int lc = Integer.valueOf(this.txtC.getText());

        String lResult = String.valueOf(la*lb*lc);

        this.lblResult.setText(lResult);
    }
    @FXML
    void mMax(ActionEvent event) {
        int la = Integer.valueOf(this.txtA.getText());
        int lb = Integer.valueOf(this.txtB.getText());
        int lc = Integer.valueOf(this.txtC.getText());

        int lMax = la > lb ? (la > lc ? la : lc) : (lb > lc ? lb : lc);

        String lResult = String.valueOf(lMax);
        this.lblResult.setText(lResult);
    }

}

package com.example.msjavafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class NhanbenhController {
    @FXML
    private Button bntluu;

    @FXML
    private CheckBox cbcmnd;

    @FXML
    private CheckBox cbmsbn;

    @FXML
    private TextField txtCmnd;

    @FXML
    private TextArea txtDiachi;

    @FXML
    private TextField txtHoten;

    @FXML
    private TextField txtMsbn;
    public Button getBntluu(){
        return bntluu;
    }
    public TextField getTxtMsbn(){
        return txtMsbn;
    }
    public TextField getTxtCmnd(){
        return txtCmnd;
    }
    public TextField getTxtHoten(){
        return txtHoten;
    }
    public TextArea getTxtDiachi(){
        return txtDiachi;
    }

}
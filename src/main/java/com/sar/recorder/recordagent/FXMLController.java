package com.sar.recorder.recordagent;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {

    @FXML
    private void runRecordButton(ActionEvent event) {
        System.out.println("RecordButton");
    }

    @FXML
    private void runStopButton(ActionEvent event) {
        System.out.println("StopButton");
    }

    @FXML
    private void setRecordName(ActionEvent event) {
        System.out.println("RecordName");
    }

    @FXML
    private void loadInfoPanel(ActionEvent event) {
        System.out.println("InfoPanel");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}

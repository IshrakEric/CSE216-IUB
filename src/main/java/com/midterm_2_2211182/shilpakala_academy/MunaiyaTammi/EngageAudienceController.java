package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class EngageAudienceController {

    @FXML
    private Button addEventButton;

    @FXML
    private Button deleteEventButton;

    @FXML
    private TableColumn<?, ?> eventDateColumn;

    @FXML
    private DatePicker eventDatePicker;

    @FXML
    private TableColumn<?, ?> eventDescriptionColumn;

    @FXML
    private TextArea eventDescriptionField;

    @FXML
    private TableColumn<?, ?> eventNameColumn;

    @FXML
    private TextField eventNameField;

    @FXML
    private TableView<?> eventsTable;

    @FXML
    void onDeleteEventButtonClick(ActionEvent event) {

    }

    @FXML
    void onaddEventButtonClick(ActionEvent event) {

    }

}
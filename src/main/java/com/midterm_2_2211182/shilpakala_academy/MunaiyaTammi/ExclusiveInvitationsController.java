package com.midterm_2_2211182.shilpakala_academy.MunaiyaTammi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

import java.time.LocalDate;

public class ExclusiveInvitationsController {

    @FXML
    private Button acceptButton;

    @FXML
    private Button declineButton;

    @FXML
    private TableColumn<Donor, LocalDate> eventDateColumn;

    @FXML
    private TableColumn<Donor, String> eventLocationColumn;

    @FXML
    private TableColumn<Donor, String> eventNameColumn;

    @FXML
    private TextArea invitationDetailsArea;

    @FXML
    private TableView<String> invitationsTable;

    @FXML
    void onacceptButtonClick(ActionEvent event) {

    }

    @FXML
    void ondeclineButtonClick(ActionEvent event) {

    }

}

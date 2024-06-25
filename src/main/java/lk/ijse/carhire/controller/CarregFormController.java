package lk.ijse.carhire.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CarregFormController {
    @FXML
    private ComboBox<?> cmbAvailable;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private TableView<?> tblCars;

    @FXML
    private TextField txtCarRegNo;

    @FXML
    private TextField txtMake;

    @FXML
    private TextField txtModel;
}

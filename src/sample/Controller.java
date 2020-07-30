package sample;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TableView table;

    @FXML
    private TableColumn<Numberus, String> c1;

    @FXML
    private TableColumn<Numberus, String> c2;

    @FXML
    private TableColumn<Numberus, String> c3;

    @FXML
    private TableColumn<Numberus, String> c4;

    @FXML
    private TableColumn<Numberus, String> c5;

    @FXML
    private Label maxL;

    @FXML
    private Label minL;


    private ObservableList<Numberus> numberuses = FXCollections.observableArrayList();


    public void generate() {
        if (numberuses.size() > 0) {
            numberuses.clear();
        }
        for (int i = 0; i < 10; i++) {
            numberuses.add(new Numberus());
        }

        table.setItems(numberuses);
        table.refresh();


    }


    public void execute() {
        float max = numberuses.get(0).getC1();
        float min = numberuses.get(0).getC1();
        for (Numberus n : numberuses) {
            for (float x : n.getNums()) {
                if (max < x) {
                    max = x;
                }
                if (min < x) {
                    min = x;
                }
            }
        }

        if (max / min > 10) {
            for (Numberus n : numberuses) {
                for (float x : n.getNums()) {
                    if (x < 0) {
                        x = Math.abs(x);
                    }
                }
            }
        }

        maxL.setText(String.format("Максимальный элемент: %f", max));
        minL.setText(String.format("Минимальный элемент: %f", min));


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        c1.setCellValueFactory(new PropertyValueFactory<>("c1"));
        c2.setCellValueFactory(new PropertyValueFactory<>("c2"));
        c3.setCellValueFactory(new PropertyValueFactory<>("c3"));
        c4.setCellValueFactory(new PropertyValueFactory<>("c4"));
        c5.setCellValueFactory(new PropertyValueFactory<>("c5"));
    }


}



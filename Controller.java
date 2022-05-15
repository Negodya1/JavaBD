package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Node;

import java.net.*;
import java.io.*;
import java.nio.ByteBuffer;

import client.db.DataBase;
import javafx.scene.layout.VBox;

public class Controller {
    DataBase _db;

    @FXML
    VBox datalist;

    public Controller() {
        _db = new DataBase();
        updateView();
    }

    public void updateView() {
        datalist = _db.select("SELECT * FROM boardgames");
    }
}
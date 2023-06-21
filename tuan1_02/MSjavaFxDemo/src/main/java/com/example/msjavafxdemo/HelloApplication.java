package com.example.msjavafxdemo;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private ObservableList<Patient> patientList;
    @Override
    public void start(Stage stage) throws IOException {
        // Khởi tạo danh sách bệnh nhân

        // Load file FXML cho giao diện Khambenh
        FXMLLoader khambenhLoader = new FXMLLoader(getClass().getResource("khambenh.fxml"));
        Parent khambenhRoot = khambenhLoader.load();
        FXMLLoader nhanbenhLoader = new FXMLLoader(getClass().getResource("nhanbenh.fxml"));
        Parent nhanbenhRoot = nhanbenhLoader.load();
        NhanbenhController nhanbenhController = nhanbenhLoader.getController();
        Scene khambenhScene = new Scene(khambenhRoot);
        Scene nhanbenhScene = new Scene(nhanbenhRoot);
        stage.setTitle("Bac si kham benh");
        stage.setScene(khambenhScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
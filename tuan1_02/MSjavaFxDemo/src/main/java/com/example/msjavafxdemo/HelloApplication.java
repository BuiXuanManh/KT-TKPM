package com.example.msjavafxdemo;

import com.example.msjavafxdemo.entity.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
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
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("msjavafxdemo");
        EntityManager em= emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        try{
            tr.commit();
        }catch (Exception e){
            e.printStackTrace();
            tr.rollback();
        }
        // Khởi tạo danh sách bệnh nhân

        // Load file FXML cho giao diện Khambenh
        FXMLLoader khambenhLoader = new FXMLLoader(getClass().getResource("khambenh.fxml"));
        Parent khambenhRoot = khambenhLoader.load();
        FXMLLoader nhanbenhLoader = new FXMLLoader(getClass().getResource("nhanbenh.fxml"));
        Parent nhanbenhRoot = nhanbenhLoader.load();
        NhanBenhController nhanbenhController = nhanbenhLoader.getController();
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
package com.example.msjavafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class KhambenhController {
    @FXML
    private Button btnGoiKham;

    @FXML
    private Button btnUpdate;

    @FXML
    private TextField txtCmnd;

    @FXML
    private TextArea txtDiachi;

    @FXML
    private TextField txtHoten;

    @FXML
    private ListView<Patient> txtListView;

    @FXML
    private TextField txtMsbn;
    public ListView<Patient> getListViewPatients() {
        return txtListView;
    }
    @FXML
    private void initialize() {
        // Khởi tạo và hiển thị danh sách bệnh nhân chờ khám
        // Đồng thời gán sự kiện khi một bệnh nhân được chọn

        // Sự kiện khi bệnh nhân được chọn
        txtListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            // Hiển thị thông tin bệnh nhân được chọn lên các trường nhập liệu
            // (txtMsbn, txtCmnd, txtHoten, txtDiachi)
        });

        // Sự kiện khi nhấn nút "Khám"
        btnGoiKham.setOnAction(event -> {
            // Lấy thông tin bệnh nhân được chọn từ các trường nhập liệu
            // Gửi thông báo đến máy tính của bác sĩ về việc khám bệnh bệnh nhân này
        });

        // Sự kiện khi nhấn nút "Cập nhật"
        btnUpdate.setOnAction(event -> {
            // Lấy thông tin bệnh nhân từ các trường nhập liệu
            // Cập nhật thông tin bệnh nhân trong cơ sở dữ liệu
        });
    }
}

package com.example.msjavafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NhanBenhController {
    @FXML
    private TextField txtMsbn;
    @FXML
    private CheckBox cbmsbn;
    @FXML
    private TextField txtCmnd;
    @FXML
    private CheckBox cbcmnd;
    @FXML
    private TextField txtHoten;
    @FXML
    private TextField txtDiachi;
    @FXML
    private Button bntluu;

    @FXML
    private void luuThongTin() {
        String msbn = txtMsbn.getText();
        String cmnd = txtCmnd.getText();
        String hoTen = txtHoten.getText();
        String diaChi = txtDiachi.getText();

        // Kết nối cơ sở dữ liệu
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ten_cua_database", "ten_nguoi_dung", "mat_khau");

            // Thực hiện truy vấn SQL để lưu thông tin bệnh nhân
            String sql = "INSERT INTO benh_nhan (ma_so, cmnd, ho_ten, dia_chi) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, msbn);
            statement.setString(2, cmnd);
            statement.setString(3, hoTen);
            statement.setString(4, diaChi);
            statement.executeUpdate();

            // Đóng kết nối
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Xử lý ngoại lệ và thông báo lỗi nếu cần
        }
    }
}
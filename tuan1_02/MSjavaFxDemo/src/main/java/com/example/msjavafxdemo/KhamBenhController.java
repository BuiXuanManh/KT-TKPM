package com.example.msjavafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KhamBenhController {
    @FXML
    private ListView<String> txtListView;
    @FXML
    private Button btnGoiKham;
    @FXML
    private TextField txtMsbn;
    @FXML
    private TextField txtCmnd;
    @FXML
    private TextField txtHoten;
    @FXML
    private TextArea txtDiachi;
    @FXML
    private Button btnUpdate;

    @FXML
    private void initialize() {
        // Kết nối cơ sở dữ liệu
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/khambenh", "root", "");

            // Lấy danh sách bệnh nhân chờ khám từ cơ sở dữ liệu
            String sql = "SELECT * FROM benh_nhan";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Hiển thị danh sách bệnh nhân lên ListView
            while (resultSet.next()) {
                String hoTen = resultSet.getString("ho_ten");
                txtListView.getItems().add(hoTen);
            }

            // Đóng kết nối
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Xử lý ngoại lệ và thông báo lỗi nếu cần
        }
    }

    @FXML
    private void goiKham() {
        // Lấy thông tin bệnh nhân được chọn trong ListView
        String selectedPatient = txtListView.getSelectionModel().getSelectedItem();
        // ...
        // Thực hiện xử lý khi gọi khám bệnh
        // ...
    }

    @FXML
    private void updateInfo() {
        String msbn = txtMsbn.getText();
        String cmnd = txtCmnd.getText();
        String hoTen = txtHoten.getText();
        String diaChi = txtDiachi.getText();

        // Kết nối cơ sở dữ liệu
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ten_cua_database", "ten_nguoi_dung", "mat_khau");

            // Thực hiện truy vấn SQL để cập nhật thông tin bệnh nhân
            String sql = "UPDATE benh_nhan SET cmnd = ?, ho_ten = ?, dia_chi = ? WHERE ma_so = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, cmnd);
            statement.setString(2, hoTen);
            statement.setString(3, diaChi);
            statement.setString(4, msbn);
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

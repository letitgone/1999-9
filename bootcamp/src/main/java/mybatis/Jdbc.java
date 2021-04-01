package mybatis;

import java.sql.*;

/**
 * @Author ZhangGJ
 * @Date 2021/04/02 06:23
 */
public class Jdbc {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://8.140.171.253:3306/hifm_center?characterEncoding=utf8", "root",
                    "123456");
            String sql = "select * from center_users where username = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "q001");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String phone = resultSet.getString("user_phone");
                String email = resultSet.getString("email");
                System.out.println("phone: " + phone + ", email: " + email);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }
    }
}

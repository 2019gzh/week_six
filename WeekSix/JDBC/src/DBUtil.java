import java.sql.*;
public class DBUtil {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/week_six?characterEncoding=utf8";
    public static final String USER = "root";
    public static final String PASSWORD = "131426";
    static {
        try {
            Class.forName(DRIVER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connection get_Conn() throws SQLException {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        return conn;
    }
    public static void get_CloseConn(ResultSet rs, PreparedStatement pstm, Connection conn) throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (pstm != null) {
            pstm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
    public static void main(String[] args) {
        try {
            get_Conn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

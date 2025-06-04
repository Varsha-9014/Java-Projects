package xyz;
import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to database
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");

            // 3. Prepare REPLACE SQL statement
            String insertSQL = "REPLACE INTO stds(id, name) VALUES (?, ?)";
            pstmt = con.prepareStatement(insertSQL);

            // 4. Data to insert
            Object[][] stds = {
                {1, "varsha"},
                {2, "thanuja"},
                {3, "geethika"},
                {4, "honey"},
                {5, "lucky"},
                {6, "manasa"}
            };

            // 5. Insert data
            for (Object[] student : stds) {
                pstmt.setInt(1, (int) student[0]);
                pstmt.setString(2, (String) student[1]);
                pstmt.executeUpdate();
            }

            // 6. Retrieve and display data
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM stds");

            System.out.println("Student List:");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 7. Close resources
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }
}

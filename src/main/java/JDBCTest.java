//import java.sql.*;
//import com.mysql.cj.jdbc.Driver;
//import java.util.ArrayList;
//import java.util.List;
//
//public class JDBCTest {
//
//    public static List<String> getAlbumNames(){
//        List<String> albumNames = new ArrayList<>();
//        try {
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
//                    "root",
//                    "codeup"
//            );
//            Statement statement = connection.createStatement();
//
//            // Execute statement
//            ResultSet ts = statement.executeQuery("SELECT name FROM codeup_test_db.albums");
//        } catch (SQLException sqle){
//            sqle.printStackTrace();
//        }
//        return albumsNames;
//    }
//}

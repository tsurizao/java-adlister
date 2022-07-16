import com.mysql.cj.api.Session;
import com.mysql.cj.jdbc.Driver;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        } catch (SQLException sqle) {
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db.ads");
            while (rs.next()) {
                Ad ad = new Ad(rs.getLong("id"), rs.getLong("user_id"), rs.getString("title"), rs.getString("description"));
                ads.add(ad);
            }
        } catch (SQLException sqle) {
            throw new RuntimeException("Error connecting to db", sqle);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
//        String title = ad.getTitle();
//        String description = ad.getDescription();
//        String query = "INSERT INTO adlister_db.ads (title, description) VALUES ('" + title + ", " + description + "')";
//        try {
//            Statement statement = connection.createStatement();
//            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
//            ResultSet rs = statement.getGeneratedKeys();
//            rs.next();
//            long key = rs.getLong(1);
//        } catch (SQLException sqle){
//            throw new RuntimeException("Error connecting to db", sqle);
//        }

        return null;
    }
}

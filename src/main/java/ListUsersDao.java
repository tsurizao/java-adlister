import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import com.mysql.cj.jdbc.Driver;

public class ListUsersDao implements Users {

    private Connection connection;
    private List<User> users;

    public ListUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        } catch (SQLException sqle) {
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }

    @Override
    public List<User> all() {
        List<User> users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db.users");
            while (rs.next()) {
                User user = new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("password")
                );
                users.add(user);
            }
        } catch (SQLException sqle) {
            throw new RuntimeException("Error connecting to db", sqle);
        }
        return users;
    }

    @Override
    public void insert(User user) {
        String username = user.getUsername();
        String email = user.getEmail();
        String password = user.getPassword();
        String query = "INSERT INTO adlister_db.users (username, email, password) VALUES ('" + username + "', '" + email + "', '" + password + "')";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            long key = rs.getLong(1);
        } catch (SQLException sqle){
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }

    private List<User> generateUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(
                1,
                "user1",
                "user1@email.com",
                "password"
        ));
        users.add(new User(
                2,
                "user2",
                "user2@email.com",
                "password"
        ));
        return users;
    }
}

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class QuotesDao implements Quotes {
    private Connection connection;

    public QuotesDao() {

        try {
            DriverManager.registerDriver(new Driver());
            Config config = new Config();
            connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
        } catch (SQLException sqle) {
            throw new RuntimeException("Error connecting to db", sqle);
        }
    }

    @Override
    public List<Quote> all() {
        Authors authorsDao = new AuthorsDao();
        List<Author> authors = authorsDao.all();
        List<Quote> quotes = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM codeup_test_db.quotes");
            while (rs.next()){
                long author_id = rs.getLong("author_id");
                Author quoteAuthor = null;
                for(Author author: authors){
                    if(author.getId() == author_id){
                        quoteAuthor = author;
                    }
                }
                Quote quote = new Quote(rs.getLong("id"), rs.getString("content"), quoteAuthor);
                quotes.add(quote);
            }
        } catch (SQLException sqle) {
            throw new RuntimeException("Error connecting to db", sqle);
        }
        return quotes;
    }
    @Override
    public void insert(Quote quote) {

    }
}

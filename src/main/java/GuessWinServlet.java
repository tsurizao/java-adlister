import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/win")
public class GuessWinServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String winner = "You win!";
        req.setAttribute("win-or-lose", winner);
        req.getRequestDispatcher("guess-results.jsp").forward(req, resp);
    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
    int randomNumber = 1 + (int) (Math.random() * ((3 - 1) + 1));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userGuess = req.getParameter("guess");
        if (Integer.parseInt(userGuess) == randomNumber) {
            resp.sendRedirect("/win");
        } else {
            resp.sendRedirect("/lose");
        }
    }
}
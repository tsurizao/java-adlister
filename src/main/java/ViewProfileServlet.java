import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = (String) request.getSession().getAttribute("user");
        String password = (String) request.getSession().getAttribute("password");
        boolean invalidUser = (user == null || password == null || user.trim().equals("") || password.trim().equals(""));
        if (invalidUser) {
            response.sendRedirect("/login");
        } else {
            request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response);
        }
    }
}
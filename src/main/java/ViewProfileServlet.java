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
        boolean validUser;
        if(user == null || password == null || user.trim().equals("") || password.trim().equals("")){
            response.sendRedirect("/login");
        } else if (user.equals("admin") && password.equals("password")) {
            validUser = true;
            request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response);
        }
    }
}

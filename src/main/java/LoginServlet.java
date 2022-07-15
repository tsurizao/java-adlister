import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = (String) request.getSession().getAttribute("user");
        String password = (String) request.getSession().getAttribute("password");
        if (user == null) {
            request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        } else if (user.equals("admin") && password.equals("password")){
            response.sendRedirect("/profile");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        boolean validUser = (user.equals("admin") && password.equals("password"));
        if (validUser) {
            request.getSession().setAttribute("user", user);
            request.getSession().setAttribute("password", password);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FavoriteCityServlet", urlPatterns = "/favCity")
public class FavoriteCityServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String html = "<h1>Enter your favorite city:<h1>";
        html += "<form method='POST'>" +
                "<h3><label for='city'>City</label></h3>" +
                "<input name='city' type='text' placeholder='Enter your favorite city'>" +
                "<button>Submit</button>" +
                "</form>";
        out.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String city = req.getParameter("city");
        System.out.println(city);
    }
}
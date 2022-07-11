import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/pies")
public class PiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> pies = new ArrayList<>(Arrays.asList(
                "key lime",
                "cherry",
                "huckleberry",
                "pecan",
                "pumpkin"
        ));
        req.setAttribute("pies", pies);
        req.getRequestDispatcher("/pies.jsp").forward(req, resp);
    }
}

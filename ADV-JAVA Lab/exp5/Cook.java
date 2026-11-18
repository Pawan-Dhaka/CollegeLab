import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Cook extends HttpServlet {

    public void doGet(HttpServletRequest req,
                      HttpServletResponse res)
                      throws ServletException, IOException {

        Cookie c1 = new Cookie("cookie1", req.getParameter("fn"));
        Cookie c2 = new Cookie("cookie2", req.getParameter("ln"));

        c1.setMaxAge(60 * 60 * 24);
        c2.setMaxAge(60 * 60 * 24);

        res.addCookie(c1);
        res.addCookie(c2);

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<center>");
        out.println("<font color='red'>SAMPLE COOKIES</font>");
        out.println("</center>");

        out.println("<font color='green'>");
        out.println("FIRST NAME: " + req.getParameter("fn"));
        out.println("</font><br>");

        out.println("<font color='blue'>");
        out.println("LAST NAME: " + req.getParameter("ln"));
        out.println("</font>");
    }
}
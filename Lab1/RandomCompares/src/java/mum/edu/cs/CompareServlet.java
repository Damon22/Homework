package mum.edu.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class CompareServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        int control = (int)(10 * Math.random());
        int first = (int)(10 * Math.random());
        int second = (int)(10 * Math.random());
        int third = (int)(10 * Math.random());

        System.out.println("Hello world---------------");
        System.out.println("Control result:" + control);

        req.setAttribute("control", control);
        req.setAttribute("first", first);
        req.setAttribute("second", second);
        req.setAttribute("third", third);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}

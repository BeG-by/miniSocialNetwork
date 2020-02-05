package by.company.beg.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayDeque;

@WebServlet(name = "ClearChatServlet", urlPatterns = "/clear")
public class ClearChatServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayDeque<String> chat = (ArrayDeque<String>) req.getServletContext().getAttribute("chat");
        chat.clear();
        resp.sendRedirect("/acc");
    }
}

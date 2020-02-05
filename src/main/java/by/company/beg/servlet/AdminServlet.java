package by.company.beg.servlet;

import by.company.beg.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/admin", name = "AdminServlet")
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<User> userList = (List<User>) getServletContext().getAttribute("userList");
        List<String> list = new ArrayList<>();

        for (User currentUser : userList) {
            list.add(currentUser.getEmail());
        }

        req.setAttribute("users", list);

        req.getRequestDispatcher("/admin.jsp").forward(req, resp);


    }
}

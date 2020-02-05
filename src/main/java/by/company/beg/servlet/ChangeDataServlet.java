package by.company.beg.servlet;

import by.company.beg.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/change", name = "ChangeDataServlet")
public class ChangeDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/change.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");
        String oldPassword = req.getParameter("oldPassword");
        String newPassword = req.getParameter("newPassword");


        User currentUser = (User) req.getSession().getAttribute("currentUser");


        if (!firstName.equals("")) {
            currentUser.setFirstName(firstName);
        }

        if (!lastName.equals("")) {
            currentUser.setLastName(lastName);
        }

        if (Pattern.matches("\\d+", age)) {
            currentUser.setAge(Integer.parseInt(age));
        }

        if (!oldPassword.equals("") && oldPassword.equals(currentUser.getPassword())) {
            currentUser.setPassword(newPassword);
        }

        resp.sendRedirect("/acc");

    }

}

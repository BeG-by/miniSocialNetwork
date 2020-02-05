package by.company.beg.servlet;

import by.company.beg.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

@WebServlet(urlPatterns = "/reg", name = "RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String age = req.getParameter("age");
        String sex = req.getParameter("sex");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        boolean isSex = true;

        if (sex == null) {
            resp.sendRedirect("/errors/sexError.jsp");
            return;
        }

        if (!Pattern.matches("\\d+", age) || age.equals("0")) {
            resp.sendRedirect("/errors/numberError.jsp");
            return;
        }


        if (sex.equals("women")) {
            isSex = false;
        }

        List<User> userList = (List<User>) getServletContext().getAttribute("userList");

        for (User currentUser : userList) {
            if (email.equals(currentUser.getEmail())) {
                resp.sendRedirect("/errors/regError.jsp");
                return;
            }
        }

        User user = new User(firstName, lastName, Integer.parseInt(age), email, password, isSex);
        userList.add(user);
        resp.sendRedirect("/auth");

    }
}

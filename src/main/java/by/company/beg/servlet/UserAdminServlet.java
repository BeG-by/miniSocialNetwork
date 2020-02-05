package by.company.beg.servlet;

import by.company.beg.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/user", name = "UserAdminServlet")
public class UserAdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");

        List<User> userList = (List<User>) getServletContext().getAttribute("userList");
        User user = null;


        for (User currentUser : userList) {
            if (currentUser.getEmail().equals(email)) {
                user = currentUser;
            }
        }

        String sex = "Мужчина";

        if (!user.isSex()) {
            sex = "Женщина";
        }

        req.setAttribute("firstName", user.getFirstName());
        req.setAttribute("lastName", user.getLastName());
        req.setAttribute("age", user.getAge());
        req.setAttribute("sex", sex);
        req.setAttribute("email", user.getEmail());
        req.setAttribute("password", user.getPassword());

        req.getRequestDispatcher("/user.jsp").forward(req, resp);

    }
}

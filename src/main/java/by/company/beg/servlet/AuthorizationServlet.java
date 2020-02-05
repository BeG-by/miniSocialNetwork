package by.company.beg.servlet;

import by.company.beg.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/auth", name = "AuthorizationServlet")
public class AuthorizationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/main.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        List<User> userList = (List<User>) getServletContext().getAttribute("userList");
        User user = new User(login, password);

        for (User currentUser : userList) {
            if (user.equals(currentUser)) {
                req.getSession().setAttribute("currentUser", currentUser);
                if (currentUser.isAdmin()) {
                    req.getSession().setAttribute("flag", true);
                }
                resp.sendRedirect("/acc");
                return;
            }
        }

        resp.sendRedirect("/errors/authError.jsp");


    }
}

package by.company.beg.servlet;

import by.company.beg.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;

@WebServlet(urlPatterns = "/acc", name = "AccountServlet")
public class AccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User currentUser = (User) req.getSession().getAttribute("currentUser");
        req.getSession().setAttribute("firstName", currentUser.getFirstName());
        req.getSession().setAttribute("lastName", currentUser.getLastName());
        req.getSession().setAttribute("age", currentUser.getAge());
        req.getSession().setAttribute("email", currentUser.getEmail());

        String sex = "Мужчина";

        if (!currentUser.isSex()) {
            sex = "Женщина";
        }

        req.getSession().setAttribute("sex", sex);

        req.getRequestDispatcher("/account.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayDeque<String> chat = (ArrayDeque<String>) req.getServletContext().getAttribute("chat");

        String message = req.getParameter("message");
        User currentUser = (User) req.getSession().getAttribute("currentUser");
        String firstName = currentUser.getFirstName();
        String lastName = currentUser.getLastName();

        Date dateNow = new Date();
        SimpleDateFormat currentDate = new SimpleDateFormat("h:mm:ss");
        String time = currentDate.format(dateNow);
        String resultMessage = time + " " + firstName + " " + lastName + " : " + message;

        chat.add(resultMessage.trim());

        resp.sendRedirect("/acc");

    }
}

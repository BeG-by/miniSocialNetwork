package by.company.beg.listener;

import by.company.beg.entity.User;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

@WebListener()
public class Listener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    public Listener() {
    }


    public void contextInitialized(ServletContextEvent sce) {

        User admin = new User("admin", "admin", 100, "admin@gmail.com", "admin", true, true);
        User user1 = new User("user1", "user1", 10, "user1@gmail.com", "user", true);
        User user2 = new User("user2", "user2", 20, "user2@gmail.com", "user", false);
        User user3 = new User("user3", "user3", 30, "user3@gmail.com", "user", false);
        User user4 = new User("user4", "user4", 35, "user4@gmail.com", "user", true);
        User user5 = new User("user5", "user5", 40, "user5@gmail.com", "user", true);
        User user6 = new User("user6", "user6", 40, "dsfs@gmail.com", "user", true);
        User user7 = new User("user7", "user7", 40, "ddd@gmail.com", "user", true);
        User user8 = new User("user8", "user8", 40, "dddd5@gmail.com", "user", true);
        User user9 = new User("Петр", "Петрович", 25, "d@gmail.com", "d", true);
        User user10 = new User("user10", "user10", 40, "user5@gmail.com", "user", false);
        List<User> list = new ArrayList<>();
        list.add(admin);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);
        list.add(user10);

        sce.getServletContext().setAttribute("userList", list);
        sce.getServletContext().setAttribute("chat", new ArrayDeque<>());

    }

    public void contextDestroyed(ServletContextEvent sce) {
    }

    public void sessionCreated(HttpSessionEvent se) {
    }

    public void sessionDestroyed(HttpSessionEvent se) {
    }


}

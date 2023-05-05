package com.sudang;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * WebServlet 어노테이션 방식
 *
 * @author sudang
 * @date   2023/05/05
**/
@WebServlet(name = "myServlet", urlPatterns = "/my-servlet")
public class MyServlet extends HttpServlet {
    private final Logger log = Logger.getLogger(MyServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        resp.setContentType("text/html");

        try (PrintWriter out = resp.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>My Servlet</h1>");
            out.println("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() {
        log.info("init() executed...");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) {
        log.info("service() executed...");
    }

    @Override
    public void destroy() {
        log.info("destroy() executed...");
    }
}

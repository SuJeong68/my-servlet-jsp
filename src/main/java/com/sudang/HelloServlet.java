package com.sudang;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * [web.xml]에 Servlet 설정 추가 방식
 *
 * @author sudang
 * @date   2023/05/05
**/
public class HelloServlet extends HttpServlet {
    private final Logger log = Logger.getLogger(HelloServlet.class.getName());
    private String message;

    @Override
    public void init() {
        log.info("Message initializing...");
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        resp.setContentType("text/html");

        try (PrintWriter out = resp.getWriter()) {
            out.println("<html><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("<h1>" + message + "</h1>");
            out.println("<h1>" + message + "</h1>");
            out.println("<h1>" + message + "</h1>");
            out.println("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

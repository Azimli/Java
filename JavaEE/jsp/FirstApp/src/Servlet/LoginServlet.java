package Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebServlet( name ="/Servlet.LoginServlet", urlPatterns = {"/Servlet.LoginServlet"})
public class LoginServlet extends javax.servlet.http.HttpServlet {


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

      /* String email= request.getParameter("email");
        String password =request.getParameter("password");

        if (email.equals("azimlishakir@gmail.com") && password.equals("123456")){
            HttpSession session = request.getSession();
            session.setAttribute("email",email);
            response.sendRedirect("register.jsp");
        }else {
            response.sendRedirect("index.jsp");
        }*/

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

}

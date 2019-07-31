package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet(name = "/Servlet.RegisterServlet", urlPatterns = "/Servlet.RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/jsp");



        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String father_name = request.getParameter("father_name");
        String email =request.getParameter("email");
        Integer phone = Integer.parseInt(request.getParameter("age"));
        String password1 = request.getParameter("password1");
        String password2 =request.getParameter("password2");
        String photo =request.getParameter("photo");


        if ((name != null) && (surname != null) && (father_name!= null) && (phone!=null) && (password1!=password1) && (photo!= null) && (password1==password2)){
            try {
                Connection connection = DatabaseConnection.initializeDatabase();
                PreparedStatement st = connection.prepareStatement("insert into student(id,name,surname,father_name,email,phone,password,file_name) values (?,?,?,?,?,?,?,?)");
                st.setInt(1,Integer.valueOf(request.getParameter("id")));
                st.setString(2,request.getParameter(name));
                st.setString(3,request.getParameter(surname));
                st.setString(4,request.getParameter(father_name));
                st.setString(5,request.getParameter(email));
                st.setInt(6,Integer.valueOf(request.getParameter(String.valueOf(phone))));
                st.setString(6,request.getParameter("password"));
                st.setString(7,request.getParameter(photo));

                st.executeUpdate();
                st.close();
                connection.close();

                PrintWriter out = response.getWriter();
                out.println("<html><body><b>Successfully Inserted"
                        + "</b></body></html>");

            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            response.sendRedirect("index.jsp");
            System.out.println("Xanalari duzgun doldurmadiniz");
        }
    }

}

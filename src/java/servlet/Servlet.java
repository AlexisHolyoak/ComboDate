/*
 * Developed by: Alexis Peralta Holyoak.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Model;

/**
 *
 * @author peral
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    @Override
  protected void doPost(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    
    // Datos
        Model model = new Model();
    
    // Proceso
    
    // Forward
    request.setAttribute("model", model);
        RequestDispatcher rd;
    rd = request.getRequestDispatcher("result.jsp");
    rd.forward(request, response);
  }

}

package vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Menu", urlPatterns = {"/Menu"})
public class Menu extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
                                
           
            // Formulario Menuout.println("
            out.println("<!Doctype html>");
            out.println("<html>");
            out.println("<head> ");
            out.println("<title>MENU</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos02.css\"> ");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> MENU </h1>");
            out.println("<table id=tabla border = \"0\">");
            out.println("<form method=\"POST\">");
            out.println("<div id=\"contenidoLogin\">");
            out.println("<div>");
            out.println("<tr>");
            out.println("<td><input class=\"botones\" type=\"submit\" id=\"btnRegistrarEmpleado\" value=\"Empleado\"></td>");
            out.println("<td><input class=\"botones\" type=\"submit\" id=\"btnRegistrarProveedor\" value=\"Proveedor\"></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><input class=\"botones\" type=\"submit\" id=\"btnRegistrarProducto\" value=\"producto\"></td>");
            out.println("<td><input class=\"botones\" type=\"submit\" id=\"btnRegistrarVenta\" value=\"Venta\"></td>");
            out.println("</tr>");
            out.println("</div>");
            out.println("</div>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
            



           
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

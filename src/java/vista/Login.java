package vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.vo.EmpleadoVO;
import modelo.dao.EmpleadoDAO;
import modelo.conexion.conexion;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.conexion.conexion;
import vista.Menu;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection cnn =  null;
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("<form method=\"POST\">");
            out.println("<div id =\"contenidoLogin\">");
            out.println("<div>");
            out.println("<label for=\"documento\">Documento:</label>");
            out.println("<input type = \"text\" id =\"documento\" name=\"8\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<label for=\"clave\">Clave:</label>");
            out.println("<input type = \"password\" id =\"contrasena\" name=\"contrasena\">");
            out.println("</div>");
            out.println("<div>");
            out.println("<input class = \"botones\" type=\"reset\" id = \"btnCancelar\" value=\"Cancelar\">");
            out.println("<input class = \"botones\" type=\"submit\" id = \"btnAceptar\" value=\"Aceptar\">");
            out.println("</div>");
            out.println("</div>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");

            try {
                cnn = conexion.getconxeionDB();
                            if (request.getParameter("documento") != null && request.getParameter("contrasena") != null) {
                EmpleadoVO vo = new EmpleadoVO();
                vo.setDocumento(request.getParameter("documento"));
                vo.setContrasena(request.getParameter("contrasena"));
                try {
                    boolean validado = validarlogin(cnn, vo);
                    if (validado == true){
                       response.sendRedirect("Menu");                       
                    }else{
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('Usuario o Contraseña Incorrecta');");
                        out.println("</script>");                        
                    }
                    
                } catch (SQLException ex) {
                }
                

            }
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

    public boolean validarlogin(Connection cnn, EmpleadoVO vo) throws SQLException {
        EmpleadoDAO dao = new EmpleadoDAO(cnn);
        boolean validado = dao.validarUsuario(vo);
        return validado;
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

package modelo.conexion;
import java.sql.*;
import java.util.HashSet;


public class conexion {
    
    
    public static Connection getconxeionDB()throws ClassNotFoundException, SQLException{
        String servidor = "localhost";
        String puertoMySQL = "3306";
        String usuario ="DKNOOS";
        String clave ="DFPM-900320";
        String baseDatos ="controlfactura";
        Class.forName("com.mysql.jdbc.Driver");
        
        
        Connection cnn = DriverManager.getConnection("jdbc:mysql://"+servidor+":"+puertoMySQL+"/"+baseDatos, usuario, clave);
        cnn.setAutoCommit(false);
        return cnn;
        
    }

    public static void cerrarconexion(Connection cnn) throws SQLException{
        cnn.commit();
        cnn.close();
    }
    
    public static void cancelartrans(Connection cnn) throws SQLException{
        cnn.rollback();
        cnn.close();
    }
}

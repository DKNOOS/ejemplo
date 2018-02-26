package modelo.dao;
import modelo.vo.EmpleadoVO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class EmpleadoDAO {
    Connection cnn;
    
    public EmpleadoDAO(Connection cnn){
        this.cnn = cnn;    
    }
    
     public void insertar(EmpleadoVO vo) throws SQLException{
        PreparedStatement sentencia = 
                cnn.prepareStatement("INSERT INTO empleado (tipodocumento,documento,nombre,apellidos,telefono,fechanac,contrasena) VALUES(?,?,?,?,?,?,?)");
        int i=1;
        sentencia.setString(i++, vo.getTipodocumento());
        sentencia.setString(i++, vo.getDocumento());
        sentencia.setString(i++, vo.getNombre());
        sentencia.setString(i++, vo.getApellidos());
        sentencia.setString(i++, vo.getTelefono());
        sentencia.setDate(i++, new java.sql.Date(vo.getFechanac().getTime()));
        sentencia.setString(i++, vo.getContrasena());
        sentencia.executeUpdate();
    }
    
    public void borrar(EmpleadoVO vo) throws SQLException{
        PreparedStatement sentencia = cnn.prepareStatement("DELETE empleado WHERE idempleado = ?");
        sentencia.setInt(1, vo.getIdempleado());
        sentencia.executeUpdate();
    }
    
    public void modificar(EmpleadoVO vo) throws SQLException{
        PreparedStatement sentencia = cnn.prepareStatement("UPDATE empleado SET tipodocumento=?,documento=?,nombre=?,apellidos=?,telefono=?,fechanac=?,contrasena=?"
                + "WHERE idcontacto = ?");
        int i=1;
        sentencia.setString(i++, vo.getTipodocumento());
        sentencia.setString(i++, vo.getDocumento());
        sentencia.setString(i++, vo.getNombre());
        sentencia.setString(i++, vo.getApellidos());
        sentencia.setString(i++, vo.getTelefono());
        sentencia.setDate(i++, new java.sql.Date(vo.getFechanac().getTime()));
        sentencia.setString(i++, vo.getContrasena());        
        sentencia.setInt(i++, vo.getIdempleado());
        sentencia.executeUpdate();
    }
    
    public List<EmpleadoVO> consultar() throws SQLException{
        List<EmpleadoVO> listaEmpleados = new ArrayList<>();
        
        PreparedStatement sentencia = cnn.prepareStatement("SELECT * FROM empleado");
        ResultSet resultado =  sentencia.executeQuery();
        while (resultado.next()) {
            EmpleadoVO voTemp = new EmpleadoVO();
            voTemp.setIdempleado(resultado.getInt("idempleado"));
            voTemp.setTipodocumento(resultado.getString("tipodocumento"));
            voTemp.setDocumento(resultado.getString("documento"));
            voTemp.setNombre(resultado.getString("nombre"));
            voTemp.setApellidos(resultado.getString("apellidos"));
            voTemp.setTelefono(resultado.getString("telefono"));
            voTemp.setFechanac(resultado.getDate("fechanac"));
            voTemp.setContrasena(resultado.getString("contrasena"));
            listaEmpleados.add(voTemp);
        }
        if(listaEmpleados.size() > 0){
            return listaEmpleados;
        }else{
            return null;
        }        
    }
    
    public boolean validarUsuario(EmpleadoVO vo) throws SQLException{       
        PreparedStatement sentencia = cnn.prepareStatement("SELECT * FROM empleado WHERE documento = ?");
        sentencia.setString(1, vo.getDocumento());
        ResultSet resultado =  sentencia.executeQuery();
        if(resultado.next()){
            EmpleadoVO voTemp = new EmpleadoVO();
            voTemp.setDocumento(resultado.getString("documento"));
            voTemp.setContrasena(resultado.getString("contrasena"));
            return voTemp.getDocumento().equals(vo.getDocumento()) &&  voTemp.getContrasena().equals(vo.getContrasena());
        }
        
        return false;
    } 
    
    
}

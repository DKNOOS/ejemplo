package modelo.vo;
import java.util.Date;

public class FacturaVO {

    /**
     * @return the idfactura
     */
    public int getIdfactura() {
        return idfactura;
    }

    /**
     * @param idfactura the idfactura to set
     */
    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    /**
     * @return the fechafac
     */
    public Date getFechafac() {
        return fechafac;
    }

    /**
     * @param fechafac the fechafac to set
     */
    public void setFechafac(Date fechafac) {
        this.fechafac = fechafac;
    }

    /**
     * @return the idproveedor
     */
    public int getIdproveedor() {
        return idproveedor;
    }

    /**
     * @param idproveedor the idproveedor to set
     */
    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    /**
     * @return the idempleado
     */
    public int getIdempleado() {
        return idempleado;
    }

    /**
     * @param idempleado the idempleado to set
     */
    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    private int idfactura;
    private Date fechafac;
    private int idproveedor;
    private int idempleado;
    private String descripcion;
    
    
}

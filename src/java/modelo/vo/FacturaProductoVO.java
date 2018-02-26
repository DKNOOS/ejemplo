package modelo.vo;
import java.util.Date;

public class FacturaProductoVO {

    /**
     * @return the idfacturaproducto
     */
    public int getIdfacturaproducto() {
        return idfacturaproducto;
    }

    /**
     * @param idfacturaproducto the idfacturaproducto to set
     */
    public void setIdfacturaproducto(int idfacturaproducto) {
        this.idfacturaproducto = idfacturaproducto;
    }

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
     * @return the idproducto
     */
    public int getIdproducto() {
        return idproducto;
    }

    /**
     * @param idproducto the idproducto to set
     */
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the lote
     */
    public String getLote() {
        return lote;
    }

    /**
     * @param lote the lote to set
     */
    public void setLote(String lote) {
        this.lote = lote;
    }

    /**
     * @return the fechavenlote
     */
    public Date getFechavenlote() {
        return fechavenlote;
    }

    /**
     * @param fechavenlote the fechavenlote to set
     */
    public void setFechavenlote(Date fechavenlote) {
        this.fechavenlote = fechavenlote;
    }
    private int idfacturaproducto;
    private int idfactura;
    private int idproducto;
    private int cantidad;
    private String lote;
    private Date fechavenlote;
}

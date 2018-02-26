package modelo.vo;
import java.util.Date;
public class ProductoVO {

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
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the fechalanz
     */
    public Date getFechalanz() {
        return fechalanz;
    }

    /**
     * @param fechalanz the fechalanz to set
     */
    public void setFechalanz(Date fechalanz) {
        this.fechalanz = fechalanz;
    }

    /**
     * @return the tamano
     */
    public String getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the preciound
     */
    public double getPreciound() {
        return preciound;
    }

    /**
     * @param preciound the preciound to set
     */
    public void setPreciound(double preciound) {
        this.preciound = preciound;
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
    
    private int idproducto;
    private String producto;
    private String marca;
    private Date fechalanz;
    private String tamano;
    private double preciound;
    private String descripcion;
    
    
    
}

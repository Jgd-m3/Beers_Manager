package acc_r3_javier_gonzalez.bbdd;
// Generated 14-dic-2016 19:54:29 by Hibernate Tools 4.3.1



/**
 * R3Ventas generated by hbm2java
 */
public class R3Ventas  implements java.io.Serializable {


     private int vid;
     private R3Cerveza r3Cerveza;
     private R3Tiendas r3Tiendas;
     private String vcliente;
     private short vcantidad;

    public R3Ventas() {
    }

	
    public R3Ventas(int vid, String vcliente, short vcantidad) {
        this.vid = vid;
        this.vcliente = vcliente;
        this.vcantidad = vcantidad;
    }
    public R3Ventas(int vid, R3Cerveza r3Cerveza, R3Tiendas r3Tiendas, String vcliente, short vcantidad) {
       this.vid = vid;
       this.r3Cerveza = r3Cerveza;
       this.r3Tiendas = r3Tiendas;
       this.vcliente = vcliente;
       this.vcantidad = vcantidad;
    }
   
    public int getVid() {
        return this.vid;
    }
    
    public void setVid(int vid) {
        this.vid = vid;
    }
    public R3Cerveza getR3Cerveza() {
        return this.r3Cerveza;
    }
    
    public void setR3Cerveza(R3Cerveza r3Cerveza) {
        this.r3Cerveza = r3Cerveza;
    }
    public R3Tiendas getR3Tiendas() {
        return this.r3Tiendas;
    }
    
    public void setR3Tiendas(R3Tiendas r3Tiendas) {
        this.r3Tiendas = r3Tiendas;
    }
    public String getVcliente() {
        return this.vcliente;
    }
    
    public void setVcliente(String vcliente) {
        this.vcliente = vcliente;
    }
    public short getVcantidad() {
        return this.vcantidad;
    }
    
    public void setVcantidad(short vcantidad) {
        this.vcantidad = vcantidad;
    }




}


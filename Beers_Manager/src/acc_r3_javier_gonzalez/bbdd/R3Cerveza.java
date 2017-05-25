package acc_r3_javier_gonzalez.bbdd;
// Generated 14-dic-2016 19:54:29 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * R3Cerveza generated by hbm2java
 */
public class R3Cerveza  implements java.io.Serializable {


     private int cid;
     private String cnombre;
     private BigDecimal cgraduacion;
     private BigDecimal cprecio;
     private Set r3Ventases = new HashSet(0);

    public R3Cerveza() {
    }

	
    public R3Cerveza(int cid, String cnombre) {
        this.cid = cid;
        this.cnombre = cnombre;
    }
    public R3Cerveza(int cid, String cnombre, BigDecimal cgraduacion, BigDecimal cprecio, Set r3Ventases) {
       this.cid = cid;
       this.cnombre = cnombre;
       this.cgraduacion = cgraduacion;
       this.cprecio = cprecio;
       this.r3Ventases = r3Ventases;
    }
   
    public int getCid() {
        return this.cid;
    }
    
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getCnombre() {
        return this.cnombre;
    }
    
    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }
    public BigDecimal getCgraduacion() {
        return this.cgraduacion;
    }
    
    public void setCgraduacion(BigDecimal cgraduacion) {
        this.cgraduacion = cgraduacion;
    }
    public BigDecimal getCprecio() {
        return this.cprecio;
    }
    
    public void setCprecio(BigDecimal cprecio) {
        this.cprecio = cprecio;
    }
    public Set getR3Ventases() {
        return this.r3Ventases;
    }
    
    public void setR3Ventases(Set r3Ventases) {
        this.r3Ventases = r3Ventases;
    }




}


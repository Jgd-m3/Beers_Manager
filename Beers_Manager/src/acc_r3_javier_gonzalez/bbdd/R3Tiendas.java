package acc_r3_javier_gonzalez.bbdd;
// Generated 14-dic-2016 19:54:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * R3Tiendas generated by hbm2java
 */
public class R3Tiendas  implements java.io.Serializable {


     private int tid;
     private String tnombre;
     private String ttipo;
     private String tciudad;
     private Set r3Ventases = new HashSet(0);

    public R3Tiendas() {
    }

	
    public R3Tiendas(int tid, String tnombre, String ttipo) {
        this.tid = tid;
        this.tnombre = tnombre;
        this.ttipo = ttipo;
    }
    public R3Tiendas(int tid, String tnombre, String ttipo, String tciudad, Set r3Ventases) {
       this.tid = tid;
       this.tnombre = tnombre;
       this.ttipo = ttipo;
       this.tciudad = tciudad;
       this.r3Ventases = r3Ventases;
    }
   
    public int getTid() {
        return this.tid;
    }
    
    public void setTid(int tid) {
        this.tid = tid;
    }
    public String getTnombre() {
        return this.tnombre;
    }
    
    public void setTnombre(String tnombre) {
        this.tnombre = tnombre;
    }
    public String getTtipo() {
        return this.ttipo;
    }
    
    public void setTtipo(String ttipo) {
        this.ttipo = ttipo;
    }
    public String getTciudad() {
        return this.tciudad;
    }
    
    public void setTciudad(String tciudad) {
        this.tciudad = tciudad;
    }
    public Set getR3Ventases() {
        return this.r3Ventases;
    }
    
    public void setR3Ventases(Set r3Ventases) {
        this.r3Ventases = r3Ventases;
    }




}



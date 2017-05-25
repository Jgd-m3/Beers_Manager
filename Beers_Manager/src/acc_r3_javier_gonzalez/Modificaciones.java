/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acc_r3_javier_gonzalez;

import acc_r3_javier_gonzalez.bbdd.R3Cerveza;
import org.hibernate.Session;

/**
 *Clase que implementa los metodos necesarios para insertar Cervezas en la BD.
 * @author M3z
 */
public class Modificaciones {
    
    /**
     * Metodo para insertar una cerveza.
     * @param cerve 
     */
    public static void insertaCerve(R3Cerveza cerve){
        Session s = Conexion.getSession();
        Conexion.transacciona();
        
        s.save(cerve);
        
        Conexion.commit();
        Conexion.desconecta();
    }
    
    /**
     * Metodo para modificar una Cerveza.
     * @param cerve 
     */
    public static void modificaCerve(R3Cerveza cerve){
        
        Session s = Conexion.getSession();
        Conexion.transacciona();
        
        s.update(cerve);
        
        Conexion.commit();
        Conexion.desconecta();
    }
    
    
    /**
     * Metodo Para eliminar una cerveza de determinado ID pasado por parametro.
     * @param id (int) - id de la cerveza
     * @return true si se borró, false si no pudo borrarla.
     */
    public static boolean eliminar(int id){
        boolean exito = false;
        Session s = Conexion.getSession();
        Conexion.transacciona();
        
        R3Cerveza cerve = (R3Cerveza) s.get(R3Cerveza.class, id);
        if(cerve != null){
            s.delete(cerve);
            exito = true;
        }
        Conexion.commit();
        Conexion.desconecta();
        
        return exito;        
    }
}

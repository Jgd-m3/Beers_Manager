/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acc_r3_javier_gonzalez;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author M3z
 */
public class Conexion {
    
    /**
     * Atributos Static de la clase conexion.
     */
    private static final SessionFactory sF = buildSF();
    private static Session s;
    private static Transaction tx;
    
    /**
     * Getter de una Session para operar.
     * @return (Session) - Session actual
     */
    public static Session getSession(){ return (s = sF.openSession()); }
    /**
     * Metodo que cierra la Session actual.
     */
    public static void desconecta(){ s.close(); }
    /**
     * Metodo que inicia una transaccion para modificar tablas.
     */
    public static void transacciona(){ tx = s.beginTransaction(); }
    /**
     * Metodo que cierra la transaccion con un commit.
     */
    public static void commit(){ tx.commit();}
    /**
     * Metodo que destruye la SessionFactory, solo se usa al salir del programa.
     */
    public static void destruyeSessionFactory(){ sF.close(); }
    

    /**
     * Metodo para asegurar la misma SessionFactory durante toda la ejecucion.
     * @return 
     */
    private static SessionFactory buildSF(){
            try {
                return new Configuration().configure().buildSessionFactory(
                        new StandardServiceRegistryBuilder().configure().build());
            } catch (Throwable e) {
                System.err.printf("Error al iniciar la SessionFactory de miUtil:%n> %s%n", e);
                throw new ExceptionInInitializerError(e);
            }
        }
}

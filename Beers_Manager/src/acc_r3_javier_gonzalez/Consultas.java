/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acc_r3_javier_gonzalez;

import acc_r3_javier_gonzalez.bbdd.Calculado;
import acc_r3_javier_gonzalez.bbdd.R3Cerveza;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 * 
 * 
 * @author M3z
 */
public class Consultas {
    
    /**
     * Metodo que devuelve una List con los resultados de la consulta con campo calculado.
     * Suma las cervezas de la misma marca que ha comprado cada Cliente.
     * @return (list<Calculado>) - lista con los datos a mostrar.
     */
    public static List consultaCalculado(){
       
        Session s = Conexion.getSession();
        String hql = "select new acc_r3_javier_gonzalez.bbdd.Calculado("
                + "v.vcliente, sum(v.vcantidad), c.cnombre) "
                + "from R3Ventas as v, R3Cerveza as c "
                + "where v.r3Cerveza.cid = c.cid "
                + "group by v.vcliente, c.cnombre order by v.vcliente";
        
        Query q = s.createQuery(hql);
        List<Calculado> l = q.list();
        Conexion.desconecta();
       return l;
    }
    
    /**
     * Metodo que devuelve una List con los resultados de la consulta con join.
     * Muestra datos de las tres tablas.
     * @return (List<Join>) - lista con los datos a mostrar.
     */
    public static List consultaJoin(){
        Session s = Conexion.getSession();
        String hql = "select new acc_r3_javier_gonzalez.bbdd.Join("
                + "v.vcliente, t.tnombre, c.cnombre, v.vcantidad) "
                + "from R3Ventas as v, R3Cerveza as c, R3Tiendas as t "
                + "where v.r3Cerveza.cid = c.cid and v.r3Tiendas.tid = t.tid "
                + "order by v.vcliente";
        
        Query q = s.createQuery(hql);
        List<Calculado> l = q.list();
        Conexion.desconecta();
       return l;
    }
    
    /**
     * Metodo que devuelve toda la tabla R3Cerveza.
     * @return (List<R3Cerveza>) - lista con los resultados a mostrar.
     */
    public static List consultaCerves(){
        
        Session s = Conexion.getSession();
        String hql = "from R3Cerveza";
        Query q = s.createQuery(hql);
        List<R3Cerveza> l = q.list();
        Conexion.desconecta();
        return l;
    }
    
    /**
     * Metodo que devuelve una cerveza concreta buscada por ID.
     * @param id (int) - id de la cerveza que se quiere recuperar.
     * @return (R3Cerveza) - cerveza que se devuelve, null si no está.
     */
    public static R3Cerveza searchById(int id){
        Session s = Conexion.getSession();
        String hql = "from R3Cerveza where cid = :id";
        Query q = s.createQuery(hql);
        q.setInteger("id", id);
        R3Cerveza cerve = (R3Cerveza) q.uniqueResult();
        Conexion.desconecta();
        return cerve;
    }
}

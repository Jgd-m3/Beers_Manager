/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acc_r3_javier_gonzalez.bbdd;

/**
 * Clase que representa una Consulta con campos calculados.
 * @author M3z
 */
public class Calculado {
    /**
     * Atributos de la clase.
     */
    private String nombreCli;
    private long sumaCervezas;
    private String nombreCerv;
    
    /**
     * Constructor.
     */
    public Calculado(String n, long sum, String c){
        nombreCli = n;
        sumaCervezas = sum;
        nombreCerv = c;
    }

    /**
     * Getters y Setters de cada uno de los atributos.
     * @return 
     */
    public String getNombreCli() { return nombreCli; }
    public void setNombreCli(String nombre) { this.nombreCli = nombre; }

    public long getSumaCervezas() { return sumaCervezas; }
    public void setSumaCervezas(long sumaCervezas) { this.sumaCervezas = sumaCervezas; }
    
    public String getNombreCerv() { return nombreCerv; }
    public void setNombreCerv(String nombre) { this.nombreCerv = nombre; }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acc_r3_javier_gonzalez.bbdd;

/**
 * Clase que representa una consulta con join de tablas.
 * @author M3z
 */
public class Join{
    
    /**
     * Atributos de la clase.
     */
    private String cliente;
    private String tienda;
    private String cerveza;
    private short cantidad;
    
    /**
     * Constructor de la clase.
     */
    public Join(String cli, String shop, String cerv, short cant){
        cliente = cli;
        tienda = shop;
        cerveza = cerv;
        cantidad = cant;
    }

    /**
     * Getters y setters de los atributos de la clase.
     * @return 
     */
    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getTienda() { return tienda; }
    public void setTienda(String tienda) { this.tienda = tienda; }

    public String getCerveza() { return cerveza; }
    public void setCerveza(String cerveza) { this.cerveza = cerveza; }

    public short getCantidad() { return cantidad; }
    public void setCantidad(short cantidad) { this.cantidad = cantidad; }
    
    
}

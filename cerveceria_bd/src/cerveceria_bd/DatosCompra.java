/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerveceria_bd;

/**
 *
 * @author luis hernandez
 */
public class DatosCompra {
    private int idproducto;
    private int cantS;
    private int cantD;
    private String nom;
    private int precio_venta;
    private int sub_total;

    public DatosCompra() {
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantS() {
        return cantS;
    }

    public void setCantS(int cant) {
        this.cantS = cant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getSub_total() {
        return sub_total;
    }

    public void setSub_total(int sub_total) {
        this.sub_total = sub_total;
    }

    public int getCantD() {
        return cantD;
    }

    public void setCantD(int cantD) {
        this.cantD = cantD;
    }
    
    
}

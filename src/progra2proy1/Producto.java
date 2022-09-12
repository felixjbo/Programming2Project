package progra2proy1;

import java.util.ArrayList;

public class Producto {
    
    private String IDProd;
    private String Nombre;
    private ArrayList Lista;
    private int PrecioProd;
    
    public Producto() {
        
    }

    public String getIDProd() {
        return IDProd;
    }

    public void setIDProd(String IDProd) {
        this.IDProd = IDProd;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getLista() {
        return Lista;
    }

    public void setLista(ArrayList Lista) {
        this.Lista = Lista;
    }

    public int getPrecioProd() {
        return PrecioProd;
    }

    public void setPrecioProd(int PrecioProd) {
        this.PrecioProd = PrecioProd;
    }
    
}

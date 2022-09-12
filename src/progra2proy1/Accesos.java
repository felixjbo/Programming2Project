package progra2proy1;

import java.util.ArrayList;

public class Accesos {
    
    public void AgregarIngrediente (progra2proy1.Ingrediente pIngr) {
        
        Listas acceso = new Listas();
        acceso.AgregarIngrediente(pIngr);
    }
    
    public ArrayList<progra2proy1.Ingrediente> ObtenerListaIngredientes() {
        
        Listas acceso = new Listas();
        return acceso.ObtenerListaIngredientes();
    }
    
    public void AgregarProducto (progra2proy1.Producto pIngr) {
        
        Listas acceso = new Listas();
        acceso.AgregarProducto(pIngr);
    }
    
    public ArrayList<progra2proy1.Producto> ObtenerListaProductos() {
        
        Listas acceso = new Listas();
        return acceso.ObtenerListaProductos();
    }
    
}

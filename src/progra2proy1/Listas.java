package progra2proy1;

import java.util.ArrayList;

public class Listas {
    
    private static ArrayList<Ingrediente> ListaIngredientes = new ArrayList<Ingrediente>();
    private static ArrayList<Producto> ListaProductos = new ArrayList<Producto>();

    public void AgregarIngrediente (progra2proy1.Ingrediente pIngr) {
        
        ListaIngredientes.add(pIngr);
    }
    
    public ArrayList<progra2proy1.Ingrediente> ObtenerListaIngredientes() {
        
        return ListaIngredientes;
    }
    
    public void AgregarProducto (progra2proy1.Producto pProd) {
        
        ListaProductos.add(pProd);
    }
    
    public ArrayList<progra2proy1.Producto> ObtenerListaProductos() {
        
       return ListaProductos;
    }
}

package pe.egcc.ventatalleres.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.ventatalleres.model.Taller;
import pe.egcc.ventatalleres.model.Venta;

public class VentaService {

  private static Taller talleres[];
  private static List<Venta> ventas;
  
  static {
    
    talleres = new Taller[]{
      new Taller("Java Developer", 1500.0),
      new Taller("Oracle Database", 1400.0),
      new Taller("PHP Developer", 850.0),
      new Taller("NET Developer", 1300.0)
    };
    
    
    ventas = new ArrayList<>();
    
  }

  public static Venta procesarVenta(Venta venta){
    // Variables
    double precio, importe;
    // PRoceso
    precio = 0.0;
    for (Taller t : talleres) {
      if(t.getNombre().equals(venta.getTaller())){
        precio = t.getPrecio();
        break;        
      }
    }
    importe = precio * venta.getCantidad();
    // Grabar
    venta.setPrecio(precio);
    venta.setImporte(importe);
    ventas.add(venta);
    // Retorno
    return venta;
  }
  
  public static Taller[] obtenerTalleres(){
    return talleres;
  }
  
  public static List<Venta> obtenerVentas(){
    return ventas;
  }
  
}

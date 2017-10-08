package pe.egcc.ventatalleres.prueba;

import java.util.List;
import pe.egcc.ventatalleres.model.Taller;
import pe.egcc.ventatalleres.model.Venta;
import pe.egcc.ventatalleres.service.VentaService;

public class Prueba02 {

  public static void main(String[] args) {
    
    // Registrar ventas
    Taller[] talleres = VentaService.obtenerTalleres();
    VentaService.procesarVenta(
            new Venta("A", talleres[0].getNombre() , 6));
    VentaService.procesarVenta(
            new Venta("B", talleres[0].getNombre() , 10));
    VentaService.procesarVenta(
            new Venta("C", talleres[0].getNombre() , 12));
    
    // Reporte de ventas
    List<Venta> ventas = VentaService.obtenerVentas();
    for (Venta v : ventas) {
      System.out.println(v);
    }
    
    
    
  }

  
}

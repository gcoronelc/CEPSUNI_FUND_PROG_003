package pe.egcc.ventatalleres.prueba;

import pe.egcc.ventatalleres.model.Taller;
import pe.egcc.ventatalleres.service.VentaService;

public class Prueba01 {


  public static void main(String[] args) {
    
    Taller[] talleres = VentaService.obtenerTalleres();
    
    for (Taller t : talleres) {
      System.out.println(t);
    }
    
  }
  
}

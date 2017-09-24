package pe.ceps.uni.arregloapp.prueba;

import pe.ceps.uni.arregloapp.service.ArregloService;

public class Prueba01 {

  public static void main(String[] args) {
    // Datos
    int n = 10;
    // Proceso
    int[] arreglo = ArregloService.crearArreglo(n);
    // Reporte
    for (int i = 0; i < arreglo.length; i++) {
      int dato = arreglo[i];
      System.out.println(dato);
    }
    System.out.println("Mayor: " + ArregloService.leerMayorV4());
    System.out.println("Menor: " + ArregloService.leerMenorV1());
  }

  
}

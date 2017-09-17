package pe.ceps.uni.mateapp.prueba;

import pe.ceps.uni.mateapp.service.MateService;

public class Prueba02 {

  public static void main(String[] args) {
    // Datos
    int n1 = 15;
    int n2 = 20;
    int n3 = 30;
    
    // Proceso
    int mcd = MateService.calcMcd(n1, n2);
    int mcm = MateService.calcMcm(n1, n2);
    int mcd2 = MateService.calcMcd(n1, n2, n3);
    
    // Reporte
    System.out.println("INPUT");
    System.out.println("n1: " + n1);
    System.out.println("n2: " + n2);
    System.out.println("OUTPUT");
    System.out.println("MCD: " + mcd);
    System.out.println("MCD2: " + mcd2);
    System.out.println("MCM: " + mcm);
  }
  
}

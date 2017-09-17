package pe.ceps.uni.mateapp.prueba;

import pe.ceps.uni.mateapp.service.MateService;

public class Prueba02 {

  public static void main(String[] args) {
    // Datos
    int n1 = 15;
    int n2 = 20;
    int n3 = 45;
    
    // Proceso
    int mcd = MateService.calcMcd(n1, n2);
    int mcm = MateService.calcMcm(n1, n2);
    int mcd3 = MateService.calcMcd(n1, n2, n3);
    int mcm3 = MateService.calcMcm(n1, n2, n3);
    
    // Reporte
    System.out.println("INPUT");
    System.out.println("n1: " + n1);
    System.out.println("n2: " + n2);
    System.out.println("n3: " + n3);
    System.out.println("OUTPUT");
    System.out.println("MCD: " + mcd);
    System.out.println("MCM: " + mcm);
    System.out.println("MCD3: " + mcd3);
    System.out.println("MCM3: " + mcm3);
  }
  
}

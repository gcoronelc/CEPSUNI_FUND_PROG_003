package pe.cepsuni.rentacurso.serive;

public class CursoService {


  public static double[] procesarCurso
  (int horas, double precio, 
  int vacantes, double pagoHora){
    
    // Variabes
    double ingresos, gasAdm, gasPub;
    double gasLog, pagoProf, renta;
    
    // Proceso
    ingresos = vacantes * precio;
    gasAdm = ingresos * 0.03;
    gasPub = ingresos * 0.05;
    gasLog = ingresos * 0.04;
    pagoProf = horas * pagoHora;
    double gastos = gasAdm +gasLog + gasPub + pagoProf;
    renta = ingresos - gastos;
    
    // Reporte
    double repo[] = { 
      dosDec(ingresos), dosDec(gasAdm), 
      dosDec(gasLog), dosDec(gasPub), 
      dosDec(pagoProf), dosDec(renta)};
    return repo;

  }
  
  
  private static double dosDec(double num) {
    num = num * 100;
    num = Math.round(num);
    num = num / 100;
    return num;
  }

  public static String[] obtenerConceptos() {
    String conceptos[] = {
      "INGRESOS", "GASTOS ADM.",
      "GASTOS PUB.", "GASTOS LOG.",
      "PAGO PROF.", "RENTABILIDAD"};
    return conceptos;
  }
  
}

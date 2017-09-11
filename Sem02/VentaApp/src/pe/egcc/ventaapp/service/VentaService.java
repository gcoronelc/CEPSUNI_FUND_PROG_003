package pe.egcc.ventaapp.service;

public class VentaService {

  public static double calcDcto(double precio, int cant) {
    // Variable
    double dcto;
    // Proceso
    dcto = 0.0;
    if (cant > 6) {
      dcto = precio * 0.05;
    }
    // Retorno
    return dosDec(dcto);
  }

  public static double calcTotal(double precio, int cant) {
    // Variable
    double total;
    // Proceso
    double dcto = calcDcto(precio, cant);
    total = (precio - dcto) * cant;
    // Retorno
    return dosDec(total);
  }

  public static double calcImporte(double total) {
    // Variable
    double importe;
    // Proceso
    importe = total / 1.18;
    // Retorno
    return dosDec(importe);
  }

  public static double calcImpuesto(double total) {
    // Variable
    double impuesto;
    // Proceso
    impuesto = total - calcImporte(total);
    // Retorno
    return dosDec(impuesto);
  }

  private static double dosDec(double num) {
    num = num * 100;
    num = Math.round(num);
    num = num / 100;
    return num;
  }

}

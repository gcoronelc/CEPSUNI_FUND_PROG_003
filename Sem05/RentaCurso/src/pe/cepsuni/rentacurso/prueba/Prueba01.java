package pe.cepsuni.rentacurso.prueba;

import pe.cepsuni.rentacurso.serive.CursoService;

public class Prueba01 {

  public static void main(String[] args) {

    // Datos
    int horas = 24;
    double precio = 250.0;
    int vacantes = 7;
    double pagoHora = 50.0;

    // Proceso
    double repo[] = CursoService.procesarCurso
        (horas, precio, vacantes, pagoHora);

    // Reporte
    String conceptos[] = CursoService.obtenerConceptos();
    for (int i = 0; i < conceptos.length; i++) {
      String concepto = conceptos[i];
      double valor = repo[i];
      System.out.println(concepto + "\t" + valor);

    }

  }

}

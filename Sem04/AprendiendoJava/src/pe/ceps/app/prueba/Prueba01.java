package pe.ceps.app.prueba;

public class Prueba01 {
  
  public static void main(String[] args) {
  
   int[] notas;
   notas = new int[5];
   
   mostrarArreglo( notas );
    
   notas[0] = 18;
   notas[1] = 13;
   notas[2] = 15;
   notas[3] = 17;
   notas[4] = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
   
    mostrarArreglo(notas);
  }

  /**
   * Imprime un arreglo utilizando el recorrido indexado.
   * 
   * @param arreglo 
   */
  private static void mostrarArreglo(int[] arreglo) {
    System.out.println("------------------------");
    System.out.println("Tamaño: " + arreglo.length);
    for (int i = 0; i < arreglo.length; i++) {
      int nota = arreglo[i];
      System.out.println(nota);
    }
  }
  
}


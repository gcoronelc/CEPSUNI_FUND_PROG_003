package pe.ceps.uni.arregloapp.service;

import java.util.Arrays;
import java.util.Random;

public class ArregloService {

  private static int[] arreglo;
  
  public static int[] crearArreglo( int n ){
    arreglo = new int[n];
    // Proceso
    Random rnd = new Random();
    for (int i = 0; i < arreglo.length; i++) {
      arreglo[i] = rnd.nextInt(30) + 20;
    }
    // Proceso
    return arreglo;
  }
  
  public static int[] leerArreglo(){
    return arreglo;
  }
  
  public static int leerMayorV1(){
    int mayor;
    // Proceso - Años 95
    mayor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
      if( arreglo[i] > mayor ){
        mayor = arreglo[i];
      }
    }
    return mayor;
  }
  
  public static int leerMayorV2(){
    int mayor;
    // Proceso - Años 95
    mayor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
      mayor = Math.max(mayor, arreglo[i] );
    }
    return mayor;
  }

  public static int leerMayorV3(){
    int mayor;
    // Proceso - Año 98 1.2
    int arreglo1[] = arreglo.clone();
    Arrays.sort(arreglo1);
    mayor = arreglo1[arreglo1.length - 1];
    // Retorno
    return mayor;
  }
  
  public static int leerMayorV4(){
    int mayor;
    // Proceso - Año 2014 Java 8 Expresiones Lambda
    mayor = Arrays.stream(arreglo).max().getAsInt();
    // Retorno
    return mayor;
  }
  
  public static int leerMenorV1(){
    int menor;
    // Proceso - Años  95
    menor = arreglo[0];
    for (int i = 1; i < arreglo.length; i++) {
      if( arreglo[i] < menor ){
        menor = arreglo[i];
      }
    }
    return menor;
  }
  
}

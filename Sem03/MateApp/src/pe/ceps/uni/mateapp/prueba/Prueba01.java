package pe.ceps.uni.mateapp.prueba;

import java.util.Random;

public class Prueba01 {
  
  public static void main(String[] args) {
    
    Random rnd = new Random();
    int n = 50;
    
    while( n > 20 ){
      System.out.println("Hola Gustavo");
      n = rnd.nextInt(1000);
    }
    
    
  }
  
}

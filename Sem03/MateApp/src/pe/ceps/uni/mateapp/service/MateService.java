package pe.ceps.uni.mateapp.service;

public class MateService {

  public static int calcMcd(int n1, int n2){
    // Variables
    int mcd;
    // Proceso
    while( n1 != n2){
      if( n1 > n2 ){
        n1 -= n2;
      } else {
        n2 = n2 - n1;
      }
    }
    mcd = n2;
    // Retorno
    return mcd;
  }

   public static int calcMcm(int n1, int n2){
     // variable
     int mcm;
     // Proceso
     mcm = n1 * n2 / calcMcd(n1, n2);
     // Retorno
     return mcm;
   }
   
   public static int calcMcd(int n1, int n2, int n3){
    // Variables
    int mcd;
    // Proceso
    mcd = calcMcd( calcMcd(n1, n2), n3);
    // Retorno
    return mcd;
  }
   
   public static int calcMcm(int n1, int n2, int n3){
     // variable
     int mcm;
     // Proceso
     mcm = calcMcm( calcMcm(n1, n2), n3 );
     // Retorno
     return mcm;
   }
}

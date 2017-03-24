
package cambiobase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CambioBase {

    public static int cambiaBase(int numero,int base,int resultado){
        if (numero!=0){
            resultado = numero % base;
            numero= numero / base;
            return( cambiaBase(numero,base,resultado)*10 +resultado);       
        }            
        return 0;
    }
    
//    
//    public static void main(String[] args) throws IOException {
//             
//        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
//       
//        int x,y;
//        
//       System.out.print("Escriba numero a convertir: "); x=Integer.parseInt(lector.readLine());
//       System.out.print("Escriba base a convertir: "); y=Integer.parseInt(lector.readLine());
//        int resultado = cambiaBase(x,y,0);
//        System.out.println(resultado);
//    }
    
}

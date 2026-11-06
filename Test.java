
import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
       Scanner vr= new Scanner (System.in);
       
       System.out.println("ingrese un texto");
       String texto = vr.nextLine();

       Saludo persona = new Saludo();
       persona.prueba(texto);

       

        
        
    } 
}
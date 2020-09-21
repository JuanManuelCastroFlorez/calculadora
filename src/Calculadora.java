import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String entrada; 
       int conv = 0;
       int suma;
       int resul = 0;
       int i = 0;
       
        
       while(true){
           
           System.out.println("ingrese sus numeros");
           entrada = sc.nextLine();
           if(entrada.equals("=")){
               System.out.println("Tu suma es: " + resul);
               break;
           }
           conv =Integer.parseInt(entrada);
           suma = conv;
           resul = resul + suma;
           
           //i=+1;
           System.out.println(resul);
           
           
           
       }
      
        
        
        
        
        
        
        
        
        
        
    }
    
    public int suma(){
        
        return 0;          
    } 
    
    public int resta(){
        return 0;
    }
    
    public int multiplicacion(){
        return 0;
    }
    
    public int division(){
        return 0;
    }
    
    public int modulo(){
        return 0;
    }
    
    public int potencia(){
        return 0;
    }
    
    
}

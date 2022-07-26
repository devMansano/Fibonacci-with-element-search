package ex;
import java.util.*;
import java.util.Scanner;
public class fibonacci{

    public static void main(String[] args){

        int a = 0;
        int b = 1;
        int aux;
        List<Number> Lista = new ArrayList<>();

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Qual o número que deseja ?");
            int numeroEscolhido = leitor.nextInt(); 
            System.out.println("Qual o tamanho da sequência ?");
            int numeroSeq = leitor.nextInt(); 
            for(int i = 0; i <numeroSeq; i++){ 
                Lista.add(a);

                aux = a;
                a = a+b;
                b = aux;
         System.out.println("Sequência de Fibonacci: " + Lista);
    }
    
        if(numeroEscolhido == Lista.size()){ 
            
                System.out.println("Faz parte da sequência  ");
         
          
                    
        }else if(numeroEscolhido != Lista.size()){
         
                System.out.println("Esse número não pertence a lista ");
        
        }
              
        }
            
            
            
        }
    }



import java.util.Scanner;

public class Verificanota {

    public static void main (String[] args){
        double nota;
        System.out.println("Entre com a sua nota:");
        Scanner input = new Scanner (System.in);
        nota = input.nextDouble();

        if  (nota<4){
            System.out.println("você está reprovado");
        }
        else{
            if (nota<=6){
                System.out.println("Você está de recuperação");
            }
            else{
                if (nota>=7){
                    System.out.println("Você está Aprovado");
                }
            }
        }
    }
}
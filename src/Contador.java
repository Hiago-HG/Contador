import java.util.Scanner;

public class Contador 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o 1° número:");
        int numero1 = scanner.nextInt();

        System.out.println("Insira o 2° número:");
        int numero2 = scanner.nextInt();


        if (numero2 < numero1) {
            System.out.println("Número inválido! O segundo número deve ser maior ou igual ao primeiro.");
        } else {
            int diferenca = numero2 - numero1;
            System.out.println("A diferença entre os números é de : " + diferenca);
        
        System.out.print("Números de 1 até " + diferenca + " são : ");
        for (int i = 1; i <= diferenca; i++) {
            System.out.print(i);
            if (i < diferenca) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
    
        scanner.close();
        }
    }

}
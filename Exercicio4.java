import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int idade;
        double altura;
        double somaAlturas = 0;
        int contador = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            
            System.out.print("Digite a altura: ");
            altura = sc.nextDouble();
            
            if (idade > 50) {
                somaAlturas += altura;
                contador++;
            }
        }
        
        if (contador > 0) {
            double media = somaAlturas / contador;
            System.out.println("Média das alturas (idade > 50): " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi informada.");
        }
        
        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, media;
        int aprovados = 0, exame = 0, reprovados = 0;
        double somaMedias = 0;
        
        for (int i = 1; i <= 6; i++) {
            System.out.println("\nAluno " + i + ":");
            
            System.out.print("Digite a primeira nota: ");
            nota1 = sc.nextDouble();
            
            System.out.print("Digite a segunda nota: ");
            nota2 = sc.nextDouble();
            
            media = (nota1 + nota2) / 2;
            somaMedias += media;
            
            System.out.println("Média: " + media);
            
            if (media <= 3) {
                System.out.println("REPROVADO");
                reprovados++;
            } else if (media < 7) {
                System.out.println("EXAME");
                exame++;
            } else {
                System.out.println("APROVADO");
                aprovados++;
            }
        }
        
        double mediaClasse = somaMedias / 6;
        
        System.out.println("\nRESULTADOS FINAIS:");
        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de exame: " + exame);
        System.out.println("Total de reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);
        
        sc.close();
    }
}
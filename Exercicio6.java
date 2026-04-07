import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int nulos = 0, brancos = 0;
        int totalEleitores = 10;

        for (int i = 1; i <= totalEleitores; i++) {
            System.out.print("Digite o voto do eleitor " + i + ": ");
            int voto = sc.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    nulos++;
                    break;
                case 6:
                    brancos++;
                    break;
                default:
                    System.out.println("Voto inválido!");
                    i--; // repete o voto
            }
        }

        int totalVotos = candidato1 + candidato2 + candidato3 + candidato4 + nulos + brancos;

        double percNulos = (nulos * 100.0) / totalVotos;
        double percBrancos = (brancos * 100.0) / totalVotos;

        System.out.println("\nResultado da eleição:");
        System.out.println("Candidato 1: " + candidato1 + " votos");
        System.out.println("Candidato 2: " + candidato2 + " votos");
        System.out.println("Candidato 3: " + candidato3 + " votos");
        System.out.println("Candidato 4: " + candidato4 + " votos");
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);
        System.out.printf("Percentual de nulos: %.2f%%\n", percNulos);
        System.out.printf("Percentual de brancos: %.2f%%\n", percBrancos);

        sc.close();
    }
}

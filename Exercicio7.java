import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPessoas = 10;
        int maiores50 = 0;
        int contAltura = 0;
        double somaAltura = 0;
        int pesoMenor40 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i);

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura (em metros): ");
            double altura = sc.nextDouble();

            System.out.print("Peso (em kg): ");
            double peso = sc.nextDouble();

            // a) maiores de 50 anos
            if (idade > 50) {
                maiores50++;
            }

            // b) média das alturas entre 10 e 20 anos
            if (idade >= 10 && idade <= 20) {
                somaAltura += altura;
                contAltura++;
            }

            // c) peso inferior a 40 kg
            if (peso < 40) {
                pesoMenor40++;
            }

            System.out.println();
        }

        double mediaAltura = 0;
        if (contAltura > 0) {
            mediaAltura = somaAltura / contAltura;
        }

        double porcentagemPeso = (pesoMenor40 * 100.0) / totalPessoas;

        System.out.println("RESULTADOS:");
        System.out.println("Quantidade de pessoas com mais de 50 anos: " + maiores50);
        System.out.println("Média das alturas (10 a 20 anos): " + mediaAltura);
        System.out.printf("Porcentagem com peso inferior a 40kg: %.2f%%\n", porcentagemPeso);

        sc.close();
    }
}
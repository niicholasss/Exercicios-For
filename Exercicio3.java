public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        
        System.out.print("Sequência: ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            
            if (i < n) {
                System.out.print(" ");
            }
        }
        
        sc.close();
    }
}
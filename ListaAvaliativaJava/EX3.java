import java.util.Scanner;

class EX3 {
    
    public static void main(String[] args) {
        
        // Criação das variáveis num e soma
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int soma = 0;
		
		// Soma e mostra, enquanto não for 0
		while (num != 0){
		    soma += num;
			System.out.println(soma);
			num = sc.nextInt();
		} 
    }
}

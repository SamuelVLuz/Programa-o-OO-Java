import java.util.Scanner;

class EX3 {
    
    public static void main(String[] args) {
        
        // Variáveis são inteiras, porque vou calcular com centímetros
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int soma = 0;
		
		while (num != 0){
		    soma += num;
			System.out.println(soma);
			num = sc.nextInt();
		} 
    }
}
import java.util.Scanner;

class EX1 {
    
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		// Criando as variáveis
        float peso;        
        
	    System.out.println("Digite a sua altura (metros): ");
        float altura = sc.nextFloat();

        System.out.println("Digite o seu sexo (M ou F): ");
        String sexo = sc.next();
		
		// Se homem
		if (sexo.equals("M")){
			peso = (72.7f * altura) - 58;
			System.out.printf("O peso ideal de um homem com %.2f de altura é: %.3f", altura, peso);
		}
		
		// Se mulher
		else if (sexo.equals("F")){
			peso = (62.1f * altura) - 44.7f;
			System.out.printf("O peso ideal de uma mulher com %.2f de altura é: %.3f", altura, peso);
		}
    }
}

import java.util.Scanner;

class EX2 {
    
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		// Criando as variáveis peso e altura
        System.out.println("Digite o seu peso (Kg): ");
        float peso = sc.nextFloat();      
                
	    System.out.println("Digite a sua altura (metros): ");
        float altura = sc.nextFloat();

		// Calculando IMC
		float imc = peso / (altura * altura);
			
			
		// 	
		String faixa;
		
		if (imc < 18.5){
			faixa = "Magreza";
		}
		
		else if (imc < 25){
			faixa = "Normal";
		}
		
		else if (imc < 30){
			faixa = "Sobrepeso";
		}
		
		else if (imc < 40){
			faixa = "Obesidade";
		}
		
		else
			faixa = "Obesidade grave";
		
		System.out.printf("O seu IMC é %.2f, o que é classificado como: %s", imc, faixa);
    }
}

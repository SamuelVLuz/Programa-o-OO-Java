import java.util.Scanner;

class media {
    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int notas = 0;
		float med = 0;
		
		for (int i = 0; i < 3; i++){
			float nota = sc.nextFloat();
			
			if (10 >= nota && nota >= 0){
				med += nota;
				notas++;
			}
		}
		
		// Ajuste, para não fazer uma divisão por zero, caso nenhuma nota seja válida
		if(notas == 0)
			notas++;
		
		System.out.printf("Foram lidas %d notas e a média é %.2f", notas, med/notas);

        
    }
}

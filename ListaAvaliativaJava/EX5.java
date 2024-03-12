class EX5 {
    
    public static void main(String[] args) {
        
        // Variáveis são inteiras, para calcular em centímetros
		int chico = 80;
		int juca = 60;
		int anos = 0;
		
		// Aumentar 1 ano, enquanto Juca for menor
		do {
			chico += 6;
			juca += 9;
			anos ++;
			
		} while (chico >= juca);
		
		System.out.printf("Vão ser necessários %d anos, para que Juca fique maior que Chico", anos);

        
    }
}

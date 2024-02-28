class fibo {
    public static void main(String[] args) {
        
        // Variáveis são inteiras, porque vou calcular com centímetros
		int num = 1;
		int mais = 0;
		int ant = 0;
		
		System.out.println(num);
		for (int i = 1; i < 10; i++){
			ant = num;
			
			num += mais;
			System.out.println(num);
			mais = ant;
				
		}
    }
}

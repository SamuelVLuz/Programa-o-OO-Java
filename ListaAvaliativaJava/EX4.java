class EX4 {
    
    public static void main(String[] args) {
        
        // Criação do número e do booleano primo
		int num = 1;
		boolean primo;
		
		// loop que vai até o número 100
		do {
			num ++;
			primo = true;
			
			// Divide pelos números anteriores e encerra se encontrar um divisor
			for (int i = 2; i < num; i++){
				
				if (num % i == 0){
					primo = false;
					break;
				}
			}
			
			// Se for primo, imprime
			if(primo)
				System.out.println(num);
			
		} while (num < 100);

        
    }
}

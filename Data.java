class Data {
	// declaração dos atributos da classe
	int dia;
	int mes;
	int ano;
	
	public String escreverPorExtenso(){
		String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
		"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		
		return dia + " de " + meses[mes-1] + " de " + ano;
	}
	
	public void ajustarData(int dia, int mes, int ano){
		int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			System.out.println("Mês inválido\n");
			this.mes = 1;
		}
		
		if (dia>=1 && dia <= diasMes[this.mes -1]){
			this.dia = dia;
		} else {
			System.out.println("Dia inválido\n");
			this.dia = 1;
		}
		
		if (ano > 1900){
			this.ano = ano;
		} else {
			System.out.printf("Ano inválido\n");
			this.ano = 2000;
		}
	}
	
    public static void main(String[] args) {
		Data hoje = new Data();
		hoje .ajustarData(19,13,2024);
		
		System.out.printf("Hoje é %s", hoje.escreverPorExtenso());        
    }
}

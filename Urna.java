import java.util.Scanner;

class Urna {
	private int cand51;
	private int cand55;
	private int voto;
	private int brancos;
	private int nulos;
	private int votos;
	private int status;
	
	static final int FECHADA = 0;
	static final int ABERTA = 1;
	static final int EMTESTE = 2;
	
	public Urna(){
		setStatus(EMTESTE);
	}
		
	void setStatus(int status){
		if (status == ABERTA || status == EMTESTE){
			resetarVotos();
			this.status = status;
		} else if(status == FECHADA)
			this.status = status;
			
	}
	
	private void resetarVotos(){
		cand51 = 0;
		cand51 = 0;
		voto = 0;
		votos = 0;
		brancos = 0;
		nulos = 0;
	}
	
	int getStatus(){
				
		return status;
		
	}
	
	void votar (int voto){
		if (status == ABERTA || status == EMTESTE){ 	
			if (voto == 51)
				cand51 += 1;
			else if (voto == 55)
				cand55 += 1;
			else if (voto == 0)
				brancos += 1;
			else
				nulos += 1;
			
			votos += 1;
		}
	}
	
	void imprimirResultado(){
		if (status == FECHADA || status == EMTESTE){
			float c51 = (float) cand51;
			float c55 = (float) cand55;
			float total = cand51 + cand55;
			System.out.printf("\nResultado das votações:\n\nCandidato51: %.2f dos votos válidos" +
			"\nCandido 55: %.2f dos votos válidos" +
			"\nTotal de votos válidos: %.0f\n" +
			"\nBrancos: %d votos" +
			"\nNulos: %d votos" +
			"\nTotal de votos: %d", 
			(c51 * 100) / total, (c55 * 100) / total, total, brancos, nulos, votos);
		} else
			System.out.println("Resultado não pode ser visto, enquanto a urna está ABERTA");
	}
	
	
	
	
	public static void main (String []args){
		Urna teste = new Urna();/*
		teste.iniciarVotacao();
		System.out.println(teste.getStatus());
		teste.votar(51);
		teste.votar(51);
		teste.votar(55);
		teste.votar(-11);
		teste.votar(57);
		teste.votar(0);
		teste.fecharVotacao();
		System.out.println(teste.getStatus());
		teste.imprimirResultado();*/
	}
}

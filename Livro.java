import java.util.Arrays;
import java.util.List;

class Livro extends Produto {
	private String autor;
	private String genero;
	private int paginas;
	
	public Livro(String nome, float precoCompra, String autor, String genero, int paginas){
		super(nome, precoCompra);
	}
	
	public Livro(String nome, float precoCompra, float precoVenda, String autor, String genero, int paginas){
		super(nome, precoCompra, precoVenda);
	}
	
	public void setAutor(String autor){
		if	(autor.length() >= 3)
			this.autor = autor;
		else
			System.out.println("Nome de autor inválido");
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setGenero(String genero){	
		String [] generoslivros = new String[] {"Romance", "Drama", "Comédia", "Ficção", "Aventura", "Fantasia", "Suspense", "Terror", "Horror", "Mistério", "Ação"};
		List<String> generos = Arrays.asList(generoslivros);
        if (generos.contains(genero))
			this.genero = genero;
		else
			System.out.println("Gênero literário inválido");
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setPaginas(int paginas){	
		if (paginas >= 2)
			this.paginas = paginas;
		else
			System.out.println("Número de páginas insuficientes");
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public String imprimirLivro() {
		return "Informações do livro: " + autor + "\n" + precoVenda + "";
	} 
	
	
	public static void main (String []args){
	}
}

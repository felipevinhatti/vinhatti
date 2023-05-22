package simuladordecarro;

public class Carro {
	
	//atributos
	String nome;
	String marca;
	int ano;
	int vel;
	
	//métodos
	void acelerar(int aceleracao) {
		vel+=aceleracao;
	}
	
	void frear(int frenagem) {
		vel-=frenagem;
		
	}
	
	void buzinar() {
		System.out.println("bibibi");
	}
	

}

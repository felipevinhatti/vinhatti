package simuladordecarro;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.nome = "Uno";
		c1.marca = "Fiat";
		c1.ano = 1998;
		c1.vel = 70;
		
		c1.acelerar(40);
		System.out.println("Velocidade do " + c1.nome + ": " + c1.vel + "km/h");
		
		c1.frear(80);
		System.out.println("Velocidade do " + c1.nome + ": " + c1.vel + "km/h");
		

		
		
		
		
				

	}

}

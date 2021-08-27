public class Sonic {

	public static void main(String[] args) {
		//Neste método construtor temos os parâmetros: espécie, cor da pele, vestuario e velocidade.
		Personagem sonic = new Personagem("Ouriço", "Azul", "Tênis e luvas", 80);
		
		//No método "status()", podemos ver no console as características configuradas a partir do método construtor.
		//sonic.status();
		
		//No método construtor, os atributos espécie, cor da pela, vestuario e velocidade podem ter seus valores retornados e alterados a partir dos métodos getters e setters abaixo:
		
		/*sonic.setEspecie("Porco espinho");
		System.out.println(sonic.getEspecie());
		
		sonic.setCorPele("Azul e cor de pêssego");
		System.out.println(sonic.getCorPele());
		
		sonic.setVestuario("Luvas, tênis e meias");
		System.out.println(sonic.getVestuario());
		
		sonic.setVelocidade(98);
		System.out.println(sonic.getVelocidade());*/
		
		
		//Os métodos comentados abaixo são os designados para ativar e retornar os poderes de Sonic:
		/*sonic.impulsionar();
		sonic.semImpulso();
		sonic.correr();
		sonic.desenrolar();
		sonic.enrolarse();
		sonic.enrolado();
		sonic.perdeuAnel();
		sonic.capturouAnel();
		sonic.possuiAnel();*/

		//Adicionados os métodos que fazem com que Sonic ganhe ou perca velocidade.
		/* sonic.ganharVelocidade();
		sonic.perderVelocidade();*/
	}

}

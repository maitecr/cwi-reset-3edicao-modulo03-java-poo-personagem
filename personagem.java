public class Personagem {
	private String especie;
	private String corPele;
	private String vestuario;
	private int velocidade = 100;
	private boolean impulso;
	private boolean anel;
	private boolean enrolar;

	//Método Construtor
	public Personagem(String e, String cp, String ves, int vel) {
		this.especie = e;
		this.corPele = cp;
		this.vestuario = ves;
		this.velocidade = vel;
		this.desenrolar();
		this.perdeuAnel();
		this.semImpulso();
	}
	
	//Métodos getters
	
	public String getEspecie() {
		return this.especie;
	}
	
	public String getCorPele() {
		return this.corPele;
	}
	
	public String getVestuario() {
		return this.vestuario;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	//Métodos setters
	
	public void setEspecie(String e) {
		this.especie = e;
	}
	
	public void setCorPele(String cp) {
		this.corPele = cp;
	}
	
	public void setVestuario(String ves) {
		this.vestuario = ves;
	}
	
	public void setVelocidade(int vel)  {
		this.velocidade = vel;
	}
	
	
	//Métodos Gerais
	public void status() {
		System.out.println("Espécie: " + this.especie);
		System.out.println("Cor: " + this.corPele);
		System.out.println("Vestuário: " + this.vestuario);
		System.out.println("Velocidade: " + this.velocidade);
		System.out.println("Impulso: " + this.impulso);
		System.out.println("Anel: " + this.anel);
		System.out.println("Enrolado: " + this.enrolar);
		System.out.println("");
	}

	public void impulsionar() {
		this.impulso = true;
	}
	
	public void semImpulso() {
		this.impulso = false;
	}
	
	public void correr() {
		if (this.impulso == true) {
			System.out.println("Você pegou impulso! CORRA CORRA CORRA!");
		} else {
			System.out.println("Você está sem impulso e precisa dele parar correr...");
		}
		System.out.println("");
	}
	
	
	public void enrolarse() {
		this.enrolar = true;
	}
	
	public void desenrolar() {
		this.enrolar = false;
	}
	
	public void enrolado() {
		if (this.enrolar == true) {
			System.out.println("SUA VELOCIDADE TRIPLICOU!");
		} else {
			System.out.println("Pegue impulso e se enrole para triplicar sua velocidade!");
		}
		System.out.println("");
	}
	
	public void capturouAnel() {
		this.anel = true;
	}
	
	public void perdeuAnel() {
		this.anel = false;
	}
	
	public void possuiAnel() {
		if (this.anel == true) {
			System.out.println("CORRA NA VELOCIDADE DO SOM!");
		} else {
			System.out.println("Que pena! Perdeu a chance de capturar o anel. Agora terá que correr em sua velocidade normal...");
		}
		System.out.println("");
	}
}

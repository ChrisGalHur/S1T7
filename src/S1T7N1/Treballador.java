package S1T7N1;

public class Treballador {

	//Atributs
	private String nom;
	private String cognom;
	private int preuHora;
	
	//Constructors
	public Treballador(String nom, String cognom, int preuHora) {
		this.nom = nom;
		this.cognom = cognom;
		this.preuHora = preuHora;
	}

	//Getters
	public String getNom() {
		return nom;
	}

	public String getCognom() {
		return cognom;
	}

	public int getPreuHora() {
		return preuHora;
	}

	//Setters
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public void setPreuHora(int preuHora) {
		this.preuHora = preuHora;
	}
	
	public Float calcularSou(float hores) {
		float sou = hores * this.preuHora;
		return sou;
	}

	public void imprimeix() {
		System.out.println("Treballador Sense Asignar [ nom = " + this.getNom() + " cognom = " + this.getCognom() + " preuHora = " + this.getPreuHora() + " ]");
	}
}

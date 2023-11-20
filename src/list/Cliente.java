package list;

public class Cliente {

	private String nome ;
	private String codiceFiscale;
	private String telefono;
	private String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Cliente (String nome, String codiceFiscale, String telefono ,String email) {
		this.nome = nome;
		this.codiceFiscale = codiceFiscale;
		this.telefono = telefono;
		this.email =email;
	}
	public void print () {
		// System.out.println("Nome Cliente: " + this.getNome()+
		// 		" Codice Fiscale: " + this.getCodiceFiscale()+ " Telefono: " + this.getTelefono()+
		// 		" E-mail: " + this.getEmail());
		System.out.printf("%-10s %-10s %-10s %-10s \n",
				 this.getNome(), this.getCodiceFiscale(),this.getTelefono(),this.getEmail());
		
	}
}

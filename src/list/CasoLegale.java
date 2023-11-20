package list;

public class CasoLegale {

	private Cliente cliente ;
	private int numeroCaso;
	private String descrizione;
	private String stato;
	public int getNumeroCaso() {
		return numeroCaso;
	}
	public void setNumeroCaso(int numeroCaso) {
		this.numeroCaso = numeroCaso;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public void setCliente (Cliente cliente) {
		this.cliente = cliente;
	}
	public Cliente getCliente() {
		return cliente ;
	}
	public CasoLegale (Cliente cliente, int numeroCaso, String descrizione, String stato) {
		this.cliente =cliente;
		this.numeroCaso = numeroCaso;
		this.descrizione = descrizione;
		this.stato = stato;
		
	}
	public void print () {
		// System.out.println("Cliente: " + this.getCliente().getNome() +
		//	" Numero Caso: " + this.getNumeroCaso()	+ " Descrizione: " + this.getDescrizione()
		//	+ " Stato: " + this.getStato());
		System.out.printf("%-10s %6d %-10s %12s \n",
				this.getNumeroCaso(),this.getNumeroCaso(),this.getDescrizione(),this.getStato());
	}
}

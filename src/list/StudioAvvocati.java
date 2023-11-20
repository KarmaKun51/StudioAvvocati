package list;

import java.util.ArrayList;

public class StudioAvvocati {

	private ArrayList<Cliente> clienti = new ArrayList<>();
	private ArrayList<CasoLegale> casiLegali = new ArrayList<>();

	public void getNewCliente(String nome, String codiceFiscale, String telefono, String email) {
		Cliente cliente = new Cliente(nome, codiceFiscale, telefono, email);
		clienti.add(cliente);
	}

	public void getNewCasoLegale(Cliente cliente, int numeroCaso, String descrizione, String stato) {
		CasoLegale casoLegale = new CasoLegale(cliente, numeroCaso, descrizione, stato);
		casiLegali.add(casoLegale);
	}

	public void printCliente(int index) {
		System.out.printf("%2s %-10s %-10s %-10s %10s \n"," #", "Cliente","C.Fiscale","Telefono","Email" );
		System.out.print(" 1 ");
		clienti.get(index - 1).print();
	}

	public void printClienti() {
		int indexC = 0;
		System.out.printf("%2s %-10s %-10s %-10s %10s \n"," #", "Cliente","C.Fiscale","Telefono","Email" );
		for (Cliente i : clienti) {
			System.out.print(" "+(indexC + 1) + " ");
			i.print();
			indexC++;
		}
	}

	public void printCasiLegali(int index) {
		System.out.printf("%2s %-10s %6s %-12s %10s \n"," #", "Cliente","N.Caso","Descrizione","Stato" );
		System.out.print(" 1 ");
		casiLegali.get(index - 1).print();
	}

	public void printCasilegal() {
		int indexCS = 0;
		System.out.printf("%2s %-10s %6s %-12s %10s \n"," #", "Cliente","N.Caso","Descrizione","Stato" );
		for (CasoLegale i : casiLegali) {
			System.out.print(" "+(indexCS + 1)+" ");
			i.print();
			indexCS++;
		}
	}

	public Cliente getCliente(int index) {

		return clienti.get(index - 1);

	}

	public CasoLegale getCasoLegale(int index) {
		return casiLegali.get(index - 1);
	}

	public void removeclient(int index) {
		clienti.remove(index - 1);
	}
}
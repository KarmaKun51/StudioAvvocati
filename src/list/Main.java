package list;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudioAvvocati sA = new StudioAvvocati();

		while (true) {
			System.out.println("Benvenuto allo studio");
			System.out.println("1: Nuovo cliente: ");
			System.out.println("2: Nuovo caso legale: ");
			System.out.println("3: Visualizzare i dettagli del cliente o del caso legale: ");
			System.out.println("4: Modifica caso legale: ");
			System.out.println("5: Eliminare un cliente: ");

			int scelta = 0;
			ConsistencyControl control = new ConsistencyControl(false);

			scelta = control.isANumber();

			
			switch (scelta) {
			case 1:
				System.out.println("Inserire i dati del cliente");
				System.out.println("Inserire il nome:");
				String name = scanner.next();
				System.out.println("Inserire il CF:");
				String codiceFiscale = scanner.next();
				System.out.println("Inserire il telefono:");
				String telefono = scanner.next();
				System.out.println("Inserire l'email:");
				String email = control.isAMail();
				scanner.nextLine();

				sA.getNewCliente(name, codiceFiscale, telefono, email);
				sA.getNewCliente(name, codiceFiscale, telefono, email);
				sA.getNewCliente(name, codiceFiscale, telefono, email);

				break;
			case 2:
				System.out.println("Seleziona il cliente associato al caso legale");
				sA.printClienti();
				
				int indexC2 = control.isANumber();

				Cliente client = sA.getCliente(indexC2);
				System.out.println("Nuovo caso legale: ");
				System.out.println("Inserire il numero del caso:");
				
				int numeroCaso = control.isANumber();

				System.out.println("Inserire la descrizione:");
				String descrizione = scanner.nextLine();
				System.out.println("Inserire lo stato:");
				String stato = scanner.nextLine();

				sA.getNewCasoLegale(client, numeroCaso, descrizione, stato);
				break;
			case 3:
				System.out.println("Clienti dello studio");
				sA.printClienti();
				System.out.println("Casi dello studio");
				sA.printCasilegal();
				break;
			case 4:
				System.out.println("Seleziona il caso legale da modificare");
				sA.printCasilegal();
				int indexC4 = scanner.nextInt();
				scanner.nextLine();

				CasoLegale casilega = sA.getCasoLegale(indexC4);
				System.out.println("Selezionare nuovo stato di caso legale: ");
				System.out.println("Stati possibili: In corso / Chiuso / Archiviato ");

				String stato1 = scanner.nextLine();
				casilega.setStato(stato1);
				break;
			case 5:
				System.out.println("Seleziona il cliente da eliminare");
				sA.printClienti();
				int indexS5 = control.isANumber();

				System.out.println("Cliente Archiviato");
				sA.removeclient(indexS5);
				break;
			case 0:
				System.out.println("Esci");
				System.exit(0);
				break;

			default:
				System.out.println("Scelta non valida");
				break;
			}

		}
	}
}

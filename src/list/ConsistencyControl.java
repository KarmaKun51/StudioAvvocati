package list;

import java.util.Scanner;

public class ConsistencyControl {
	
	public ConsistencyControl(Boolean IsEverithingOK) {
		this.IsEverithingOK = IsEverithingOK;
	}

	public Boolean getIsEverithingOK() {
		return IsEverithingOK;
	}

	public void setIsEverithingOK(Boolean isEverithingOK) {
		IsEverithingOK = isEverithingOK;
	}

	private Boolean IsEverithingOK = false;

	public int isANumber() {
		int scelta =0;
		Scanner scanner = new Scanner(System.in);
		while (!IsEverithingOK) {
			try {
				String input = scanner.nextLine();
				scelta = Integer.parseInt(input);
				IsEverithingOK = true;
			} catch (NumberFormatException e) {
				System.out.println("Invalid value");

			}
		}
		IsEverithingOK = false;
		return scelta;		
	}
	
	public String isAMail() {
		String mail ="";
		Scanner scanner = new Scanner(System.in);
		while (!IsEverithingOK) {
			mail = scanner.nextLine();
			Boolean containsDot = mail.contains(".");
			Boolean containsAt =mail.contains("@");
			if ( containsDot && containsAt) {
				IsEverithingOK = true;
			} else {
				System.out.println("Invalid mail value");
			}
		}
		IsEverithingOK = false;
		return mail;
	}


}

package application;

public class Fournisseur {

	private String nomF;
	private String adresseF;
	private int telephoneF;
	private String emailF;
	
	public Fournisseur(String nomF, String adresseF, int telephoneF, String emailF) {
		
		this.nomF = nomF;
		this.adresseF = adresseF;
		this.telephoneF = telephoneF;
		this.emailF = emailF;
	}

	

	public String getNomF() {
		return nomF;
	}



	public void setNomF(String nomF) {
		this.nomF = nomF;
	}



	public String getAdresseF() {
		return adresseF;
	}



	public void setAdresseF(String adresseF) {
		this.adresseF = adresseF;
	}



	public int getTelephoneF() {
		return telephoneF;
	}



	public void setTelephoneF(int telephoneF) {
		this.telephoneF = telephoneF;
	}



	public String getEmailF() {
		return emailF;
	}



	public void setEmailF(String emailF) {
		this.emailF = emailF;
	}



	@Override
	public String toString() {
		return "Fournisseur [nom=" + nomF + ", adresse=" + adresseF + ", tel=" + telephoneF + ", email=" + emailF+"]";
		// TODO Auto-generated method stub
	}


	

	
	
	
}
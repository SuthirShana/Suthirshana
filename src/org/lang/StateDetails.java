package org.lang;
//child class
public class StateDetails extends LanguageInfo {
	
	private void southIndia() {
		System.out.println("TamilNadu, Kerala, Andhra, Karnataka");

	}
	private void northIndia() {
		System.out.println("Panchap, Kashmir ");

	}
	public static void main(String[] args) {
		StateDetails s= new StateDetails();
		s.southIndia();
		s.northIndia();
		s.englishLanguage();
		s.hindiLanguage();
		s.tamilLanguage();
		
	}

}

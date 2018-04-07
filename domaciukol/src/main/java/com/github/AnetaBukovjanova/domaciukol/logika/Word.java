package com.github.AnetaBukovjanova.domaciukol.logika;

public class Word {

	private String slovoENG;
	private String slovoCZE;
	private String obrazek;
	
	public Word(String slovoENG, String slovoCZE, String obrazek) {
		this.slovoENG = slovoENG;
		this.slovoCZE = slovoCZE;
		this.obrazek = obrazek;
}
	public String getSlovoENG() {
		return slovoENG;
		
}

	public String getSlovoCZE() {
		return slovoCZE;
	}
	
	public String getObrazek() {
		return obrazek;
	}
}
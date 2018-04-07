package com.github.AnetaBukovjanova.domaciukol.logika;

import com.github.AnetaBukovjanova.domaciukol.logika.Word;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Game {

	private List<Word> slova;
	private String hadane;
	private boolean konecHry = false;
	
	public Game() {
		
		slova = new ArrayList<Word>();
		Word bear = new Word("bear", "medvěd", "/zdrojekukolu/bear.png");
		slova.add(bear);
		Word elephant = new Word("elephant", "slon", "/zdrojekukolu/elephant.png");
		slova.add(elephant);
		Word fox = new Word("fox", "liška", "/zdrojekukolu/fox.png");
		slova.add(fox);
		Word lion = new Word("lion", "lev", "/zdrojekukolu/lion.png");
		slova.add(lion);
		Word rabbit = new Word("rabbit", "králík", "/zdrojekukolu/rabbit.png");
		slova.add(rabbit);
		Word zebra = new Word("zebra", "zebra", "/zdrojekukolu/zebra.png");
		slova.add(zebra);
}
	public List<Word> getSlova(){
		return slova;
	}
	
	public String getHadane() {
    	return hadane;
    }
    
    public void vyberSlovo() {
    	Random nahodneSlovo = new Random();
    	hadane = slova.get(nahodneSlovo.nextInt(slova.size())).getSlovoENG();
    }
    
    public boolean konecHry() {
        return konecHry;
    }

}
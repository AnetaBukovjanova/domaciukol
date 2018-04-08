package com.github.AnetaBukovjanova.domaciukol.logika;

import com.github.AnetaBukovjanova.domaciukol.logika.Word;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Game {

	private List<Word> slova;
	private String hadane;
	private boolean konecHry = false;
	private Integer spravne = 0;
	private Integer spatne = 0;
	
	public Game() {
		
		slova = new ArrayList<Word>();
		Word bear = new Word("bear", "medvěd", "/ui/bear.png");
		slova.add(bear);
		Word elephant = new Word("elephant", "slon", "/ui/elephant.png");
		slova.add(elephant);
		Word fox = new Word("fox", "liška", "/ui/fox.png");
		slova.add(fox);
		Word lion = new Word("lion", "lev", "/ui/lion.png");
		slova.add(lion);
		Word rabbit = new Word("rabbit", "králík", "/ui/rabbit.png");
		slova.add(rabbit);
		Word zebra = new Word("zebra", "zebra", "/ui/zebra.png");
		slova.add(zebra);
}
	public List<Word> getSlova(){
		return slova;
	}
	
	public String getHadane() {
    	return hadane;
    }
	
	public Integer getSpravne() {
		return spravne;
	}
	
	public Integer getSpatne() {
		return spatne;
	}
    
    public void vyberSlovo() {
    	Random nahodneWord = new Random();
    	hadane = slova.get(nahodneWord.nextInt(slova.size())).getSlovoENG();
    }
    
    public boolean uhadnuto(String word) {
    	if (word.equals(hadane)) {
    		return true;
    	}
    	else
    		return false;
    }
    
    public void setVysledek(String word) {
    	if (uhadnuto(word)) {
    		spravne = spravne + 1;
    	}
    	else
    	{
    		spatne = spatne + 1;
    	}
    }
   
    public boolean konecHry() {
        return konecHry;
    }

}
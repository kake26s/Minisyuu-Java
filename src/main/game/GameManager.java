package main.game;

import java.util.*;

public class GameManager{

	//エントリー配列
	private static ArrayList<String> entry = new ArrayList<>();

	/**
	*		エントリーする
	*/
	public static boolean setEntry(String name){
		if(!GameManager.entry.contains(name)){
			GameManager.entry.add(name);
			return true;
		}
		return false;
	}
}
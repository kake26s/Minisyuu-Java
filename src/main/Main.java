package main;

import cn.nukkit.*;
import cn.nukkit.plugin.PluginBase;
//
import main.game.GameManager;
import main.event.Event;

public class Main extends PluginBase{

	//Gameオブジェクト
	private GameManager gm;

	@Override
	public void onEnable(){
		Event event = new Event();
		this.getServer().getPluginManager().registerEvents(event, this);

		this.gm = new GameManager();
	}
}
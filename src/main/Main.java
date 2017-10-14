package main;

import cn.nukkit.*;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
//event
import cn.nukkit.event.*;
import cn.nukkit.event.player.*;

public class Main extends PluginBase implements Listener{

	@Override
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player pl = e.getPlayer();
		pl.sendMessage("Hello World");
	}
}
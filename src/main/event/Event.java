package main.event;

import cn.nukkit.*;
import cn.nukkit.event.Listener;
//event
import cn.nukkit.event.*;
import cn.nukkit.event.player.*;
//chat
import main.chat.Chat;
import main.game.*;

public class Event implements Listener{

	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player pl = e.getPlayer();
		pl.sendMessage("Hello World");
	}

	@EventHandler
	public void useItem(PlayerInteractEvent e){
		Player pl = e.getPlayer();
		String name = pl.getName();
		int blockid = e.getBlock().getId();

		switch (blockid){
			case 42:
				boolean entry = GameManager.setEntry(name);
				if(entry == true){
					pl.sendMessage(Chat.system + "エントリーしました");
				}else{
					pl.sendMessage(Chat.system + "エントリーしています");
				}
				break;
		}
	}
}
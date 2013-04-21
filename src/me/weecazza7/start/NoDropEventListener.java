package me.weecazza7.start;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class NoDropEventListener implements Listener{ 

	@EventHandler
	public void NoDrop(PlayerDropItemEvent event){
	    if(event.getItemDrop().getItemStack().getType() == Material.BOWL || event.getItemDrop().getItemStack().getType() == Material.MUSHROOM_SOUP)//gomeow helped
	    {
	    	event.getItemDrop().remove();
		}
}
}

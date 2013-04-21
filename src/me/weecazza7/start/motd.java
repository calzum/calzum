package me.weecazza7.start;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class motd implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		p.sendMessage(ChatColor.BLUE + "=====================================================");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage(ChatColor.BOLD  + "         Welcome " + p.getDisplayName() + " to Calzums Server");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage(ChatColor.BLUE + "=====================================================");
	}
}
	
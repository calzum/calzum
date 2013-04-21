package me.weecazza7.start;

import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignEventListener implements Listener {
	
	@EventHandler
	public void onSignChange(SignChangeEvent e) {
		if (e.getLine(0).equalsIgnoreCase("[HEAL]")) {
			e.setLine(0,  "§3[Heal]");
			e.setLine(1, "§3Click to");
			e.setLine(2, "§3Heal");
		}
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if (e.getClickedBlock().getState() instanceof Sign) {
			Sign s = (Sign) e.getClickedBlock().getState();
			if (s.getLine(0).equalsIgnoreCase("[HEAL]")) {
				e.getPlayer().setHealth(20);
				e.getPlayer().sendMessage(ChatColor.GREEN + "You were healed");
			}
		}
	}

}

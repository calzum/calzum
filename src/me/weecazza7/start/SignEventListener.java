package me.weecazza7.start;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.ItemMeta;

public class SignEventListener implements Listener {
	
	@EventHandler
	public void onSignChange(SignChangeEvent e) {
		if (e.getLine(0).equalsIgnoreCase("[Buys2]")) {
			e.setLine(0,  "§4[Buy]");
			e.setLine(1, "§3Buy Sharp 2");
			e.setLine(2, "§3 10xp");
		}
			
		}
			
	
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {//
		Player p = e.getPlayer();
		int getxp = p.getLevel();
		if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if (e.getClickedBlock().getState() instanceof Sign) {
			Sign s = (Sign) e.getClickedBlock().getState();
			if (s.getLine(0).equalsIgnoreCase("§4[Buy]")) {
				if(p.getInventory().getItemInHand().getType() == Material.DIAMOND_SWORD){
				if(getxp>=50){
				p.sendMessage(ChatColor.BLUE + "[Shop]" + ChatColor.GREEN + "You Bought a upgrade!");
				p.setLevel(getxp-50);
				p.getInventory().getItemInHand().addEnchantment(Enchantment.DAMAGE_ALL, 2);
				return;
			}}{{
				e.getPlayer().sendMessage(ChatColor.BLUE + "[Shop]"+ ChatColor.RED + "You do not have enough xp or the item cannot be enchanted!");
			}}
			}
		}
	}
}



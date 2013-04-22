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
		if (e.getLine(0).equalsIgnoreCase("[Buys3]")) {
			e.setLine(0,  "§4[Buy]");
			e.setLine(1, "§3Buy Sharp 3");
			e.setLine(2, "§3 30xp");
		}
		if (e.getLine(0).equalsIgnoreCase("[Buys4]")) {
			e.setLine(0,  "§4[Buy]");
			e.setLine(1, "§3Buy Sharp 4");
			e.setLine(2, "§3 60xp");
		}
		if (e.getLine(0).equalsIgnoreCase("[Buys5]")) {
			e.setLine(0,  "§4[Buy]");
			e.setLine(1, "§3Buy Sharp 5");
			e.setLine(2, "§3 100xp");
		}
			
		}
			
	
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {//
		Player p = e.getPlayer();
		int getxp = p.getLevel();
		if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if (e.getClickedBlock().getState() instanceof Sign) {
			Sign s = (Sign) e.getClickedBlock().getState();
			if (s.getLine(1).equalsIgnoreCase("§3Buy Sharp 2")) {
				if(p.getInventory().getItemInHand().getType() == Material.DIAMOND_SWORD){
				if(getxp>=10){
				p.sendMessage(ChatColor.BLUE + "[Shop]" + ChatColor.GREEN + "You Bought a upgrade!");
				p.setLevel(getxp-10);
				p.getInventory().getItemInHand().addEnchantment(Enchantment.DAMAGE_ALL, 2);
				return;
			}}{{
				e.getPlayer().sendMessage(ChatColor.BLUE + "[Shop]"+ ChatColor.RED + "You do not have enough xp or the item cannot be enchanted!");
			}}
			}
		}
		if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if (e.getClickedBlock().getState() instanceof Sign) {
			Sign s = (Sign) e.getClickedBlock().getState();
			if (s.getLine(1).equalsIgnoreCase("§3Buy Sharp 3")) {
				if(p.getInventory().getItemInHand().getType() == Material.DIAMOND_SWORD){
				if(getxp>=30){
				p.sendMessage(ChatColor.BLUE + "[Shop]" + ChatColor.GREEN + "You Bought a upgrade!");
				p.setLevel(getxp-30);
				p.getInventory().getItemInHand().addEnchantment(Enchantment.DAMAGE_ALL, 3);
				return;
			}}{{
				e.getPlayer().sendMessage(ChatColor.BLUE + "[Shop]"+ ChatColor.RED + "You do not have enough xp or the item cannot be enchanted!");
			}}
			}
		}
		if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if (e.getClickedBlock().getState() instanceof Sign) {
			Sign s = (Sign) e.getClickedBlock().getState();
			if (s.getLine(1).equalsIgnoreCase("§3Buy Sharp 4")) {
				if(p.getInventory().getItemInHand().getType() == Material.DIAMOND_SWORD){
				if(getxp>=60){
				p.sendMessage(ChatColor.BLUE + "[Shop]" + ChatColor.GREEN + "You Bought a upgrade!");
				p.setLevel(getxp-60);
				p.getInventory().getItemInHand().addEnchantment(Enchantment.DAMAGE_ALL, 4);
				return;
			}}{{
				e.getPlayer().sendMessage(ChatColor.BLUE + "[Shop]"+ ChatColor.RED + "You do not have enough xp or the item cannot be enchanted!");
			}}
			}
		}
		if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if (e.getClickedBlock().getState() instanceof Sign) {
			Sign s = (Sign) e.getClickedBlock().getState();
			if (s.getLine(1).equalsIgnoreCase("§3Buy Sharp 5")) {
				if(p.getInventory().getItemInHand().getType() == Material.DIAMOND_SWORD){
				if(getxp>=100){
				p.sendMessage(ChatColor.BLUE + "[Shop]" + ChatColor.GREEN + "You Bought a upgrade!");
				p.setLevel(getxp-100);
				p.getInventory().getItemInHand().addEnchantment(Enchantment.DAMAGE_ALL, 5);
				return;
			}}{{
				e.getPlayer().sendMessage(ChatColor.BLUE + "[Shop]"+ ChatColor.RED + "You do not have enough xp or the item cannot be enchanted!");
			}}
			}
		}
	}
}



package me.weecazza7.start;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SoupCommandExecutor implements CommandExecutor{
private SoupCommandExecutor myExecutor;
 
 public SoupCommandExecutor(MainPvP plugin) {

 } 
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
   Player p = (Player) sender;
   Inventory pi = p.getInventory();
   int getxp = p.getLevel();
	if(getxp>=2){
	p.sendMessage(ChatColor.BLUE + "[Shop]" + ChatColor.GREEN + "You Bought a upgrade!");
    p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 5));
    p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 100, 5));
      ItemStack getSoup = new ItemStack(Material.MUSHROOM_SOUP, 1);
      for(int i=1; i <=34; i++)
      {
      pi.addItem(getSoup);
      }

	}
	return false;
 }
}

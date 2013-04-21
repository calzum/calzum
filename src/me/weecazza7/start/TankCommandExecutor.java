package me.weecazza7.start;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TankCommandExecutor implements CommandExecutor {
	private TankCommandExecutor myExecutor;
	
	public TankCommandExecutor(MainPvP plugin) {
		
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		Inventory pi = p.getInventory();
		p.sendMessage(ChatColor.GREEN + "You are now a TANK");
		p.getInventory().clear();
	    pi.addItem(getfood());
	    pi.addItem(getsword());
	    p.getInventory().setHelmet(gethelm());
	    p.getInventory().setChestplate(getchest());
	    p.getInventory().setLeggings(getlegs());
	    p.getInventory().setBoots(getboot());
	    
		
		return false;
		
	}
	public static ItemStack getfood(){
		ItemStack itemStack = new ItemStack(Material.COOKED_BEEF, 5);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName("�bThe only way!");
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}
	public static ItemStack getsword(){
		ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		itemMeta.setDisplayName("�bThe Knight's Sharp Sword!");
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}
	public static ItemStack gethelm(){
		ItemStack itemStack = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName("�bThe Knight's Helm");
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}
	public static ItemStack getchest(){
		ItemStack itemStack = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName("�bThe Knight's Chestplate");
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}
	public static ItemStack getlegs(){
		ItemStack itemStack = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName("�bThe Knight's Pants");
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}
	public static ItemStack getboot(){
		ItemStack itemStack = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta itemMeta = itemStack.getItemMeta();
		itemMeta.setDisplayName("�bThe Knight's Boots");
		itemStack.setItemMeta(itemMeta);
		return itemStack;
	}

	public TankCommandExecutor getMyExecutor() {
		return myExecutor;
	}

	public void setMyExecutor(TankCommandExecutor myExecutor) {
		this.myExecutor = myExecutor;
	}


	

}

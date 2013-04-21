package me.weecazza7.start;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ArcherCommandExecutor implements CommandExecutor{
private ArcherCommandExecutor myExecutor;
	
	public ArcherCommandExecutor(MainPvP plugin) {

	}	
		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			Player p = (Player) sender;
			Inventory pi = p.getInventory();
			p.sendMessage("§6You Are Now A Archer!");
			p.getInventory().clear();
			p.getInventory().setArmorContents(null);
			  for(PotionEffect effect : p.getActivePotionEffects())
              {
                  p.removePotionEffect(effect.getType());
              }
		    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 2400000, 0));
		    p.getInventory().setHelmet(getHelmet());
		    p.getInventory().setChestplate(getchestplate());
		    p.getInventory().setLeggings(getleggins());
		    p.getInventory().setBoots(getboots());
		    p.getInventory().addItem(getbow());
		    ItemStack getSoup = new ItemStack(Material.MUSHROOM_SOUP, 1);
		    for(int i=1; i <=34; i++)
		    {
		    pi.addItem(getSoup);
		    }
			p.getInventory().addItem(getarrow());
			return false; 
	}
		
		
		//							ARMOUR & Swords									//
		public static ItemStack getHelmet(){
			ItemStack itemStack = new ItemStack(Material.IRON_HELMET);
			ItemMeta itemMeta = itemStack.getItemMeta();
			itemMeta.setDisplayName("§bArchers Capeline!");
			itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			itemStack.setItemMeta(itemMeta);
			return itemStack;
		}
		public static ItemStack getchestplate(){
			ItemStack itemStack = new ItemStack(Material.IRON_CHESTPLATE);
			ItemMeta itemMeta = itemStack.getItemMeta();
			itemMeta.setDisplayName("§bArchers Robe Top");
			itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			itemStack.setItemMeta(itemMeta);
			return itemStack;
		}
		public static ItemStack getleggins(){
			ItemStack itemStack = new ItemStack(Material.IRON_LEGGINGS);
			ItemMeta itemMeta = itemStack.getItemMeta();
			itemMeta.setDisplayName("§bArchers robe bottoms!");
			itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			itemStack.setItemMeta(itemMeta);
			return itemStack;
		}
		
		public static ItemStack getboots(){
			ItemStack itemStack = new ItemStack(Material.IRON_BOOTS);
			ItemMeta itemMeta = itemStack.getItemMeta();
			itemMeta.setDisplayName("§bArchers Mystical Boots!");
			itemMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
			itemStack.setItemMeta(itemMeta);
			return itemStack;
		}
		public static ItemStack getbow(){
			ItemStack itemStack = new ItemStack(Material.BOW);
			ItemMeta itemMeta = itemStack.getItemMeta();
			itemMeta.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
			itemMeta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
			itemMeta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
			itemMeta.setDisplayName("§4Power Bow!");
			itemStack.setItemMeta(itemMeta);
			return itemStack;
		}
		public static ItemStack getarrow(){
			ItemStack itemStack = new ItemStack(Material.ARROW);
			ItemMeta itemMeta = itemStack.getItemMeta();
			itemMeta.setDisplayName("§4The Last Arrow!");
			itemStack.setItemMeta(itemMeta);
			return itemStack;
		}
		public static ItemStack getsword(){
			ItemStack itemStack = new ItemStack(Material.ARROW);
			ItemMeta itemMeta = itemStack.getItemMeta();
			itemMeta.setDisplayName("§4The Last Arrow!");
			itemStack.setItemMeta(itemMeta);
			return itemStack;
		}
}

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
import org.bukkit.potion.PotionEffect;

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
  p.getInventory().setArmorContents(null);
    for(PotionEffect effect : p.getActivePotionEffects())
        {
            p.removePotionEffect(effect.getType());
        }
     pi.addItem(getsword());
     p.getInventory().setHelmet(gethelm());
     p.getInventory().setChestplate(getchest());
     p.getInventory().setLeggings(getlegs());
     p.getInventory().setBoots(getboot());
     ItemStack getSoup = new ItemStack(Material.MUSHROOM_SOUP, 1);
     for(int i=1; i <=34; i++)
     {
     pi.addItem(getSoup);
     }
     
  
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
  ItemStack itemStack = new ItemStack(Material.IRON_SWORD);
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
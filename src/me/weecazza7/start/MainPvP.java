package me.weecazza7.start;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MainPvP extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getServer().getLogger().info("Enabled");
		PluginManager manager = this.getServer().getPluginManager();
		manager.registerEvents(new OnJoinEventListener(), this);
		manager.registerEvents(new SignEventListener(), this);
		getCommand("kit").setExecutor(new KitCommandExecutor(this));
		getCommand("tank").setExecutor(new TankCommandExecutor(this));
		
	}
	public void onDisable() {
		Bukkit.getServer().getLogger().info("Disabled");
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		if(!(sender instanceof Player)) {
			sender.sendMessage("ERROR! Player use only!");
			return true;
			
		}
		
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("heal")) {
			if (args.length == 0) {
				player.setHealth(20);
				player.sendMessage(ChatColor.GREEN + "You have been Healed!");
				return true;	
		}
		Player target = Bukkit.getServer().getPlayer(args[0]);
		if (target == null) {
			player.sendMessage(ChatColor.RED + "Could not find player");
			return true;
		}
		target.setHealth(20);
		target.sendMessage(ChatColor.BLUE + "You have been healed");
		player.sendMessage(ChatColor.BLUE + target.getName() + " Healed!");
	}
		
		
		if(cmd.getName().equalsIgnoreCase("kill")) {
			if (args.length == 0) {
				player.setHealth(0);
				player.sendMessage(ChatColor.GREEN + "You have been Killed");
				return true;	
		}
		Player target = Bukkit.getServer().getPlayer(args[0]);
		if (target == null) {
			player.sendMessage(ChatColor.RED + "Could not find player");
			return true;
		}
		target.setHealth(0);
		target.sendMessage("You have been killed");
		player.sendMessage(ChatColor.GREEN + target.getName() + " killed!");
	}
		
		
		if(cmd.getName().equalsIgnoreCase("feed")) {
			if (args.length == 0) {
				player.setFoodLevel(20);
				player.sendMessage(ChatColor.GREEN + "You have been fed");
				return true;	
		}
		Player target = Bukkit.getServer().getPlayer(args[0]);
		if (target == null) {
			player.sendMessage(ChatColor.RED + "Could not find player");
			return true;
		}
		target.setFoodLevel(20);
		target.sendMessage(ChatColor.BLUE + "You have been fed");
		player.sendMessage(ChatColor.BLUE + target.getName() + " fed!");
	}
		
				
		if(cmd.getName().equalsIgnoreCase("start")) {
			player.sendMessage("Well done!");
		}
		
		return false;
	}
}

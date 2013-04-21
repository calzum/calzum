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
		manager.registerEvents(new NoDropDeadEventListener(), this);
		manager.registerEvents(new NoDropEventListener(), this);
		manager.registerEvents(new SoupEventListener(), this);
		getCommand("kit").setExecutor(new KitCommandExecutor(this));
		getCommand("tank").setExecutor(new TankCommandExecutor(this));
		getCommand("archer").setExecutor(new ArcherCommandExecutor(this));
		
	}
	public void onDisable() {
		Bukkit.getServer().getLogger().info("Disabled");
		
	}
}

package me.weecazza7.start;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class kits implements CommandExecutor{
private kits myExecutor;
	
	public kits(start plugin) {

	}
	
		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			Player p = (Player) sender;
			p.sendMessage(ChatColor.GREEN + "--Kit List--");
			p.sendMessage("Archer, Knight, Farmer, Tank");
			
			return false;
		
		}

		public kits getMyExecutor() {
			return myExecutor;
		}

		public void setMyExecutor(kits myExecutor) {
			this.myExecutor = myExecutor;
		}
}

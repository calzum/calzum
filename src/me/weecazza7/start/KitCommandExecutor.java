package me.weecazza7.start;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class KitCommandExecutor implements CommandExecutor{
private KitCommandExecutor myExecutor;
	
	public KitCommandExecutor(MainPvP plugin) {

	}
	
		@Override
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			Player p = (Player) sender;
			p.sendMessage(ChatColor.GREEN + "--Kit List--");
			p.sendMessage("Archer, Knight, Farmer, Tank");
			
			return false;
		
		}

		public KitCommandExecutor getMyExecutor() {
			return myExecutor;
		}

		public void setMyExecutor(KitCommandExecutor myExecutor) {
			this.myExecutor = myExecutor;
		}
}

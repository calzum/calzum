package me.weecazza7.start;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class NoDropDeadEventListener implements Listener{ 

	@EventHandler(priority = EventPriority.HIGHEST)
	public void PlayerDeathEvent(PlayerDeathEvent event){
		Player p = event.getEntity();
		Player k = event.getEntity().getKiller();
        p.playSound(p.getLocation(), Sound.AMBIENCE_THUNDER , 1007, 0);
        p.playEffect(p.getLocation(), Effect.SMOKE , 10);
		event.getDrops().clear();
		event.setKeepLevel(true);
		if(k instanceof Player){
		k.giveExpLevels(2);
		}
		event.setDroppedExp(0);
		
}
}

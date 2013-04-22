package me.weecazza7.start;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class SoundOnDeathListener implements Listener {
	
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDeath(PlayerDeathEvent e) 
    {
        Player p = e.getEntity();
        p.playSound(p.getLocation(), Sound.AMBIENCE_THUNDER , 1007, 0);
        p.playEffect(p.getLocation(), Effect.SMOKE , 10);

    }
}

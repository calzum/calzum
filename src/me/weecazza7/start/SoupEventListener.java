package me.weecazza7.start;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class SoupEventListener implements Listener{
	@EventHandler
	public void onPlayerClick(PlayerInteractEvent event)
	{
		Player p = event.getPlayer();
		int currhealth = p.getHealth();
		int SoupHeal = 6;//The ammount Soup Heals
		int MaxHealth = 20;//Max Health Heal
		 if((event.getAction() == Action.RIGHT_CLICK_BLOCK) || (event.getAction() == Action.RIGHT_CLICK_AIR))
		 {
			if(p.getItemInHand().getType() == Material.MUSHROOM_SOUP)
			{
				if(p.getHealth()== 20){
					event.setCancelled(true);
					
				}else{
					if(p.getHealth() < 14)//16
					{
						p.setHealth(currhealth + SoupHeal);
						p.setItemInHand(new ItemStack(Material.BOWL, 1));
						event.setCancelled(true);
					}else{
						if(p.getHealth() >= 14)
							p.setHealth(MaxHealth);
							p.setItemInHand(new ItemStack(Material.BOWL, 1));
							event.setCancelled(true);
						}
				}
			}//7
		 }
	}
}





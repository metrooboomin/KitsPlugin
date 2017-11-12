package net.dragonsdoom.metro.kitpvp.Kits.Sniper;

import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class SniperEVENT implements Listener {
	
    @EventHandler
    public void onBowDraw(PlayerInteractEvent e) { // if player draws their bow, this event should trigger.
    	if (!KitArrays.sniperUsed.contains(e.getPlayer().getName())) // if they aren't in this arraylist, then don't continue.
    		return;
    	if (e.getItem() == null || e.getItem().getType() != Material.BOW) // if the item is null or the item is not a bow, don't continue.
    		return;
        final Player p = (Player) e.getPlayer();
        if (p.getItemInHand().hasItemMeta() && p.getItemInHand().getItemMeta().hasDisplayName()) {
        	if (p.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Sniper")) { //bow's name is Sniper in Red, changeable
        		if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK) || e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
        			KitArrays.bowDrawn.add(p.getName()); // adds them to the list of people drawing back a bow/holding back their bow.
        			
        			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 1)); // slowness effect
        		}
        	}
        }
    }
    
    @EventHandler
    public void onBowRelease(EntityShootBowEvent e) { // if a player shoot an arrow.
    	if (!(e.getEntity() instanceof Player)) // if player is not player, do not continue.
    		return;
    	Player p = (Player) e.getEntity();
    	if (!KitArrays.sniperUsed.contains(p.getName())) // if player is not using the sniper kit, do not continue.
    		return;
    	if (KitArrays.bowDrawn.contains(p.getName())) // if bow is drawn back and they fired the shot, remove them from the bow drawing list.
    		KitArrays.bowDrawn.remove(p.getName());
    	
    	p.removePotionEffect(PotionEffectType.SLOW); // remove their slowness effect.
    }
    
    @EventHandler
    public void onChangeSlot(PlayerItemHeldEvent e) { // if player changes their item in hand.
    	Player p = e.getPlayer();
    	if (KitArrays.bowDrawn.contains(p.getName())) {
    		KitArrays.bowDrawn.remove(p.getName());
    		p.removePotionEffect(PotionEffectType.SLOW);
    	}
    }
}

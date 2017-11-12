package net.dragonsdoom.metro.kitpvp.Kits.Turtle;

import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class TurtleEVENT implements Listener {
    @EventHandler
    public void onDamageFromBehind(EntityDamageByEntityEvent e){
        String receiver = e.getEntity().getName();
        double f = e.getDamage() / 2.0;
        if (e.getCause().equals(EntityDamageEvent.DamageCause.ENTITY_ATTACK)) {
            if (KitArrays.turtleUsed.contains(receiver)) {
                e.setDamage(f);
            }
        }
    }
}

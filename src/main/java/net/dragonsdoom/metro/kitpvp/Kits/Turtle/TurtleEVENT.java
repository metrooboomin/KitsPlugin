package net.dragonsdoom.metro.kitpvp.Kits.Turtle;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.util.Vector;

public class TurtleEVENT implements Listener {
    @EventHandler
    public void onEntityAttacked(EntityDamageByEntityEvent event) {
        //only interested in players getting attacked by players
        if ((event.getEntity() instanceof Player) && (event.getDamager() instanceof Player)) {
            //get each player's direction
            Vector attackerDirection = event.getDamager().getLocation().getDirection();
            Vector victimDirection = event.getEntity().getLocation().getDirection();
            //determine if the dot product between the vectors is greater than 0
            if (attackerDirection.dot(victimDirection) > 0) {
                //player was backstabbed
                double d = event.getDamage();
                event.setDamage(.5 / d);

            }
        }
    }
}
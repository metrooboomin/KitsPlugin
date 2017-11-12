package net.dragonsdoom.metro.kitpvp.Kits.Snail;

import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class SnailEVENT implements Listener {
    @EventHandler
    public void Damage(EntityDamageByEntityEvent e){
        Player defender = (Player)e.getEntity();
        Player damager = (Player)e.getDamager();
        if (KitArrays.snailUsed.contains(damager.getName())) {
            Random random = new Random();
            if (random.nextInt(100) <= 33) {
                defender.addPotionEffect(
                new PotionEffect(PotionEffectType.SLOW, 1, 140), true);
            }
        }
    }
}

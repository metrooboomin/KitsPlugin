package net.dragonsdoom.metro.kitpvp.Utils;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.potion.PotionEffect;

public class DeathEvent implements Listener {
    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        //KITS IN GENERAL
        KitArrays.kitUsed.remove(e.getEntity().getName());

        //NINJA
        KitArrays.ninjaUSED.remove(e.getEntity().getName());


        //KANGAROO
        KitArrays.kangaUsed.remove(e.getEntity().getName());
        //FISHERMAN?
        KitArrays.fisherUsed.remove(e.getEntity().getName());


        //GHOST
        KitArrays.ghostUsed.remove(e.getEntity().getName());
        KitArrays.ghostWAIT.remove(e.getEntity().getName());


        //PIKACHU
        KitArrays.pikaUsed.remove(e.getEntity().getName());
        KitArrays.pikaWAIT.remove(e.getEntity().getName());

        //TAMER
        KitArrays.tamerUsed.remove(e.getEntity().getName());
        KitArrays.tamerWAIT.remove(e.getEntity().getName());
        //Switcher
        KitArrays.switcherUsed.remove(e.getEntity().getName());

        //HULK
        KitArrays.hulkUsed.remove(e.getEntity().getName());
        //TURTLE
        KitArrays.turtleUsed.remove(e.getEntity().getName());

    }
    @EventHandler
    public void onRespawn(PlayerRespawnEvent e) {
        Player p = e.getPlayer();

        for (PotionEffect effect : p.getActivePotionEffects())
            p.removePotionEffect(effect.getType());



    }
}


package net.dragonsdoom.metro.kitpvp.Kits.Matrix;

import net.dragonsdoom.metro.kitpvp.KitPvP;
import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public class MatrixEVENT implements Listener {
    public ArrayList<String> frozen = new ArrayList<>();

    @EventHandler
    public void onClockStop(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if ((p.getItemInHand().getType().equals(Material.WATCH)) && (
                (e.getAction() == Action.RIGHT_CLICK_AIR) ||
                        (e.getAction() == Action.RIGHT_CLICK_BLOCK))) {
            if (KitArrays.matrixWAIT.contains(p.getName())) {
                p.sendMessage(ChatColor.AQUA + "Your kit is still on cooldown.");
                return;
            }
                if (KitArrays.matrixUsed.contains(p.getName())) {
                    List<Entity> nearbyEntities = e.getPlayer().getNearbyEntities(5.0D, 5.0D, 5.0D);
                    for (Entity target : nearbyEntities) {
                        if ((target instanceof Player)) {
                            final Player t = (Player) target;
                            frozen.add(t.getName());
                            t.sendMessage(ChatColor.RED + "A timelord froze you!");
                            t.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 5));
                            Bukkit.getServer().getScheduler().runTaskLater(KitPvP.getInstance(), new Runnable() {
                                public void run() {
                                    frozen.remove(t.getName());
                                    t.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 300, 2));
                                }
                            }, 100L);
                        }
                    }
                }
            }
        }
    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        if (frozen.contains(e.getPlayer().getName())) {
            e.getPlayer().teleport(e.getPlayer());
        }
    }
}

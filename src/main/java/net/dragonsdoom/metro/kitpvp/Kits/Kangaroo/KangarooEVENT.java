package net.dragonsdoom.metro.kitpvp.Kits.Kangaroo;

import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.HashMap;

public class KangarooEVENT implements Listener {
    HashMap<Player, Integer> jumped = new HashMap<Player, Integer>();

    @SuppressWarnings("deprecation")
    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        final Player p = e.getPlayer();
        Action a = e.getAction();
        if (a == Action.RIGHT_CLICK_BLOCK || a == Action.RIGHT_CLICK_AIR || a == Action.LEFT_CLICK_BLOCK || a == Action.LEFT_CLICK_AIR) {
            if (KitArrays.kangaUsed.contains(e.getPlayer().getName())) {
                if (p.getItemInHand().getType() == Material.FIREWORK) {
                    e.setCancelled(true);
                    if (!(jumped.containsKey(p))) {
                        if (!(p.isSneaking())) {
                            if (!(p.isOnGround())) {
                                jumped.put(p, 1);
                                p.setVelocity(p.getLocation().getDirection().multiply(0.3D).setY(1.0D));
                            } else {
                                p.setVelocity(p.getLocation().getDirection().multiply(0.3D).setY(1.0D));
                            }
                        } else {
                            if (!(p.isOnGround())) {
                                p.getLocation().getDirection().multiply(0.84D).setY(0.5D);
                                jumped.put(p, 1);
                            } else {
                                p.setVelocity(p.getLocation().getDirection().multiply(1.1D).setY(0.5D));
                            }
                        }
                    }
                }

            }

        }

    }
    @EventHandler
    public void onMove(PlayerMoveEvent e) {

        if (!(e.getPlayer().getLocation().getBlock().getRelative(BlockFace.DOWN).getType() == Material.AIR)) {
            if (jumped.containsKey(e.getPlayer())) {
                jumped.remove(e.getPlayer());
            }
        }
    }
    @EventHandler
    public void onEntityDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            if (KitArrays.kangaUsed.contains(p.getName())) {
                if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                    e.setCancelled(true);
                }
            }
        }
    }
}
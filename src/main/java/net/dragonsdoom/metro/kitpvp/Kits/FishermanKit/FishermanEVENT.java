package net.dragonsdoom.metro.kitpvp.Kits.FishermanKit;

import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

public class FishermanEVENT implements Listener {
    @EventHandler
    public void fisherman(PlayerFishEvent event) {
        final Player player = event.getPlayer();

        if (KitArrays.fisherUsed.contains(player.getName())) {
                Player fisher = event.getPlayer();
                if (event.getState() == PlayerFishEvent.State.CAUGHT_ENTITY) {
                    if (event.getCaught().getType() == EntityType.PLAYER) {
                        Player caught = (Player) event.getCaught();
                        World w = fisher.getLocation().getWorld();
                        double x = fisher.getLocation().getBlockX() + 0.5D;
                        double y = fisher.getLocation().getBlockY();
                        double z = fisher.getLocation().getBlockZ() + 0.5D;
                        float yaw = caught.getLocation().getYaw();
                        float pitch = caught.getLocation().getPitch();
                        Location loc = new Location(w, x, y, z, yaw, pitch);
                        caught.teleport(loc);
                    }
                }
        }
    }
}

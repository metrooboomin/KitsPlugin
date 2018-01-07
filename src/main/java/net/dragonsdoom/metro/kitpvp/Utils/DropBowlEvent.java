package net.dragonsdoom.metro.kitpvp.Utils;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropBowlEvent implements Listener {
    @EventHandler
    public void onDropBowl(PlayerDropItemEvent e) {
        if (e.getItemDrop().getItemStack().getType() == Material.BOWL) {
            e.getItemDrop().remove();
        }
    }
}

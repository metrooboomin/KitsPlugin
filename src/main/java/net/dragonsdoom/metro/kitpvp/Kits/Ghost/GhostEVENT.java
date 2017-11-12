package net.dragonsdoom.metro.kitpvp.Kits.Ghost;

import net.dragonsdoom.metro.kitpvp.KitPvP;
import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GhostEVENT implements Listener {
    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerMove(PlayerMoveEvent event) {
        Player p = (Player) event.getPlayer();
        if (KitArrays.ghostUsed.contains(p.getName())){
            if(p.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
                p.getInventory().setHelmet(null);
            }else{
                p.getEyeLocation().getWorld().playEffect(p.getLocation(), Effect.SMOKE, 1);
                ItemStack skull = new ItemStack(Material.SKULL_ITEM);
                p.getInventory().setHelmet(skull);
            }

        }
    }



    @EventHandler
    public void GhostUse(PlayerInteractEvent event) {
        final Player player = event.getPlayer();
        if(KitArrays.ghostUsed.contains(player.getName())) {
            if (player.getItemInHand().getType() == Material.CLAY_BALL) {
                if (event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.RIGHT_CLICK_AIR) {
                    if (KitArrays.ghostWAIT.contains(player.getName())){
                        player.sendMessage(ChatColor.RED + "Ghost Ability is currently on cooldown!");
                    }else{
                        player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 300, 2));
                        player.sendMessage(ChatColor.RED + "Ghost Ability has now been used!");
                        KitArrays.ghostWAIT.add(player.getName());
                        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(KitPvP.getInstance(), new Runnable() {
                            public void run() {
                                if (KitArrays.ghostWAIT.contains(player.getName())){
                                    KitArrays.ghostWAIT.remove(player.getName());
                                    player.sendMessage(ChatColor.RED + "Ghost Ability is no longer on cooldown");
                                }
                            }
                        } ,400L);
                    }
                }
            }
        }
    }
}

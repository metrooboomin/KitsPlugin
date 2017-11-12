package net.dragonsdoom.metro.kitpvp.Kits.PikachuKIT;

import net.dragonsdoom.metro.kitpvp.KitPvP;
import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PikachuEVENT implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e){
        ItemStack Thundershock = new ItemStack(Material.GOLD_AXE, 1);
        ItemMeta thundermeta = (ItemMeta) Thundershock.getItemMeta();
        thundermeta.setDisplayName(ChatColor.RED + "Thundershock");
        final Player p = (Player) e.getPlayer();
        if(p.getItemInHand().hasItemMeta()){
            if(p.getItemInHand().getItemMeta().hasDisplayName()){
                if(p.getItemInHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Thundershock")){
                    if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
                        if (KitArrays.pikaUsed.contains(p.getName())){
                            if (KitArrays.pikaWAIT.contains(p.getName())){
                                p.sendMessage(ChatColor.RED + "Your Thunderschock is still charging!");
                            }
                            else{
                                p.getWorld().strikeLightning(p.getWorld().getHighestBlockAt(e.getClickedBlock().getLocation()).getLocation());
                                KitArrays.pikaWAIT.add(p.getName());
                                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(KitPvP.getInstance(),  new Runnable() {
                                    public void run() {
                                        if (KitArrays.pikaWAIT.contains(p.getName())){
                                            KitArrays.pikaWAIT.remove(p.getName());
                                            p.sendMessage(ChatColor.RED + "Your Thundershock is no longer charging!");
                                        }
                                    }
                                } ,100);
                            }
                        }
                    }
                }
            }
        }
    }
    @EventHandler
    public void onIgnite(BlockIgniteEvent event) {
        if(event.getCause() == BlockIgniteEvent.IgniteCause.LIGHTNING) {
            event.setCancelled(true);
        }
    }

    @EventHandler (priority = EventPriority.NORMAL)
    public void onDamage (EntityDamageEvent damage) {
        if (damage.getEntity() instanceof Player) {
            Player damaged = (Player) damage.getEntity();
            if (KitArrays.pikaUsed.contains(damaged.getName())) {
                if(damage.getCause() == EntityDamageEvent.DamageCause.LIGHTNING)
                    damage.setDamage(0.0);
                return;
            }else{
                damage.setDamage(8.5);
                return;
            }
        }
    }
}

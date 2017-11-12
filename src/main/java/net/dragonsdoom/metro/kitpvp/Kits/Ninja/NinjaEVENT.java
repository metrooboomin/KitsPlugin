package net.dragonsdoom.metro.kitpvp.Kits.Ninja;

import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Egg;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NinjaEVENT implements Listener {
    @EventHandler
    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
        if ((event.getEntity() instanceof Player)) {
            LivingEntity pl = (LivingEntity) event.getEntity();
            if ((event.getDamager() instanceof Egg)) {
                Egg damager = (Egg)event.getDamager();
                if ((damager.getShooter() instanceof Player)) {

                    Player shooter = (Player)damager.getShooter();
                    if(KitArrays.ninjaUSED.contains(shooter.getName())) {
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 1));
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100 , 2));
                        pl.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100 , 2));
                        shooter.sendMessage(ChatColor.RED + "You have hit " + ((Player)pl).getName() + "!");
                        ((Player) pl).sendMessage(ChatColor.RED + "You have been hit by a Darkness ball.");



                    }

                }
            }
        }
    }
    @EventHandler
    public void onKill(PlayerDeathEvent e) {
        if(e.getEntity() instanceof Player && e.getEntity().getKiller() instanceof Player) {

            Player killer = e.getEntity().getKiller();
            Inventory iv = killer.getInventory();
            if(KitArrays.ninjaUSED.contains(killer.getName())) {
                killer.sendMessage(ChatColor.GREEN + "You have received 1 Darkness Ball");
                ItemStack snowball = new ItemStack(Material.EGG);
                ItemMeta featherMeta = snowball.getItemMeta();
                featherMeta.setDisplayName(ChatColor.RED + "Darkness Ball");
                snowball.setItemMeta(featherMeta);
                iv.addItem(snowball);
            }
        }
    }
}

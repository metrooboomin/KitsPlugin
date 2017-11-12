 package net.dragonsdoom.metro.kitpvp.Kits.Switcher;
 import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
 import org.bukkit.Location;
 import org.bukkit.entity.Player;
 import org.bukkit.entity.Snowball;
 import org.bukkit.event.EventHandler;
 import org.bukkit.event.Listener;
 import org.bukkit.event.entity.EntityDamageByEntityEvent;

 public class SwitcherEVENT implements Listener {
    @EventHandler
    public void SwitcherEvent(EntityDamageByEntityEvent e) {
        Snowball s = (Snowball)e.getDamager();
        Player shooter = (Player)s.getShooter();
        Location location = shooter.getLocation();
        if (e.getDamager() instanceof Snowball && e.getEntity() instanceof Player) {
            if ((s.getShooter() instanceof Player)) {
                if (KitArrays.switcherUsed.contains(shooter.getName())) {
                    shooter.teleport(e.getEntity().getLocation());
                    e.getEntity().teleport(location);
                }
            }
        }
    }
}
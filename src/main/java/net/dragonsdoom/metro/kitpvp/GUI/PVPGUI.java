package net.dragonsdoom.metro.kitpvp.GUI;


        import org.bukkit.Bukkit;
        import org.bukkit.ChatColor;
        import org.bukkit.Sound;
        import org.bukkit.entity.Player;
        import org.bukkit.event.EventHandler;
        import org.bukkit.event.Listener;
        import org.bukkit.event.inventory.InventoryClickEvent;
        import org.bukkit.inventory.Inventory;

public class PVPGUI implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getCurrentItem() != null) {
            if (event.getCurrentItem().getItemMeta() != null) {
                Inventory inv = event.getInventory();
                final Player p = (Player) event.getWhoClicked();
                if (inv.getTitle().equals("§cDragonsDoom §7> §6Kit Selector§f:")) {
                    switch (event.getCurrentItem().getItemMeta().getDisplayName()) {
                        case "§3PvP Kit":
                            Bukkit.dispatchCommand(p, "pvp");
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                            p.closeInventory();
                            break;
                        case "§3Archer Kit":
                            Bukkit.dispatchCommand(p, "archer");
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                            p.closeInventory();
                            break;
                        case "§cFree Kits§f:":
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ENDERDRAGON_GROWL, 1, 1);
                            break;
                        case "§3DragonsDoom PvP":
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ENDERDRAGON_GROWL, 1, 1);
                            break;
                        case "§cCommands":
                            event.setCancelled(true);
                            p.closeInventory();
                            p.sendMessage(ChatColor.GRAY + "---- " + ChatColor.DARK_AQUA + "Commands" + ChatColor.GRAY + " ----");
                            p.sendMessage(ChatColor.GRAY + " /kit - Opens up the kit GUI.");
                            p.sendMessage(ChatColor.GRAY + " /shop - Opens up GUI the for shop.");
                            p.sendMessage(ChatColor.GRAY + " /[kitName] - Pick your kit, if you do not want to use the kit GUI.");
                            p.sendMessage(ChatColor.GRAY + " /spawn - Teleports you to spawn point.");
                            p.sendMessage(ChatColor.GRAY + " /warp [warpName] - Basic command to warp to places.");
                            p.sendMessage(ChatColor.GRAY + " /lms join - Join in the Last Man Standing event.");
                            p.getWorld().playSound(p.getLocation(), Sound.VILLAGER_YES, 1, 1);
                            break;
                        case "§3Pikachu Kit":
                            Bukkit.dispatchCommand(p, "pikachu");
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                            p.closeInventory();
                            break;
                        case "§3Fisherman Kit":
                            Bukkit.dispatchCommand(p, "fisherman");
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                            p.closeInventory();
                            break;
                        case "§3Kangaroo Kit":
                            Bukkit.dispatchCommand(p, "kangaroo");
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                            p.closeInventory();
                            break;
                        case "§3Ghost Kit":
                            Bukkit.dispatchCommand(p, "ghost");
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                            p.closeInventory();
                            break;
                        case "§3Ninja Kit":
                            Bukkit.dispatchCommand(p, "ninja");
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                            p.closeInventory();
                            break;
                        case "§3Tamer Kit":
                            Bukkit.dispatchCommand(p, "tamer");
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                            p.closeInventory();
                            break;
                        case "§3Hulk Kit":
                            Bukkit.dispatchCommand(p, "hulk");
                            event.setCancelled(true);
                            p.getWorld().playSound(p.getLocation(), Sound.ORB_PICKUP, 1, 1);
                            p.closeInventory();
                            break;
                         }
                    }
                }
            }
        }
}
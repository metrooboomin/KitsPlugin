package net.dragonsdoom.metro.kitpvp.Kits.PikachuKIT;

import net.dragonsdoom.metro.kitpvp.Utils.GiveKit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Pikachu implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        if (command.getName().equalsIgnoreCase("pikachu")) {
            GiveKit.PikachuKIT(p);
        }
        return false;
    }
}

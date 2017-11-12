package net.dragonsdoom.metro.kitpvp.Kits.Ghost;

import net.dragonsdoom.metro.kitpvp.Utils.GiveKit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ghost implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;
        if (command.getName().equalsIgnoreCase("ghost")){
            GiveKit.GhostKIT(p);
        }

        return false;
    }
}

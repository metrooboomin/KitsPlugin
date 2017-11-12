package net.dragonsdoom.metro.kitpvp.Kits;

import net.dragonsdoom.metro.kitpvp.Utils.GiveKit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PvP implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //PVP Kit
        Player p = (Player) sender;
        if(command.getName().equalsIgnoreCase("pvp")) {
            GiveKit.PvPKit(p);
        }

        return false;
    }
}

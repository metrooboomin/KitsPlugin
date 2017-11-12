package net.dragonsdoom.metro.kitpvp.Kits.Kangaroo;

import net.dragonsdoom.metro.kitpvp.Utils.GiveKit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kangaroo implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String labe, String[] args) {
        Player p = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("kangaroo")) {
            GiveKit.KangarooKIT(p);
        }
        return false;
    }

}
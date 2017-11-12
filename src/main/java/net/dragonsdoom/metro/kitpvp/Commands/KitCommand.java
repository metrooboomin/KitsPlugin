package net.dragonsdoom.metro.kitpvp.Commands;

import net.dragonsdoom.metro.kitpvp.Utils.KitArrays;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;


public class KitCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel,String[] args) {
        Player p = (Player) sender;
        if(cmd.getName().equalsIgnoreCase("kit")) {
            if(args.length == 0) {
                if(KitArrays.kitUsed.contains(p.getName())) {
                    p.sendMessage(ChatColor.RED +"You've already got a kit, you can no longer use ./kit until death.");
                    return true;
                }
                //PVP
                ItemStack pvp = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta mpvp = pvp.getItemMeta();
                mpvp.setDisplayName("§3PvP Kit");
                List<String> loreList = new ArrayList<String>();
                loreList.add(ChatColor.RED + "Standard PvP Kit.");
                loreList.add(ChatColor.RED + "Rank: " + ChatColor.GREEN + "Default");
                mpvp.setLore(loreList);
                pvp.setItemMeta(mpvp);


                //ARCHER
                //PVP
                ItemStack archer = new ItemStack(Material.BOW);
                ItemMeta marcher = archer.getItemMeta();
                marcher.setDisplayName("§3Archer Kit");
                List<String> archerList = new ArrayList<String>();
                archerList.add(ChatColor.RED + "Gives you a bow and sword with enchants.");
                archerList.add(ChatColor.RED + "Rank: " + ChatColor.GREEN + "Default");
                marcher.setLore(archerList);
                archer.setItemMeta(marcher);


                //INFORM

                ItemStack inform = new ItemStack(Material.DIAMOND);
                inform.addUnsafeEnchantment(Enchantment.DURABILITY, 1);
                ItemMeta inforMeta = inform.getItemMeta();
                inforMeta.setDisplayName("§cDragonsDoom");
                List<String> inforMetaList = new ArrayList<String>();
                inforMetaList.add(ChatColor.RED + ">> " + ChatColor.GRAY + "Kit Selection" + ChatColor.RED + "<<");
                inforMetaList.add(ChatColor.RED + "DragonsDoom KitPvP Sever!");
                inforMeta.setLore(inforMetaList);
                inform.setItemMeta(inforMeta);

                //Kits
                ItemStack free = new ItemStack(Material.BOOK);
                ItemMeta freemeta = free.getItemMeta();
                freemeta.setDisplayName("§cFree Kits§f:");
                free.setItemMeta(freemeta);





                ItemStack portal = new ItemStack(Material.IRON_FENCE);
                ItemMeta portalm = portal.getItemMeta();
                portalm.setDisplayName("§cNothing");
                portal.setItemMeta(portalm);


                ItemStack commands = new ItemStack(Material.PAPER);
                ItemMeta mcomm = commands.getItemMeta();
                mcomm.setDisplayName("§cCommands");
                List<String> commandList = new ArrayList<String>();
                commandList.add(ChatColor.RED + "Gives you a list of commands for the server!");

                mcomm.setLore(commandList);
                commands.setItemMeta(mcomm);

                ItemStack pikachu = new ItemStack(Material.GOLD_AXE);
                ItemMeta mpika = pikachu.getItemMeta();
                mpika.setDisplayName("§3Pikachu Kit");
                List<String> pikaList = new ArrayList<String>();
                pikaList.add(ChatColor.RED + "Allows you to schock people around you.");
                pikaList.add(ChatColor.RED + "Rank:" + ChatColor.GREEN + " Donator");

                mpika.setLore(pikaList);
                pikachu.setItemMeta(mpika);



                ItemStack fisher = new ItemStack(Material.FISHING_ROD);
                ItemMeta mfish = fisher.getItemMeta();
                mfish.setDisplayName("§3Fisherman Kit");
                List<String> fishList = new ArrayList<String>();

                fishList.add(ChatColor.RED + "Allows you to pull players to you with a fishing rod.");
                fishList.add(ChatColor.RED + "Rank:" + ChatColor.GREEN + " Donator");

                mfish.setLore(fishList);
                fisher.setItemMeta(mfish);


                ItemStack kang = new ItemStack(Material.FIREWORK);
                ItemMeta mkang = kang.getItemMeta();
                mkang.setDisplayName("§3Kangaroo Kit");
                List<String> kangList = new ArrayList<String>();

                kangList.add(ChatColor.RED + "Rick click the firework, to double jump.");
                kangList.add(ChatColor.GREEN + "You also get a max damage of 3.5 hearts.");
                kangList.add(ChatColor.RED + "Rank:" + ChatColor.GREEN + " Donator");

                mkang.setLore(kangList);
                kang.setItemMeta(mkang);


                ItemStack ghost = new ItemStack(Material.SKULL_ITEM);
                ItemMeta mghost = ghost.getItemMeta();
                mghost.setDisplayName("§3Ghost Kit");
                List<String> ghostList = new ArrayList<String>();

                ghostList.add(ChatColor.RED + "Allows you to go invisible for 15 seconds.");
                ghostList.add(ChatColor.RED + "With a 50 second cooldown.");
                ghostList.add(ChatColor.RED + "Rank:" + ChatColor.GREEN + " Donator");

                mghost.setLore(ghostList);
                ghost.setItemMeta(mghost);


                ItemStack ninja = new ItemStack(Material.NETHER_STAR);
                ItemMeta mninja = ninja.getItemMeta();
                mninja.setDisplayName("§3Ninja Kit");
                List<String> ninjaList = new ArrayList<String>();

                ninjaList.add(ChatColor.RED + "Gives you a Darkness ball, wich allows you to hit");
                ninjaList.add(ChatColor.RED + "a player with it and it will give them negative potion effects.");
                ninjaList.add(ChatColor.RED + "Rank:" + ChatColor.GREEN + " Donator");

                mninja.setLore(ninjaList);
                ninja.setItemMeta(mninja);


                ItemStack tamer = new ItemStack(Material.BONE);
                ItemMeta mt = tamer.getItemMeta();
                mt.setDisplayName("§3Tamer Kit");
                List<String> tList = new ArrayList<String>();

                tList.add(ChatColor.RED + "Allows you to spawn in minions.");
                tList.add(ChatColor.RED + "Rank:" + ChatColor.GREEN + " Donator");

                mt.setLore(tList);
                tamer.setItemMeta(mt);


                ItemStack hulk = new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta mhulk = hulk.getItemMeta();
                mhulk.setDisplayName("§3Hulk Kit");
                List<String> mlist = new ArrayList<String>();

                mlist.add(ChatColor.RED + "Gives you speed, and damage resistance on kill.");
                mlist.add(ChatColor.RED + "Rank:" + ChatColor.GREEN + " Donator");

                mhulk.setLore(mlist);
                hulk.setItemMeta(mhulk);

                ItemStack matrix = new ItemStack(Material.WATCH);
                ItemMeta mmatrix = matrix.getItemMeta();
                mmatrix.setDisplayName(ChatColor.YELLOW + "Matrix Kit");
                List<String> malist = new ArrayList<String>();
                malist.add(ChatColor.RED + "Freeze others within 5 blocks around you");
                malist.add(ChatColor.RED + "Rank" + ChatColor.GREEN + "Donator");
                mmatrix.setLore(malist);
                matrix.setItemMeta(mmatrix);

                //GUI !!!
                Inventory inv = Bukkit.createInventory(p, 54, "§cDragonsDoom §7> §6Kit Selector§f:");

                inv.setItem(0, commands);
                inv.setItem(1, portal);
                inv.setItem(2, portal);
                inv.setItem(3, portal);
                inv.setItem(4 ,inform);
                inv.setItem(5, portal);
                inv.setItem(6, portal);
                inv.setItem(7, portal);
                inv.setItem(8, portal);
                inv.setItem(9, portal);
                inv.setItem(10, portal);
                inv.setItem(11, portal);
                inv.setItem(12, portal);
                inv.setItem(13, portal);
                inv.setItem(14, portal);
                inv.setItem(15, portal);
                inv.setItem(16, portal);
                inv.setItem(17, portal);

                inv.setItem(18, free);
                inv.setItem(19, pvp);
                inv.setItem(20, archer);
                inv.setItem(21, pikachu);
                inv.setItem(22, fisher);
                inv.setItem(22, kang);
                inv.setItem(23, ghost);
                inv.setItem(24, ninja);
                inv.setItem(25, tamer);
                inv.setItem(26, hulk);

                p.openInventory(inv);

                return true;


            }
        }
        return false;
    }
}
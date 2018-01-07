package net.dragonsdoom.metro.kitpvp.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GiveKit {
    public static void KangarooKIT(Player p) {
        Inventory inv = p.getInventory();
        if(!p.hasPermission("kit.kangaroo")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if(KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        //CLEAR
        KitName.addKitUsed(p);
        KitArrays.kangaUsed.add(p.getName());


        //INV CLEAN
        KitName.cleanInventory(p);
        // Send the player a message

        p.sendMessage(KitMSG.prefix + "You have chosen kit " + ChatColor.DARK_AQUA + "Kangaroo" + ChatColor.GRAY + "!");

        //POTIONS
        KitName.StrengthPotion(p);

        ItemStack sword = new ItemStack(Material.STONE_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.DARK_AQUA + "Kangaroo Sword");
        sword.setItemMeta(swordMeta);
        ItemStack snowball = new ItemStack(Material.FIREWORK);
        ItemMeta featherMeta = sword.getItemMeta();
        featherMeta.addEnchant(Enchantment.DURABILITY, 100, true);
        featherMeta.setDisplayName(ChatColor.RED + "Double click to jump!");
        snowball.setItemMeta(featherMeta);




        // List armor

        sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);

        // Add items to inventory (weapons first.)
        inv.addItem(sword);
        inv.addItem(snowball);

        // SOUP
        KitName.giveSoup(p);


        //Put armor on player
        KitUTIL.KangarooARMOR(p);


    }



    public static void FishermanKIT(Player p) {
        Inventory inv = p.getInventory();
        if(!p.hasPermission("kit.fisherman")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if(KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        //CLEAR
        KitName.addKitUsed(p);
        KitArrays.fisherUsed.add(p.getName());

        // Send the player a message

        p.sendMessage(KitMSG.prefix + "You have chosen kit " + ChatColor.DARK_AQUA + "Fisherman" + ChatColor.GRAY + "!");

        //POTIONS
        KitName.StrengthPotion(p);

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.DARK_AQUA + "Fisherman Sword");
        sword.setItemMeta(swordMeta);
        ItemStack snowball = new ItemStack(Material.FISHING_ROD);
        ItemMeta featherMeta = sword.getItemMeta();
        featherMeta.addEnchant(Enchantment.DURABILITY, 100, true);
        featherMeta.setDisplayName(ChatColor.RED + "Fishing Rod");
        snowball.setItemMeta(featherMeta);

        sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);

        // Add items to inventory (weapons first.)
        inv.addItem(sword);
        inv.addItem(snowball);

        // SOUP
        KitName.giveSoup(p);


        //Put armor on player
        KitUTIL.FishermanArmor(p);


    }

































    //PIKA
    public static void PikachuKIT(Player p) {
        PlayerInventory inv = p.getInventory();
        if(!p.hasPermission("kit.pikachu")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if(KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        //ARRAYS
        KitName.addKitUsed(p);
        KitArrays.pikaUsed.add(p.getName());
        //CLEAR INVENTORY + POTS
        KitName.cleanInventory(p);



        //MESSAGW TO KIT
        p.sendMessage(KitMSG.prefix + "You have chosen kit " + ChatColor.DARK_AQUA + "Pikachu" + ChatColor.GRAY + "!");

        //POTIONS
        KitName.StrengthPotion(p);

        //ITEMS
        ItemStack sword = new ItemStack(Material.STONE_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.DARK_AQUA + "Pikachu Sword");
        sword.setItemMeta(swordMeta);


        ItemStack snowball = new ItemStack(Material.GOLD_AXE);
        ItemMeta featherMeta = sword.getItemMeta();
        featherMeta.setDisplayName(ChatColor.RED + "Thundershock");
        snowball.setItemMeta(featherMeta);


        // Add items to inventory (weapons first.)
        inv.addItem(sword);
        inv.addItem(snowball);

        KitName.giveSoup(p);

        //Armor
        KitUTIL.PikaArmor(p);
    }








    //ARCHER
    public static void ArcherKIT(Player p) {
        PlayerInventory inv = p.getInventory();
        if(!p.hasPermission("kit.archer")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if(KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        //REMOVE
        KitName.addKitUsed(p);

        //CLEAR INVENTORY + POTS
        KitName.cleanInventory(p);

        //MESSAGW TO KIT
        p.sendMessage(KitMSG.prefix + "You have chosen kit " + ChatColor.DARK_AQUA + "Archer" + ChatColor.GRAY + "!");

        //POTIONS
        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1));

        //sword
        ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
        sword.addEnchantment(Enchantment.KNOCKBACK, 1);

        //item 2
        ItemStack bow = new ItemStack(Material.BOW, 1);
        bow.addEnchantment(Enchantment.ARROW_DAMAGE, 2);
        bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
        bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);


        //ITEM 3
        ItemStack arrow = new ItemStack(Material.ARROW, 1);

        //ARMOR
        KitUTIL.ArcherArmor(p);
        //SWORD PLZ AND OTHER ITEM
        inv.addItem(sword);
        inv.addItem(bow);
        inv.addItem(arrow);

        //SOUP
        KitName.giveSoup(p);

    }








    //PVP
    public static void PvPKit(Player p) {
        if(!p.hasPermission("kit.pvp")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if(KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        PlayerInventory inv = p.getInventory();
        //REMOVE
        KitName.addKitUsed(p);

        //CLEAR INVENTORY + POTS
        KitName.cleanInventory(p);

        //MESSAGW TO KIT
        p.sendMessage(KitMSG.prefix + "You have chosen kit " + ChatColor.DARK_AQUA + "PvP" + ChatColor.GRAY + "!");

        //POTIONS
        KitName.StrengthPotion(p);


        //SWORD
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.DARK_AQUA + "PvP Sword");
        sword.setItemMeta(swordMeta);



        //Item 2 if it exists




        //ENCHANTS
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);

        //SWORD PLZ AND OTHER ITEM
        inv.addItem(sword);


        //SOUP
        KitName.giveSoup(p);

        //ARMOR
        KitUTIL.PvPARMOR(p);
    }



    public static void GhostKIT(Player p) {
        if(!p.hasPermission("kit.ghost")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if(KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        PlayerInventory inv = p.getInventory();
        //REMOVE
        KitName.addKitUsed(p);
        KitArrays.ghostUsed.add(p.getName());

        //CLEAR INVENTORY + POTS
        KitName.cleanInventory(p);

        //MESSAGE TO KIT
        p.sendMessage(KitMSG.prefix + "You have chosen kit " + ChatColor.DARK_AQUA + "Ghost" + ChatColor.GRAY + "!");

        //POTIONS
        KitName.StrengthPotion(p);

        //SWORDS
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.DARK_AQUA + "Ghost Sword");
        sword.setItemMeta(swordMeta);

        //ITEM 2
        ItemStack snowball = new ItemStack(Material.CLAY_BALL);
        ItemMeta featherMeta = snowball.getItemMeta();
        featherMeta.setDisplayName(ChatColor.RED + "Ghost Ability");
        snowball.setItemMeta(featherMeta);



        // Add items to inventory (weapons first.)
        inv.addItem(sword);
        inv.addItem(snowball);

        KitName.giveSoup(p);

    }



    public static void NinjaKIT(Player p) {

        if(!p.hasPermission("kit.ninja")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if(KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        PlayerInventory inv = p.getInventory();
        //REMOVE
        KitName.addKitUsed(p);
        KitArrays.ninjaUSED.add(p.getName());

        //CLEAR INVENTORY
        KitName.cleanInventory(p);
        //MSG
        p.sendMessage(KitMSG.prefix + "You have chosen kit " + ChatColor.DARK_AQUA + "Ninja" + ChatColor.GRAY + "!");

        //POTIONS
        KitName.StrengthPotion(p);

        //ITEMS

        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();

        swordMeta.setDisplayName(ChatColor.DARK_AQUA + "Ninja Sword");
        sword.setItemMeta(swordMeta);


        ItemStack snowball = new ItemStack(Material.EGG);
        ItemMeta featherMeta = sword.getItemMeta();
        featherMeta.setDisplayName(ChatColor.RED + "Darkness Ball");
        snowball.setItemMeta(featherMeta);

        sword.addEnchantment(Enchantment.DAMAGE_ALL, 3);

        inv.addItem(sword);
        inv.addItem(snowball);

        KitName.giveSoup(p);

        KitUTIL.NinjaARMOR(p);



    }



    public static void TamerKit(Player p) {

        if(!p.hasPermission("kit.tamer")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if(KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        PlayerInventory inv = p.getInventory();
        //CLEAN INVENTORY
        KitName.cleanInventory(p);

        //ADD ARRAYS
        KitName.addKitUsed(p);
        KitArrays.tamerUsed.add(p.getName());

        p.sendMessage(KitMSG.prefix + "You have chosen kit " + ChatColor.DARK_AQUA + "Tamer" + ChatColor.GRAY + "!");

        ItemStack sword = new ItemStack(Material.STONE_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();

        swordMeta.setDisplayName(ChatColor.DARK_AQUA + "Tamer Sword");
        sword.setItemMeta(swordMeta);


        ItemStack snowball = new ItemStack(Material.BONE);
        ItemMeta featherMeta = sword.getItemMeta();
        featherMeta.setDisplayName(ChatColor.RED + "Wolf Spawner");
        snowball.setItemMeta(featherMeta);

        sword.addEnchantment(Enchantment.DAMAGE_ALL, 3);
        sword.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
        sword.addEnchantment(Enchantment.KNOCKBACK, 2);

        inv.addItem(sword);
        inv.addItem(snowball);

        KitName.StrengthPotion(p);

        KitName.giveSoup(p);

        KitUTIL.TamerARMOR(p);
    }



    public static void HulkKIT(Player p) {

        if(!p.hasPermission("kit.hulk")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if(KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        PlayerInventory inv = p.getInventory();
        //REMOVE
        KitName.addKitUsed(p);
        KitArrays.hulkUsed.add(p.getName());

        //CLEAR INVENTORY + POTS
        KitName.cleanInventory(p);

        //MESSAGE TO KIT
        p.sendMessage(KitMSG.prefix + "You have chosen kit " + ChatColor.DARK_AQUA + "Hulk" + ChatColor.GRAY + "!");

        //POTIONS
        KitName.StrengthPotion(p);


        //SWORD
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName(ChatColor.DARK_AQUA + "Hulk Sword");
        sword.setItemMeta(swordMeta);



        //Item 2 if it exists




        //ENCHANTS
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 2);

        //SWORD PLZ AND OTHER ITEM
        inv.addItem(sword);


        //SOUP
        KitName.giveSoup(p);

        //ARMOR
        KitUTIL.HulkARMOR(p);


    }
    public static void TurtleKit(Player p) {
        if (!p.hasPermission("kit.turtle")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if (KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        PlayerInventory inv = p.getInventory();
        KitName.addKitUsed(p);
        KitArrays.turtleUsed.add(p.getName());

        // Clear inventory

        KitName.cleanInventory(p);

        //Message

        p.sendMessage(KitMSG.prefix + "You have chosen kit" + ChatColor.DARK_AQUA + "Turtle" + ChatColor.GRAY + "!");

        //Potions
        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 2));

        //SWORD
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordmeta = sword.getItemMeta();
        swordmeta.setDisplayName(ChatColor.DARK_AQUA + "Turtle Sword");
        sword.setItemMeta(swordmeta);

        //ENCHANTS
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);

        //SWORD
        inv.addItem(sword);
        //SOUP
        KitName.giveSoup(p);
        //ARMOR
        KitUTIL.TurtleARMOR(p);

    }



	public static void SniperKit(Player p) {
        if (!p.hasPermission("kit.sniper")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if (KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        PlayerInventory inv = p.getInventory();
        KitName.addKitUsed(p);
        KitArrays.sniperUsed.add(p.getName());

        // Clear inventory

        KitName.cleanInventory(p);

        //Message

        p.sendMessage(KitMSG.prefix + "You have chosen kit" + ChatColor.DARK_AQUA + "Sniper" + ChatColor.GRAY + "!");
        
        //BOW
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowmeta = bow.getItemMeta();
        bowmeta.setDisplayName(ChatColor.RED + "Sniper");
        bow.setItemMeta(bowmeta);
        bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
        bow.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
        //SWORD
        ItemStack sword = new ItemStack(Material.GOLD_SWORD);
        ItemMeta swordmeta = sword.getItemMeta();
        swordmeta.setDisplayName(ChatColor.GOLD + "Sniper Dagger");
        sword.setItemMeta(swordmeta);
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
        //TOOLS
        inv.addItem(bow);
        inv.addItem(sword);
        //ARMOR
        KitUTIL.SniperARMOR(p);
        //SOUP
        KitName.giveSoup(p);
        //ARROWS
        ItemStack arrows = new ItemStack(Material.ARROW);
        arrows.setAmount(64);
        inv.addItem(arrows);
    }
    public static void SwitcherKIT(Player p) {
        if (!p.hasPermission("kit.switcher")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if (KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        PlayerInventory inv = p.getInventory();
        KitName.addKitUsed(p);
        KitArrays.switcherUsed.add(p.getName());

        // Clear inventory

        KitName.cleanInventory(p);
        //Snowballs
        ItemStack snowballs = new ItemStack(Material.SNOW_BALL);
        ItemMeta snowballmeta = snowballs.getItemMeta();
        snowballmeta.setDisplayName(ChatColor.RED + "Switcher Snowballs");
        snowballs.setItemMeta(snowballmeta);
        snowballs.setAmount(16);
        inv.addItem(snowballs);

        //Message

        p.sendMessage(KitMSG.prefix + "You have chosen kit" + ChatColor.DARK_AQUA + "Switcher" + ChatColor.GRAY + "!");

        //SWORD
        ItemStack sword = new ItemStack(Material.GOLD_SWORD);
        ItemMeta swordmeta = sword.getItemMeta();
        swordmeta.setDisplayName(ChatColor.GOLD + "Switcher Sword");
        sword.setItemMeta(swordmeta);
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 2);
        //TOOLS
        inv.addItem(sword);
        //ARMOR
        KitUTIL.SwitcherARMOR(p);
        //SOUP
        KitName.giveSoup(p);
    }
    public static void MatrixKIT(Player p) {
        if (!p.hasPermission("kit.matrix")) {
            p.sendMessage(KitMSG.noPerms);
            return;
        }
        if (KitArrays.kitUsed.contains(p) &&!p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
            return;
        }
        PlayerInventory inv = p.getInventory();
        KitName.addKitUsed(p);
        KitArrays.matrixUsed.add(p.getName());

        //Clear inv
        KitName.cleanInventory(p);
        //WATCH
        ItemStack watch = new ItemStack(Material.WATCH);
        ItemMeta watchmeta = watch.getItemMeta();
        watchmeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Matrix Watch");
        watch.setItemMeta(watchmeta);
        inv.addItem(watch);
        //Message
        p.sendMessage(KitMSG.prefix + "You have chosen kit" + ChatColor.DARK_AQUA + "Matrix" + ChatColor.GRAY + "!");
        //SWORD
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordmeta = sword.getItemMeta();
        swordmeta.setDisplayName(ChatColor.GOLD + "Matrix Sword");
        sword.setItemMeta(swordmeta);
        //TOOLS
        inv.addItem(sword);
        //ARMOR
        KitUTIL.MatrixArmor(p);
        //SOUP
        KitName.giveSoup(p);
    }
    public static void ViperKit(Player p) {
        if (!p.hasPermission("kit.viper")) {
            p.sendMessage(KitMSG.noPerms);
        }
        if (KitArrays.kitUsed.contains(p) && !p.isOp()) {
            p.sendMessage(KitMSG.kitUsed);
        }
        PlayerInventory inv = p.getInventory();
        KitName.addKitUsed(p);
        KitArrays.viperUsed.add(p.getName());
        //Clear Inventory
        KitName.cleanInventory(p);
        //Sword
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta swordmeta  = sword.getItemMeta();
        swordmeta.setDisplayName(ChatColor.GREEN + "Viper Sword");
        sword.setItemMeta(swordmeta);
        inv.addItem(sword);

    }
}
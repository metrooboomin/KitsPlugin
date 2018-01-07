package net.dragonsdoom.metro.kitpvp.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class KitUTIL {
    public static void KangarooARMOR(Player p) {
        PlayerInventory inv = p.getInventory();
        //chest
        ItemStack helm = new ItemStack(Material.IRON_HELMET);

        //chest
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta chestMeta = chest.getItemMeta();
        ((LeatherArmorMeta)chestMeta).setColor(Color.TEAL);
        chest.setItemMeta(chestMeta);

        //legs
        ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);

        //boots
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta bootMeta = boots.getItemMeta();
        ((LeatherArmorMeta)bootMeta).setColor(Color.TEAL);
        boots.setItemMeta(bootMeta);

        setArmor(helm,chest,legs,boots,p);
    }

    public static void TamerARMOR(Player p) {
        PlayerInventory inv = p.getInventory();

        ItemStack helm = new ItemStack(Material.DIAMOND_HELMET);

        //chest
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta chestMeta = chest.getItemMeta();
        ((LeatherArmorMeta)chestMeta).setColor(Color.WHITE);
        chest.setItemMeta(chestMeta);
        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);

        //legs
        ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta legsMeta = legs.getItemMeta();
        ((LeatherArmorMeta)legsMeta).setColor(Color.BLACK);
        legs.setItemMeta(legsMeta);

        //boots
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);

        setArmor(helm,chest,legs,boots,p);
    }


    public static void PvPARMOR(Player p) {
        PlayerInventory inv = p.getInventory();
        //ARMOR
        ItemStack helm = new ItemStack(Material.IRON_HELMET);
        ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
        ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
        ItemStack boots = new ItemStack(Material.IRON_BOOTS);

        setArmor(helm,chest,legs,boots,p);
    }


    public static void NinjaARMOR(Player p) {
        PlayerInventory inv = p.getInventory();

        ItemStack helm = new ItemStack(Material.JACK_O_LANTERN);

        //chest
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta chestMeta = chest.getItemMeta();
        ((LeatherArmorMeta)chestMeta).setColor(Color.BLACK);
        chest.setItemMeta(chestMeta);

        //legs
        ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta legsMeta = legs.getItemMeta();
        ((LeatherArmorMeta)legsMeta).setColor(Color.BLACK);
        legs.setItemMeta(legsMeta);

        //boots
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta bootMeta = boots.getItemMeta();
        ((LeatherArmorMeta)bootMeta).setColor(Color.BLACK);
        boots.setItemMeta(bootMeta);

        setArmor(helm,chest,legs,boots,p);
    }


    public static void HulkARMOR(Player p) {
        PlayerInventory inv = p.getInventory();

        ItemStack helm = new ItemStack(Material.DIAMOND_HELMET);

        //chest
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta chestMeta = chest.getItemMeta();
        ((LeatherArmorMeta)chestMeta).setColor(Color.GREEN);
        chest.setItemMeta(chestMeta);
        chest.addEnchantment(Enchantment.THORNS, 2);
        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        //legs
        ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta legsMeta = legs.getItemMeta();
        ((LeatherArmorMeta)legsMeta).setColor(Color.GREEN);
        legs.setItemMeta(legsMeta);
        //boots
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta bootMeta = boots.getItemMeta();
        ((LeatherArmorMeta)bootMeta).setColor(Color.GREEN);
        boots.setItemMeta(bootMeta);

        setArmor(helm,chest,legs,boots,p);

    }
    public static void TurtleARMOR(Player p) {
        PlayerInventory inv = p.getInventory();
        //helm
        ItemStack helm = new ItemStack(Material.DIAMOND_HELMET);
        //chest
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta chestmeta = chest.getItemMeta();
        ((LeatherArmorMeta)chestmeta).setColor(Color.AQUA);
        chest.setItemMeta(chestmeta);
        //legs
        ItemStack legs = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        //boots
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);

        setArmor(helm,chest,legs,boots,p);
    }
    public static void SniperARMOR(Player p) {
        PlayerInventory inv = p.getInventory();
        //helm
        ItemStack helm = new ItemStack(Material.CHAINMAIL_HELMET);
        ItemMeta helmmeta = helm.getItemMeta();
        helmmeta.setDisplayName(ChatColor.GOLD + "Sniper Helmet");
        helm.setItemMeta(helmmeta);
        //chest
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta chestmeta = chest.getItemMeta();
        chestmeta.setDisplayName(ChatColor.GOLD + "Sniper ChestPlate");
        chest.setItemMeta(chestmeta);
        //LEGS
        ItemStack legs = new ItemStack(Material.CHAINMAIL_LEGGINGS);
        ItemMeta legmeta = legs.getItemMeta();
        legmeta.setDisplayName(ChatColor.GOLD + "Sniper Leggings");
        legs.setItemMeta(legmeta);
        //BOOTS
        ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);
        ItemMeta bootmeta = boots.getItemMeta();
        bootmeta.setDisplayName(ChatColor.GOLD + "Sniper Boots");
        boots.setItemMeta(bootmeta);

        setArmor(helm,chest,legs,boots,p);
    }
    public static void SwitcherARMOR(Player p){
        PlayerInventory inv = p.getInventory();
        //helm
        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta helmmeta = helmet.getItemMeta();
        helmmeta.setDisplayName(ChatColor.GOLD + "Switcher Helmet");
        helmet.setItemMeta(helmmeta);
        //chest
        ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta chestmeta = chest.getItemMeta();
        chestmeta.setDisplayName(ChatColor.GOLD + "Switcher ChestPlate");
        chest.setItemMeta(chestmeta);
        //LEGS
        ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta legmeta = legs.getItemMeta();
        legmeta.setDisplayName(ChatColor.GOLD + "Switcher Leggings");
        legs.setItemMeta(legmeta);
        //BOOTS
        ItemStack boots = new ItemStack(Material.GOLD_BOOTS);
        ItemMeta bootmeta = boots.getItemMeta();
        bootmeta.setDisplayName(ChatColor.GOLD + "Switcher Boots");
        boots.setItemMeta(bootmeta);
        boots.addEnchantment(Enchantment.DURABILITY, 3);

        setArmor(helmet,chest,legs,boots,p);
    }
    public static void MatrixArmor(Player p) {
        PlayerInventory inv = p.getInventory();

        //helm
        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta helmmeta = helmet.getItemMeta();
        helmmeta.setDisplayName(ChatColor.GOLD + "Matrix Helmet");
        helmet.setItemMeta(helmmeta);
        //chest
        ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta chestmeta = chest.getItemMeta();
        chestmeta.setDisplayName(ChatColor.GOLD + "Matrix ChestPlate");
        chest.setItemMeta(chestmeta);
        //LEGS
        ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta legmeta = legs.getItemMeta();
        legmeta.setDisplayName(ChatColor.GOLD + "Matrix Leggings");
        legs.setItemMeta(legmeta);
        //BOOTS
        ItemStack boots = new ItemStack(Material.GOLD_BOOTS);
        ItemMeta bootmeta = boots.getItemMeta();
        bootmeta.setDisplayName(ChatColor.GOLD + "Matrix Boots");
        boots.setItemMeta(bootmeta);
        boots.addEnchantment(Enchantment.DURABILITY, 3);

        setArmor(helmet,chest,legs,boots,p);
    }
    public static void PikaArmor(Player p) {
        PlayerInventory inv = p.getInventory();

        //helmet
        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta helmmeta = helmet.getItemMeta();
        helmmeta.setDisplayName(ChatColor.GOLD + "Pikachu Helmet");
        helmet.setItemMeta(helmmeta);
        //chest
        ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE);
        chest.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        ItemMeta chestmeta = chest.getItemMeta();
        chestmeta.setDisplayName(ChatColor.GOLD + "Pikachu ChestPlate");
        chest.setItemMeta(chestmeta);
        //LEGS
        ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS);
        ItemMeta legmeta = legs.getItemMeta();
        legmeta.setDisplayName(ChatColor.GOLD + "Pikachu Leggings");
        legs.setItemMeta(legmeta);
        //BOOTS
        ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta bootmeta = boots.getItemMeta();
        bootmeta.setDisplayName(ChatColor.GOLD + "Pikachu Boots");
        boots.setItemMeta(bootmeta);

        setArmor(helmet, chest, legs, boots, p);
    }
    public static void FishermanArmor(Player p) {
        PlayerInventory inv = p.getInventory();

        //helmet
        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta helmmeta = helmet.getItemMeta();
        helmmeta.setDisplayName(ChatColor.GOLD + "Fisherman Helmet");
        helmet.setItemMeta(helmmeta);
        //chest
        ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta chestmeta = chest.getItemMeta();
        chestmeta.setDisplayName(ChatColor.GOLD + "Fisherman ChestPlate");
        chest.setItemMeta(chestmeta);
        //LEGS
        ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta legmeta = legs.getItemMeta();
        legmeta.setDisplayName(ChatColor.GOLD + "Fisherman Leggings");
        legs.setItemMeta(legmeta);
        //BOOTS
        ItemStack boots = new ItemStack(Material.GOLD_BOOTS);
        ItemMeta bootmeta = boots.getItemMeta();
        bootmeta.setDisplayName(ChatColor.GOLD + "Fisherman Boots");
        boots.setItemMeta(bootmeta);
        boots.addEnchantment(Enchantment.DURABILITY, 3);

        setArmor(helmet, chest, legs, boots, p);
    }
    public static void ArcherArmor(Player p) {
        PlayerInventory inv = p.getInventory();

        //helmet
        ItemStack helmet = new ItemStack(Material.IRON_HELMET);
        ItemMeta helmmeta = helmet.getItemMeta();
        helmmeta.setDisplayName(ChatColor.GOLD + "Archer Helmet");
        helmet.setItemMeta(helmmeta);
        //chest
        ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta chestmeta = chest.getItemMeta();
        chestmeta.setDisplayName(ChatColor.GOLD + "Archer ChestPlate");
        chest.setItemMeta(chestmeta);
        //LEGS
        ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta legmeta = legs.getItemMeta();
        legmeta.setDisplayName(ChatColor.GOLD + "Archer Leggings");
        legs.setItemMeta(legmeta);
        //BOOTS
        ItemStack boots = new ItemStack(Material.GOLD_BOOTS);
        ItemMeta bootmeta = boots.getItemMeta();
        bootmeta.setDisplayName(ChatColor.GOLD + "Archer Boots");
        boots.setItemMeta(bootmeta);

        setArmor(helmet, chest, legs, boots, p);

    }

    private static void setArmor(ItemStack helmet, ItemStack chest, ItemStack legs, ItemStack boots, Player p) {
        p.getInventory().setHelmet(helmet);
        p.getInventory().setChestplate(chest);
        p.getInventory().setLeggings(legs);
        p.getInventory().setBoots(boots);
        p.updateInventory();
    }
}

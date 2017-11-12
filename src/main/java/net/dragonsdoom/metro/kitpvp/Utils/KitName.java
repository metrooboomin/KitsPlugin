package net.dragonsdoom.metro.kitpvp.Utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;

public class KitName {
    public static void StrengthPotion(Player p) {
        p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 99999999, 0));
    }
    public static void SlownessPotion(Player p) {
        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999999, 1));
    }
    public static void SpeedPotion(Player p) {
        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999, 2));
    }

    public static void cleanInventory(Player p ) {
        PlayerInventory inv = p.getInventory();
        inv.clear();
        inv.setArmorContents(null);
        for (PotionEffect effect : p.getActivePotionEffects())
            p.removePotionEffect(effect.getType());
    }

    public static void giveSoup(Player p ) {
        PlayerInventory inv = p.getInventory();
        ItemStack getSoup = new ItemStack(Material.MUSHROOM_SOUP, 1);
        ItemMeta soupMeta = getSoup.getItemMeta();
        soupMeta.setDisplayName(ChatColor.RED + "Soup");
        List<String> loreListl = new ArrayList<String>();
        loreListl.add(ChatColor.BLUE + "Heals 3.5 hearts!");
        soupMeta.setLore(loreListl);
        getSoup.setItemMeta(soupMeta);
        for(int i=1; i <=32; i++)
            inv.addItem(getSoup);

    }

    public static void addKitUsed(Player p) {
        KitArrays.kitUsed.remove(p.getName());
        KitArrays.kitUsed.add(p.getName());
    }



}

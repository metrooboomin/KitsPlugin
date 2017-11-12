package net.dragonsdoom.metro.kitpvp;

import net.dragonsdoom.metro.kitpvp.Commands.KitCommand;
import net.dragonsdoom.metro.kitpvp.GUI.PVPGUI;
import net.dragonsdoom.metro.kitpvp.Kits.Archer;
import net.dragonsdoom.metro.kitpvp.Kits.FishermanKit.Fisherman;
import net.dragonsdoom.metro.kitpvp.Kits.FishermanKit.FishermanEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.Ghost.Ghost;
import net.dragonsdoom.metro.kitpvp.Kits.Ghost.GhostEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.Hulk.Hulk;
import net.dragonsdoom.metro.kitpvp.Kits.Hulk.HulkEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.Kangaroo.Kangaroo;
import net.dragonsdoom.metro.kitpvp.Kits.Kangaroo.KangarooEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.Matrix.Matrix;
import net.dragonsdoom.metro.kitpvp.Kits.Matrix.MatrixEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.Ninja.Ninja;
import net.dragonsdoom.metro.kitpvp.Kits.Ninja.NinjaEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.PikachuKIT.Pikachu;
import net.dragonsdoom.metro.kitpvp.Kits.PikachuKIT.PikachuEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.PvP;
import net.dragonsdoom.metro.kitpvp.Kits.Snail.Snail;
import net.dragonsdoom.metro.kitpvp.Kits.Snail.SnailEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.Sniper.Sniper;
import net.dragonsdoom.metro.kitpvp.Kits.Sniper.SniperEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.Switcher.Switcher;
import net.dragonsdoom.metro.kitpvp.Kits.Switcher.SwitcherEVENT;
import net.dragonsdoom.metro.kitpvp.Kits.Tamer.Tamer;
import net.dragonsdoom.metro.kitpvp.Kits.Tamer.TamerEvent;
import net.dragonsdoom.metro.kitpvp.Kits.Turtle.Turtle;
import net.dragonsdoom.metro.kitpvp.Kits.Turtle.TurtleEVENT;
import net.dragonsdoom.metro.kitpvp.Utils.DeathEvent;
import net.dragonsdoom.metro.kitpvp.Utils.Soup;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class KitPvP extends JavaPlugin {
private static KitPvP instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        PluginManager pm = Bukkit.getServer().getPluginManager();

        // LISTENERS
        pm.registerEvents(new DeathEvent(), this);
        pm.registerEvents(new PikachuEVENT(), this);
        pm.registerEvents(new FishermanEVENT(), this);
        pm.registerEvents(new KangarooEVENT(), this);
        pm.registerEvents(new GhostEVENT(), this);
        pm.registerEvents(new NinjaEVENT(), this);
        pm.registerEvents(new TamerEvent(), this);
        pm.registerEvents(new HulkEVENT(), this);
        pm.registerEvents(new SniperEVENT(), this);
        pm.registerEvents(new TurtleEVENT(), this);
        pm.registerEvents(new Soup(), this);
        pm.registerEvents(new SwitcherEVENT(), this);
        pm.registerEvents(new SnailEVENT(), this);
        pm.registerEvents(new MatrixEVENT(), this);

        //GUIS
        pm.registerEvents(new PVPGUI(), this);

        //KITS
        getCommand("pvp").setExecutor(new PvP());
        getCommand("archer").setExecutor(new Archer());
        getCommand("tamer").setExecutor(new Tamer());
        getCommand("matrix").setExecutor(new Matrix());
        //DONOR KITS
        getCommand("pikachu").setExecutor(new Pikachu());
        getCommand("fisherman").setExecutor(new Fisherman());
        getCommand("switcher").setExecutor(new Switcher());
        getCommand("kangaroo").setExecutor(new Kangaroo());
        getCommand("ghost").setExecutor(new Ghost());
        getCommand("ninja").setExecutor(new Ninja());
        getCommand("hulk").setExecutor(new Hulk());
        getCommand("turtle").setExecutor(new Turtle());
        getCommand("sniper").setExecutor(new Sniper());
        getCommand("switcher").setExecutor(new Switcher());
        getCommand("snail").setExecutor(new Snail());
        //MISC
        getCommand("kit").setExecutor(new KitCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static KitPvP getInstance(){
        return instance;
    }
}

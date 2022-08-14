package xyz.roosterseatyou.gods;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Gods extends JavaPlugin {
    public static Gods plugin;
    public static Logger log;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        log = getLogger();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Gods getPlugin() {
        return plugin;
    }
}

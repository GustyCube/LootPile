package xyz.gustycube.lootpile;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class LootPile extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);
    getLogger().log(Level.INFO, "LootPiles have been patched");
    }
}

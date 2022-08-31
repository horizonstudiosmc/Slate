package org.imnobody.plugins.slate;

import com.comphenix.protocol.ProtocolManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.imnobody.plugins.slate.updater.Updater;

public final class Slate extends JavaPlugin {


    public ProtocolManager manager;



    @Override
    public void onEnable() {
        // Configuration
        saveDefaultConfig();


        // Updater
        Updater updater = new Updater(this, )



        // Commands


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

package pl.h00p03.plugintemplate;

import org.bukkit.plugin.java.JavaPlugin;

import java.time.Instant;
import java.util.HashMap;
import java.util.logging.Logger;

public class Main extends JavaPlugin implements CommandExecutor {
    public static Logger console;
    FileConfiguration config = getConfig();

    @Override
    public void onEnable() {
        super.onEnable();

        config.options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        super.onDisable();

    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            console.info("Komenda jest dostepna tylko z poziomu klienta gry.");
            return true;
        }

        if(args.length > 0){
            return false;
        }

        return true;

    }

}

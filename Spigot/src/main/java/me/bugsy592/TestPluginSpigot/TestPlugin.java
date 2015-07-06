package me.bugsy592.TestPluginSpigot;

import java.util.HashMap;
import java.util.Map;


import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TestPlugin extends JavaPlugin{
	
	
	
	
	
	
	FileConfiguration config = getConfig();
	
	 // Fired when plugin is first enabled
    @Override
    public void onEnable() {
    	config.addDefault("Run Plugin", true);
    }
    // Fired when plugin is disabled
    @Override
    public void onDisable() {

    }
    
    public void execute(CommandSender commandSender, String[] strings) {
       if(commandSender.isOp() && strings.length < 2){
    	   if(strings[0].equals("addPlayer")){
    		   
    	   }
       }
    }
    
    public void onPlayerJoin(PlayerJoinEvent event){
    	Player player = event.getPlayer();
    	if(config.getBoolean("Run Plugin")){
    		if(){
    			
    		}
    		
    	}
    }
    
    public void addPlayerCommand(String playername){
    	
    }
    
}
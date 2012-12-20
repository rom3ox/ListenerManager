package com.github.rom3ox.ListenerManager;

import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.configuration.Configuration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class ListenerManager extends JavaPlugin {
	
	public Logger log = this.getLogger();
	public Server server = this.getServer();
	public PluginManager pluginManager = this.server.getPluginManager();
	public Configuration config;
	
	@Override 
	public void onEnable(){
		
		this.log.info("El método onEnable de BukkitTestPlugin ha sido invocado");
		
		// Register the Event Listeners
		//pluginManager.registerEvents(new BTPPlayerListener(), this);
		// Test comment to test GitHub Commits
	
	}
	
	@Override 
	public void onDisable(){
		log.info("El método onDisable de BukkitTestPlugin ha sido invocado");
	}
	
}

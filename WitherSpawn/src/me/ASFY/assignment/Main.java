package me.ASFY.assignment;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	 
	 @Override
	 public void onEnable() {
		 
		 new ListenerThingy(this);
		 new WitherCmd(this);
		 
	 }
	 
	 @Override
	 public void onDisable() {}
	 
	 
	 
	 
	 
	 
	 
}

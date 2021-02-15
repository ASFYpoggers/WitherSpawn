package me.ASFY.assignment;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;


import net.md_5.bungee.api.ChatColor;

import org.bukkit.event.player.PlayerJoinEvent;
public class ListenerThingy implements Listener {
		
	private Main plugin;

	public ListenerThingy (Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this,plugin);
		
	}
		
	
	@EventHandler
	public void PlayerJoinEvent(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		if (p.hasPlayedBefore()) {
			p.sendMessage(ChatColor.GOLD  +  "Welcome Back!");
			
			
		}else {
			
			p.sendMessage(ChatColor.GOLD  +  "Welcome!");
			
			
		}

			
		}
	}
	
	
	


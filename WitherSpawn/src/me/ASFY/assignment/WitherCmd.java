package me.ASFY.assignment;



import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;


import net.md_5.bungee.api.ChatColor;

public class WitherCmd implements CommandExecutor {

    private Main plugin;
	
	public WitherCmd(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("wither").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[]args) {
		Player p = (Player) sender;
		Location loc = p.getLocation();
		World w = p.getWorld();
		
		
			w.spawnEntity(loc, EntityType.WITHER);
		
		
		return false;
	}
		
		
		
		
		;
	}



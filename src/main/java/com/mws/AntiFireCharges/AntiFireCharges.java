package com.mws.AntiFireCharges;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiFireCharges
  extends JavaPlugin implements Listener
{  
	public void onEnable()
  	{
	  getLogger().info("已加载AntiFireCharges");
    	getServer().getPluginManager().registerEvents(this, this);
  	}
  	public Location target;
  	
	@EventHandler
	public void onPass(EntityExplodeEvent eee)
	{
		EntityType explosion=eee.getEntityType();
		if(explosion.name()=="FIREBALL")eee.setCancelled(true);
	}
	//
	// Following are Fiona API codes.
	// Deleted due to server security. 
	//
	
	
  public void onDisable() {
  }
}
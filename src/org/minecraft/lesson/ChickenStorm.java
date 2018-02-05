package org.minecraft.lesson;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.libs.jline.internal.Log;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ChickenStorm extends JavaPlugin{
	public static final Logger LOG = Logger.getLogger(ChickenStorm.class.getName());
	private static final int NUM_CHICKENS = 30;
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments){
		//label is your command, compare label with chickenstorm before executing command.
		//make sure the sender is a Player (org.bukkit.entity.Player class)
		//return true after executing
	
		return false;
	}
	/**
	 * 
	 * @param sender
	 */
	public void executeCommand(CommandSender sender) {
		//convert sender to a Player
		//get player's location (spot)
		//get world of player (world)
		//randomize number of the chickens to generate  (NUM_CHICKENS)
		//create a location around spot, randomize around the spot (30) (chickenspot)
		//use world.spawn(chickenspot, Chicken.class) to generate chickens
		//randomize (< 0.4d) if the chicken is a baby Chicken.setBaby()/ Chicken.setAdult() 
		//log how many chickens you generated.
	}
	
}

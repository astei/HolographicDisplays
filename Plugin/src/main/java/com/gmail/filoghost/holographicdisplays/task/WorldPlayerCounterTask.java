package com.gmail.filoghost.holographicdisplays.task;

import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

import com.gmail.filoghost.holographicdisplays.util.Utils;

public class WorldPlayerCounterTask implements Runnable {

	private static Map<String, Integer> worlds = Utils.newMap();
	
	@Override
	public void run() {
	}
	
	public static String getCount(String world) {
		return "0";
	}
}

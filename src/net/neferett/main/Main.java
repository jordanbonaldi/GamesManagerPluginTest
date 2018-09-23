package net.neferett.main;

import net.neferett.epitech.plugins.PluginInterface;
import net.neferett.main.commands.TotoCommand;

public class Main implements PluginInterface{

	net.neferett.epitech.Main m = net.neferett.epitech.Main.getInstance(); 
	
	public Main() {
		System.out.println("Instantiate");
	}
	
	@Override
	public void onDisable() {
	}

	@Override
	public void onEnable() {
		this.m.getCmd().put("toto", new TotoCommand());
	}

}

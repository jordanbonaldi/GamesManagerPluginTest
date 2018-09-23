package net.neferett.main.commands;

import net.neferett.epitech.console.commandsManagers.Commands;

public class TotoCommand extends Commands {

	public TotoCommand() {
		super("toto", "fais rien");
	}

	@Override
	public boolean onCommand(String arg0, String[] arg1) {
		System.out.println("Biloute");
		return false;
	}

}

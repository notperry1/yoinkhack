package cat.yoink.yoinkhack.impl.command;

import cat.yoink.yoinkhack.Client;
import cat.yoink.yoinkhack.api.command.Command;
import cat.yoink.yoinkhack.api.util.LoggerUtil;

public class Help extends Command
{
	public Help(String name, String[] alias, String usage)
	{
		super(name, alias, usage);
	}

	@Override
	public void run(String arguments)
	{

		LoggerUtil.sendMessage("\"yoinkhack best hack\" -everyone 2020!");

		for (Command command : Client.INSTANCE.commandManager.getCommands())
		{
			LoggerUtil.sendMessage(command.getName() + " - " + command.getUsage());
		}
	}
}

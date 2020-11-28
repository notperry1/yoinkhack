package cat.yoink.yoinkhack.api.setting;

import cat.yoink.yoinkhack.Client;
import cat.yoink.yoinkhack.api.module.Module;

import java.util.ArrayList;

/**
 * @author yoink
 * @since 8/28/2020
 */
public class SettingManager
{
	private final ArrayList<Setting> settings = new ArrayList<>();

	public void addSetting(Setting setting)
	{
		settings.add(setting);
	}

	public ArrayList<Setting> getSettings()
	{
		return settings;
	}

	public ArrayList<Setting> getSettingsByModule(Module module)
	{

		ArrayList<Setting> sets = new ArrayList<>();

		for (Setting setting : settings)
		{

			if (setting.getParent().equals(module))
			{

				sets.add(setting);

			}

		}

		return sets;

	}

	public Setting getSettingEasy(String moduleName, int index)
	{
		return getSettingsByModule(Client.INSTANCE.moduleManager.getModuleByName(moduleName)).get(index);
	}

	public ArrayList<String> getSettingsForConfig()
	{
		ArrayList<String> arrayList = new ArrayList<>();

		for (Setting setting : getSettings())
		{
			if (setting.isInteger())
			{
				arrayList.add(setting.getParent().getName() + ":" + setting.getName() + ":" + setting.getIntValue());
			}
			else if (setting.isBoolean())
			{
				arrayList.add(setting.getParent().getName() + ":" + setting.getName() + ":" + setting.getBoolValue());
			}
			else if (setting.isEnum())
			{
				arrayList.add(setting.getParent().getName() + ":" + setting.getName() + ":" + setting.getEnumValue());
			}
		}
		return arrayList;
	}
}

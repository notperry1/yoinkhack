package cat.yoink.yoinkhack.api.component;

import cat.yoink.yoinkhack.Client;
import cat.yoink.yoinkhack.impl.component.*;
import net.minecraftforge.common.MinecraftForge;

import java.util.ArrayList;

/**
 * @author yoink
 * @since 8/28/2020
 */
public class ComponentManager
{
	public ArrayList<Component> components = new ArrayList<>();

	public ComponentManager()
	{
		components.add(new Watermark("Watermark"));
		components.add(new InventoryViewer("InventoryViewer"));
		components.add(new Arraylist("Arraylist"));
		components.add(new CombatSupplies("CombatSupplies"));
		components.add(new Durability("Durability"));
		components.add(new EnemyInfo("EnemyInfo"));
		components.add(new FPS("FPS"));
		components.add(new Ping("Ping"));
		components.add(new TPS("TPS"));
		components.add(new BPS("BPS"));

		for (Component component : components)
		{
			MinecraftForge.EVENT_BUS.register(component);
		}
	}

	public ArrayList<Component> getComponents()
	{
		return components;
	}

	public ArrayList<String> getComponentsForConfig()
	{
		ArrayList<String> arrayList = new ArrayList<>();
		for (Component component : Client.INSTANCE.componentManager.getComponents())
		{
			arrayList.add(component.getName() + ":" + component.getX() + ":" + component.getY());
		}
		return arrayList;
	}
}

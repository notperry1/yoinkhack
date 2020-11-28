package cat.yoink.yoinkhack.impl.component;

import cat.yoink.yoinkhack.api.component.Component;
import cat.yoink.yoinkhack.api.util.TPSUtil;
import cat.yoink.yoinkhack.api.util.font.FontUtil;

public class TPS extends Component
{
	public TPS(String name)
	{
		super(name);
	}

	@Override
	public void render()
	{
		String text = "\u00A77TPS \u00A7r" + (float) Math.round(TPSUtil.INSTANCE.getTickRate() * 100) / 100;

		setWidth(FontUtil.getStringWidth(text));
		setHeight(FontUtil.getFontHeight());

		FontUtil.drawStringWithShadow("\u00A77TPS \u00A7r" + (float) Math.round(TPSUtil.INSTANCE.getTickRate() * 100) / 100, getX(), getY(), 0xffffffff);
	}
}

package cat.yoink.yoinkhack.api.gui.clickgui;

public interface IComponent
{
	void render(int mX, int mY);

	void mouseDown(int mX, int mY, int mB);

	void mouseUp(int mX, int mY);

	void keyPress(int key);

	void close();
}

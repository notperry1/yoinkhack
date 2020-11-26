package cat.yoink.yoinkhack.mixin.mixins.mixin;

import cat.yoink.yoinkhack.mixin.mixins.accessor.ICPacketPlayer;
import net.minecraft.network.play.client.CPacketPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author yoink
 * @since 8/28/2020
 */
@Mixin(value = CPacketPlayer.class, priority = 999)
public class CPacketPlayerMixin implements ICPacketPlayer
{
	@Shadow
	protected double x;
	@Shadow
	protected double y;
	@Shadow
	protected double z;
	@Shadow
	protected float yaw;
	@Shadow
	protected float pitch;
	@Shadow
	protected boolean onGround;

	@Override
	public void setX(double x)
	{
		this.x = x;
	}

	@Override
	public void setY(double y)
	{
		this.y = y;
	}

	@Override
	public void setZ(double z)
	{
		this.z = z;
	}

	@Override
	public void setYaw(float yaw)
	{
		this.yaw = yaw;
	}

	@Override
	public void setPitch(float pitch)
	{
		this.pitch = pitch;
	}

	@Override
	public void setOnGround(boolean onGround)
	{
		this.onGround = onGround;
	}
}
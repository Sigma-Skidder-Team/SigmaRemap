package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CPlayerAbilitiesPacket implements IPacket<IServerPlayNetHandler>
{
    private boolean invulnerable;
    private boolean flying;
    private boolean allowFlying;
    private boolean creativeMode;
    private float flySpeed;
    private float walkSpeed;

    public CPlayerAbilitiesPacket()
    {
    }

    public CPlayerAbilitiesPacket(PlayerAbilities p_i750_1_)
    {
        this.setInvulnerable(p_i750_1_.disableDamage);
        this.setFlying(p_i750_1_.isFlying);
        this.setAllowFlying(p_i750_1_.allowFlying);
        this.setCreativeMode(p_i750_1_.isCreativeMode);
        this.setFlySpeed(p_i750_1_.getFlySpeed());
        this.setWalkSpeed(p_i750_1_.getWalkSpeed());
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        byte b0 = buf.readByte();
        this.setInvulnerable((b0 & 1) > 0);
        this.setFlying((b0 & 2) > 0);
        this.setAllowFlying((b0 & 4) > 0);
        this.setCreativeMode((b0 & 8) > 0);
        this.setFlySpeed(buf.readFloat());
        this.setWalkSpeed(buf.readFloat());
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        byte b0 = 0;

        if (this.isInvulnerable())
        {
            b0 = (byte)(b0 | 1);
        }

        if (this.isFlying())
        {
            b0 = (byte)(b0 | 2);
        }

        if (this.isAllowFlying())
        {
            b0 = (byte)(b0 | 4);
        }

        if (this.isCreativeMode())
        {
            b0 = (byte)(b0 | 8);
        }

        buf.writeByte(b0);
        buf.writeFloat(this.flySpeed);
        buf.writeFloat(this.walkSpeed);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processPlayerAbilities(this);
    }

    public boolean isInvulnerable()
    {
        return this.invulnerable;
    }

    public void setInvulnerable(boolean isInvulnerable)
    {
        this.invulnerable = isInvulnerable;
    }

    public boolean isFlying()
    {
        return this.flying;
    }

    public void setFlying(boolean isFlying)
    {
        this.flying = isFlying;
    }

    public boolean isAllowFlying()
    {
        return this.allowFlying;
    }

    public void setAllowFlying(boolean isAllowFlying)
    {
        this.allowFlying = isAllowFlying;
    }

    public boolean isCreativeMode()
    {
        return this.creativeMode;
    }

    public void setCreativeMode(boolean isCreativeMode)
    {
        this.creativeMode = isCreativeMode;
    }

    public void setFlySpeed(float flySpeedIn)
    {
        this.flySpeed = flySpeedIn;
    }

    public void setWalkSpeed(float walkSpeedIn)
    {
        this.walkSpeed = walkSpeedIn;
    }
}

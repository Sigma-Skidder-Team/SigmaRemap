package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class SEntityVelocityPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityID;
    private int motionX;
    private int motionY;
    private int motionZ;

    public SEntityVelocityPacket()
    {
    }

    public SEntityVelocityPacket(Entity p_i1697_1_)
    {
        this(p_i1697_1_.getEntityId(), p_i1697_1_.getMotion());
    }

    public SEntityVelocityPacket(int p_i1698_1_, Vec3d p_i1698_2_)
    {
        this.entityID = p_i1698_1_;
        double d0 = 3.9D;
        double d1 = MathHelper.clamp(p_i1698_2_.x, -3.9D, 3.9D);
        double d2 = MathHelper.clamp(p_i1698_2_.y, -3.9D, 3.9D);
        double d3 = MathHelper.clamp(p_i1698_2_.z, -3.9D, 3.9D);
        this.motionX = (int)(d1 * 8000.0D);
        this.motionY = (int)(d2 * 8000.0D);
        this.motionZ = (int)(d3 * 8000.0D);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityID = buf.readVarInt();
        this.motionX = buf.readShort();
        this.motionY = buf.readShort();
        this.motionZ = buf.readShort();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityID);
        buf.writeShort(this.motionX);
        buf.writeShort(this.motionY);
        buf.writeShort(this.motionZ);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleEntityVelocity(this);
    }

    public int getEntityID()
    {
        return this.entityID;
    }

    public int getMotionX()
    {
        return this.motionX;
    }

    public int getMotionY()
    {
        return this.motionY;
    }

    public int getMotionZ()
    {
        return this.motionZ;
    }
}

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SEntityTeleportPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private double posX;
    private double posY;
    private double posZ;
    private byte yaw;
    private byte pitch;
    private boolean onGround;

    public SEntityTeleportPacket()
    {
    }

    public SEntityTeleportPacket(Entity p_i4217_1_)
    {
        this.entityId = p_i4217_1_.getEntityId();
        this.posX = p_i4217_1_.getPosX();
        this.posY = p_i4217_1_.getPosY();
        this.posZ = p_i4217_1_.getPosZ();
        this.yaw = (byte)((int)(p_i4217_1_.rotationYaw * 256.0F / 360.0F));
        this.pitch = (byte)((int)(p_i4217_1_.rotationPitch * 256.0F / 360.0F));
        this.onGround = p_i4217_1_.onGround;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.posX = buf.readDouble();
        this.posY = buf.readDouble();
        this.posZ = buf.readDouble();
        this.yaw = buf.readByte();
        this.pitch = buf.readByte();
        this.onGround = buf.readBoolean();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        buf.writeDouble(this.posX);
        buf.writeDouble(this.posY);
        buf.writeDouble(this.posZ);
        buf.writeByte(this.yaw);
        buf.writeByte(this.pitch);
        buf.writeBoolean(this.onGround);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleEntityTeleport(this);
    }

    public int getEntityId()
    {
        return this.entityId;
    }

    public double getX()
    {
        return this.posX;
    }

    public double getY()
    {
        return this.posY;
    }

    public double getZ()
    {
        return this.posZ;
    }

    public byte getYaw()
    {
        return this.yaw;
    }

    public byte getPitch()
    {
        return this.pitch;
    }

    public boolean isOnGround()
    {
        return this.onGround;
    }
}

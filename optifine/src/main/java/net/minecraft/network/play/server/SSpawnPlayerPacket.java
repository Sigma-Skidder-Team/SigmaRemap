package net.minecraft.network.play.server;

import java.io.IOException;
import java.util.UUID;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SSpawnPlayerPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private UUID uniqueId;
    private double x;
    private double y;
    private double z;
    private byte yaw;
    private byte pitch;

    public SSpawnPlayerPacket()
    {
    }

    public SSpawnPlayerPacket(PlayerEntity p_i931_1_)
    {
        this.entityId = p_i931_1_.getEntityId();
        this.uniqueId = p_i931_1_.getGameProfile().getId();
        this.x = p_i931_1_.getPosX();
        this.y = p_i931_1_.getPosY();
        this.z = p_i931_1_.getPosZ();
        this.yaw = (byte)((int)(p_i931_1_.rotationYaw * 256.0F / 360.0F));
        this.pitch = (byte)((int)(p_i931_1_.rotationPitch * 256.0F / 360.0F));
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.uniqueId = buf.readUniqueId();
        this.x = buf.readDouble();
        this.y = buf.readDouble();
        this.z = buf.readDouble();
        this.yaw = buf.readByte();
        this.pitch = buf.readByte();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        buf.writeUniqueId(this.uniqueId);
        buf.writeDouble(this.x);
        buf.writeDouble(this.y);
        buf.writeDouble(this.z);
        buf.writeByte(this.yaw);
        buf.writeByte(this.pitch);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleSpawnPlayer(this);
    }

    public int getEntityID()
    {
        return this.entityId;
    }

    public UUID getUniqueId()
    {
        return this.uniqueId;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public double getZ()
    {
        return this.z;
    }

    public byte getYaw()
    {
        return this.yaw;
    }

    public byte getPitch()
    {
        return this.pitch;
    }
}

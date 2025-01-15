package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SSpawnGlobalEntityPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private double x;
    private double y;
    private double z;
    private int type;

    public SSpawnGlobalEntityPacket()
    {
    }

    public SSpawnGlobalEntityPacket(Entity p_i2207_1_)
    {
        this.entityId = p_i2207_1_.getEntityId();
        this.x = p_i2207_1_.getPosX();
        this.y = p_i2207_1_.getPosY();
        this.z = p_i2207_1_.getPosZ();

        if (p_i2207_1_ instanceof LightningBoltEntity)
        {
            this.type = 1;
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.type = buf.readByte();
        this.x = buf.readDouble();
        this.y = buf.readDouble();
        this.z = buf.readDouble();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        buf.writeByte(this.type);
        buf.writeDouble(this.x);
        buf.writeDouble(this.y);
        buf.writeDouble(this.z);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleSpawnGlobalEntity(this);
    }

    public int getEntityId()
    {
        return this.entityId;
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

    public int getType()
    {
        return this.type;
    }
}

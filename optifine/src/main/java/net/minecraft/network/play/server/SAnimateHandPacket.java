package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SAnimateHandPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private int type;

    public SAnimateHandPacket()
    {
    }

    public SAnimateHandPacket(Entity p_i1722_1_, int p_i1722_2_)
    {
        this.entityId = p_i1722_1_.getEntityId();
        this.type = p_i1722_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.type = buf.readUnsignedByte();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        buf.writeByte(this.type);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleAnimation(this);
    }

    public int getEntityID()
    {
        return this.entityId;
    }

    public int getAnimationType()
    {
        return this.type;
    }
}

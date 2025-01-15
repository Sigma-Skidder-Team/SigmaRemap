package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;

public class SEntityStatusPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private byte logicOpcode;

    public SEntityStatusPacket()
    {
    }

    public SEntityStatusPacket(Entity p_i978_1_, byte p_i978_2_)
    {
        this.entityId = p_i978_1_.getEntityId();
        this.logicOpcode = p_i978_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readInt();
        this.logicOpcode = buf.readByte();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeInt(this.entityId);
        buf.writeByte(this.logicOpcode);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleEntityStatus(this);
    }

    public Entity getEntity(World worldIn)
    {
        return worldIn.getEntityByID(this.entityId);
    }

    public byte getOpCode()
    {
        return this.logicOpcode;
    }
}

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SDestroyEntitiesPacket implements IPacket<IClientPlayNetHandler>
{
    private int[] entityIDs;

    public SDestroyEntitiesPacket()
    {
    }

    public SDestroyEntitiesPacket(int... p_i3598_1_)
    {
        this.entityIDs = p_i3598_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityIDs = new int[buf.readVarInt()];

        for (int i = 0; i < this.entityIDs.length; ++i)
        {
            this.entityIDs[i] = buf.readVarInt();
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityIDs.length);

        for (int i : this.entityIDs)
        {
            buf.writeVarInt(i);
        }
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleDestroyEntities(this);
    }

    public int[] getEntityIDs()
    {
        return this.entityIDs;
    }
}

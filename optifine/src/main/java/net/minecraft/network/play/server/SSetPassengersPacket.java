package net.minecraft.network.play.server;

import java.io.IOException;
import java.util.List;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SSetPassengersPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private int[] passengerIds;

    public SSetPassengersPacket()
    {
    }

    public SSetPassengersPacket(Entity p_i1413_1_)
    {
        this.entityId = p_i1413_1_.getEntityId();
        List<Entity> list = p_i1413_1_.getPassengers();
        this.passengerIds = new int[list.size()];

        for (int i = 0; i < list.size(); ++i)
        {
            this.passengerIds[i] = list.get(i).getEntityId();
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.passengerIds = buf.readVarIntArray();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        buf.writeVarIntArray(this.passengerIds);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleSetPassengers(this);
    }

    public int[] getPassengerIds()
    {
        return this.passengerIds;
    }

    public int getEntityId()
    {
        return this.entityId;
    }
}

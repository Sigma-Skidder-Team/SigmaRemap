package net.minecraft.network.play.server;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SMountEntityPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private int vehicleEntityId;

    public SMountEntityPacket()
    {
    }

    public SMountEntityPacket(Entity p_i1261_1_, @Nullable Entity p_i1261_2_)
    {
        this.entityId = p_i1261_1_.getEntityId();
        this.vehicleEntityId = p_i1261_2_ != null ? p_i1261_2_.getEntityId() : 0;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readInt();
        this.vehicleEntityId = buf.readInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeInt(this.entityId);
        buf.writeInt(this.vehicleEntityId);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleEntityAttach(this);
    }

    public int getEntityId()
    {
        return this.entityId;
    }

    public int getVehicleEntityId()
    {
        return this.vehicleEntityId;
    }
}

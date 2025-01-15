package net.minecraft.network.play.server;

import java.io.IOException;
import java.util.List;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.EntityDataManager;

public class SEntityMetadataPacket implements IPacket<IClientPlayNetHandler>
{
    private int entityId;
    private List < EntityDataManager.DataEntry<? >> dataManagerEntries;

    public SEntityMetadataPacket()
    {
    }

    public SEntityMetadataPacket(int p_i3446_1_, EntityDataManager p_i3446_2_, boolean p_i3446_3_)
    {
        this.entityId = p_i3446_1_;

        if (p_i3446_3_)
        {
            this.dataManagerEntries = p_i3446_2_.getAll();
            p_i3446_2_.setClean();
        }
        else
        {
            this.dataManagerEntries = p_i3446_2_.getDirty();
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
        this.dataManagerEntries = EntityDataManager.readEntries(buf);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
        EntityDataManager.writeEntries(this.dataManagerEntries, buf);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleEntityMetadata(this);
    }

    public List < EntityDataManager.DataEntry<? >> getDataManagerEntries()
    {
        return this.dataManagerEntries;
    }

    public int getEntityId()
    {
        return this.entityId;
    }
}

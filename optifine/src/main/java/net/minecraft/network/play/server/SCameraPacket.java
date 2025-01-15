package net.minecraft.network.play.server;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;

public class SCameraPacket implements IPacket<IClientPlayNetHandler>
{
    public int entityId;

    public SCameraPacket()
    {
    }

    public SCameraPacket(Entity p_i3936_1_)
    {
        this.entityId = p_i3936_1_.getEntityId();
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.entityId = buf.readVarInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.entityId);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleCamera(this);
    }

    @Nullable
    public Entity getEntity(World worldIn)
    {
        return worldIn.getEntityByID(this.entityId);
    }
}

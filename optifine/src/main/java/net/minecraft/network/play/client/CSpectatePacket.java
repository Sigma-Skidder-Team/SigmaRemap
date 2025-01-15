package net.minecraft.network.play.client;

import java.io.IOException;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.entity.Entity;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.world.server.ServerWorld;

public class CSpectatePacket implements IPacket<IServerPlayNetHandler>
{
    private UUID id;

    public CSpectatePacket()
    {
    }

    public CSpectatePacket(UUID creatureIn)
    {
        this.id = creatureIn;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.id = buf.readUniqueId();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeUniqueId(this.id);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.handleSpectate(this);
    }

    @Nullable
    public Entity getEntity(ServerWorld worldIn)
    {
        return worldIn.getEntityByUuid(this.id);
    }
}

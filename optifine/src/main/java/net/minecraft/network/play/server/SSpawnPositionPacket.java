package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

public class SSpawnPositionPacket implements IPacket<IClientPlayNetHandler>
{
    private BlockPos spawnBlockPos;

    public SSpawnPositionPacket()
    {
    }

    public SSpawnPositionPacket(BlockPos p_i834_1_)
    {
        this.spawnBlockPos = p_i834_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.spawnBlockPos = buf.readBlockPos();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeBlockPos(this.spawnBlockPos);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleSpawnPosition(this);
    }

    public BlockPos getSpawnPos()
    {
        return this.spawnBlockPos;
    }
}

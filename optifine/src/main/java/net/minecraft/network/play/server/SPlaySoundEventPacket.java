package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

public class SPlaySoundEventPacket implements IPacket<IClientPlayNetHandler>
{
    private int soundType;
    private BlockPos soundPos;
    private int soundData;
    private boolean serverWide;

    public SPlaySoundEventPacket()
    {
    }

    public SPlaySoundEventPacket(int p_i2101_1_, BlockPos p_i2101_2_, int p_i2101_3_, boolean p_i2101_4_)
    {
        this.soundType = p_i2101_1_;
        this.soundPos = p_i2101_2_.toImmutable();
        this.soundData = p_i2101_3_;
        this.serverWide = p_i2101_4_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.soundType = buf.readInt();
        this.soundPos = buf.readBlockPos();
        this.soundData = buf.readInt();
        this.serverWide = buf.readBoolean();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeInt(this.soundType);
        buf.writeBlockPos(this.soundPos);
        buf.writeInt(this.soundData);
        buf.writeBoolean(this.serverWide);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleEffect(this);
    }

    public boolean isSoundServerwide()
    {
        return this.serverWide;
    }

    public int getSoundType()
    {
        return this.soundType;
    }

    public int getSoundData()
    {
        return this.soundData;
    }

    public BlockPos getSoundPos()
    {
        return this.soundPos;
    }
}

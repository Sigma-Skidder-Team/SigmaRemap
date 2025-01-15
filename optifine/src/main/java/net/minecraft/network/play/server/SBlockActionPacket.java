package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.block.Block;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

public class SBlockActionPacket implements IPacket<IClientPlayNetHandler>
{
    private BlockPos blockPosition;
    private int instrument;
    private int pitch;
    private Block block;

    public SBlockActionPacket()
    {
    }

    public SBlockActionPacket(BlockPos p_i4029_1_, Block p_i4029_2_, int p_i4029_3_, int p_i4029_4_)
    {
        this.blockPosition = p_i4029_1_;
        this.block = p_i4029_2_;
        this.instrument = p_i4029_3_;
        this.pitch = p_i4029_4_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.blockPosition = buf.readBlockPos();
        this.instrument = buf.readUnsignedByte();
        this.pitch = buf.readUnsignedByte();
        this.block = Registry.BLOCK.getByValue(buf.readVarInt());
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeBlockPos(this.blockPosition);
        buf.writeByte(this.instrument);
        buf.writeByte(this.pitch);
        buf.writeVarInt(Registry.BLOCK.getId(this.block));
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleBlockAction(this);
    }

    public BlockPos getBlockPosition()
    {
        return this.blockPosition;
    }

    public int getData1()
    {
        return this.instrument;
    }

    public int getData2()
    {
        return this.pitch;
    }

    public Block getBlockType()
    {
        return this.block;
    }
}

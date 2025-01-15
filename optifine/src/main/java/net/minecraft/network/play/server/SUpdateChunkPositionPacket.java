package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SUpdateChunkPositionPacket implements IPacket<IClientPlayNetHandler>
{
    private int field_218756_a;
    private int field_218757_b;

    public SUpdateChunkPositionPacket()
    {
    }

    public SUpdateChunkPositionPacket(int p_i3607_1_, int p_i3607_2_)
    {
        this.field_218756_a = p_i3607_1_;
        this.field_218757_b = p_i3607_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.field_218756_a = buf.readVarInt();
        this.field_218757_b = buf.readVarInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.field_218756_a);
        buf.writeVarInt(this.field_218757_b);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleChunkPositionPacket(this);
    }

    public int func_218755_b()
    {
        return this.field_218756_a;
    }

    public int func_218754_c()
    {
        return this.field_218757_b;
    }
}

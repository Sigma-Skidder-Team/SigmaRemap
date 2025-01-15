package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SOpenHorseWindowPacket implements IPacket<IClientPlayNetHandler>
{
    private int field_218705_a;
    private int field_218706_b;
    private int field_218707_c;

    public SOpenHorseWindowPacket()
    {
    }

    public SOpenHorseWindowPacket(int p_i366_1_, int p_i366_2_, int p_i366_3_)
    {
        this.field_218705_a = p_i366_1_;
        this.field_218706_b = p_i366_2_;
        this.field_218707_c = p_i366_3_;
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleOpenHorseWindow(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.field_218705_a = buf.readUnsignedByte();
        this.field_218706_b = buf.readVarInt();
        this.field_218707_c = buf.readInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.field_218705_a);
        buf.writeVarInt(this.field_218706_b);
        buf.writeInt(this.field_218707_c);
    }

    public int func_218704_b()
    {
        return this.field_218705_a;
    }

    public int func_218702_c()
    {
        return this.field_218706_b;
    }

    public int func_218703_d()
    {
        return this.field_218707_c;
    }
}

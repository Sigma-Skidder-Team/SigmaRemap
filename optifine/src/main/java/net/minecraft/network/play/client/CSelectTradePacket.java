package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CSelectTradePacket implements IPacket<IServerPlayNetHandler>
{
    private int field_210354_a;

    public CSelectTradePacket()
    {
    }

    public CSelectTradePacket(int p_i487_1_)
    {
        this.field_210354_a = p_i487_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.field_210354_a = buf.readVarInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.field_210354_a);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processSelectTrade(this);
    }

    public int func_210353_a()
    {
        return this.field_210354_a;
    }
}

package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CTabCompletePacket implements IPacket<IServerPlayNetHandler>
{
    private int transactionId;
    private String command;

    public CTabCompletePacket()
    {
    }

    public CTabCompletePacket(int p_i1436_1_, String p_i1436_2_)
    {
        this.transactionId = p_i1436_1_;
        this.command = p_i1436_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.transactionId = buf.readVarInt();
        this.command = buf.readString(32500);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.transactionId);
        buf.writeString(this.command, 32500);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processTabComplete(this);
    }

    public int getTransactionId()
    {
        return this.transactionId;
    }

    public String getCommand()
    {
        return this.command;
    }
}

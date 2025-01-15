package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

public class SChangeGameStatePacket implements IPacket<IClientPlayNetHandler>
{
    public static final String[] MESSAGE_NAMES = new String[] {"block.minecraft.bed.not_valid"};
    private int state;
    private float value;

    public SChangeGameStatePacket()
    {
    }

    public SChangeGameStatePacket(int p_i1887_1_, float p_i1887_2_)
    {
        this.state = p_i1887_1_;
        this.value = p_i1887_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.state = buf.readUnsignedByte();
        this.value = buf.readFloat();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.state);
        buf.writeFloat(this.value);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleChangeGameState(this);
    }

    public int getGameState()
    {
        return this.state;
    }

    public float getValue()
    {
        return this.value;
    }
}

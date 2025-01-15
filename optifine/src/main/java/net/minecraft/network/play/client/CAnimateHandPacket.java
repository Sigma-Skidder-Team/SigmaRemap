package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.util.Hand;

public class CAnimateHandPacket implements IPacket<IServerPlayNetHandler>
{
    private Hand hand;

    public CAnimateHandPacket()
    {
    }

    public CAnimateHandPacket(Hand p_i3165_1_)
    {
        this.hand = p_i3165_1_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.hand = buf.readEnumValue(Hand.class);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeEnumValue(this.hand);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.handleAnimation(this);
    }

    public Hand getHand()
    {
        return this.hand;
    }
}

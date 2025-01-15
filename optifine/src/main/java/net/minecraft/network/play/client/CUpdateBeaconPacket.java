package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CUpdateBeaconPacket implements IPacket<IServerPlayNetHandler>
{
    private int primaryEffect;
    private int secondaryEffect;

    public CUpdateBeaconPacket()
    {
    }

    public CUpdateBeaconPacket(int p_i2844_1_, int p_i2844_2_)
    {
        this.primaryEffect = p_i2844_1_;
        this.secondaryEffect = p_i2844_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.primaryEffect = buf.readVarInt();
        this.secondaryEffect = buf.readVarInt();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.primaryEffect);
        buf.writeVarInt(this.secondaryEffect);
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processUpdateBeacon(this);
    }

    public int getPrimaryEffect()
    {
        return this.primaryEffect;
    }

    public int getSecondaryEffect()
    {
        return this.secondaryEffect;
    }
}

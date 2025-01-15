package net.minecraft.network.login.client;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.login.IServerLoginNetHandler;

public class CCustomPayloadLoginPacket implements IPacket<IServerLoginNetHandler>
{
    private int transaction;
    private PacketBuffer payload;

    public CCustomPayloadLoginPacket()
    {
    }

    public CCustomPayloadLoginPacket(int p_i2706_1_, @Nullable PacketBuffer p_i2706_2_)
    {
        this.transaction = p_i2706_1_;
        this.payload = p_i2706_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.transaction = buf.readVarInt();

        if (buf.readBoolean())
        {
            int i = buf.readableBytes();

            if (i < 0 || i > 1048576)
            {
                throw new IOException("Payload may not be larger than 1048576 bytes");
            }

            this.payload = new PacketBuffer(buf.readBytes(i));
        }
        else
        {
            this.payload = null;
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeVarInt(this.transaction);

        if (this.payload != null)
        {
            buf.writeBoolean(true);
            buf.writeBytes(this.payload.copy());
        }
        else
        {
            buf.writeBoolean(false);
        }
    }

    public void processPacket(IServerLoginNetHandler handler)
    {
        handler.processCustomPayloadLogin(this);
    }
}

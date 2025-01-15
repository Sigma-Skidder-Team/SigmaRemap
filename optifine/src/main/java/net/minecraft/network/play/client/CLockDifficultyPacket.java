package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;

public class CLockDifficultyPacket implements IPacket<IServerPlayNetHandler>
{
    private boolean field_218777_a;

    public CLockDifficultyPacket()
    {
    }

    public CLockDifficultyPacket(boolean p_i358_1_)
    {
        this.field_218777_a = p_i358_1_;
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.func_217261_a(this);
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.field_218777_a = buf.readBoolean();
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeBoolean(this.field_218777_a);
    }

    public boolean func_218776_b()
    {
        return this.field_218777_a;
    }
}

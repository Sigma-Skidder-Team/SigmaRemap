package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;

public class CUpdateSignPacket implements IPacket<IServerPlayNetHandler>
{
    private BlockPos pos;
    private String[] lines;

    public CUpdateSignPacket()
    {
    }

    public CUpdateSignPacket(BlockPos p_i1324_1_, ITextComponent p_i1324_2_, ITextComponent p_i1324_3_, ITextComponent p_i1324_4_, ITextComponent p_i1324_5_)
    {
        this.pos = p_i1324_1_;
        this.lines = new String[] {p_i1324_2_.getString(), p_i1324_3_.getString(), p_i1324_4_.getString(), p_i1324_5_.getString()};
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.pos = buf.readBlockPos();
        this.lines = new String[4];

        for (int i = 0; i < 4; ++i)
        {
            this.lines[i] = buf.readString(384);
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeBlockPos(this.pos);

        for (int i = 0; i < 4; ++i)
        {
            buf.writeString(this.lines[i]);
        }
    }

    public void processPacket(IServerPlayNetHandler handler)
    {
        handler.processUpdateSign(this);
    }

    public BlockPos getPosition()
    {
        return this.pos;
    }

    public String[] getLines()
    {
        return this.lines;
    }
}

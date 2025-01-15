package net.minecraft.network.play.server;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.scoreboard.ScoreObjective;

public class SDisplayObjectivePacket implements IPacket<IClientPlayNetHandler>
{
    private int position;
    private String scoreName;

    public SDisplayObjectivePacket()
    {
    }

    public SDisplayObjectivePacket(int p_i1240_1_, @Nullable ScoreObjective p_i1240_2_)
    {
        this.position = p_i1240_1_;

        if (p_i1240_2_ == null)
        {
            this.scoreName = "";
        }
        else
        {
            this.scoreName = p_i1240_2_.getName();
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.position = buf.readByte();
        this.scoreName = buf.readString(16);
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeByte(this.position);
        buf.writeString(this.scoreName);
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleDisplayObjective(this);
    }

    public int getPosition()
    {
        return this.position;
    }

    @Nullable
    public String getName()
    {
        return Objects.equals(this.scoreName, "") ? null : this.scoreName;
    }
}

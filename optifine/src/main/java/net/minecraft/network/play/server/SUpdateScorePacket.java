package net.minecraft.network.play.server;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.scoreboard.ServerScoreboard;

public class SUpdateScorePacket implements IPacket<IClientPlayNetHandler>
{
    private String name = "";
    @Nullable
    private String objective;
    private int value;
    private ServerScoreboard.Action action;

    public SUpdateScorePacket()
    {
    }

    public SUpdateScorePacket(ServerScoreboard.Action p_i1053_1_, @Nullable String p_i1053_2_, String name, int p_i1053_4_)
    {
        if (p_i1053_1_ != ServerScoreboard.Action.REMOVE && p_i1053_2_ == null)
        {
            throw new IllegalArgumentException("Need an objective name");
        }
        else
        {
            this.name = name;
            this.objective = p_i1053_2_;
            this.value = p_i1053_4_;
            this.action = p_i1053_1_;
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.name = buf.readString(40);
        this.action = buf.readEnumValue(ServerScoreboard.Action.class);
        String s = buf.readString(16);
        this.objective = Objects.equals(s, "") ? null : s;

        if (this.action != ServerScoreboard.Action.REMOVE)
        {
            this.value = buf.readVarInt();
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeString(this.name);
        buf.writeEnumValue(this.action);
        buf.writeString(this.objective == null ? "" : this.objective);

        if (this.action != ServerScoreboard.Action.REMOVE)
        {
            buf.writeVarInt(this.value);
        }
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleUpdateScore(this);
    }

    public String getPlayerName()
    {
        return this.name;
    }

    @Nullable
    public String getObjectiveName()
    {
        return this.objective;
    }

    public int getScoreValue()
    {
        return this.value;
    }

    public ServerScoreboard.Action getAction()
    {
        return this.action;
    }
}

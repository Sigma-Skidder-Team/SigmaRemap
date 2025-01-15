package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.scoreboard.ScoreCriteria;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.util.text.ITextComponent;

public class SScoreboardObjectivePacket implements IPacket<IClientPlayNetHandler>
{
    private String objectiveName;
    private ITextComponent displayName;
    private ScoreCriteria.RenderType renderType;
    private int action;

    public SScoreboardObjectivePacket()
    {
    }

    public SScoreboardObjectivePacket(ScoreObjective p_i3892_1_, int p_i3892_2_)
    {
        this.objectiveName = p_i3892_1_.getName();
        this.displayName = p_i3892_1_.getDisplayName();
        this.renderType = p_i3892_1_.getRenderType();
        this.action = p_i3892_2_;
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.objectiveName = buf.readString(16);
        this.action = buf.readByte();

        if (this.action == 0 || this.action == 2)
        {
            this.displayName = buf.readTextComponent();
            this.renderType = buf.readEnumValue(ScoreCriteria.RenderType.class);
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeString(this.objectiveName);
        buf.writeByte(this.action);

        if (this.action == 0 || this.action == 2)
        {
            buf.writeTextComponent(this.displayName);
            buf.writeEnumValue(this.renderType);
        }
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleScoreboardObjective(this);
    }

    public String getObjectiveName()
    {
        return this.objectiveName;
    }

    public ITextComponent getDisplayName()
    {
        return this.displayName;
    }

    public int getAction()
    {
        return this.action;
    }

    public ScoreCriteria.RenderType getRenderType()
    {
        return this.renderType;
    }
}

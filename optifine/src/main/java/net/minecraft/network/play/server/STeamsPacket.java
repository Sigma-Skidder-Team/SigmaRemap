package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;

public class STeamsPacket implements IPacket<IClientPlayNetHandler>
{
    private String name = "";
    private ITextComponent displayName = new StringTextComponent("");
    private ITextComponent prefix = new StringTextComponent("");
    private ITextComponent suffix = new StringTextComponent("");
    private String nameTagVisibility = Team.Visible.ALWAYS.internalName;
    private String collisionRule = Team.CollisionRule.ALWAYS.name;
    private TextFormatting color = TextFormatting.RESET;
    private final Collection<String> players = Lists.newArrayList();
    private int action;
    private int friendlyFlags;

    public STeamsPacket()
    {
    }

    public STeamsPacket(ScorePlayerTeam p_i1218_1_, int p_i1218_2_)
    {
        this.name = p_i1218_1_.getName();
        this.action = p_i1218_2_;

        if (p_i1218_2_ == 0 || p_i1218_2_ == 2)
        {
            this.displayName = p_i1218_1_.getDisplayName();
            this.friendlyFlags = p_i1218_1_.getFriendlyFlags();
            this.nameTagVisibility = p_i1218_1_.getNameTagVisibility().internalName;
            this.collisionRule = p_i1218_1_.getCollisionRule().name;
            this.color = p_i1218_1_.getColor();
            this.prefix = p_i1218_1_.getPrefix();
            this.suffix = p_i1218_1_.getSuffix();
        }

        if (p_i1218_2_ == 0)
        {
            this.players.addAll(p_i1218_1_.getMembershipCollection());
        }
    }

    public STeamsPacket(ScorePlayerTeam worldIn, Collection<String> xCoordIn, int p_i1219_3_)
    {
        if (p_i1219_3_ != 3 && p_i1219_3_ != 4)
        {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        else if (xCoordIn != null && !xCoordIn.isEmpty())
        {
            this.action = p_i1219_3_;
            this.name = worldIn.getName();
            this.players.addAll(xCoordIn);
        }
        else
        {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
    }

    public void readPacketData(PacketBuffer buf) throws IOException
    {
        this.name = buf.readString(16);
        this.action = buf.readByte();

        if (this.action == 0 || this.action == 2)
        {
            this.displayName = buf.readTextComponent();
            this.friendlyFlags = buf.readByte();
            this.nameTagVisibility = buf.readString(40);
            this.collisionRule = buf.readString(40);
            this.color = buf.readEnumValue(TextFormatting.class);
            this.prefix = buf.readTextComponent();
            this.suffix = buf.readTextComponent();
        }

        if (this.action == 0 || this.action == 3 || this.action == 4)
        {
            int i = buf.readVarInt();

            for (int j = 0; j < i; ++j)
            {
                this.players.add(buf.readString(40));
            }
        }
    }

    public void writePacketData(PacketBuffer buf) throws IOException
    {
        buf.writeString(this.name);
        buf.writeByte(this.action);

        if (this.action == 0 || this.action == 2)
        {
            buf.writeTextComponent(this.displayName);
            buf.writeByte(this.friendlyFlags);
            buf.writeString(this.nameTagVisibility);
            buf.writeString(this.collisionRule);
            buf.writeEnumValue(this.color);
            buf.writeTextComponent(this.prefix);
            buf.writeTextComponent(this.suffix);
        }

        if (this.action == 0 || this.action == 3 || this.action == 4)
        {
            buf.writeVarInt(this.players.size());

            for (String s : this.players)
            {
                buf.writeString(s);
            }
        }
    }

    public void processPacket(IClientPlayNetHandler handler)
    {
        handler.handleTeams(this);
    }

    public String getName()
    {
        return this.name;
    }

    public ITextComponent getDisplayName()
    {
        return this.displayName;
    }

    public Collection<String> getPlayers()
    {
        return this.players;
    }

    public int getAction()
    {
        return this.action;
    }

    public int getFriendlyFlags()
    {
        return this.friendlyFlags;
    }

    public TextFormatting getColor()
    {
        return this.color;
    }

    public String getNameTagVisibility()
    {
        return this.nameTagVisibility;
    }

    public String getCollisionRule()
    {
        return this.collisionRule;
    }

    public ITextComponent getPrefix()
    {
        return this.prefix;
    }

    public ITextComponent getSuffix()
    {
        return this.suffix;
    }
}

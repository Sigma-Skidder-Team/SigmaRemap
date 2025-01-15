package net.minecraft.scoreboard;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.HoverEvent;

public class ScorePlayerTeam extends Team
{
    private final Scoreboard scoreboard;
    private final String name;
    private final Set<String> membershipSet = Sets.newHashSet();
    private ITextComponent displayName;
    private ITextComponent prefix = new StringTextComponent("");
    private ITextComponent suffix = new StringTextComponent("");
    private boolean allowFriendlyFire = true;
    private boolean canSeeFriendlyInvisibles = true;
    private Team.Visible nameTagVisibility = Team.Visible.ALWAYS;
    private Team.Visible deathMessageVisibility = Team.Visible.ALWAYS;
    private TextFormatting color = TextFormatting.RESET;
    private Team.CollisionRule collisionRule = Team.CollisionRule.ALWAYS;

    public ScorePlayerTeam(Scoreboard p_i3345_1_, String p_i3345_2_)
    {
        this.scoreboard = p_i3345_1_;
        this.name = p_i3345_2_;
        this.displayName = new StringTextComponent(p_i3345_2_);
    }

    public String getName()
    {
        return this.name;
    }

    public ITextComponent getDisplayName()
    {
        return this.displayName;
    }

    public ITextComponent getCommandName()
    {
        ITextComponent itextcomponent = TextComponentUtils.wrapInSquareBrackets(this.displayName.deepCopy().applyTextStyle((p_211543_1_) ->
        {
            p_211543_1_.setInsertion(this.name).setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new StringTextComponent(this.name)));
        }));
        TextFormatting textformatting = this.getColor();

        if (textformatting != TextFormatting.RESET)
        {
            itextcomponent.applyTextStyle(textformatting);
        }

        return itextcomponent;
    }

    public void setDisplayName(ITextComponent name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name cannot be null");
        }
        else
        {
            this.displayName = name;
            this.scoreboard.onTeamChanged(this);
        }
    }

    public void setPrefix(@Nullable ITextComponent p_207408_1_)
    {
        this.prefix = (ITextComponent)(p_207408_1_ == null ? new StringTextComponent("") : p_207408_1_.deepCopy());
        this.scoreboard.onTeamChanged(this);
    }

    public ITextComponent getPrefix()
    {
        return this.prefix;
    }

    public void setSuffix(@Nullable ITextComponent p_207409_1_)
    {
        this.suffix = (ITextComponent)(p_207409_1_ == null ? new StringTextComponent("") : p_207409_1_.deepCopy());
        this.scoreboard.onTeamChanged(this);
    }

    public ITextComponent getSuffix()
    {
        return this.suffix;
    }

    public Collection<String> getMembershipCollection()
    {
        return this.membershipSet;
    }

    public ITextComponent format(ITextComponent p_200540_1_)
    {
        ITextComponent itextcomponent = (new StringTextComponent("")).appendSibling(this.prefix).appendSibling(p_200540_1_).appendSibling(this.suffix);
        TextFormatting textformatting = this.getColor();

        if (textformatting != TextFormatting.RESET)
        {
            itextcomponent.applyTextStyle(textformatting);
        }

        return itextcomponent;
    }

    public static ITextComponent formatMemberName(@Nullable Team p_200541_0_, ITextComponent p_200541_1_)
    {
        return p_200541_0_ == null ? p_200541_1_.deepCopy() : p_200541_0_.format(p_200541_1_);
    }

    public boolean getAllowFriendlyFire()
    {
        return this.allowFriendlyFire;
    }

    public void setAllowFriendlyFire(boolean friendlyFire)
    {
        this.allowFriendlyFire = friendlyFire;
        this.scoreboard.onTeamChanged(this);
    }

    public boolean getSeeFriendlyInvisiblesEnabled()
    {
        return this.canSeeFriendlyInvisibles;
    }

    public void setSeeFriendlyInvisiblesEnabled(boolean friendlyInvisibles)
    {
        this.canSeeFriendlyInvisibles = friendlyInvisibles;
        this.scoreboard.onTeamChanged(this);
    }

    public Team.Visible getNameTagVisibility()
    {
        return this.nameTagVisibility;
    }

    public Team.Visible getDeathMessageVisibility()
    {
        return this.deathMessageVisibility;
    }

    public void setNameTagVisibility(Team.Visible visibility)
    {
        this.nameTagVisibility = visibility;
        this.scoreboard.onTeamChanged(this);
    }

    public void setDeathMessageVisibility(Team.Visible visibility)
    {
        this.deathMessageVisibility = visibility;
        this.scoreboard.onTeamChanged(this);
    }

    public Team.CollisionRule getCollisionRule()
    {
        return this.collisionRule;
    }

    public void setCollisionRule(Team.CollisionRule rule)
    {
        this.collisionRule = rule;
        this.scoreboard.onTeamChanged(this);
    }

    public int getFriendlyFlags()
    {
        int i = 0;

        if (this.getAllowFriendlyFire())
        {
            i |= 1;
        }

        if (this.getSeeFriendlyInvisiblesEnabled())
        {
            i |= 2;
        }

        return i;
    }

    public void setFriendlyFlags(int flags)
    {
        this.setAllowFriendlyFire((flags & 1) > 0);
        this.setSeeFriendlyInvisiblesEnabled((flags & 2) > 0);
    }

    public void setColor(TextFormatting color)
    {
        this.color = color;
        this.scoreboard.onTeamChanged(this);
    }

    public TextFormatting getColor()
    {
        return this.color;
    }
}

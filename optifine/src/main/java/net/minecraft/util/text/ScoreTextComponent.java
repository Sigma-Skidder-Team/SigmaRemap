package net.minecraft.util.text;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.command.CommandSource;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.arguments.EntitySelector;
import net.minecraft.command.arguments.EntitySelectorParser;
import net.minecraft.entity.Entity;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.StringUtils;

public class ScoreTextComponent extends TextComponent implements ITargetedTextComponent
{
    private final String name;
    @Nullable
    private final EntitySelector selector;
    private final String objective;
    private String value = "";

    public ScoreTextComponent(String p_i1849_1_, String p_i1849_2_)
    {
        this.name = p_i1849_1_;
        this.objective = p_i1849_2_;
        EntitySelector entityselector = null;

        try
        {
            EntitySelectorParser entityselectorparser = new EntitySelectorParser(new StringReader(p_i1849_1_));
            entityselector = entityselectorparser.parse();
        }
        catch (CommandSyntaxException var5)
        {
            ;
        }

        this.selector = entityselector;
    }

    public String getName()
    {
        return this.name;
    }

    public String getObjective()
    {
        return this.objective;
    }

    public void setValue(String valueIn)
    {
        this.value = valueIn;
    }

    public String getUnformattedComponentText()
    {
        return this.value;
    }

    private void resolve(CommandSource p_197665_1_)
    {
        MinecraftServer minecraftserver = p_197665_1_.getServer();

        if (minecraftserver != null && minecraftserver.isAnvilFileSet() && StringUtils.isNullOrEmpty(this.value))
        {
            Scoreboard scoreboard = minecraftserver.getScoreboard();
            ScoreObjective scoreobjective = scoreboard.getObjective(this.objective);

            if (scoreboard.entityHasObjective(this.name, scoreobjective))
            {
                Score score = scoreboard.getOrCreateScore(this.name, scoreobjective);
                this.setValue(String.format("%d", score.getScorePoints()));
            }
            else
            {
                this.value = "";
            }
        }
    }

    public ScoreTextComponent shallowCopy()
    {
        ScoreTextComponent scoretextcomponent = new ScoreTextComponent(this.name, this.objective);
        scoretextcomponent.setValue(this.value);
        return scoretextcomponent;
    }

    public ITextComponent createNames(@Nullable CommandSource p_197668_1_, @Nullable Entity p_197668_2_, int p_197668_3_) throws CommandSyntaxException
    {
        if (p_197668_1_ == null)
        {
            return this.shallowCopy();
        }
        else
        {
            String s;

            if (this.selector != null)
            {
                List <? extends Entity > list = this.selector.select(p_197668_1_);

                if (list.isEmpty())
                {
                    s = this.name;
                }
                else
                {
                    if (list.size() != 1)
                    {
                        throw EntityArgument.TOO_MANY_ENTITIES.create();
                    }

                    s = list.get(0).getScoreboardName();
                }
            }
            else
            {
                s = this.name;
            }

            String s1 = p_197668_2_ != null && s.equals("*") ? p_197668_2_.getScoreboardName() : s;
            ScoreTextComponent scoretextcomponent = new ScoreTextComponent(s1, this.objective);
            scoretextcomponent.setValue(this.value);
            scoretextcomponent.resolve(p_197668_1_);
            return scoretextcomponent;
        }
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (!(p_equals_1_ instanceof ScoreTextComponent))
        {
            return false;
        }
        else
        {
            ScoreTextComponent scoretextcomponent = (ScoreTextComponent)p_equals_1_;
            return this.name.equals(scoretextcomponent.name) && this.objective.equals(scoretextcomponent.objective) && super.equals(p_equals_1_);
        }
    }

    public String toString()
    {
        return "ScoreComponent{name='" + this.name + '\'' + "objective='" + this.objective + '\'' + ", siblings=" + this.siblings + ", style=" + this.getStyle() + '}';
    }
}

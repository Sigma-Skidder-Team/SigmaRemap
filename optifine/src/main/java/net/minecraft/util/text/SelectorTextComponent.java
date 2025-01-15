package net.minecraft.util.text;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;
import net.minecraft.command.CommandSource;
import net.minecraft.command.arguments.EntitySelector;
import net.minecraft.command.arguments.EntitySelectorParser;
import net.minecraft.entity.Entity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SelectorTextComponent extends TextComponent implements ITargetedTextComponent
{
    private static final Logger LOGGER = LogManager.getLogger();
    private final String selector;
    @Nullable
    private final EntitySelector field_197670_d;

    public SelectorTextComponent(String entityIn)
    {
        this.selector = entityIn;
        EntitySelector entityselector = null;

        try
        {
            EntitySelectorParser entityselectorparser = new EntitySelectorParser(new StringReader(entityIn));
            entityselector = entityselectorparser.parse();
        }
        catch (CommandSyntaxException commandsyntaxexception)
        {
            LOGGER.warn("Invalid selector component: {}", entityIn, commandsyntaxexception.getMessage());
        }

        this.field_197670_d = entityselector;
    }

    public String getSelector()
    {
        return this.selector;
    }

    public ITextComponent createNames(@Nullable CommandSource p_197668_1_, @Nullable Entity p_197668_2_, int p_197668_3_) throws CommandSyntaxException
    {
        return (ITextComponent)(p_197668_1_ != null && this.field_197670_d != null ? EntitySelector.joinNames(this.field_197670_d.select(p_197668_1_)) : new StringTextComponent(""));
    }

    public String getUnformattedComponentText()
    {
        return this.selector;
    }

    public SelectorTextComponent shallowCopy()
    {
        return new SelectorTextComponent(this.selector);
    }

    public boolean equals(Object p_equals_1_)
    {
        if (this == p_equals_1_)
        {
            return true;
        }
        else if (!(p_equals_1_ instanceof SelectorTextComponent))
        {
            return false;
        }
        else
        {
            SelectorTextComponent selectortextcomponent = (SelectorTextComponent)p_equals_1_;
            return this.selector.equals(selectortextcomponent.selector) && super.equals(p_equals_1_);
        }
    }

    public String toString()
    {
        return "SelectorComponent{pattern='" + this.selector + '\'' + ", siblings=" + this.siblings + ", style=" + this.getStyle() + '}';
    }
}

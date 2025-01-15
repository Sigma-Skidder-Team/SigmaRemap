package net.minecraft.command;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.util.text.ITextComponent;

public class CommandException extends RuntimeException
{
    private final ITextComponent component;

    public CommandException(ITextComponent p_i3037_1_)
    {
        super(p_i3037_1_.getUnformattedComponentText(), (Throwable)null, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES, CommandSyntaxException.ENABLE_COMMAND_STACK_TRACES);
        this.component = p_i3037_1_;
    }

    public ITextComponent getComponent()
    {
        return this.component;
    }
}

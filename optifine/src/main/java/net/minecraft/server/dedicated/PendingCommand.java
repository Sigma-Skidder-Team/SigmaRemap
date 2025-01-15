package net.minecraft.server.dedicated;

import net.minecraft.command.CommandSource;

public class PendingCommand
{
    public final String command;
    public final CommandSource sender;

    public PendingCommand(String p_i3197_1_, CommandSource p_i3197_2_)
    {
        this.command = p_i3197_1_;
        this.sender = p_i3197_2_;
    }
}

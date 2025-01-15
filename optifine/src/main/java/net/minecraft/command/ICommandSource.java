package net.minecraft.command;

import net.minecraft.util.text.ITextComponent;

public interface ICommandSource
{
    ICommandSource DUMMY = new ICommandSource()
    {
        public void sendMessage(ITextComponent component)
        {
        }
        public boolean shouldReceiveFeedback()
        {
            return false;
        }
        public boolean shouldReceiveErrors()
        {
            return false;
        }
        public boolean allowLogging()
        {
            return false;
        }
    };

    void sendMessage(ITextComponent component);

    boolean shouldReceiveFeedback();

    boolean shouldReceiveErrors();

    boolean allowLogging();
}

package net.minecraft.client.gui;

import net.minecraft.util.text.ITextComponent;

public class ChatLine
{
    private final int updateCounterCreated;
    private final ITextComponent lineString;
    private final int chatLineID;

    public ChatLine(int p_i1594_1_, ITextComponent p_i1594_2_, int p_i1594_3_)
    {
        this.lineString = p_i1594_2_;
        this.updateCounterCreated = p_i1594_1_;
        this.chatLineID = p_i1594_3_;
    }

    public ITextComponent getChatComponent()
    {
        return this.lineString;
    }

    public int getUpdatedCounter()
    {
        return this.updateCounterCreated;
    }

    public int getChatLineID()
    {
        return this.chatLineID;
    }
}

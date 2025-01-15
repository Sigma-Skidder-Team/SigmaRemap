package net.minecraft.realms;

import net.minecraft.client.gui.IGuiEventListener;

public class RealmsLabelProxy implements IGuiEventListener
{
    private final RealmsLabel label;

    public RealmsLabelProxy(RealmsLabel p_i948_1_)
    {
        this.label = p_i948_1_;
    }

    public RealmsLabel getLabel()
    {
        return this.label;
    }
}

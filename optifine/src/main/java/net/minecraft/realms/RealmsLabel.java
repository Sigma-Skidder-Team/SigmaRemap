package net.minecraft.realms;

import net.minecraft.client.gui.IGuiEventListener;

public class RealmsLabel extends RealmsGuiEventListener
{
    private final RealmsLabelProxy proxy = new RealmsLabelProxy(this);
    private final String text;
    private final int x;
    private final int y;
    private final int color;

    public RealmsLabel(String p_i3843_1_, int p_i3843_2_, int p_i3843_3_, int p_i3843_4_)
    {
        this.text = p_i3843_1_;
        this.x = p_i3843_2_;
        this.y = p_i3843_3_;
        this.color = p_i3843_4_;
    }

    public void render(RealmsScreen p_render_1_)
    {
        p_render_1_.drawCenteredString(this.text, this.x, this.y, this.color);
    }

    public IGuiEventListener getProxy()
    {
        return this.proxy;
    }

    public String getText()
    {
        return this.text;
    }
}

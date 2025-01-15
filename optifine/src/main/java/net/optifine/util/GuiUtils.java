package net.optifine.util;

import net.minecraft.client.gui.widget.OptionSlider;
import net.minecraft.client.gui.widget.Widget;

public class GuiUtils
{
    public static int getWidth(Widget widget)
    {
        return OptionSlider.getWidth(widget);
    }

    public static int getHeight(Widget widget)
    {
        return OptionSlider.getHeight(widget);
    }
}

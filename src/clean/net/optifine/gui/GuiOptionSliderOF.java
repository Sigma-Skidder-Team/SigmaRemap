package net.optifine.gui;

import net.minecraft.client.AbstractOption;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.OptionSlider;
import net.minecraft.client.settings.SliderPercentageOption;

public class GuiOptionSliderOF extends OptionSlider implements IOptionControl
{
    private AbstractOption option = null;

    public GuiOptionSliderOF(int id, int x, int y, SliderPercentageOption option)
    {
        super(Minecraft.getInstance().gameSettings, x, y, 200, 20, option);
        this.option = option;
    }

    public AbstractOption getControlOption()
    {
        return this.option;
    }
}

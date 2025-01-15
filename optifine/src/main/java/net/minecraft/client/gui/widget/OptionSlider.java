package net.minecraft.client.gui.widget;

import net.minecraft.client.GameSettings;
import net.minecraft.client.settings.AbstractOption;
import net.minecraft.client.settings.SliderPercentageOption;
import net.optifine.gui.IOptionControl;

public class OptionSlider extends AbstractSlider implements IOptionControl
{
    private final SliderPercentageOption option;

    public OptionSlider(GameSettings p_i77_1_, int p_i77_2_, int p_i77_3_, int p_i77_4_, int p_i77_5_, SliderPercentageOption p_i77_6_)
    {
        super(p_i77_1_, p_i77_2_, p_i77_3_, p_i77_4_, p_i77_5_, (double)((float)p_i77_6_.normalizeValue(p_i77_6_.get(p_i77_1_))));
        this.option = p_i77_6_;
        this.updateMessage();
    }

    protected void applyValue()
    {
        this.option.set(this.options, this.option.denormalizeValue(this.value));
        this.options.saveOptions();
    }

    protected void updateMessage()
    {
        this.setMessage(this.option.getText(this.options));
    }

    public static int getWidth(Widget p_getWidth_0_)
    {
        return p_getWidth_0_.width;
    }

    public static int getHeight(Widget p_getHeight_0_)
    {
        return p_getHeight_0_.height;
    }

    public AbstractOption getControlOption()
    {
        return this.option;
    }
}

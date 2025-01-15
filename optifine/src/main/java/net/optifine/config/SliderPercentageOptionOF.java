package net.optifine.config;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.client.GameSettings;
import net.minecraft.client.settings.SliderPercentageOption;

public class SliderPercentageOptionOF extends SliderPercentageOption
{
    public SliderPercentageOptionOF(String name)
    {
        this(name, 0.0D, 1.0D, 0.0F);
    }

    public SliderPercentageOptionOF(String name, double valueMin, double valueMax, float step)
    {
        super(name, valueMin, valueMax, step, (Function<GameSettings, Double>)null, (BiConsumer<GameSettings, Double>)null, (BiFunction<GameSettings, SliderPercentageOption, String>)null);
        super.getter = this::getOptionValue;
        super.setter = this::setOptionValue;
        super.getDisplayStringFunc = this::getOptionText;
    }

    private double getOptionValue(GameSettings gameSettings)
    {
        return gameSettings.getOptionFloatValueOF(this);
    }

    private void setOptionValue(GameSettings gameSettings, double value)
    {
        gameSettings.setOptionFloatValueOF(this, value);
    }

    private String getOptionText(GameSettings gameSettings, SliderPercentageOption sliderPercentageOption)
    {
        return gameSettings.getKeyBindingOF(sliderPercentageOption);
    }
}

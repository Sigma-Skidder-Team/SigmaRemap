package net.minecraft.client.settings;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.client.GameSettings;

public class SliderMultiplierOption extends SliderPercentageOption
{
    public SliderMultiplierOption(String p_i2948_1_, double p_i2948_2_, double p_i2948_4_, float p_i2948_6_, Function<GameSettings, Double> p_i2948_7_, BiConsumer<GameSettings, Double> p_i2948_8_, BiFunction<GameSettings, SliderPercentageOption, String> p_i2948_9_)
    {
        super(p_i2948_1_, p_i2948_2_, p_i2948_4_, p_i2948_6_, p_i2948_7_, p_i2948_8_, p_i2948_9_);
    }

    public double normalizeValue(double value)
    {
        return Math.log(value / this.minValue) / Math.log(this.maxValue / this.minValue);
    }

    public double denormalizeValue(double value)
    {
        return this.minValue * Math.pow(Math.E, Math.log(this.maxValue / this.minValue) * value);
    }
}

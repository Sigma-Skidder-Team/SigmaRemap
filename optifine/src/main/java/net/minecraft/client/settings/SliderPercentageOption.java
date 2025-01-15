package net.minecraft.client.settings;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.widget.OptionSlider;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.math.MathHelper;

public class SliderPercentageOption extends AbstractOption
{
    protected final float stepSize;
    protected final double minValue;
    protected double maxValue;
    protected Function<GameSettings, Double> getter;
    protected BiConsumer<GameSettings, Double> setter;
    protected BiFunction<GameSettings, SliderPercentageOption, String> getDisplayStringFunc;

    public SliderPercentageOption(String p_i225_1_, double p_i225_2_, double p_i225_4_, float p_i225_6_, Function<GameSettings, Double> p_i225_7_, BiConsumer<GameSettings, Double> p_i225_8_, BiFunction<GameSettings, SliderPercentageOption, String> p_i225_9_)
    {
        super(p_i225_1_);
        this.minValue = p_i225_2_;
        this.maxValue = p_i225_4_;
        this.stepSize = p_i225_6_;
        this.getter = p_i225_7_;
        this.setter = p_i225_8_;
        this.getDisplayStringFunc = p_i225_9_;
    }

    public Widget createWidget(GameSettings options, int xIn, int yIn, int widthIn)
    {
        return new OptionSlider(options, xIn, yIn, widthIn, 20, this);
    }

    public double normalizeValue(double value)
    {
        return MathHelper.clamp((this.snapToStepClamp(value) - this.minValue) / (this.maxValue - this.minValue), 0.0D, 1.0D);
    }

    public double denormalizeValue(double value)
    {
        return this.snapToStepClamp(MathHelper.lerp(MathHelper.clamp(value, 0.0D, 1.0D), this.minValue, this.maxValue));
    }

    private double snapToStepClamp(double valueIn)
    {
        if (this.stepSize > 0.0F)
        {
            valueIn = (double)(this.stepSize * (float)Math.round(valueIn / (double)this.stepSize));
        }

        return MathHelper.clamp(valueIn, this.minValue, this.maxValue);
    }

    public double getMinValue()
    {
        return this.minValue;
    }

    public double getMaxValue()
    {
        return this.maxValue;
    }

    public void setMaxValue(float valueIn)
    {
        this.maxValue = (double)valueIn;
    }

    public void set(GameSettings options, double valueIn)
    {
        this.setter.accept(options, valueIn);
    }

    public double get(GameSettings options)
    {
        return this.getter.apply(options);
    }

    public String getText(GameSettings options)
    {
        return this.getDisplayStringFunc.apply(options, this);
    }
}

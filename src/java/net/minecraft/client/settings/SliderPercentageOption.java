package net.minecraft.client.settings;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import net.minecraft.client.gui.widget.OptionSlider;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;

public class SliderPercentageOption extends AbstractOption {
   public final float stepSize;
   public final double minValue;
   public double maxValue;
   public Function<GameSettings, Double> getter;
   public BiConsumer<GameSettings, Double> setter;
   public BiFunction<GameSettings, SliderPercentageOption, ITextComponent> getDisplayStringFunc;

   public SliderPercentageOption(String translationKey, double minValueIn, double maxValueIn, float stepSizeIn, Function<GameSettings, Double> getter, BiConsumer<GameSettings, Double> setter, BiFunction<GameSettings, SliderPercentageOption, ITextComponent> getDisplayString)
   {
      super(translationKey);
      this.minValue = minValueIn;
      this.maxValue = maxValueIn;
      this.stepSize = stepSizeIn;
      this.getter = getter;
      this.setter = setter;
      this.getDisplayStringFunc = getDisplayString;
   }

   @Override
   public Widget createWidget(GameSettings var1, int var2, int var3, int var4) {
      return new OptionSlider(var1, var2, var3, var4, 20, this);
   }

   public double normalizeValue(double var1) {
      return MathHelper.clamp((this.snapToStepClamp(var1) - this.minValue) / (this.maxValue - this.minValue), 0.0, 1.0);
   }

   public double denormalizeValue(double var1) {
      return this.snapToStepClamp(MathHelper.lerp(MathHelper.clamp(var1, 0.0, 1.0), this.minValue, this.maxValue));
   }

   private double snapToStepClamp(double var1) {
      if (this.stepSize > 0.0F) {
         var1 = (double)(this.stepSize * (float)Math.round(var1 / (double)this.stepSize));
      }

      return MathHelper.clamp(var1, this.minValue, this.maxValue);
   }

   public double getMinValue() {
      return this.minValue;
   }

   public double getMaxValue() {
      return this.maxValue;
   }

   public void setMaxValue(float var1) {
      this.maxValue = (double)var1;
   }

   public void set(GameSettings var1, double var2) {
      this.setter.accept(var1, var2);
   }

   public double get(GameSettings var1) {
      return this.getter.apply(var1);
   }

   public ITextComponent apply(GameSettings var1) {
      return this.getDisplayStringFunc.apply(var1, this);
   }
}

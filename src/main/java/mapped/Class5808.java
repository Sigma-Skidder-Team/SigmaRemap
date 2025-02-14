package mapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import net.minecraft.client.GameSettings;
import net.minecraft.client.settings.SliderPercentageOption;
import net.minecraft.util.text.ITextComponent;

public class Class5808 extends SliderPercentageOption {
   public Class5808(
      String var1,
      double var2,
      double var4,
      float var6,
      Function<GameSettings, Double> var7,
      BiConsumer<GameSettings, Double> var8,
      BiFunction<GameSettings, SliderPercentageOption, ITextComponent> var9
   ) {
      super(var1, var2, var4, var6, var7, var8, var9);
   }

   @Override
   public double normalizeValue(double var1) {
      return Math.log(var1 / this.minValue) / Math.log(this.maxValue / this.minValue);
   }

   @Override
   public double denormalizeValue(double var1) {
      return this.minValue * Math.pow(Math.E, Math.log(this.maxValue / this.minValue) * var1);
   }
}

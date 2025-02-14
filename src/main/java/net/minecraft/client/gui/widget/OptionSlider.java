package net.minecraft.client.gui.widget;

import mapped.Class1233;
import mapped.Class1234;
import mapped.Class9125;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.GameSettings;
import net.minecraft.client.settings.SliderPercentageOption;

import java.util.List;
import java.util.Optional;

public class OptionSlider extends Class1234 implements Class1233 {
   private static String[] field6580;
   private final SliderPercentageOption field6581;

   public OptionSlider(GameSettings var1, int var2, int var3, int var4, int var5, SliderPercentageOption var6) {
      super(var1, var2, var3, var4, var5, (double)((float)var6.normalizeValue(var6.get(var1))));
      this.field6581 = var6;
      this.method5813();
   }

   @Override
   public void method5812() {
      this.field6581.set(this.field6582, this.field6581.denormalizeValue(this.field6584));
      this.field6582.saveOptions();
   }

   @Override
   public void method5813() {
      this.setMessage(this.field6581.apply(this.field6582));
   }

   @Override
   public Optional<List<Class9125>> method5810() {
      return this.field6581.method17951();
   }

   public static int method5814(Widget var0) {
      return var0.width;
   }

   public static int method5815(Widget var0) {
      return var0.height;
   }

   public AbstractOption method5811() {
      return this.field6581;
   }
}

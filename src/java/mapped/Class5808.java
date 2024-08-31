package mapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import net.minecraft.client.GameSettings;
import net.minecraft.util.text.ITextComponent;

public class Class5808 extends Class5807 {
   public Class5808(
      String var1,
      double var2,
      double var4,
      float var6,
      Function<GameSettings, Double> var7,
      BiConsumer<GameSettings, Double> var8,
      BiFunction<GameSettings, Class5807, ITextComponent> var9
   ) {
      super(var1, var2, var4, var6, var7, var8, var9);
   }

   @Override
   public double method18083(double var1) {
      return Math.log(var1 / this.field25450) / Math.log(this.field25451 / this.field25450);
   }

   @Override
   public double method18084(double var1) {
      return this.field25450 * Math.pow(Math.E, Math.log(this.field25451 / this.field25450) * var1);
   }
}

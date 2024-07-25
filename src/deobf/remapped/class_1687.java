package remapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;

public class class_1687 extends class_8369 {
   public class_1687(
      String var1,
      double var2,
      double var4,
      float var6,
      Function<class_8881, Double> var7,
      BiConsumer<class_8881, Double> var8,
      BiFunction<class_8881, class_8369, ITextComponent> var9
   ) {
      super(var1, var2, var4, var6, var7, var8, var9);
   }

   @Override
   public double method_38566(double var1) {
      return Math.log(var1 / this.field_42850) / Math.log(this.field_42849 / this.field_42850);
   }

   @Override
   public double method_38571(double var1) {
      return this.field_42850 * Math.pow(Math.E, Math.log(this.field_42849 / this.field_42850) * var1);
   }
}

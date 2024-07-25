package remapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;

public class class_8369 extends class_1013 {
   public final float field_42847;
   public final double field_42850;
   public double field_42849;
   public Function<class_8881, Double> field_42846;
   public BiConsumer<class_8881, Double> field_42848;
   public BiFunction<class_8881, class_8369, ITextComponent> field_42851;

   public class_8369(
      String var1,
      double var2,
      double var4,
      float var6,
      Function<class_8881, Double> var7,
      BiConsumer<class_8881, Double> var8,
      BiFunction<class_8881, class_8369, ITextComponent> var9
   ) {
      super(var1);
      this.field_42850 = var2;
      this.field_42849 = var4;
      this.field_42847 = var6;
      this.field_42846 = var7;
      this.field_42848 = var8;
      this.field_42851 = var9;
   }

   @Override
   public class_7114 method_4482(class_8881 var1, int var2, int var3, int var4) {
      return new class_2180(var1, var2, var3, var4, 20, this);
   }

   public double method_38566(double var1) {
      return class_9299.method_42827((this.method_38568(var1) - this.field_42850) / (this.field_42849 - this.field_42850), 0.0, 1.0);
   }

   public double method_38571(double var1) {
      return this.method_38568(class_9299.method_42794(class_9299.method_42827(var1, 0.0, 1.0), this.field_42850, this.field_42849));
   }

   private double method_38568(double var1) {
      if (this.field_42847 > 0.0F) {
         var1 = (double)(this.field_42847 * (float)Math.round(var1 / (double)this.field_42847));
      }

      return class_9299.method_42827(var1, this.field_42850, this.field_42849);
   }

   public double method_38569() {
      return this.field_42850;
   }

   public double method_38573() {
      return this.field_42849;
   }

   public void method_38574(float var1) {
      this.field_42849 = (double)var1;
   }

   public void method_38567(class_8881 var1, double var2) {
      this.field_42848.accept(var1, var2);
   }

   public double method_38570(class_8881 var1) {
      return this.field_42846.apply(var1);
   }

   public ITextComponent method_38572(class_8881 var1) {
      return this.field_42851.apply(var1, this);
   }
}

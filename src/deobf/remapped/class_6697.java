package remapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public final class class_6697 extends class_4190 {
   private static String[] field_34593;

   public class_6697(class_5791 var1) {
      super(var1);
   }

   @Override
   public DoubleList method_19486(class_9249 var1) {
      return new class_4347(this.field_20395.method_26199(var1));
   }

   @Override
   public int method_19487(class_9249 var1, double var2) {
      int var6 = this.field_20395.method_26199(var1);
      return class_9299.method_42829(class_9299.method_42847(var2 * (double)var6), -1, var6);
   }
}

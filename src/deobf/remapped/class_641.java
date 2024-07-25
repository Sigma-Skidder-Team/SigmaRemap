package remapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class class_641 extends class_4190 {
   private static String[] field_3598;
   private final class_4190 field_3597;
   private final class_9249 field_3599;
   private static final DoubleList field_3596 = new class_4347(1);

   public class_641(class_4190 var1, class_9249 var2, int var3) {
      super(method_2942(var1.field_20395, var2, var3));
      this.field_3597 = var1;
      this.field_3599 = var2;
   }

   private static class_5791 method_2942(class_5791 var0, class_9249 var1, int var2) {
      return new class_4079(
         var0,
         var1.method_42631(var2, 0, 0),
         var1.method_42631(0, var2, 0),
         var1.method_42631(0, 0, var2),
         var1.method_42631(var2 + 1, var0.field_29269, var0.field_29269),
         var1.method_42631(var0.field_29266, var2 + 1, var0.field_29266),
         var1.method_42631(var0.field_29267, var0.field_29267, var2 + 1)
      );
   }

   @Override
   public DoubleList method_19486(class_9249 var1) {
      return var1 != this.field_3599 ? this.field_3597.method_19486(var1) : field_3596;
   }
}

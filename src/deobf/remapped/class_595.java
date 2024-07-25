package remapped;

import java.util.function.IntUnaryOperator;

public class class_595 implements IntUnaryOperator {
   private static String[] field_3436;
   private final Integer field_3434;
   private final Integer field_3435;
   private final IntUnaryOperator field_3437;

   private class_595(Integer var1, Integer var2) {
      this.field_3434 = var1;
      this.field_3435 = var2;
      if (var1 != null) {
         int var5 = var1;
         if (var2 != null) {
            int var6 = var2;
            this.field_3437 = var2x -> MathHelper.clamp(var2x, var5, var6);
         } else {
            this.field_3437 = var1x -> Math.max(var5, var1x);
         }
      } else if (var2 != null) {
         int var7 = var2;
         this.field_3437 = var1x -> Math.min(var7, var1x);
      } else {
         this.field_3437 = var0 -> var0;
      }
   }

   public static class_595 method_2795(int var0, int var1) {
      return new class_595(var0, var1);
   }

   public static class_595 method_2798(int var0) {
      return new class_595(var0, (Integer)null);
   }

   public static class_595 method_2793(int var0) {
      return new class_595((Integer)null, var0);
   }

   @Override
   public int applyAsInt(int var1) {
      return this.field_3437.applyAsInt(var1);
   }
}

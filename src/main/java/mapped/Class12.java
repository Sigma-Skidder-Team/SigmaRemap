package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.function.IntUnaryOperator;

public class Class12 implements IntUnaryOperator {
   private static String[] field20;
   private final Integer field21;
   private final Integer field22;
   private final IntUnaryOperator field23;

   public Class12(Integer var1, Integer var2) {
      this.field21 = var1;
      this.field22 = var2;
      if (var1 != null) {
         int var5 = var1;
         if (var2 != null) {
            int var6 = var2;
            this.field23 = var2x -> MathHelper.clamp(var2x, var5, var6);
         } else {
            this.field23 = var1x -> Math.max(var5, var1x);
         }
      } else if (var2 != null) {
         int var7 = var2;
         this.field23 = var1x -> Math.min(var7, var1x);
      } else {
         this.field23 = var0 -> var0;
      }
   }

   public static Class12 method58(int var0, int var1) {
      return new Class12(var0, var1);
   }

   public static Class12 method59(int var0) {
      return new Class12(var0, (Integer)null);
   }

   public static Class12 method60(int var0) {
      return new Class12((Integer)null, var0);
   }

   @Override
   public int applyAsInt(int var1) {
      return this.field23.applyAsInt(var1);
   }

   // $VF: synthetic method
   public static Integer method65(Class12 var0) {
      return var0.field22;
   }

   // $VF: synthetic method
   public static Integer method66(Class12 var0) {
      return var0.field21;
   }
}

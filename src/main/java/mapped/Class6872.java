package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class6872 implements Class6870 {
   private static String[] field29802;
   private final float field29803;
   private final float field29804;

   public Class6872(float var1, float var2) {
      this.field29803 = var1;
      this.field29804 = var2;
   }

   public Class6872(float var1) {
      this.field29803 = var1;
      this.field29804 = var1;
   }

   public static Class6872 method20921(float var0, float var1) {
      return new Class6872(var0, var1);
   }

   public float method20922() {
      return this.field29803;
   }

   public float method20923() {
      return this.field29804;
   }

   @Override
   public int method20914(Random var1) {
      return MathHelper.method37782(var1, MathHelper.floor(this.field29803), MathHelper.floor(this.field29804));
   }

   public float method20924(Random var1) {
      return MathHelper.method37783(var1, this.field29803, this.field29804);
   }

   public boolean method20925(int var1) {
      return (float)var1 <= this.field29804 && (float)var1 >= this.field29803;
   }

   @Override
   public ResourceLocation method20916() {
      return field29798;
   }

   // $VF: synthetic method
   public static float method20926(Class6872 var0) {
      return var0.field29803;
   }

   // $VF: synthetic method
   public static float method20927(Class6872 var0) {
      return var0.field29804;
   }
}

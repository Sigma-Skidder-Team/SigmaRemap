package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.Random;

public final class Class6869 implements Class6870 {
   private static String[] field29794;
   private final int field29795;
   private final float field29796;

   public Class6869(int var1, float var2) {
      this.field29795 = var1;
      this.field29796 = var2;
   }

   @Override
   public int method20914(Random var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < this.field29795; var5++) {
         if (var1.nextFloat() < this.field29796) {
            var4++;
         }
      }

      return var4;
   }

   public static Class6869 method20915(int var0, float var1) {
      return new Class6869(var0, var1);
   }

   @Override
   public ResourceLocation method20916() {
      return field29799;
   }

   // $VF: synthetic method
   public static int method20917(Class6869 var0) {
      return var0.field29795;
   }

   // $VF: synthetic method
   public static float method20918(Class6869 var0) {
      return var0.field29796;
   }
}

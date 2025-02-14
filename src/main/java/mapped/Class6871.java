package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.Random;

public final class Class6871 implements Class6870 {
   private static String[] field29800;
   private final int field29801;

   public Class6871(int var1) {
      this.field29801 = var1;
   }

   @Override
   public int method20914(Random var1) {
      return this.field29801;
   }

   @Override
   public ResourceLocation method20916() {
      return field29797;
   }

   public static Class6871 method20919(int var0) {
      return new Class6871(var0);
   }

   // $VF: synthetic method
   public static int method20920(Class6871 var0) {
      return var0.field29801;
   }
}

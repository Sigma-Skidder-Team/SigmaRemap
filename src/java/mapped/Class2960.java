package mapped;

import com.mojang.serialization.Codec;

import java.util.Random;

public class Class2960 extends Structure<Class4712> {
   public Class2960(Codec<Class4712> var1) {
      super(var1);
   }

   @Override
   public boolean method11357() {
      return false;
   }

   public boolean method11361(Class5646 var1, Class1685 var2, long var3, Class2420 var5, int var6, int var7, Biome var8, Class7481 var9, Class4712 var10) {
      return method11360(var6, var7, var1) >= 60;
   }

   @Override
   public Class7072<Class4712> method11359() {
      return Class5452::new;
   }

   private static int method11360(int var0, int var1, Class5646 var2) {
      Random var5 = new Random((long)(var0 + var1 * 10387313));
      Class80 var6 = Class80.method254(var5);
      byte var7 = 5;
      byte var8 = 5;
      if (var6 != Class80.field186) {
         if (var6 != Class80.field187) {
            if (var6 == Class80.field188) {
               var8 = -5;
            }
         } else {
            var7 = -5;
            var8 = -5;
         }
      } else {
         var7 = -5;
      }

      int var9 = (var0 << 4) + 7;
      int var10 = (var1 << 4) + 7;
      int var11 = var2.method17829(var9, var10, Class101.field295);
      int var12 = var2.method17829(var9, var10 + var8, Class101.field295);
      int var13 = var2.method17829(var9 + var7, var10, Class101.field295);
      int var14 = var2.method17829(var9 + var7, var10 + var8, Class101.field295);
      return Math.min(Math.min(var11, var12), Math.min(var13, var14));
   }

   // $VF: synthetic method
   public static int method11362(int var0, int var1, Class5646 var2) {
      return method11360(var0, var1, var2);
   }
}

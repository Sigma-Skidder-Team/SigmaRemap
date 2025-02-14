package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.MutableBoundingBox;

import java.util.List;
import java.util.Random;

public class Class6883 {
   private static String[] field29831;

   private static Class4188 method20957(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6, Class102 var7) {
      int var10 = var1.nextInt(100);
      if (var10 < 80) {
         if (var10 < 70) {
            MutableBoundingBox var11 = Class4191.method12972(var0, var1, var2, var3, var4, var5);
            if (var11 != null) {
               return new Class4191(var6, var1, var11, var5, var7);
            }
         } else {
            MutableBoundingBox var12 = Class4192.method12975(var0, var1, var2, var3, var4, var5);
            if (var12 != null) {
               return new Class4192(var6, var12, var5, var7);
            }
         }
      } else {
         MutableBoundingBox var13 = Class4190.method12970(var0, var1, var2, var3, var4, var5);
         if (var13 != null) {
            return new Class4190(var6, var13, var5, var7);
         }
      }

      return null;
   }

   private static Class4188 method20958(Class4178 var0, List<Class4178> var1, Random var2, int var3, int var4, int var5, Direction var6, int var7) {
      if (var7 <= 8) {
         if (Math.abs(var3 - var0.method12915().minX) <= 80 && Math.abs(var5 - var0.method12915().minZ) <= 80) {
            Class102 var10 = ((Class4188)var0).field20479;
            Class4188 var11 = method20957(var1, var2, var3, var4, var5, var6, var7 + 1, var10);
            if (var11 != null) {
               var1.add(var11);
               var11.method12894(var0, var1, var2);
            }

            return var11;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $VF: synthetic method
   public static Class4188 method20959(Class4178 var0, List var1, Random var2, int var3, int var4, int var5, Direction var6, int var7) {
      return method20958(var0, var1, var2, var3, var4, var5, var6, var7);
   }
}

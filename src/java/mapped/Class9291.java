package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class9291 {
   private static String[] field42732;

   public static boolean method35028(List<Class9238> var0) {
      if (var0.size() <= 0) {
         return false;
      } else {
         BlockPos var3 = ((Class9238)var0.get(0)).field42516;
         Class9238[] var4 = new Class9238[]{
            new Class9238(var3.method8341(), Direction.SOUTH),
            new Class9238(var3.method8347(), Direction.WEST),
            new Class9238(var3.method8343(), Direction.NORTH),
            new Class9238(var3.method8345(), Direction.EAST),
            new Class9238(var3.method8313(), Direction.field673),
            new Class9238(var3.method8311(), Direction.field672)
         };

         for (Class9238 var8 : var4) {
            if (Class9217.method34536(var8.field42516) != Blocks.AIR) {
               return true;
            }
         }

         return false;
      }
   }

   public static List<Class9238> method35029(List<Class9238> var0) {
      ArrayList var3 = new ArrayList();

      for (int var4 = var0.size() - 1; var4 >= 0; var4--) {
         var3.add(var0.get(var4));
      }

      return var3;
   }

   public static List<Class9238> method35030(Block var0, BlockPos var1, int var2) {
      ArrayList var5 = new ArrayList();
      if (var1 != null && var2 >= 0) {
         if (!Class9217.method34538(var0, var1)) {
            return var5;
         } else {
            Class9238[] var6 = new Class9238[]{
               new Class9238(var1.method8311(), Direction.field672),
               new Class9238(var1.method8341(), Direction.SOUTH),
               new Class9238(var1.method8347(), Direction.WEST),
               new Class9238(var1.method8343(), Direction.NORTH),
               new Class9238(var1.method8345(), Direction.EAST),
               new Class9238(var1.method8313(), Direction.field673)
            };

            for (Class9238 var10 : var6) {
               if (!Class9217.method34538(var0, var10.field42516)) {
                  var5.add(var10);
                  return var5;
               }
            }

            for (int var13 = 1; var13 < var2; var13++) {
               for (Class9238 var11 : var6) {
                  List var12 = method35030(var0, var11.field42516, var13);
                  if (method35028(method35029(var12))) {
                     var5.addAll(var12);
                     return (List<Class9238>)(var5.size() <= 1 ? var5 : method35029(var5));
                  }
               }
            }

            return var5;
         }
      } else {
         return var5;
      }
   }
}

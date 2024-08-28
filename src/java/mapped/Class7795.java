package mapped;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;

public class Class7795 {
   private static final IntSet field33484 = new IntOpenHashSet(70, 1.0F);

   public static void method25885(Class6355 var0) {
      var0.method19360(Class1914.field11360, new Class3994());
      var0.method19360(Class1914.field11365, new Class3947());
      var0.method19360(Class1914.field11366, new Class3905());
      var0.method19360(Class1914.field11367, new Class3808());
      var0.method19360(Class1914.field11372, new Class3842());
      var0.method19360(Class1914.field11384, new Class3799());
      var0.method19360(Class1914.field11385, new Class3844());
      var0.method19360(Class1914.field11381, new Class3882());
      var0.method19360(Class1914.field11388, new Class4032());
      var0.method19360(Class1914.field11390, new Class4047());
   }

   public static int method25886(int var0) {
      if (var0 < 0) {
         var0 = 0;
      }

      int var3 = Class6380.field27947.method18535().method22147(var0);
      if (var3 != -1) {
         return var3;
      } else {
         var3 = Class6380.field27947.method18535().method22147(var0 & -16);
         if (var3 == -1) {
            if (!Class8042.method27612().method21941() || Class8042.method27614().method34425()) {
               Class8042.method27613().method27366().warning("Missing block completely " + var0);
            }

            return 1;
         } else {
            if (!Class8042.method27612().method21941() || Class8042.method27614().method34425()) {
               Class8042.method27613().method27366().warning("Missing block " + var0);
            }

            return var3;
         }
      }
   }

   private static int method25887(Class7161 var0, Class9695 var1, int var2) {
      Class6039 var5 = var0.<Class6039>method22438(Class6039.class);
      if (!var5.method18688(var1)) {
         if (var5.method18687(var2)) {
            var5.method18685(var1, var2);
         }
      } else {
         Class9344 var6 = var5.method18689(var1);
         if (var6.method35361() != var2) {
            var5.method18690(var1);
            if (var5.method18687(var2)) {
               var5.method18685(var1, var2);
            }
         } else if (var6.method35363() != -1) {
            return var6.method35363();
         }
      }

      return var2;
   }

   // $VF: synthetic method
   public static int method25888(Class7161 var0, Class9695 var1, int var2) {
      return method25887(var0, var1, var2);
   }

   // $VF: synthetic method
   public static IntSet method25889() {
      return field33484;
   }

   static {
      for (int var4 = 0; var4 < 50; var4++) {
         field33484.add(var4);
      }

      field33484.add(127);

      for (int var7 = 129; var7 <= 134; var7++) {
         field33484.add(var7);
      }

      field33484.add(140);
      field33484.add(149);
      field33484.add(151);

      for (int var8 = 155; var8 <= 158; var8++) {
         field33484.add(var8);
      }

      for (int var9 = 160; var9 <= 167; var9++) {
         field33484.add(var9);
      }
   }
}

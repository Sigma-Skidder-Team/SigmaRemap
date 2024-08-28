package mapped;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.function.LongFunction;

public class Class9320 {
   private static String[] field43266;
   private static final Int2IntMap field43267 = Util.method38508(new Int2IntOpenHashMap(), var0 -> {
      method35217(var0, Class2308.field15806, 16);
      method35217(var0, Class2308.field15806, 26);
      method35217(var0, Class2308.field15809, 2);
      method35217(var0, Class2308.field15809, 17);
      method35217(var0, Class2308.field15809, 130);
      method35217(var0, Class2308.field15799, 131);
      method35217(var0, Class2308.field15799, 162);
      method35217(var0, Class2308.field15799, 20);
      method35217(var0, Class2308.field15799, 3);
      method35217(var0, Class2308.field15799, 34);
      method35217(var0, Class2308.field15807, 27);
      method35217(var0, Class2308.field15807, 28);
      method35217(var0, Class2308.field15807, 29);
      method35217(var0, Class2308.field15807, 157);
      method35217(var0, Class2308.field15807, 132);
      method35217(var0, Class2308.field15807, 4);
      method35217(var0, Class2308.field15807, 155);
      method35217(var0, Class2308.field15807, 156);
      method35217(var0, Class2308.field15807, 18);
      method35217(var0, Class2308.field15805, 140);
      method35217(var0, Class2308.field15805, 13);
      method35217(var0, Class2308.field15805, 12);
      method35217(var0, Class2308.field15800, 168);
      method35217(var0, Class2308.field15800, 169);
      method35217(var0, Class2308.field15800, 21);
      method35217(var0, Class2308.field15800, 23);
      method35217(var0, Class2308.field15800, 22);
      method35217(var0, Class2308.field15800, 149);
      method35217(var0, Class2308.field15800, 151);
      method35217(var0, Class2308.field15801, 37);
      method35217(var0, Class2308.field15801, 165);
      method35217(var0, Class2308.field15801, 167);
      method35217(var0, Class2308.field15801, 166);
      method35217(var0, Class2308.field15802, 39);
      method35217(var0, Class2308.field15802, 38);
      method35217(var0, Class2308.field15812, 14);
      method35217(var0, Class2308.field15812, 15);
      method35217(var0, Class2308.field15797, 25);
      method35217(var0, Class2308.field15808, 46);
      method35217(var0, Class2308.field15808, 49);
      method35217(var0, Class2308.field15808, 50);
      method35217(var0, Class2308.field15808, 48);
      method35217(var0, Class2308.field15808, 24);
      method35217(var0, Class2308.field15808, 47);
      method35217(var0, Class2308.field15808, 10);
      method35217(var0, Class2308.field15808, 45);
      method35217(var0, Class2308.field15808, 0);
      method35217(var0, Class2308.field15808, 44);
      method35217(var0, Class2308.field15803, 1);
      method35217(var0, Class2308.field15803, 129);
      method35217(var0, Class2308.field15810, 11);
      method35217(var0, Class2308.field15810, 7);
      method35217(var0, Class2308.field15804, 35);
      method35217(var0, Class2308.field15804, 36);
      method35217(var0, Class2308.field15804, 163);
      method35217(var0, Class2308.field15804, 164);
      method35217(var0, Class2308.field15811, 6);
      method35217(var0, Class2308.field15811, 134);
      method35217(var0, Class2308.field15798, 160);
      method35217(var0, Class2308.field15798, 161);
      method35217(var0, Class2308.field15798, 32);
      method35217(var0, Class2308.field15798, 33);
      method35217(var0, Class2308.field15798, 30);
      method35217(var0, Class2308.field15798, 31);
      method35217(var0, Class2308.field15798, 158);
      method35217(var0, Class2308.field15798, 5);
      method35217(var0, Class2308.field15798, 19);
      method35217(var0, Class2308.field15798, 133);
   });

   private static <T extends Class7899, C extends Class6660<T>> Class7962<T> method35213(
      long var0, Class1825 var2, Class7962<T> var3, int var4, LongFunction<C> var5
   ) {
      Class7962 var8 = var3;

      for (int var9 = 0; var9 < var4; var9++) {
         var8 = var2.method8079((Class6660)var5.apply(var0 + (long)var9), var8);
      }

      return var8;
   }

   private static <T extends Class7899, C extends Class6660<T>> Class7962<T> method35214(boolean var0, int var1, int var2, LongFunction<C> var3) {
      Class7962 var6 = Class1972.field12841.method8252((Class6660)var3.apply(1L));
      var6 = Class1823.field9823.method8079((Class6660)var3.apply(2000L), var6);
      var6 = Class1846.field9860.method8079((Class6660)var3.apply(1L), var6);
      var6 = Class1823.field9822.method8079((Class6660)var3.apply(2001L), var6);
      var6 = Class1846.field9860.method8079((Class6660)var3.apply(2L), var6);
      var6 = Class1846.field9860.method8079((Class6660)var3.apply(50L), var6);
      var6 = Class1846.field9860.method8079((Class6660)var3.apply(70L), var6);
      var6 = Class1839.field9846.method8079((Class6660)var3.apply(2L), var6);
      Class7962 var7 = Class1970.field12839.method8252((Class6660)var3.apply(2L));
      var7 = method35213(2001L, Class1823.field9822, var7, 6, var3);
      var6 = Class1850.field9866.method8079((Class6660)var3.apply(2L), var6);
      var6 = Class1846.field9860.method8079((Class6660)var3.apply(3L), var6);
      var6 = Class1838.field9844.method8079((Class6660)var3.apply(2L), var6);
      var6 = Class1837.field9842.method8079((Class6660)var3.apply(2L), var6);
      var6 = Class1830.field9827.method8079((Class6660)var3.apply(3L), var6);
      var6 = Class1823.field9822.method8079((Class6660)var3.apply(2002L), var6);
      var6 = Class1823.field9822.method8079((Class6660)var3.apply(2003L), var6);
      var6 = Class1846.field9860.method8079((Class6660)var3.apply(4L), var6);
      var6 = Class1847.field9862.method8079((Class6660)var3.apply(5L), var6);
      var6 = Class1842.field9854.method8079((Class6660)var3.apply(4L), var6);
      var6 = method35213(1000L, Class1823.field9822, var6, 0, var3);
      Class7962 var8 = method35213(1000L, Class1823.field9822, var6, 0, var3);
      var8 = Class1829.field9825.method8079((Class6660)var3.apply(100L), var8);
      Class7962 var9 = new Class1831(var0).method8079((Class6660)var3.apply(200L), var6);
      var9 = Class1851.field9868.method8079((Class6660)var3.apply(1001L), var9);
      var9 = method35213(1000L, Class1823.field9822, var9, 2, var3);
      var9 = Class1844.field9858.method8079((Class6660)var3.apply(1000L), var9);
      Class7962 var10 = method35213(1000L, Class1823.field9822, var8, 2, var3);
      var9 = Class1834.field9838.method8084((Class6660)var3.apply(1000L), var9, var10);
      var8 = method35213(1000L, Class1823.field9822, var8, 2, var3);
      var8 = method35213(1000L, Class1823.field9822, var8, var2, var3);
      var8 = Class1841.field9852.method8079((Class6660)var3.apply(1L), var8);
      var8 = Class1843.field9856.method8079((Class6660)var3.apply(1000L), var8);
      var9 = Class1849.field9864.method8079((Class6660)var3.apply(1001L), var9);

      for (int var11 = 0; var11 < var1; var11++) {
         var9 = Class1823.field9822.method8079((Class6660)var3.apply((long)(1000 + var11)), var9);
         if (var11 == 0) {
            var9 = Class1846.field9860.method8079((Class6660)var3.apply(3L), var9);
         }

         if (var11 == 1 || var1 == 1) {
            var9 = Class1840.field9848.method8079((Class6660)var3.apply(1000L), var9);
         }
      }

      var9 = Class1843.field9856.method8079((Class6660)var3.apply(1000L), var9);
      var9 = Class1852.field9870.method8084((Class6660)var3.apply(100L), var9, var8);
      return Class1832.field9836.<T>method8084((Class6660<T>)var3.apply(100L), var9, var7);
   }

   public static Class7345 method35215(long var0, boolean var2, int var3, int var4) {
      byte var7 = 25;
      Class7962 var8 = method35214(var2, var3, var4, var2x -> new Class6659(25, var0, var2x));
      return new Class7345(var8);
   }

   public static boolean method35216(int var0, int var1) {
      return var0 != var1 ? field43267.get(var0) == field43267.get(var1) : true;
   }

   private static void method35217(Int2IntOpenHashMap var0, Class2308 var1, int var2) {
      var0.put(var2, var1.ordinal());
   }

   public static boolean method35218(int var0) {
      return var0 == 44 || var0 == 45 || var0 == 0 || var0 == 46 || var0 == 10 || var0 == 47 || var0 == 48 || var0 == 24 || var0 == 49 || var0 == 50;
   }

   public static boolean method35219(int var0) {
      return var0 == 44 || var0 == 45 || var0 == 0 || var0 == 46 || var0 == 10;
   }
}

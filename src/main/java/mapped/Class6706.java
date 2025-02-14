package mapped;

import it.unimi.dsi.fastutil.objects.Object2LongMap;
import it.unimi.dsi.fastutil.objects.Object2LongMaps;
import it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap;

public class Class6706 implements Class6705 {
   private static String[] field29342;
   private long field29343;
   private long field29344;
   private Object2LongOpenHashMap<String> field29345 = new Object2LongOpenHashMap();

   public Class6706() {
   }

   @Override
   public long method20440() {
      return this.field29343;
   }

   @Override
   public long method20441() {
      return this.field29344;
   }

   @Override
   public Object2LongMap<String> method20442() {
      return Object2LongMaps.unmodifiable(this.field29345);
   }

   // $VF: synthetic method
   public static long method20443(Class6706 var0, long var1) {
      return var0.field29343 = var1;
   }

   // $VF: synthetic method
   public static long method20444(Class6706 var0) {
      return var0.field29343;
   }

   // $VF: synthetic method
   public static long method20445(Class6706 var0, long var1) {
      return var0.field29344 = var1;
   }

   // $VF: synthetic method
   public static Object2LongOpenHashMap method20446(Class6706 var0) {
      return var0.field29345;
   }
}

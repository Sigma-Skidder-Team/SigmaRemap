package remapped;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class class_6851 {
   private static String[] field_35328;
   private static final Map<String, Object> field_35329 = Collections.<String, Object>synchronizedMap(new HashMap<String, Object>());

   public static boolean method_31439(String var0) {
      return field_35329.containsKey(var0);
   }

   public static Object method_31435(String var0) {
      return field_35329.get(var0);
   }

   public static void method_31430(String var0, Object var1) {
      field_35329.put(var0, var1);
   }

   public static int method_31432(String var0, int var1) {
      Object var4 = field_35329.get(var0);
      if (var4 instanceof Integer) {
         Integer var5 = (Integer)var4;
         return var5;
      } else {
         return var1;
      }
   }

   public static int method_31431(String var0, int var1) {
      int var4 = method_31432(var0, 0);
      Integer var5 = var1;
      field_35329.put(var0, var5);
      return var4;
   }

   public static long method_31438(String var0, long var1) {
      Object var5 = field_35329.get(var0);
      if (var5 instanceof Long) {
         Long var6 = (Long)var5;
         return var6;
      } else {
         return var1;
      }
   }

   public static void method_31433(String var0, long var1) {
      Long var5 = var1;
      field_35329.put(var0, var5);
   }

   public static long method_31434(String var0, long var1, long var3) {
      long var7 = method_31438(var0, var3);
      Long var9 = var1;
      field_35329.put(var0, var9);
      return var7;
   }

   public static long method_31436(String var0, long var1, long var3) {
      long var7 = method_31438(var0, var3);
      var7 += var1;
      method_31433(var0, var7);
      return var7;
   }
}

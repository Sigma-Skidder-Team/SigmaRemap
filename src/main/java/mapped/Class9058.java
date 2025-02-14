package mapped;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Class9058 {
   private static String[] field41465;
   private static final Map<String, Object> field41466 = Collections.<String, Object>synchronizedMap(new HashMap<String, Object>());

   public static boolean method33710(String var0) {
      return field41466.containsKey(var0);
   }

   public static Object method33711(String var0) {
      return field41466.get(var0);
   }

   public static void method33712(String var0, Object var1) {
      field41466.put(var0, var1);
   }

   public static int method33713(String var0, int var1) {
      Object var4 = field41466.get(var0);
      if (var4 instanceof Integer) {
         Integer var5 = (Integer)var4;
         return var5;
      } else {
         return var1;
      }
   }

   public static int method33714(String var0, int var1) {
      int var4 = method33713(var0, 0);
      Integer var5 = var1;
      field41466.put(var0, var5);
      return var4;
   }

   public static long method33715(String var0, long var1) {
      Object var5 = field41466.get(var0);
      if (var5 instanceof Long) {
         Long var6 = (Long)var5;
         return var6;
      } else {
         return var1;
      }
   }

   public static void method33716(String var0, long var1) {
      Long var5 = var1;
      field41466.put(var0, var5);
   }

   public static long method33717(String var0, long var1, long var3) {
      long var7 = method33715(var0, var3);
      Long var9 = var1;
      field41466.put(var0, var9);
      return var7;
   }

   public static long method33718(String var0, long var1, long var3) {
      long var7 = method33715(var0, var3);
      var7 += var1;
      method33716(var0, var7);
      return var7;
   }
}

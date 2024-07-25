package remapped;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class class_6987 {
   private static char[] field_35877 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_".toCharArray();
   private static int field_35876 = field_35877.length;
   private static int field_35873 = 0;
   private static String field_35875;
   private static Map<Character, Integer> field_35874 = new HashMap<Character, Integer>(field_35876);

   private class_6987() {
   }

   public static String method_31966(long var0) {
      StringBuilder var4 = new StringBuilder();
      long var5 = var0;

      do {
         var4.insert(0, field_35877[(int)(var5 % (long)field_35876)]);
         var5 /= (long)field_35876;
      } while (var5 > 0L);

      return var4.toString();
   }

   public static long method_31965(String var0) {
      long var3 = 0L;

      for (char var8 : var0.toCharArray()) {
         var3 = var3 * (long)field_35876 + (long)field_35874.get(var8).intValue();
      }

      return var3;
   }

   public static String method_31967() {
      String var2 = method_31966(new Date().getTime());
      if (var2.equals(field_35875)) {
         return var2 + "." + method_31966((long)(field_35873++));
      } else {
         field_35873 = 0;
         field_35875 = var2;
         return var2;
      }
   }

   static {
      for (int var4 = 0; var4 < field_35876; var4++) {
         field_35874.put(field_35877[var4], var4);
      }
   }
}

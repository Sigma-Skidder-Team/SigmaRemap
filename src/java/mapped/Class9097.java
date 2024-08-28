package mapped;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class Class9097 {
   private static char[] field41619 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_".toCharArray();
   private static int field41620 = field41619.length;
   private static int field41621 = 0;
   private static String field41622;
   private static Map<Character, Integer> field41623 = new HashMap<Character, Integer>(field41620);

   private Class9097() {
   }

   public static String method33924(long var0) {
      StringBuilder var4 = new StringBuilder();
      long var5 = var0;

      do {
         var4.insert(0, field41619[(int)(var5 % (long)field41620)]);
         var5 /= (long)field41620;
      } while (var5 > 0L);

      return var4.toString();
   }

   public static long method33925(String var0) {
      long var3 = 0L;

      for (char var8 : var0.toCharArray()) {
         var3 = var3 * (long)field41620 + (long)field41623.get(var8).intValue();
      }

      return var3;
   }

   public static String method33926() {
      String var2 = method33924(new Date().getTime());
      if (var2.equals(field41622)) {
         return var2 + "." + method33924((long)(field41621++));
      } else {
         field41621 = 0;
         field41622 = var2;
         return var2;
      }
   }

   static {
      for (int var4 = 0; var4 < field41620; var4++) {
         field41623.put(field41619[var4], var4);
      }
   }
}

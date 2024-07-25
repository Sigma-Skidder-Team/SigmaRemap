package remapped;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class class_9297 {
   private final String field_47431;
   private final int field_47433;
   private final LinkedHashMap<String, String> field_47432 = new LinkedHashMap<String, String>();

   public static class_9297 method_42781(String var0) {
      String[] var3 = var0.split("\\[");
      String var4 = var3[0];
      class_9297 var5 = new class_9297(var4, class_7943.method_35969(var0));
      if (var3.length > 1) {
         String var6 = var3[1];
         var6 = var6.replace("]", "");
         String[] var7 = var6.split(",");

         for (String var11 : var7) {
            String[] var12 = var11.split("=");
            var5.field_47432.put(var12[0], var12[1]);
         }
      }

      return var5;
   }

   public static class_9297 method_42776(int var0) {
      String var3 = class_7943.method_35973(var0);
      if (var3 == null) {
         class_3446.method_15886().method_34617().info("Unable to get blockdata from " + var0);
         return method_42781("minecraft:air");
      } else {
         return method_42781(var3);
      }
   }

   private class_9297(String var1, int var2) {
      this.field_47431 = var1;
      this.field_47433 = var2;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder(this.field_47431 + "[");

      for (Entry var5 : this.field_47432.entrySet()) {
         var3.append((String)var5.getKey()).append('=').append((String)var5.getValue()).append(',');
      }

      return var3.substring(0, var3.length() - 1) + "]";
   }

   public String method_42779() {
      return this.field_47431;
   }

   public int method_42777() {
      return this.field_47433;
   }

   public int method_42775() {
      return class_7943.method_35969(this.toString());
   }

   public class_9297 method_42782(String var1, Object var2) {
      if (this.method_42780(var1)) {
         this.field_47432.put(var1, var2.toString());
         return this;
      } else {
         throw new UnsupportedOperationException("No blockdata found for " + var1 + " at " + this.field_47431);
      }
   }

   public String method_42778(String var1) {
      return this.field_47432.get(var1);
   }

   public boolean method_42780(String var1) {
      return this.field_47432.containsKey(var1);
   }
}

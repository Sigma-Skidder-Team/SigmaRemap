package mapped;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Class9678 {
   private final String field45202;
   private final int field45203;
   private final LinkedHashMap<String, String> field45204 = new LinkedHashMap<String, String>();

   public static Class9678 method37755(String var0) {
      String[] var3 = var0.split("\\[");
      String var4 = var3[0];
      Class9678 var5 = new Class9678(var4, Class9322.method35234(var0));
      if (var3.length > 1) {
         String var6 = var3[1];
         var6 = var6.replace("]", "");
         String[] var7 = var6.split(",");

         for (String var11 : var7) {
            String[] var12 = var11.split("=");
            var5.field45204.put(var12[0], var12[1]);
         }
      }

      return var5;
   }

   public static Class9678 method37756(int var0) {
      String var3 = Class9322.method35235(var0);
      if (var3 == null) {
         ViaVersion3.method27613().method27366().info("Unable to get blockdata from " + var0);
         return method37755("minecraft:air");
      } else {
         return method37755(var3);
      }
   }

   private Class9678(String var1, int var2) {
      this.field45202 = var1;
      this.field45203 = var2;
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder(this.field45202 + "[");

      for (Entry var5 : this.field45204.entrySet()) {
         var3.append((String)var5.getKey()).append('=').append((String)var5.getValue()).append(',');
      }

      return var3.substring(0, var3.length() - 1) + "]";
   }

   public String method37757() {
      return this.field45202;
   }

   public int method37758() {
      return this.field45203;
   }

   public int method37759() {
      return Class9322.method35234(this.toString());
   }

   public Class9678 method37760(String var1, Object var2) {
      if (this.method37762(var1)) {
         this.field45204.put(var1, var2.toString());
         return this;
      } else {
         throw new UnsupportedOperationException("No blockdata found for " + var1 + " at " + this.field45202);
      }
   }

   public String method37761(String var1) {
      return this.field45204.get(var1);
   }

   public boolean method37762(String var1) {
      return this.field45204.containsKey(var1);
   }
}

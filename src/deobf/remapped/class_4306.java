package remapped;

import java.util.Map;

public class class_4306 implements class_3608 {
   private Map<String, String> field_20889 = null;

   public class_4306(Map<String, String> var1) {
      this.field_20889 = var1;
   }

   @Override
   public class_3999 method_16829(String var1) {
      String var4 = "defined_";
      if (var1.startsWith(var4)) {
         String var7 = var1.substring(var4.length());
         return !this.field_20889.containsKey(var7)
            ? new class_6457(class_2966.field_14558, (class_3999[])null)
            : new class_6457(class_2966.field_14561, (class_3999[])null);
      } else {
         while (this.field_20889.containsKey(var1)) {
            String var5 = this.field_20889.get(var1);
            if (var5 == null || var5.equals(var1)) {
               break;
            }

            var1 = var5;
         }

         int var6 = class_3111.method_14361(var1, Integer.MIN_VALUE);
         if (var6 != Integer.MIN_VALUE) {
            return new class_4570((float)var6);
         } else {
            class_3111.method_14317("Unknown macro value: " + var1);
            return new class_4570(0.0F);
         }
      }
   }
}

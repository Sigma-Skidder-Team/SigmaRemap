package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_6522 implements class_3608 {
   private static String[] field_33206;
   private Map<String, class_9812> field_33205 = new HashMap<String, class_9812>();

   public class_6522(class_6843[] var1) {
      for (int var4 = 0; var4 < var1.length; var4++) {
         class_6843 var5 = var1[var4];
         if (var5 instanceof class_6335) {
            class_6335 var6 = (class_6335)var5;
            class_9812 var7 = new class_9812(var6);
            this.field_33205.put(var5.method_31405(), var7);
         }
      }
   }

   @Override
   public class_3999 method_16829(String var1) {
      return this.field_33205.get(var1);
   }
}

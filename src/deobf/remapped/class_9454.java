package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_9454 {
   private static String[] field_48244;
   private static Map<Integer, class_6117> field_48243 = new HashMap<Integer, class_6117>();
   private static class_7225 field_48242 = new class_7225(1);

   public static float method_43723(int var0, float var1, float var2, float var3) {
      synchronized (field_48243) {
         Integer var7 = var0;
         class_6117 var8 = field_48243.get(var7);
         if (var8 == null) {
            var8 = new class_6117(var1, var2, var3);
            field_48243.put(var7, var8);
         }

         return var8.method_28097(var1, var2, var3);
      }
   }

   public static int method_43720() {
      synchronized (field_48242) {
         return field_48242.method_33083();
      }
   }

   public static void method_43722() {
      synchronized (field_48243) {
         field_48243.clear();
      }
   }
}

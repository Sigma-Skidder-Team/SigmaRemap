package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_1190 extends class_2733 {
   private static Map<String, Integer> field_6671 = null;

   public class_1190() {
      super(class_6629.field_34318, "ravager", 1.1F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_8575();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_8575) {
         class_8575 var5 = (class_8575)var1;
         Map var6 = method_5275();
         if (!var6.containsKey(var2)) {
            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40203, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return method_5275().keySet().<String>toArray(new String[0]);
   }

   private static Map<String, Integer> method_5275() {
      if (field_6671 == null) {
         field_6671 = new HashMap<String, Integer>();
         field_6671.put("head", 0);
         field_6671.put("jaw", 1);
         field_6671.put("body", 2);
         field_6671.put("leg1", 3);
         field_6671.put("leg2", 4);
         field_6671.put("leg3", 5);
         field_6671.put("leg4", 6);
         field_6671.put("neck", 7);
         return field_6671;
      } else {
         return field_6671;
      }
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_7600 var6 = new class_7600(var5);
      var6.field_32487 = (class_8575)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}

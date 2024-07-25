package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_3901 extends class_2733 {
   private static Map<String, Integer> field_18963 = null;

   public class_3901() {
      super(class_6629.field_34250, "fox", 0.4F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_6980();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_6980) {
         class_6980 var5 = (class_6980)var1;
         Map var6 = method_18050();
         if (!var6.containsKey(var2)) {
            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (class_1549)class_7860.method_35558(var5, class_7860.field_39883, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return method_18050().keySet().<String>toArray(new String[0]);
   }

   private static Map<String, Integer> method_18050() {
      if (field_18963 == null) {
         field_18963 = new HashMap<String, Integer>();
         field_18963.put("head", 0);
         field_18963.put("body", 4);
         field_18963.put("leg1", 5);
         field_18963.put("leg2", 6);
         field_18963.put("leg3", 7);
         field_18963.put("leg4", 8);
         field_18963.put("tail", 9);
         return field_18963;
      } else {
         return field_18963;
      }
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_326 var6 = new class_326(var5);
      var6.field_32487 = (class_6980<class_5542>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}

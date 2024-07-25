package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_2272 extends class_2733 {
   private static Map<String, Integer> field_11287 = null;

   public class_2272() {
      super(class_6629.field_34214, "ocelot", 0.4F);
   }

   public class_2272(class_6629 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_9873 method_12295() {
      return new class_9067(0.0F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_9067) {
         class_9067 var5 = (class_9067)var1;
         Map var6 = method_10477();
         if (!var6.containsKey(var2)) {
            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40247, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "tail", "tail2", "head", "body"};
   }

   private static Map<String, Integer> method_10477() {
      if (field_11287 == null) {
         field_11287 = new HashMap<String, Integer>();
         field_11287.put("back_left_leg", 0);
         field_11287.put("back_right_leg", 1);
         field_11287.put("front_left_leg", 2);
         field_11287.put("front_right_leg", 3);
         field_11287.put("tail", 4);
         field_11287.put("tail2", 5);
         field_11287.put("head", 6);
         field_11287.put("body", 7);
         return field_11287;
      } else {
         return field_11287;
      }
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_615 var6 = new class_615(var5);
      var6.field_32487 = (class_9067<class_7617>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}

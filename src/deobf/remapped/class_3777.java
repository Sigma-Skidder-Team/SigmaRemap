package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_3777 extends class_2733 {
   private static Map<String, Integer> field_18440 = null;

   public class_3777() {
      super(class_6629.field_34251, "rabbit", 0.3F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_4490();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_4490) {
         class_4490 var5 = (class_4490)var1;
         Map var6 = method_17495();
         if (!var6.containsKey(var2)) {
            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40170, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{
         "left_foot", "right_foot", "left_thigh", "right_thigh", "body", "left_arm", "right_arm", "head", "right_ear", "left_ear", "tail", "nose"
      };
   }

   private static Map<String, Integer> method_17495() {
      if (field_18440 == null) {
         field_18440 = new HashMap<String, Integer>();
         field_18440.put("left_foot", 0);
         field_18440.put("right_foot", 1);
         field_18440.put("left_thigh", 2);
         field_18440.put("right_thigh", 3);
         field_18440.put("body", 4);
         field_18440.put("left_arm", 5);
         field_18440.put("right_arm", 6);
         field_18440.put("head", 7);
         field_18440.put("right_ear", 8);
         field_18440.put("left_ear", 9);
         field_18440.put("tail", 10);
         field_18440.put("nose", 11);
         return field_18440;
      } else {
         return field_18440;
      }
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_1431 var6 = new class_1431(var5);
      var6.field_32487 = (class_4490<class_7272>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}

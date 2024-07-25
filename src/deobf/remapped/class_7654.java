package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_7654 extends class_2733 {
   private static Map<String, Integer> field_38891 = null;

   public class_7654() {
      super(class_6629.field_34246, "phantom", 0.75F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_5861();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_5861) {
         class_5861 var5 = (class_5861)var1;
         Map var6 = method_34650();
         if (!var6.containsKey(var2)) {
            if (var2.equals("head")) {
               int var9 = (Integer)var6.get("body");
               class_1549 var8 = (class_1549)class_7860.method_35558(var5, class_7860.field_40036, var9);
               if (var8 != null) {
                  return var8.method_7041(1);
               }
            }

            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40036, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return method_34650().keySet().<String>toArray(new String[0]);
   }

   private static Map<String, Integer> method_34650() {
      if (field_38891 == null) {
         field_38891 = new HashMap<String, Integer>();
         field_38891.put("body", 0);
         field_38891.put("left_wing", 1);
         field_38891.put("left_wing_tip", 2);
         field_38891.put("right_wing", 3);
         field_38891.put("right_wing_tip", 4);
         field_38891.put("tail", 5);
         field_38891.put("tail2", 6);
         return field_38891;
      } else {
         return field_38891;
      }
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_494 var6 = new class_494(var5);
      var6.field_32487 = (class_5861<class_9825>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}

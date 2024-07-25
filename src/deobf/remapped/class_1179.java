package remapped;

import java.util.HashMap;
import java.util.Map;

public class class_1179 extends class_2733 {
   private static Map<String, Integer> field_6644 = method_5220();
   private static Map<String, Integer> field_6641 = method_5219();
   private static Map<String, Integer> field_6643 = method_5218();

   public class_1179() {
      super(class_6629.field_34286, "horse", 0.75F);
   }

   public class_1179(class_6629 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_9873 method_12295() {
      return new class_3192(0.0F);
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_3192) {
         class_3192 var5 = (class_3192)var1;
         if (!field_6644.containsKey(var2)) {
            if (!field_6641.containsKey(var2)) {
               if (!field_6643.containsKey(var2)) {
                  return null;
               } else {
                  class_1549 var9 = this.method_12291(var5, "body");
                  int var10 = field_6643.get(var2);
                  return var9.method_7041(var10);
               }
            } else {
               class_1549 var8 = this.method_12291(var5, "neck");
               int var7 = field_6641.get(var2);
               return var8.method_7041(var7);
            }
         } else {
            int var6 = field_6644.get(var2);
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40223, var6);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{
         "body",
         "neck",
         "back_left_leg",
         "back_right_leg",
         "front_left_leg",
         "front_right_leg",
         "child_back_left_leg",
         "child_back_right_leg",
         "child_front_left_leg",
         "child_front_right_leg",
         "tail",
         "saddle",
         "head",
         "mane",
         "mouth",
         "left_ear",
         "right_ear",
         "left_bit",
         "right_bit",
         "left_rein",
         "right_rein",
         "headpiece",
         "noseband"
      };
   }

   private static Map<String, Integer> method_5220() {
      HashMap var2 = new HashMap();
      var2.put("body", 0);
      var2.put("neck", 1);
      var2.put("back_left_leg", 2);
      var2.put("back_right_leg", 3);
      var2.put("front_left_leg", 4);
      var2.put("front_right_leg", 5);
      var2.put("child_back_left_leg", 6);
      var2.put("child_back_right_leg", 7);
      var2.put("child_front_left_leg", 8);
      var2.put("child_front_right_leg", 9);
      return var2;
   }

   private static Map<String, Integer> method_5219() {
      HashMap var2 = new HashMap();
      var2.put("head", 0);
      var2.put("mane", 1);
      var2.put("mouth", 2);
      var2.put("left_ear", 3);
      var2.put("right_ear", 4);
      var2.put("left_bit", 5);
      var2.put("right_bit", 6);
      var2.put("left_rein", 7);
      var2.put("right_rein", 8);
      var2.put("headpiece", 9);
      var2.put("noseband", 10);
      return var2;
   }

   private static Map<String, Integer> method_5218() {
      HashMap var2 = new HashMap();
      var2.put("tail", 0);
      var2.put("saddle", 1);
      return var2;
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.method_8510().method_8587();
      class_2511 var6 = new class_2511(var5);
      var6.field_32487 = (class_3192<class_3551>)var1;
      var6.field_36492 = var2;
      return (class_8599)var6;
   }
}

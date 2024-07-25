package remapped;

import com.google.common.collect.ImmutableList;

public class class_775 extends class_2733 {
   public class_775() {
      super(class_6629.field_34330, "boat", 0.5F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_4803();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_4803) {
         class_4803 var5 = (class_4803)var1;
         ImmutableList var6 = var5.method_22133();
         if (var6 != null) {
            if (var2.equals("bottom")) {
               return class_4992.method_22955(var6, 0);
            }

            if (var2.equals("back")) {
               return class_4992.method_22955(var6, 1);
            }

            if (var2.equals("front")) {
               return class_4992.method_22955(var6, 2);
            }

            if (var2.equals("right")) {
               return class_4992.method_22955(var6, 3);
            }

            if (var2.equals("left")) {
               return class_4992.method_22955(var6, 4);
            }

            if (var2.equals("paddle_left")) {
               return class_4992.method_22955(var6, 5);
            }

            if (var2.equals("paddle_right")) {
               return class_4992.method_22955(var6, 6);
            }
         }

         return !var2.equals("bottom_no_water") ? null : var5.method_22130();
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"bottom", "back", "front", "right", "left", "paddle_left", "paddle_right", "bottom_no_water"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = MinecraftClient.getInstance().method_8587();
      class_1133 var6 = new class_1133(var5);
      if (class_7860.field_40221.method_7978()) {
         class_7860.method_35561(var6, class_7860.field_40221, var1);
         var6.field_36492 = var2;
         return (class_8599)var6;
      } else {
         class_3111.method_14317("Field not found: RenderBoat.modelBoat");
         return null;
      }
   }
}

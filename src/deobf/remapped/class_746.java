package remapped;

public class class_746 extends class_2733 {
   public class_746() {
      super(class_133.field_378, "shulker_box", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7916();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_7916) {
         class_7916 var5 = (class_7916)var1;
         if (!var2.equals("base")) {
            if (!var2.equals("lid")) {
               return !var2.equals("head") ? null : (class_1549)class_7860.field_40216.method_39231(var5, 2);
            } else {
               return (class_1549)class_7860.field_40216.method_39231(var5, 1);
            }
         } else {
            return (class_1549)class_7860.field_40216.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"base", "lid", "head"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_3569 var5 = class_3569.field_17468;
      Object var6 = var5.method_16594(class_133.field_378);
      if (var6 instanceof class_6963) {
         if (((class_2255)var6).method_10365() == null) {
            var6 = new class_6963((class_7916<?>)var1, var5);
         }

         if (class_7860.field_40249.method_7978()) {
            class_7860.method_35561(var6, class_7860.field_40249, var1);
            return (class_8599)var6;
         } else {
            class_3111.method_14317("Field not found: TileEntityShulkerBoxRenderer.model");
            return null;
         }
      } else {
         return null;
      }
   }
}

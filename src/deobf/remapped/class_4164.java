package remapped;

public class class_4164 extends class_2733 {
   public class_4164() {
      super(class_6629.field_34309, "evoker_fangs", 0.0F, new String[]{"evocation_fangs"});
   }

   @Override
   public class_9873 method_12295() {
      return new class_8883();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_8883) {
         class_8883 var5 = (class_8883)var1;
         if (!var2.equals("base")) {
            if (!var2.equals("upper_jaw")) {
               return !var2.equals("lower_jaw") ? null : (class_1549)class_7860.method_35558(var5, class_7860.field_40033, 2);
            } else {
               return (class_1549)class_7860.method_35558(var5, class_7860.field_40033, 1);
            }
         } else {
            return (class_1549)class_7860.method_35558(var5, class_7860.field_40033, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"base", "upper_jaw", "lower_jaw"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_1312 var6 = new class_1312(var5);
      if (class_7860.field_40059.method_7978()) {
         class_7860.method_35561(var6, class_7860.field_40059, var1);
         var6.field_36492 = var2;
         return (class_8599)var6;
      } else {
         class_3111.method_14317("Field not found: RenderEvokerFangs.model");
         return null;
      }
   }
}

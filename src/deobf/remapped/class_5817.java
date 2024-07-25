package remapped;

public class class_5817 extends class_2733 {
   public class_5817() {
      super(class_6629.field_34329, "wither_skull", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_1570();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_1570) {
         class_1570 var5 = (class_1570)var1;
         return !var2.equals("head") ? null : (class_1549)class_7860.field_39983.method_7980(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"head"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_9133 var6 = new class_9133(var5);
      if (class_7860.field_40119.method_7978()) {
         class_7860.method_35561(var6, class_7860.field_40119, var1);
         var6.field_36492 = var2;
         return (class_8599)var6;
      } else {
         class_3111.method_14317("Field not found: RenderWitherSkull_model");
         return null;
      }
   }
}

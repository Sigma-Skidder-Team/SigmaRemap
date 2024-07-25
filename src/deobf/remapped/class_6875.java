package remapped;

public class class_6875 extends class_2733 {
   public class_6875() {
      super(class_133.field_349, "sign", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_6679();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_6679) {
         class_6679 var5 = (class_6679)var1;
         if (!var2.equals("board")) {
            return !var2.equals("stick") ? null : (class_1549)class_7860.field_40242.method_39231(var5, 1);
         } else {
            return (class_1549)class_7860.field_40242.method_39231(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"board", "stick"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_3569 var5 = class_3569.field_17468;
      Object var6 = var5.method_16594(class_133.field_349);
      if (var6 instanceof class_3913) {
         if (((class_2255)var6).method_10365() == null) {
            var6 = new class_3913(var5);
         }

         if (class_7860.field_39871.method_7978()) {
            class_7860.method_35561(var6, class_7860.field_39871, var1);
            return (class_8599)var6;
         } else {
            class_3111.method_14317("Field not found: TileEntitySignRenderer.model");
            return null;
         }
      } else {
         return null;
      }
   }
}

package remapped;

public class class_716 extends class_694 {
   public class_716() {
      super(class_6629.field_34282, "tnt_minecart", 0.5F);
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      class_6122 var5 = class_1893.method_8510().method_8587();
      class_9382 var6 = new class_9382(var5);
      if (class_7860.field_40053.method_7978()) {
         class_7860.method_35561(var6, class_7860.field_40053, var1);
         var6.field_36492 = var2;
         return (class_8599)var6;
      } else {
         class_3111.method_14317("Field not found: RenderMinecart.modelMinecart");
         return null;
      }
   }
}

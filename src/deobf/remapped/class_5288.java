package remapped;

public class class_5288 extends class_2733 {
   public class_5288() {
      super(class_6629.field_34275, "lead_knot", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_2743();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_2743) {
         class_2743 var5 = (class_2743)var1;
         return !var2.equals("knot") ? null : (class_1549)class_7860.field_39982.method_7980(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"knot"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_6073 var6 = new class_6073(var5);
      if (class_7860.field_39906.method_7978()) {
         class_7860.method_35561(var6, class_7860.field_39906, var1);
         var6.field_36492 = var2;
         return (class_8599)var6;
      } else {
         class_3111.method_14317("Field not found: RenderLeashKnot.leashKnotModel");
         return null;
      }
   }
}

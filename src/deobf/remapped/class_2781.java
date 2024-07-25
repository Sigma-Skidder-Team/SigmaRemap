package remapped;

public class class_2781 extends class_2733 {
   public class_2781() {
      super(EntityType.field_34271, "shulker_bullet", 0.0F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_7834();
   }

   @Override
   public class_1549 method_12291(class_9873 var1, String var2) {
      if (var1 instanceof class_7834) {
         class_7834 var5 = (class_7834)var1;
         return !var2.equals("bullet") ? null : (class_1549)class_7860.field_40210.method_7980(var5);
      } else {
         return null;
      }
   }

   @Override
   public String[] method_12292() {
      return new String[]{"bullet"};
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      class_6792 var6 = new class_6792(var5);
      if (class_7860.field_39903.method_7978()) {
         class_7860.method_35561(var6, class_7860.field_39903, var1);
         var6.field_36492 = var2;
         return (class_8599)var6;
      } else {
         Config.method_14317("Field not found: RenderShulkerBullet.model");
         return null;
      }
   }
}

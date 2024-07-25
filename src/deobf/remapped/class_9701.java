package remapped;

public class class_9701 extends class_7067<class_3348> {
   public static final Identifier field_49344 = new Identifier("textures/entity/trident.png");
   private final class_8825 field_49346 = new class_8825();

   public class_9701(EntityRenderDispatcher var1) {
      super(var1);
   }

   public void method_44829(class_3348 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36060(class_2426.field_12074.method_11074(MathHelper.lerp(var3, var1.prevRotationYaw, var1.rotationYaw) - 90.0F));
      var4.method_36060(class_2426.field_12076.method_11074(MathHelper.lerp(var3, var1.field_41762, var1.rotationPitch) + 90.0F));
      class_7907 var9 = ItemRenderer.method_40275(var5, this.field_49346.method_45498(this.method_44828(var1)), false, var1.method_15352());
      this.field_49346.method_45499(var4, var9, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_44828(class_3348 var1) {
      return field_49344;
   }
}

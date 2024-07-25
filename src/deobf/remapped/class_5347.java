package remapped;

public class class_5347 extends class_1793<class_4359, class_62<class_4359>> {
   private static final Identifier field_27276 = new Identifier("textures/entity/zombie/drowned.png");

   public class_5347(EntityRenderDispatcher var1) {
      super(var1, new class_62<class_4359>(0.0F, 0.0F, 64, 64), new class_62<class_4359>(0.5F, true), new class_62<class_4359>(1.0F, true));
      this.method_29100(new class_82<class_4359>(this));
   }

   @Override
   public Identifier method_7987(class_2811 var1) {
      return field_27276;
   }

   public void method_24373(class_4359 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4, var5);
      float var8 = var1.method_26602(var5);
      if (var8 > 0.0F) {
         var2.method_36060(class_2426.field_12080.method_11074(MathHelper.lerp(var8, var1.rotationPitch, -10.0F - var1.rotationPitch)));
      }
   }
}

package remapped;

public class class_9133 extends class_7067<class_1044> {
   private static final Identifier field_46723 = new Identifier("textures/entity/wither/wither_invulnerable.png");
   private static final Identifier field_46722 = new Identifier("textures/entity/wither/wither.png");
   private final class_1570 field_46721 = new class_1570();

   public class_9133(EntityRenderDispatcher var1) {
      super(var1);
   }

   public int method_42034(class_1044 var1, BlockPos var2) {
      return 15;
   }

   public void method_42036(class_1044 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36062(-1.0F, -1.0F, 1.0F);
      float var9 = MathHelper.rotLerp(var1.prevRotationYaw, var1.rotationYaw, var3);
      float var10 = MathHelper.lerp(var3, var1.field_41762, var1.rotationPitch);
      class_7907 var11 = var5.method_11645(this.field_46721.method_45498(this.method_42035(var1)));
      this.field_46721.method_7085(0.0F, var9, var10);
      this.field_46721.method_45499(var4, var11, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_42035(class_1044 var1) {
      return !var1.method_4620() ? field_46722 : field_46723;
   }
}

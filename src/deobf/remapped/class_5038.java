package remapped;

public class class_5038 extends class_7164<class_3252, class_7307<class_3252>> {
   private static final Identifier field_26063 = new Identifier("textures/entity/slime/magmacube.png");

   public class_5038(EntityRenderDispatcher var1) {
      super(var1, new class_7307<class_3252>(), 0.25F);
   }

   public int method_23209(class_3252 var1, BlockPos var2) {
      return 15;
   }

   public Identifier method_23210(class_3252 var1) {
      return field_26063;
   }

   public void method_23211(class_3252 var1, class_7966 var2, float var3) {
      int var6 = var1.method_1860();
      float var7 = MathHelper.lerp(var3, var1.field_1533, var1.field_1538) / ((float)var6 * 0.5F + 1.0F);
      float var8 = 1.0F / (var7 + 1.0F);
      var2.method_36062(var8 * (float)var6, 1.0F / var8 * (float)var6, var8 * (float)var6);
   }
}

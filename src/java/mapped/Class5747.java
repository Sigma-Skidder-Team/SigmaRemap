package mapped;

public class Class5747 extends Class5651<Class1098, Class2861<Class1098>> {
   private static String[] field25171;

   public Class5747(EntityRendererManager var1) {
      super(var1, new Class2861<Class1098>(0.0F), 0.4F);
      this.method17880(new Class263(this));
   }

   public ResourceLocation method17843(Class1098 var1) {
      return var1.method5249();
   }

   public void method17857(Class1098 var1, MatrixStack var2, float var3) {
      super.method17857(var1, var2, var3);
      var2.method35292(0.8F, 0.8F, 0.8F);
   }

   public void method17842(Class1098 var1, MatrixStack var2, float var3, float var4, float var5) {
      super.method17842(var1, var2, var3, var4, var5);
      float var8 = var1.method5264(var5);
      if (var8 > 0.0F) {
         var2.translate((double)(0.4F * var8), (double)(0.15F * var8), (double)(0.1F * var8));
         var2.method35293(Class7680.field32902.method25286(MathHelper.method37827(var8, 0.0F, 90.0F)));
         BlockPos var9 = var1.getPosition();

         for (PlayerEntity var11 : var1.world.<PlayerEntity>method7182(PlayerEntity.class, new Class6488(var9).method19663(2.0, 2.0, 2.0))) {
            if (var11.isSleeping()) {
               var2.translate((double)(0.15F * var8), 0.0, 0.0);
               break;
            }
         }
      }
   }
}

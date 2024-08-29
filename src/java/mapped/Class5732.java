package mapped;

public class Class5732<T extends AbstractMinecartEntity> extends Class5715<T> {
   private static final ResourceLocation field25143 = new ResourceLocation("textures/entity/minecart.png");
   public final Class2827<T> field25144 = new Class2818<T>();

   public Class5732(EntityRendererManager var1) {
      super(var1);
      this.field25098 = 0.7F;
   }

   public void method17853(T var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      super.method17853((T)var1, var2, var3, var4, var5, var6);
      var4.push();
      long var9 = (long)var1.method3205() * 493286711L;
      var9 = var9 * var9 * 4392167121L + var9 * 98761L;
      float var11 = (((float)(var9 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var12 = (((float)(var9 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var13 = (((float)(var9 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      var4.translate((double)var11, (double)var12, (double)var13);
      double var14 = MathHelper.method37822((double)var3, var1.lastTickPosX, var1.getPosX());
      double var16 = MathHelper.method37822((double)var3, var1.lastTickPosY, var1.getPosY());
      double var18 = MathHelper.method37822((double)var3, var1.lastTickPosZ, var1.getPosZ());
      double var20 = 0.3F;
      Vector3d var22 = var1.method3595(var14, var16, var18);
      float var23 = MathHelper.lerp(var3, var1.prevRotationPitch, var1.rotationPitch);
      if (var22 != null) {
         Vector3d var24 = var1.method3594(var14, var16, var18, 0.3F);
         Vector3d var25 = var1.method3594(var14, var16, var18, -0.3F);
         if (var24 == null) {
            var24 = var22;
         }

         if (var25 == null) {
            var25 = var22;
         }

         var4.translate(var22.field18048 - var14, (var24.field18049 + var25.field18049) / 2.0 - var16, var22.field18050 - var18);
         Vector3d var26 = var25.method11339(-var24.field18048, -var24.field18049, -var24.field18050);
         if (var26.method11348() != 0.0) {
            var26 = var26.method11333();
            var2 = (float)(Math.atan2(var26.field18050, var26.field18048) * 180.0 / Math.PI);
            var23 = (float)(Math.atan(var26.field18049) * 73.0);
         }
      }

      var4.translate(0.0, 0.375, 0.0);
      var4.method35293(Class7680.field32900.method25286(180.0F - var2));
      var4.method35293(Class7680.field32902.method25286(-var23));
      float var30 = (float)var1.method3599() - var3;
      float var31 = var1.method3597() - var3;
      if (var31 < 0.0F) {
         var31 = 0.0F;
      }

      if (var30 > 0.0F) {
         var4.method35293(Class7680.field32898.method25286(MathHelper.sin(var30) * var30 * var31 / 10.0F * (float)var1.method3601()));
      }

      int var33 = var1.method3605();
      BlockState var27 = var1.method3603();
      if (var27.getRenderType() != BlockRenderType.field9885) {
         var4.push();
         float var28 = 0.75F;
         var4.method35292(0.75F, 0.75F, 0.75F);
         var4.translate(-0.5, (double)((float)(var33 - 8) / 16.0F), 0.5);
         var4.method35293(Class7680.field32900.method25286(90.0F));
         this.method17915((T)var1, var3, var27, var4, var5, var6);
         var4.method35295();
      }

      var4.method35292(-1.0F, -1.0F, 1.0F);
      this.field25144.method10998((T)var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
      Class5422 var34 = var5.method25597(this.field25144.method11028(this.method17843((T)var1)));
      this.field25144.method11016(var4, var34, var6, Class213.field798, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method35295();
   }

   public ResourceLocation method17843(T var1) {
      return field25143;
   }

   public void method17915(T var1, float var2, BlockState var3, MatrixStack var4, Class7733 var5, int var6) {
      Minecraft.getInstance().getBlockRendererDispatcher().method814(var3, var4, var5, var6, Class213.field798);
   }
}

package mapped;

import net.minecraft.util.math.BlockPos;

public class Class5731 extends Class5715<ExperienceOrbEntity> {
   private static final ResourceLocation field25141 = new ResourceLocation("textures/entity/experience_orb.png");
   private static final RenderType field25142 = RenderType.method14315(field25141);

   public Class5731(EntityRendererManager var1) {
      super(var1);
      this.field25098 = 0.15F;
      this.field25099 = 0.75F;
   }

   public int method17858(ExperienceOrbEntity var1, BlockPos var2) {
      return MathHelper.method37775(super.method17858(var1, var2) + 7, 0, 15);
   }

   public void method17853(ExperienceOrbEntity var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      var4.push();
      int var9 = var1.method4178();
      float var10 = (float)(var9 % 4 * 16 + 0) / 64.0F;
      float var11 = (float)(var9 % 4 * 16 + 16) / 64.0F;
      float var12 = (float)(var9 / 4 * 16 + 0) / 64.0F;
      float var13 = (float)(var9 / 4 * 16 + 16) / 64.0F;
      float var14 = 1.0F;
      float var15 = 0.5F;
      float var16 = 0.25F;
      float var17 = 255.0F;
      float var18 = ((float)var1.field5555 + var3) / 2.0F;
      if (Class7944.method26911()) {
         var18 = Class9680.method37861(var18);
      }

      int var19 = (int)((MathHelper.sin(var18 + 0.0F) + 1.0F) * 0.5F * 255.0F);
      short var20 = 255;
      int var21 = (int)((MathHelper.sin(var18 + (float) (Math.PI * 4.0 / 3.0)) + 1.0F) * 0.1F * 255.0F);
      var4.translate(0.0, 0.1F, 0.0);
      var4.rotate(this.field25097.method32230());
      var4.rotate(Vector3f.YP.rotationDegrees(180.0F));
      float var22 = 0.3F;
      var4.method35292(0.3F, 0.3F, 0.3F);
      Class5422 var23 = var5.method25597(field25142);
      Class8892 var24 = var4.getLast();
      Matrix4f var25 = var24.getMatrix();
      Class8967 var26 = var24.method32362();
      int var27 = var19;
      int var28 = 255;
      int var29 = var21;
      if (Class7944.method26911()) {
         int var30 = Class9680.method37862(var18);
         if (var30 >= 0) {
            var27 = var30 >> 16 & 0xFF;
            var28 = var30 >> 8 & 0xFF;
            var29 = var30 >> 0 & 0xFF;
         }
      }

      method17914(var23, var25, var26, -0.5F, -0.25F, var27, var28, var29, var10, var13, var6);
      method17914(var23, var25, var26, 0.5F, -0.25F, var27, var28, var29, var11, var13, var6);
      method17914(var23, var25, var26, 0.5F, 0.75F, var27, var28, var29, var11, var12, var6);
      method17914(var23, var25, var26, -0.5F, 0.75F, var27, var28, var29, var10, var12, var6);
      var4.pop();
      super.method17853(var1, var2, var3, var4, var5, var6);
   }

   private static void method17914(
           Class5422 var0, Matrix4f var1, Class8967 var2, float var3, float var4, int var5, int var6, int var7, float var8, float var9, int var10
   ) {
      var0.pos(var1, var3, var4, 0.0F)
         .color(var5, var6, var7, 128)
         .tex(var8, var9)
         .method17035(Class213.field798)
         .method17034(var10)
         .method17041(var2, 0.0F, 1.0F, 0.0F)
         .endVertex();
   }

   public ResourceLocation method17843(ExperienceOrbEntity var1) {
      return field25141;
   }
}

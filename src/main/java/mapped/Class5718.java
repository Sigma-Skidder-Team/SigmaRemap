package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Vector3f;
import net.optifine.Config;
import net.optifine.shaders.Shaders;

import java.util.Random;

public class Class5718 extends EntityRenderer<EnderDragonEntity> {
   public static final ResourceLocation field25106 = new ResourceLocation("textures/entity/end_crystal/end_crystal_beam.png");
   private static final ResourceLocation field25107 = new ResourceLocation("textures/entity/enderdragon/dragon_exploding.png");
   private static final ResourceLocation field25108 = new ResourceLocation("textures/entity/enderdragon/dragon.png");
   private static final ResourceLocation field25109 = new ResourceLocation("textures/entity/enderdragon/dragon_eyes.png");
   private static final RenderType field25110 = RenderType.getEntityCutoutNoCull(field25108);
   private static final RenderType field25111 = RenderType.method14321(field25108);
   private static final RenderType field25112 = RenderType.method14325(field25109);
   private static final RenderType field25113 = RenderType.getEntitySmoothCutout(field25106);
   private static final float field25114 = (float)(Math.sqrt(3.0) / 2.0);
   private final Class2875 field25115 = new Class2875();

   public Class5718(EntityRendererManager var1) {
      super(var1);
      this.shadowSize = 0.5F;
   }

   public void render(EnderDragonEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn) {
      matrixStackIn.push();
      float var9 = (float) entityIn.method4317(7, partialTicks)[0];
      float var10 = (float)(entityIn.method4317(5, partialTicks)[1] - entityIn.method4317(10, partialTicks)[1]);
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(-var9));
      matrixStackIn.rotate(Vector3f.XP.rotationDegrees(var10 * 10.0F));
      matrixStackIn.translate(0.0, 0.0, 1.0);
      matrixStackIn.scale(-1.0F, -1.0F, 1.0F);
      matrixStackIn.translate(0.0, -1.501F, 0.0);
      boolean var11 = entityIn.hurtTime > 0;
      this.field25115.setLivingAnimations(entityIn, 0.0F, 0.0F, partialTicks);
      if (entityIn.field5635 <= 0) {
         IVertexBuilder var12 = bufferIn.getBuffer(field25110);
         this.field25115.render(matrixStackIn, var12, packedLightIn, OverlayTexture.method731(0.0F, var11), 1.0F, 1.0F, 1.0F, 1.0F);
      } else {
         float var22 = (float) entityIn.field5635 / 200.0F;
         IVertexBuilder var13 = bufferIn.getBuffer(RenderType.method14324(field25107, var22));
         this.field25115.render(matrixStackIn, var13, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
         IVertexBuilder var14 = bufferIn.getBuffer(field25111);
         this.field25115.render(matrixStackIn, var14, packedLightIn, OverlayTexture.method731(0.0F, var11), 1.0F, 1.0F, 1.0F, 1.0F);
      }

      IVertexBuilder var23 = bufferIn.getBuffer(field25112);
      if (Config.isShaders()) {
         Shaders.method33081();
      }

      Config.method26874().field1020 = true;
      this.field25115.render(matrixStackIn, var23, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      Config.method26874().field1020 = false;
      if (Config.isShaders()) {
         Shaders.method33082();
      }

      if (entityIn.field5635 > 0) {
         float var24 = ((float) entityIn.field5635 + partialTicks) / 200.0F;
         float var26 = Math.min(!(var24 > 0.8F) ? 0.0F : (var24 - 0.8F) / 0.2F, 1.0F);
         Random var15 = new Random(432L);
         IVertexBuilder var16 = bufferIn.getBuffer(RenderType.method14341());
         matrixStackIn.push();
         matrixStackIn.translate(0.0, -1.0, -2.0);

         for (int var17 = 0; (float)var17 < (var24 + var24 * var24) / 2.0F * 60.0F; var17++) {
            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(var15.nextFloat() * 360.0F));
            matrixStackIn.rotate(Vector3f.YP.rotationDegrees(var15.nextFloat() * 360.0F));
            matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(var15.nextFloat() * 360.0F));
            matrixStackIn.rotate(Vector3f.XP.rotationDegrees(var15.nextFloat() * 360.0F));
            matrixStackIn.rotate(Vector3f.YP.rotationDegrees(var15.nextFloat() * 360.0F));
            matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(var15.nextFloat() * 360.0F + var24 * 90.0F));
            float var18 = var15.nextFloat() * 20.0F + 5.0F + var26 * 10.0F;
            float var19 = var15.nextFloat() * 2.0F + 1.0F + var26 * 2.0F;
            Matrix4f var20 = matrixStackIn.getLast().getMatrix();
            int var21 = (int)(255.0F * (1.0F - var26));
            method17902(var16, var20, var21);
            method17903(var16, var20, var18, var19);
            method17904(var16, var20, var18, var19);
            method17902(var16, var20, var21);
            method17904(var16, var20, var18, var19);
            method17905(var16, var20, var18, var19);
            method17902(var16, var20, var21);
            method17905(var16, var20, var18, var19);
            method17903(var16, var20, var18, var19);
         }

         matrixStackIn.pop();
      }

      matrixStackIn.pop();
      if (entityIn.field5637 != null) {
         matrixStackIn.push();
         float var25 = (float)(entityIn.field5637.getPosX() - MathHelper.lerp((double) partialTicks, entityIn.prevPosX, entityIn.getPosX()));
         float var27 = (float)(entityIn.field5637.getPosY() - MathHelper.lerp((double) partialTicks, entityIn.prevPosY, entityIn.getPosY()));
         float var28 = (float)(entityIn.field5637.getPosZ() - MathHelper.lerp((double) partialTicks, entityIn.prevPosZ, entityIn.getPosZ()));
         method17906(var25, var27 + Class5723.method17909(entityIn.field5637, partialTicks), var28, partialTicks, entityIn.ticksExisted, matrixStackIn, bufferIn, packedLightIn);
         matrixStackIn.pop();
      }

      super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
   }

   private static void method17902(IVertexBuilder var0, Matrix4f var1, int var2) {
      var0.pos(var1, 0.0F, 0.0F, 0.0F).color(255, 255, 255, var2).endVertex();
      var0.pos(var1, 0.0F, 0.0F, 0.0F).color(255, 255, 255, var2).endVertex();
   }

   private static void method17903(IVertexBuilder var0, Matrix4f var1, float var2, float var3) {
      var0.pos(var1, -field25114 * var3, var2, -0.5F * var3).color(255, 0, 255, 0).endVertex();
   }

   private static void method17904(IVertexBuilder var0, Matrix4f var1, float var2, float var3) {
      var0.pos(var1, field25114 * var3, var2, -0.5F * var3).color(255, 0, 255, 0).endVertex();
   }

   private static void method17905(IVertexBuilder var0, Matrix4f var1, float var2, float var3) {
      var0.pos(var1, 0.0F, var2, 1.0F * var3).color(255, 0, 255, 0).endVertex();
   }

   public static void method17906(float var0, float var1, float var2, float var3, int var4, MatrixStack var5, IRenderTypeBuffer var6, int var7) {
      float var10 = MathHelper.sqrt(var0 * var0 + var2 * var2);
      float var11 = MathHelper.sqrt(var0 * var0 + var1 * var1 + var2 * var2);
      var5.push();
      var5.translate(0.0, 2.0, 0.0);
      var5.rotate(Vector3f.YP.method25285((float)(-Math.atan2((double)var2, (double)var0)) - (float) (Math.PI / 2)));
      var5.rotate(Vector3f.XP.method25285((float)(-Math.atan2((double)var10, (double)var1)) - (float) (Math.PI / 2)));
      IVertexBuilder var12 = var6.getBuffer(field25113);
      float var13 = 0.0F - ((float)var4 + var3) * 0.01F;
      float var14 = MathHelper.sqrt(var0 * var0 + var1 * var1 + var2 * var2) / 32.0F - ((float)var4 + var3) * 0.01F;
      byte var15 = 8;
      float var16 = 0.0F;
      float var17 = 0.75F;
      float var18 = 0.0F;
      Class8892 var19 = var5.getLast();
      Matrix4f var20 = var19.getMatrix();
      Matrix3f var21 = var19.method32362();

      for (int var22 = 1; var22 <= 8; var22++) {
         float var23 = MathHelper.sin((float)var22 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var24 = MathHelper.cos((float)var22 * (float) (Math.PI * 2) / 8.0F) * 0.75F;
         float var25 = (float)var22 / 8.0F;
         var12.pos(var20, var16 * 0.2F, var17 * 0.2F, 0.0F)
            .color(0, 0, 0, 255)
            .tex(var18, var13)
            .method17035(OverlayTexture.NO_OVERLAY)
            .method17034(var7)
            .method17041(var21, 0.0F, -1.0F, 0.0F)
            .endVertex();
         var12.pos(var20, var16, var17, var11)
            .color(255, 255, 255, 255)
            .tex(var18, var14)
            .method17035(OverlayTexture.NO_OVERLAY)
            .method17034(var7)
            .method17041(var21, 0.0F, -1.0F, 0.0F)
            .endVertex();
         var12.pos(var20, var23, var24, var11)
            .color(255, 255, 255, 255)
            .tex(var25, var14)
            .method17035(OverlayTexture.NO_OVERLAY)
            .method17034(var7)
            .method17041(var21, 0.0F, -1.0F, 0.0F)
            .endVertex();
         var12.pos(var20, var23 * 0.2F, var24 * 0.2F, 0.0F)
            .color(0, 0, 0, 255)
            .tex(var25, var13)
            .method17035(OverlayTexture.NO_OVERLAY)
            .method17034(var7)
            .method17041(var21, 0.0F, -1.0F, 0.0F)
            .endVertex();
         var16 = var23;
         var17 = var24;
         var18 = var25;
      }

      var5.pop();
   }

   public ResourceLocation method17843(EnderDragonEntity var1) {
      return field25108;
   }
}

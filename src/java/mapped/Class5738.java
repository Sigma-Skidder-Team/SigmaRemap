package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.HandSide;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Matrix3f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;

public class Class5738 extends EntityRenderer<Class904> {
   private static final ResourceLocation field25159 = new ResourceLocation("textures/entity/fishing_hook.png");
   private static final RenderType field25160 = RenderType.getEntityCutout(field25159);

   public Class5738(EntityRendererManager var1) {
      super(var1);
   }

   public void render(Class904 var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      PlayerEntity var9 = var1.method3544();
      if (var9 != null) {
         var4.push();
         var4.push();
         var4.scale(0.5F, 0.5F, 0.5F);
         var4.rotate(this.field25097.method32230());
         var4.rotate(Vector3f.YP.rotationDegrees(180.0F));
         Class8892 var10 = var4.getLast();
         Matrix4f var11 = var10.getMatrix();
         Matrix3f var12 = var10.method32362();
         IVertexBuilder var13 = var5.method25597(field25160);
         method17922(var13, var11, var12, var6, 0.0F, 0, 0, 1);
         method17922(var13, var11, var12, var6, 1.0F, 0, 1, 1);
         method17922(var13, var11, var12, var6, 1.0F, 1, 1, 0);
         method17922(var13, var11, var12, var6, 0.0F, 1, 0, 0);
         var4.pop();
         int var14 = var9.getPrimaryHand() != HandSide.RIGHT ? -1 : 1;
         ItemStack var15 = var9.getHeldItemMainhand();
         if (var15.getItem() != Items.field37906) {
            var14 = -var14;
         }

         float var16 = var9.getSwingProgress(var3);
         float var17 = MathHelper.sin(MathHelper.sqrt(var16) * (float) Math.PI);
         float var18 = MathHelper.lerp(var3, var9.prevRenderYawOffset, var9.renderYawOffset) * (float) (Math.PI / 180.0);
         double var19 = (double) MathHelper.sin(var18);
         double var21 = (double) MathHelper.cos(var18);
         double var23 = (double)var14 * 0.35;
         double var25 = 0.8;
         double var27;
         double var29;
         double var31;
         float var36;
         if ((this.field25097.options == null || this.field25097.options.getPointOfView().func_243192_a()) && var9 == Minecraft.getInstance().player) {
            double var33 = this.field25097.options.fov;
            var33 /= 100.0;
            Vector3d var35 = new Vector3d((double)var14 * -0.36 * var33, -0.045 * var33, 0.4);
            var35 = var35.method11350(-MathHelper.lerp(var3, var9.prevRotationPitch, var9.rotationPitch) * (float) (Math.PI / 180.0));
            var35 = var35.method11351(-MathHelper.lerp(var3, var9.prevRotationYaw, var9.rotationYaw) * (float) (Math.PI / 180.0));
            var35 = var35.method11351(var17 * 0.5F);
            var35 = var35.method11350(-var17 * 0.7F);
            var27 = MathHelper.lerp((double)var3, var9.prevPosX, var9.getPosX()) + var35.x;
            var29 = MathHelper.lerp((double)var3, var9.prevPosY, var9.getPosY()) + var35.y;
            var31 = MathHelper.lerp((double)var3, var9.prevPosZ, var9.getPosZ()) + var35.z;
            var36 = var9.getEyeHeight();
         } else {
            var27 = MathHelper.lerp((double)var3, var9.prevPosX, var9.getPosX()) - var21 * var23 - var19 * 0.8;
            var29 = var9.prevPosY + (double)var9.getEyeHeight() + (var9.getPosY() - var9.prevPosY) * (double)var3 - 0.45;
            var31 = MathHelper.lerp((double)var3, var9.prevPosZ, var9.getPosZ()) - var19 * var23 + var21 * 0.8;
            var36 = !var9.isCrouching() ? 0.0F : -0.1875F;
         }

         double var49 = MathHelper.lerp((double)var3, var1.prevPosX, var1.getPosX());
         double var37 = MathHelper.lerp((double)var3, var1.prevPosY, var1.getPosY()) + 0.25;
         double var39 = MathHelper.lerp((double)var3, var1.prevPosZ, var1.getPosZ());
         float var41 = (float)(var27 - var49);
         float var42 = (float)(var29 - var37) + var36;
         float var43 = (float)(var31 - var39);
         IVertexBuilder var44 = var5.method25597(RenderType.getLines());
         Matrix4f var45 = var4.getLast().getMatrix();
         byte var46 = 16;

         for (int var47 = 0; var47 < 16; var47++) {
            method17923(var41, var42, var43, var44, var45, method17921(var47, 16));
            method17923(var41, var42, var43, var44, var45, method17921(var47 + 1, 16));
         }

         var4.pop();
         super.render(var1, var2, var3, var4, var5, var6);
      }
   }

   private static float method17921(int var0, int var1) {
      return (float)var0 / (float)var1;
   }

   private static void method17922(IVertexBuilder var0, Matrix4f var1, Matrix3f var2, int var3, float var4, int var5, int var6, int var7) {
      var0.pos(var1, var4 - 0.5F, (float)var5 - 0.5F, 0.0F)
         .color(255, 255, 255, 255)
         .tex((float)var6, (float)var7)
         .method17035(OverlayTexture.NO_OVERLAY)
         .method17034(var3)
         .method17041(var2, 0.0F, 1.0F, 0.0F)
         .endVertex();
   }

   private static void method17923(float var0, float var1, float var2, IVertexBuilder var3, Matrix4f var4, float var5) {
      var3.pos(var4, var0 * var5, var1 * (var5 * var5 + var5) * 0.5F + 0.25F, var2 * var5).color(0, 0, 0, 255).endVertex();
   }

   public ResourceLocation method17843(Class904 var1) {
      return field25159;
   }
}

package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;

public class Class5732<T extends AbstractMinecartEntity> extends EntityRenderer<T> {
   private static final ResourceLocation field25143 = new ResourceLocation("textures/entity/minecart.png");
   public final Class2827<T> field25144 = new Class2818<T>();

   public Class5732(EntityRendererManager var1) {
      super(var1);
      this.shadowSize = 0.7F;
   }

   public void render(T var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      super.render((T)var1, var2, var3, var4, var5, var6);
      var4.push();
      long var9 = (long)var1.getEntityId() * 493286711L;
      var9 = var9 * var9 * 4392167121L + var9 * 98761L;
      float var11 = (((float)(var9 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var12 = (((float)(var9 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float var13 = (((float)(var9 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      var4.translate((double)var11, (double)var12, (double)var13);
      double var14 = MathHelper.lerp((double)var3, var1.lastTickPosX, var1.getPosX());
      double var16 = MathHelper.lerp((double)var3, var1.lastTickPosY, var1.getPosY());
      double var18 = MathHelper.lerp((double)var3, var1.lastTickPosZ, var1.getPosZ());
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

         var4.translate(var22.x - var14, (var24.y + var25.y) / 2.0 - var16, var22.z - var18);
         Vector3d var26 = var25.add(-var24.x, -var24.y, -var24.z);
         if (var26.length() != 0.0) {
            var26 = var26.method11333();
            var2 = (float)(Math.atan2(var26.z, var26.x) * 180.0 / Math.PI);
            var23 = (float)(Math.atan(var26.y) * 73.0);
         }
      }

      var4.translate(0.0, 0.375, 0.0);
      var4.rotate(Vector3f.YP.rotationDegrees(180.0F - var2));
      var4.rotate(Vector3f.ZP.rotationDegrees(-var23));
      float var30 = (float)var1.method3599() - var3;
      float var31 = var1.method3597() - var3;
      if (var31 < 0.0F) {
         var31 = 0.0F;
      }

      if (var30 > 0.0F) {
         var4.rotate(Vector3f.XP.rotationDegrees(MathHelper.sin(var30) * var30 * var31 / 10.0F * (float)var1.method3601()));
      }

      int var33 = var1.method3605();
      BlockState var27 = var1.method3603();
      if (var27.getRenderType() != BlockRenderType.field9885) {
         var4.push();
         float var28 = 0.75F;
         var4.scale(0.75F, 0.75F, 0.75F);
         var4.translate(-0.5, (double)((float)(var33 - 8) / 16.0F), 0.5);
         var4.rotate(Vector3f.YP.rotationDegrees(90.0F));
         this.method17915((T)var1, var3, var27, var4, var5, var6);
         var4.pop();
      }

      var4.scale(-1.0F, -1.0F, 1.0F);
      this.field25144.setRotationAngles((T)var1, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
      IVertexBuilder var34 = var5.method25597(this.field25144.method11028(this.method17843((T)var1)));
      this.field25144.render(var4, var34, var6, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.pop();
   }

   public ResourceLocation method17843(T var1) {
      return field25143;
   }

   public void method17915(T var1, float var2, BlockState var3, MatrixStack var4, Class7733 var5, int var6) {
      Minecraft.getInstance().getBlockRendererDispatcher().method814(var3, var4, var5, var6, OverlayTexture.NO_OVERLAY);
   }
}

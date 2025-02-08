package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3f;
import net.optifine.Config;

public class Class234 extends Class219<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> {
   private static String[] field880;

   public Class234(Class5714<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, IRenderTypeBuffer var2, int var3, AbstractClientPlayerEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.method5368() && !var4.isInvisible() && var4.method2962(Class2318.field15879) && var4.method5372() != null) {
         ItemStack var13 = var4.getItemStackFromSlot(EquipmentSlotType.CHEST);
         if (var13.getItem() != Items.ELYTRA) {
            var1.push();
            var1.translate(0.0, 0.0, 0.125);
            double var14 = MathHelper.lerp((double)var7, var4.prevChasingPosX, var4.chasingPosX)
               - MathHelper.lerp((double)var7, var4.prevPosX, var4.getPosX());
            double var16 = MathHelper.lerp((double)var7, var4.prevChasingPosY, var4.chasingPosY)
               - MathHelper.lerp((double)var7, var4.prevPosY, var4.getPosY());
            double var18 = MathHelper.lerp((double)var7, var4.prevChasingPosZ, var4.chasingPosZ)
               - MathHelper.lerp((double)var7, var4.prevPosZ, var4.getPosZ());
            float var20 = var4.prevRenderYawOffset + (var4.renderYawOffset - var4.prevRenderYawOffset);
            double var21 = (double) MathHelper.sin(var20 * (float) (Math.PI / 180.0));
            double var23 = (double)(-MathHelper.cos(var20 * (float) (Math.PI / 180.0)));
            float var25 = (float)var16 * 10.0F;
            var25 = MathHelper.clamp(var25, -6.0F, 32.0F);
            float var26 = (float)(var14 * var21 + var18 * var23) * 100.0F;
            var26 = MathHelper.clamp(var26, 0.0F, 150.0F);
            float var27 = (float)(var14 * var23 - var18 * var21) * 100.0F;
            var27 = MathHelper.clamp(var27, -20.0F, 20.0F);
            if (var26 < 0.0F) {
               var26 = 0.0F;
            }

            if (var26 > 165.0F) {
               var26 = 165.0F;
            }

            if (var25 < -5.0F) {
               var25 = -5.0F;
            }

            float var28 = MathHelper.lerp(var7, var4.prevCameraYaw, var4.cameraYaw);
            var25 += MathHelper.sin(MathHelper.lerp(var7, var4.prevDistanceWalkedModified, var4.distanceWalkedModified) * 6.0F) * 32.0F * var28;
            if (var4.isCrouching()) {
               var25 += 25.0F;
            }

            float var29 = Config.method26992() * 20.0F;
            var29 = Config.method26832(var29, 0.02F, 1.0F);
            var4.capeRotateX = MathHelper.lerp(var29, var4.capeRotateX, 6.0F + var26 / 2.0F + var25);
            var4.capeRotateZ = MathHelper.lerp(var29, var4.capeRotateZ, var27 / 2.0F);
            var4.capeRotateY = MathHelper.lerp(var29, var4.capeRotateY, 180.0F - var27 / 2.0F);
            var1.rotate(Vector3f.XP.rotationDegrees(var4.capeRotateX));
            var1.rotate(Vector3f.ZP.rotationDegrees(var4.capeRotateZ));
            var1.rotate(Vector3f.YP.rotationDegrees(var4.capeRotateY));
            IVertexBuilder var30 = var2.getBuffer(RenderType.getEntitySolid(var4.method5372()));
            this.method825().renderCape(var1, var30, var3, OverlayTexture.NO_OVERLAY);
            var1.pop();
         }
      }
   }
}

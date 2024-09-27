package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.util.math.MathHelper;

public class Class252 extends Class219<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> {
   public Class252(Class5714<AbstractClientPlayerEntity, PlayerModel<AbstractClientPlayerEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, AbstractClientPlayerEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if ("deadmau5".equals(var4.getName().getString()) && var4.method5370() && !var4.isInvisible()) {
         IVertexBuilder var13 = var2.method25597(RenderType.getEntitySolid(var4.method5371()));
         int var14 = LivingRenderer.method17883(var4, 0.0F);

         for (int var15 = 0; var15 < 2; var15++) {
            float var16 = MathHelper.lerp(var7, var4.prevRotationYaw, var4.rotationYaw) - MathHelper.lerp(var7, var4.prevRenderYawOffset, var4.renderYawOffset);
            float var17 = MathHelper.lerp(var7, var4.prevRotationPitch, var4.rotationPitch);
            var1.push();
            var1.rotate(Vector3f.YP.rotationDegrees(var16));
            var1.rotate(Vector3f.XP.rotationDegrees(var17));
            var1.translate((double)(0.375F * (float)(var15 * 2 - 1)), 0.0, 0.0);
            var1.translate(0.0, -0.375, 0.0);
            var1.rotate(Vector3f.XP.rotationDegrees(-var17));
            var1.rotate(Vector3f.YP.rotationDegrees(-var16));
            float var18 = 1.3333334F;
            var1.method35292(1.3333334F, 1.3333334F, 1.3333334F);
            this.method825().renderEars(var1, var13, var3, var14);
            var1.pop();
         }
      }
   }
}

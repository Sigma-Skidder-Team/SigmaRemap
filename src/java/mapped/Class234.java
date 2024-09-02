package mapped;

import net.minecraft.item.ItemStack;

public class Class234 extends Class219<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>> {
   private static String[] field880;

   public Class234(Class5714<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, AbstractClientPlayerEntity var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var4.method5368() && !var4.method3342() && var4.method2962(Class2318.field15879) && var4.method5372() != null) {
         ItemStack var13 = var4.method2943(Class2106.field13735);
         if (var13.getItem() != Items.field38120) {
            var1.push();
            var1.translate(0.0, 0.0, 0.125);
            double var14 = MathHelper.method37822((double)var7, var4.field4911, var4.field4914)
               - MathHelper.method37822((double)var7, var4.prevPosX, var4.getPosX());
            double var16 = MathHelper.method37822((double)var7, var4.field4912, var4.field4915)
               - MathHelper.method37822((double)var7, var4.prevPosY, var4.getPosY());
            double var18 = MathHelper.method37822((double)var7, var4.field4913, var4.field4916)
               - MathHelper.method37822((double)var7, var4.prevPosZ, var4.getPosZ());
            float var20 = var4.field4966 + (var4.field4965 - var4.field4966);
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

            float var28 = MathHelper.lerp(var7, var4.field4908, var4.field4909);
            var25 += MathHelper.sin(MathHelper.lerp(var7, var4.prevDistanceWalkedModified, var4.distanceWalkedModified) * 6.0F) * 32.0F * var28;
            if (var4.method3336()) {
               var25 += 25.0F;
            }

            float var29 = Class7944.method26992() * 20.0F;
            var29 = Class7944.method26832(var29, 0.02F, 1.0F);
            var4.field6107 = MathHelper.lerp(var29, var4.field6107, 6.0F + var26 / 2.0F + var25);
            var4.field6109 = MathHelper.lerp(var29, var4.field6109, var27 / 2.0F);
            var4.field6108 = MathHelper.lerp(var29, var4.field6108, 180.0F - var27 / 2.0F);
            var1.rotate(Vector3f.field32898.rotationDegrees(var4.field6107));
            var1.rotate(Vector3f.field32902.rotationDegrees(var4.field6109));
            var1.rotate(Vector3f.YP.rotationDegrees(var4.field6108));
            Class5422 var30 = var2.method25597(RenderType.getEntitySolid(var4.method5372()));
            this.method825().method11209(var1, var30, var3, Class213.field798);
            var1.pop();
         }
      }
   }
}

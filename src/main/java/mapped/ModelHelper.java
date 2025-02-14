package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class ModelHelper {
   private static String[] field34265;

   public static void func_239104_a_(ModelRenderer var0, ModelRenderer var1, ModelRenderer var2, boolean var3) {
      ModelRenderer var6 = !var3 ? var1 : var0;
      ModelRenderer var7 = !var3 ? var0 : var1;
      var6.rotateAngleY = (!var3 ? 0.3F : -0.3F) + var2.rotateAngleY;
      var7.rotateAngleY = (!var3 ? -0.6F : 0.6F) + var2.rotateAngleY;
      var6.rotateAngleX = (float) (-Math.PI / 2) + var2.rotateAngleX + 0.1F;
      var7.rotateAngleX = -1.5F + var2.rotateAngleX;
   }

   public static void func_239102_a_(ModelRenderer var0, ModelRenderer var1, LivingEntity var2, boolean var3) {
      ModelRenderer var6 = !var3 ? var1 : var0;
      ModelRenderer var7 = !var3 ? var0 : var1;
      var6.rotateAngleY = !var3 ? 0.8F : -0.8F;
      var6.rotateAngleX = -0.97079635F;
      var7.rotateAngleX = var6.rotateAngleX;
      float var8 = (float) CrossbowItem.method11767(var2.getActiveItemStack());
      float var9 = MathHelper.clamp((float)var2.getItemInUseMaxCount(), 0.0F, var8);
      float var10 = var9 / var8;
      var7.rotateAngleY = MathHelper.lerp(var10, 0.4F, 0.85F) * (float)(!var3 ? -1 : 1);
      var7.rotateAngleX = MathHelper.lerp(var10, var7.rotateAngleX, (float) (-Math.PI / 2));
   }

   public static <T extends MobEntity> void method27107(ModelRenderer var0, ModelRenderer var1, T var2, float var3, float var4) {
      float var7 = MathHelper.sin(var3 * (float) Math.PI);
      float var8 = MathHelper.sin((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var0.rotateAngleZ = 0.0F;
      var1.rotateAngleZ = 0.0F;
      var0.rotateAngleY = (float) (Math.PI / 20);
      var1.rotateAngleY = (float) (-Math.PI / 20);
      if (var2.getPrimaryHand() != HandSide.RIGHT) {
         var0.rotateAngleX = -0.0F + MathHelper.cos(var4 * 0.19F) * 0.5F;
         var1.rotateAngleX = -1.8849558F + MathHelper.cos(var4 * 0.09F) * 0.15F;
         var0.rotateAngleX += var7 * 1.2F - var8 * 0.4F;
         var1.rotateAngleX += var7 * 2.2F - var8 * 0.4F;
      } else {
         var0.rotateAngleX = -1.8849558F + MathHelper.cos(var4 * 0.09F) * 0.15F;
         var1.rotateAngleX = -0.0F + MathHelper.cos(var4 * 0.19F) * 0.5F;
         var0.rotateAngleX += var7 * 2.2F - var8 * 0.4F;
         var1.rotateAngleX += var7 * 1.2F - var8 * 0.4F;
      }

      func_239101_a_(var0, var1, var4);
   }

   public static void func_239101_a_(ModelRenderer var0, ModelRenderer var1, float var2) {
      var0.rotateAngleZ = var0.rotateAngleZ + MathHelper.cos(var2 * 0.09F) * 0.05F + 0.05F;
      var1.rotateAngleZ = var1.rotateAngleZ - (MathHelper.cos(var2 * 0.09F) * 0.05F + 0.05F);
      var0.rotateAngleX = var0.rotateAngleX + MathHelper.sin(var2 * 0.067F) * 0.05F;
      var1.rotateAngleX = var1.rotateAngleX - MathHelper.sin(var2 * 0.067F) * 0.05F;
   }

   public static void method27109(ModelRenderer var0, ModelRenderer var1, boolean var2, float var3, float var4) {
      float var7 = MathHelper.sin(var3 * (float) Math.PI);
      float var8 = MathHelper.sin((1.0F - (1.0F - var3) * (1.0F - var3)) * (float) Math.PI);
      var1.rotateAngleZ = 0.0F;
      var0.rotateAngleZ = 0.0F;
      var1.rotateAngleY = -(0.1F - var7 * 0.6F);
      var0.rotateAngleY = 0.1F - var7 * 0.6F;
      float var9 = (float) -Math.PI / (!var2 ? 2.25F : 1.5F);
      var1.rotateAngleX = var9;
      var0.rotateAngleX = var9;
      var1.rotateAngleX += var7 * 1.2F - var8 * 0.4F;
      var0.rotateAngleX += var7 * 1.2F - var8 * 0.4F;
      func_239101_a_(var1, var0, var4);
   }
}

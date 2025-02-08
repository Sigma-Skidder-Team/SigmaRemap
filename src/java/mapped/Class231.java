package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public abstract class Class231<T extends LivingEntity, M extends PlayerModel<T>> extends Class219<T, M> {
   public Class231(LivingRenderer<T, M> var1) {
      super(var1);
   }

   public abstract int method835(T var1);

   public abstract void method836(MatrixStack var1, IRenderTypeBuffer var2, int var3, Entity var4, float var5, float var6, float var7, float var8);

   public void method820(MatrixStack var1, IRenderTypeBuffer var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      int var13 = this.method835((T)var4);
      Random var14 = new Random((long)var4.getEntityId());
      if (var13 > 0) {
         for (int var15 = 0; var15 < var13; var15++) {
            var1.push();
            ModelRenderer var16 = this.method825().getRandomModelRenderer(var14);
            Class9661 var17 = var16.method22685(var14);
            var16.translateRotate(var1);
            float var18 = var14.nextFloat();
            float var19 = var14.nextFloat();
            float var20 = var14.nextFloat();
            float var21 = MathHelper.lerp(var18, var17.field45150, var17.field45153) / 16.0F;
            float var22 = MathHelper.lerp(var19, var17.field45151, var17.field45154) / 16.0F;
            float var23 = MathHelper.lerp(var20, var17.field45152, var17.field45155) / 16.0F;
            var1.translate((double)var21, (double)var22, (double)var23);
            var18 = -1.0F * (var18 * 2.0F - 1.0F);
            var19 = -1.0F * (var19 * 2.0F - 1.0F);
            var20 = -1.0F * (var20 * 2.0F - 1.0F);
            this.method836(var1, var2, var3, var4, var18, var19, var20, var7);
            var1.pop();
         }
      }
   }
}

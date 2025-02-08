package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class Class232<T extends LivingEntity, M extends PlayerModel<T>> extends Class231<T, M> {
   private static String[] field876;
   private final EntityRendererManager field877;
   private ArrowEntity field878;

   public Class232(LivingRenderer<T, M> var1) {
      super(var1);
      this.field877 = var1.method17897();
   }

   @Override
   public int method835(T var1) {
      return var1.method3076();
   }

   @Override
   public void method836(MatrixStack var1, IRenderTypeBuffer var2, int var3, Entity var4, float var5, float var6, float var7, float var8) {
      float var11 = MathHelper.sqrt(var5 * var5 + var7 * var7);
      this.field878 = new ArrowEntity(var4.world, var4.getPosX(), var4.getPosY(), var4.getPosZ());
      this.field878.rotationYaw = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      this.field878.rotationPitch = (float)(Math.atan2((double)var6, (double)var11) * 180.0F / (float)Math.PI);
      this.field878.prevRotationYaw = this.field878.rotationYaw;
      this.field878.prevRotationPitch = this.field878.rotationPitch;
      this.field877.renderEntityStatic(this.field878, 0.0, 0.0, 0.0, 0.0F, var8, var1, var2, var3);
   }
}

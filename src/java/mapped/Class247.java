package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.LivingEntity;

public class Class247<T extends LivingEntity> extends Class219<T, Class2826<T>> {
   private static String[] field902;
   private final Class2827<T> field903 = new Class2826<T>(0);

   public Class247(Class5714<T, Class2826<T>> var1) {
      super(var1);
   }

   public void method820(MatrixStack var1, Class7733 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.isInvisible()) {
         this.method825().copyModelAttributesTo(this.field903);
         this.field903.setLivingAnimations((T)var4, var5, var6, var7);
         this.field903.setRotationAngles((T)var4, var5, var6, var8, var9, var10);
         IVertexBuilder var13 = var2.method25597(RenderType.getEntityTranslucent(this.method826((T)var4)));
         this.field903.method11016(var1, var13, var3, LivingRenderer.method17883(var4, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}

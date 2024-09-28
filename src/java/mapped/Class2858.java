package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.entity.Entity;

public abstract class Class2858<E extends Entity> extends AgeableModel<E> {
   private float field17708 = 1.0F;
   private float field17709 = 1.0F;
   private float field17710 = 1.0F;

   public void method11190(float var1, float var2, float var3) {
      this.field17708 = var1;
      this.field17709 = var2;
      this.field17710 = var3;
   }

   @Override
   public void method11016(MatrixStack var1, IVertexBuilder var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      super.method11016(var1, var2, var3, var4, this.field17708 * var5, this.field17709 * var6, this.field17710 * var7, var8);
   }
}

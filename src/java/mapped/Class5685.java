package mapped;

import com.mojang.blaze3d.matrix.MatrixStack;

public abstract class Class5685<T extends AbstractHorseEntity, M extends Class2856<T>> extends Class5651<T, M> {
   private final float field25052;

   public Class5685(EntityRendererManager var1, M var2, float var3) {
      super(var1, (M)var2, 0.75F);
      this.field25052 = var3;
   }

   public void method17857(T var1, MatrixStack var2, float var3) {
      var2.scale(this.field25052, this.field25052, this.field25052);
      super.method17857((T)var1, var2, var3);
   }
}

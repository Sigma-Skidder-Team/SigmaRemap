package mapped;

import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.util.math.MathHelper;

public class Class4568 extends Class4566 {
   private static String[] field22006;

   public Class4568(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.field22056 = 4;
   }

   @Override
   public Class6843 method14501() {
      return Class6843.field29736;
   }

   @Override
   public void method14510(Class5422 var1, ActiveRenderInfo var2, float var3) {
      this.method14515(0.6F - ((float)this.field22055 + var3 - 1.0F) * 0.25F * 0.5F);
      super.method14510(var1, var2, var3);
   }

   @Override
   public float method14509(float var1) {
      return 7.1F * MathHelper.sin(((float)this.field22055 + var1 - 1.0F) * 0.25F * (float) Math.PI);
   }
}

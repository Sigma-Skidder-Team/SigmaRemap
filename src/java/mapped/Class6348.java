package mapped;

import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.util.math.vector.Vector3d;

public class Class6348 extends DimensionRenderInfo {
   private static String[] field27883;

   public Class6348() {
      super(128.0F, true, Class2078.field13536, false, false);
   }

   @Override
   public Vector3d method19299(Vector3d var1, float var2) {
      return var1.mul((double)(var2 * 0.94F + 0.06F), (double)(var2 * 0.94F + 0.06F), (double)(var2 * 0.91F + 0.09F));
   }

   @Override
   public boolean method19300(int var1, int var2) {
      return false;
   }
}

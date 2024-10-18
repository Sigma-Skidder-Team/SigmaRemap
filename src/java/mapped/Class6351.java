package mapped;

import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.util.math.vector.Vector3d;

import javax.annotation.Nullable;

public class Class6351 extends DimensionRenderInfo {
   private static String[] field27892;

   public Class6351() {
      super(Float.NaN, false, Class2078.field13537, true, false);
   }

   @Override
   public Vector3d method19299(Vector3d var1, float var2) {
      return var1.scale(0.15F);
   }

   @Override
   public boolean method19300(int var1, int var2) {
      return false;
   }

   @Nullable
   @Override
   public float[] method19302(float var1, float var2) {
      return null;
   }
}

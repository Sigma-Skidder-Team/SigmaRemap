package mapped;

import com.google.common.cache.CacheLoader;
import net.minecraft.util.math.shapes.VoxelShape;

public final class Class4562 extends CacheLoader<VoxelShape, Boolean> {
   private static String[] field21998;

   public Boolean load(VoxelShape var1) {
      return ! VoxelShapes.compare(VoxelShapes.method27426(), var1, IBooleanFunction.field44043);
   }
}

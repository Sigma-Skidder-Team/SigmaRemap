package mapped;

import com.google.common.cache.CacheLoader;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;

public class Class4564 extends CacheLoader<BlockPos, CachedBlockInfo> {
   private static String[] field21999;
   private final IWorldReader field22000;
   private final boolean field22001;

   public Class4564(IWorldReader var1, boolean var2) {
      this.field22000 = var1;
      this.field22001 = var2;
   }

   public CachedBlockInfo load(BlockPos var1) throws Exception {
      return new CachedBlockInfo(this.field22000, var1, this.field22001);
   }
}

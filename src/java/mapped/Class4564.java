package mapped;

import com.google.common.cache.CacheLoader;

public class Class4564 extends CacheLoader<BlockPos, Class9632> {
   private static String[] field21999;
   private final Class1662 field22000;
   private final boolean field22001;

   public Class4564(Class1662 var1, boolean var2) {
      this.field22000 = var1;
      this.field22001 = var2;
   }

   public Class9632 load(BlockPos var1) throws Exception {
      return new Class9632(this.field22000, var1, this.field22001);
   }
}

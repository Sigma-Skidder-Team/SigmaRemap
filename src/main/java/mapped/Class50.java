package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Iterator;

public final class Class50 implements Iterable<BlockPos> {
   public final BlockPos field104;
   public final BlockPos field105;

   public Class50(BlockPos var1, BlockPos var2) {
      this.field104 = var1;
      this.field105 = var2;
   }

   @Override
   public Iterator<BlockPos> iterator() {
      return new Class4555(this);
   }
}

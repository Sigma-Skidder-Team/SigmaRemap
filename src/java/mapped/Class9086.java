package mapped;

import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public class Class9086 {
   private final BlockPos field41592;
   private final Direction field41593;
   private final Direction field41594;
   private final LoadingCache<BlockPos, CachedBlockInfo> field41595;
   private final int field41596;
   private final int field41597;
   private final int field41598;

   public Class9086(BlockPos var1, Direction var2, Direction var3, LoadingCache<BlockPos, CachedBlockInfo> var4, int var5, int var6, int var7) {
      this.field41592 = var1;
      this.field41593 = var2;
      this.field41594 = var3;
      this.field41595 = var4;
      this.field41596 = var5;
      this.field41597 = var6;
      this.field41598 = var7;
   }

   public BlockPos method33878() {
      return this.field41592;
   }

   public Direction method33879() {
      return this.field41593;
   }

   public Direction method33880() {
      return this.field41594;
   }

   public CachedBlockInfo method33881(int var1, int var2, int var3) {
      return (CachedBlockInfo)this.field41595.getUnchecked(Class9803.method38658(this.field41592, this.method33879(), this.method33880(), var1, var2, var3));
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("up", this.field41594).add("forwards", this.field41593).add("frontTopLeft", this.field41592).toString();
   }
}

package remapped;

import com.google.common.base.MoreObjects;
import com.google.common.cache.LoadingCache;

public class class_6953 {
   private final BlockPos field_35746;
   private final Direction field_35751;
   private final Direction field_35752;
   private final LoadingCache<BlockPos, class_9115> field_35748;
   private final int field_35750;
   private final int field_35749;
   private final int field_35747;

   public class_6953(BlockPos var1, Direction var2, Direction var3, LoadingCache<BlockPos, class_9115> var4, int var5, int var6, int var7) {
      this.field_35746 = var1;
      this.field_35751 = var2;
      this.field_35752 = var3;
      this.field_35748 = var4;
      this.field_35750 = var5;
      this.field_35749 = var6;
      this.field_35747 = var7;
   }

   public BlockPos method_31798() {
      return this.field_35746;
   }

   public Direction method_31796() {
      return this.field_35751;
   }

   public Direction method_31797() {
      return this.field_35752;
   }

   public class_9115 method_31795(int var1, int var2, int var3) {
      return (class_9115)this.field_35748.getUnchecked(class_9741.method_44979(this.field_35746, this.method_31796(), this.method_31797(), var1, var2, var3));
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("up", this.field_35752).add("forwards", this.field_35751).add("frontTopLeft", this.field_35746).toString();
   }
}

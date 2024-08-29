package mapped;

import net.minecraft.util.math.BlockPos;

public class Class7863 implements Class7864 {
   private final BlockPos field33675;
   private final Vector3d field33676;

   public Class7863(BlockPos var1) {
      this.field33675 = var1;
      this.field33676 = Vector3d.method11328(var1);
   }

   @Override
   public Vector3d method26356() {
      return this.field33676;
   }

   @Override
   public BlockPos method26357() {
      return this.field33675;
   }

   @Override
   public boolean method26358(Class880 var1) {
      return true;
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.field33675 + ", centerPosition=" + this.field33676 + '}';
   }
}

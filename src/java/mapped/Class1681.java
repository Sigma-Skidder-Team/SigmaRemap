package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public interface Class1681 {
   boolean setBlockState(BlockPos var1, BlockState var2, int var3, int var4);

   default boolean setBlockState(BlockPos var1, BlockState var2, int var3) {
      return this.setBlockState(var1, var2, var3, 512);
   }

   boolean removeBlock(BlockPos var1, boolean var2);

   default boolean method7179(BlockPos var1, boolean var2) {
      return this.method7180(var1, var2, (Entity)null);
   }

   default boolean method7180(BlockPos var1, boolean var2, Entity var3) {
      return this.destroyBlock(var1, var2, var3, 512);
   }

   boolean destroyBlock(BlockPos var1, boolean var2, Entity var3, int var4);

   default boolean addEntity(Entity var1) {
      return false;
   }
}

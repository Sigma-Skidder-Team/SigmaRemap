package mapped;

import net.minecraft.block.Block;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public interface Class937 extends IInventory {
   VoxelShape field5296 = Block.makeCuboidShape(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   VoxelShape field5297 = Block.makeCuboidShape(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   VoxelShape field5298 = VoxelShapes.or(field5296, field5297);

   default VoxelShape method3733() {
      return field5298;
   }

   @Nullable
   World method3734();

   double method3718();

   double method3719();

   double method3720();
}

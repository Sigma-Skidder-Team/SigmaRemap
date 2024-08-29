package mapped;

import javax.annotation.Nullable;

public interface Class937 extends Class920 {
   VoxelShape field5296 = Block.method11539(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   VoxelShape field5297 = Block.method11539(0.0, 16.0, 0.0, 16.0, 32.0, 16.0);
   VoxelShape field5298 = VoxelShapes.method27431(field5296, field5297);

   default VoxelShape method3733() {
      return field5298;
   }

   @Nullable
   World method3734();

   double method3718();

   double method3719();

   double method3720();
}

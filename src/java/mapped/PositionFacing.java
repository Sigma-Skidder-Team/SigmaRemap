package mapped;

import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

public class PositionFacing {
   public BlockPos blockPos;
   public Direction direction;

   public PositionFacing(BlockPos blockPos, Direction direction) {
      this.blockPos = blockPos;
      this.direction = direction;
   }
}

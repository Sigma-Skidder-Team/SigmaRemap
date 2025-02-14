package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class6994 extends Class6991 {
   private static String[] field30267;

   public Class6994(StriderEntity var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class9597 method21644(int var1) {
      this.field30257 = new Class6762();
      return new Class9597(this.field30257, var1);
   }

   @Override
   public boolean method21680(PathNodeType var1) {
      return var1 != PathNodeType.LAVA && var1 != PathNodeType.DAMAGE_FIRE && var1 != PathNodeType.DANGER_FIRE ? super.method21680(var1) : true;
   }

   @Override
   public boolean method21672(BlockPos var1) {
      return this.field30244.getBlockState(var1).isIn(Blocks.LAVA) || super.method21672(var1);
   }
}

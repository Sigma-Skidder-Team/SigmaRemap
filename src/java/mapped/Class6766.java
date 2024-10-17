package mapped;

import net.minecraft.pathfinding.PathNodeType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class Class6766 extends Class6762 {
   private static String[] field29486;

   public Class6766() {
   }

   @Override
   public PathNodeType method20620(IBlockReader var1, boolean var2, boolean var3, BlockPos var4, PathNodeType var5) {
      return var5 != PathNodeType.LEAVES ? super.method20620(var1, var2, var3, var4, var5) : PathNodeType.OPEN;
   }
}

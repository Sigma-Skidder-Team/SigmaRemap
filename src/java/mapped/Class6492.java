package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;

import java.util.HashSet;
import java.util.Set;

public class Class6492 extends Class6490 {
   private static String[] field28456;

   public Class6492() {
      super(Class3236.class);
   }

   @Override
   public Set<Class8189> method19688(BlockPos var1, BlockState var2, Class8982 var3) {
      HashSet var6 = new HashSet();
      BlockRayTraceResult var7 = new BlockRayTraceResult(new Vector3d(0.0, 0.0, 0.0), Direction.DOWN, var1, false);
      Class5909 var8 = new Class5909(this.field28457.world, this.field28457.player, Hand.MAIN_HAND, new ItemStack(var2.getBlock()), var7);
      var8.field25717 = var1;
      var8.field25718 = false;
      BlockState var9 = var2.getBlock().method11495(var8);
      var6.add(new Class8189(var1, var9));
      return var6;
   }
}

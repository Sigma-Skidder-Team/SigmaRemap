package mapped;

import java.util.HashSet;
import java.util.Set;

public class Class6496 extends Class6490 {
   private static String[] field28456;

   public Class6496() {
      super(Class3239.class);
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

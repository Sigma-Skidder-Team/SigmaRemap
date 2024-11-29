package mapped;

import com.mentalfrostbyte.jello.module.impl.world.CakeEater;
import net.minecraft.util.math.BlockPos;

import java.util.Comparator;

public class Class3593 implements Comparator<BlockPos> {
   private static String[] field19539;
   public final CakeEater field19540;

   public Class3593(CakeEater var1) {
      this.field19540 = var1;
   }

   public int compare(BlockPos var1, BlockPos var2) {
      return !(
            Math.sqrt(
                  CakeEater.method16322()
                     .player
                     .getDistanceNearest((double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5)
               )
               > Math.sqrt(
                  CakeEater.method16323()
                     .player
                     .getDistanceNearest((double)var2.getX() + 0.5, (double)var2.getY() + 0.5, (double)var2.getZ() + 0.5)
               )
         )
         ? -1
         : 1;
   }
}

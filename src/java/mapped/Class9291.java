package mapped;

import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class Class9291 {

    public static boolean method35028(List<PositionFacing> var0) {
      if (var0.size() <= 0) {
         return false;
      } else {
         BlockPos blockPos = ((PositionFacing)var0.get(0)).blockPos;
         PositionFacing[] var4 = new PositionFacing[]{
            new PositionFacing(blockPos.north(), Direction.SOUTH),
            new PositionFacing(blockPos.east(), Direction.WEST),
            new PositionFacing(blockPos.south(), Direction.NORTH),
            new PositionFacing(blockPos.west(), Direction.EAST),
            new PositionFacing(blockPos.down(), Direction.field673),
            new PositionFacing(blockPos.up(), Direction.DOWN)
         };

         for (PositionFacing var8 : var4) {
            if (BlockUtil.getBlockFromPosition(var8.blockPos) != Blocks.AIR) {
               return true;
            }
         }

         return false;
      }
   }

   public static List<PositionFacing> method35029(List<PositionFacing> var0) {
      ArrayList var3 = new ArrayList();

      for (int var4 = var0.size() - 1; var4 >= 0; var4--) {
         var3.add(var0.get(var4));
      }

      return var3;
   }

   public static List<PositionFacing> method35030(Block var0, BlockPos var1, int var2) {
      ArrayList var5 = new ArrayList();
      if (var1 != null && var2 >= 0) {
         if (!BlockUtil.method34538(var0, var1)) {
            return var5;
         } else {
            PositionFacing[] var6 = new PositionFacing[]{
               new PositionFacing(var1.up(), Direction.DOWN),
               new PositionFacing(var1.north(), Direction.SOUTH),
               new PositionFacing(var1.east(), Direction.WEST),
               new PositionFacing(var1.south(), Direction.NORTH),
               new PositionFacing(var1.west(), Direction.EAST),
               new PositionFacing(var1.down(), Direction.field673)
            };

            for (PositionFacing var10 : var6) {
               if (!BlockUtil.method34538(var0, var10.blockPos)) {
                  var5.add(var10);
                  return var5;
               }
            }

            for (int var13 = 1; var13 < var2; var13++) {
               for (PositionFacing var11 : var6) {
                  List var12 = method35030(var0, var11.blockPos, var13);
                  if (method35028(method35029(var12))) {
                     var5.addAll(var12);
                     return (List<PositionFacing>)(var5.size() <= 1 ? var5 : method35029(var5));
                  }
               }
            }

            return var5;
         }
      } else {
         return var5;
      }
   }
}

package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.Random;

public class Class2909 extends Class2898<Class4712> {
   private static String[] field17993;
   public static final BlockPos field17994 = BlockPos.ZERO;
   private final boolean field17995;

   public Class2909(boolean var1) {
      super(Class4712.field22349);
      this.field17995 = var1;
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      for (BlockPos var9 : BlockPos.method8359(
         new BlockPos(var4.getX() - 4, var4.getY() - 1, var4.getZ() - 4),
         new BlockPos(var4.getX() + 4, var4.getY() + 32, var4.getZ() + 4)
      )) {
         boolean var10 = var9.withinDistance(var4, 2.5);
         if (var10 || var9.withinDistance(var4, 3.5)) {
            if (var9.getY() >= var4.getY()) {
               if (var9.getY() <= var4.getY()) {
                  if (var10) {
                     if (!this.field17995) {
                        this.method11217(var1, new BlockPos(var9), Blocks.AIR.getDefaultState());
                     } else {
                        this.method11217(var1, new BlockPos(var9), Blocks.END_PORTAL.getDefaultState());
                     }
                  } else {
                     this.method11217(var1, var9, Blocks.BEDROCK.getDefaultState());
                  }
               } else {
                  this.method11217(var1, var9, Blocks.AIR.getDefaultState());
               }
            } else if (!var10) {
               if (var9.getY() < var4.getY()) {
                  this.method11217(var1, var9, Blocks.END_STONE.getDefaultState());
               }
            } else {
               this.method11217(var1, var9, Blocks.BEDROCK.getDefaultState());
            }
         }
      }

      for (int var11 = 0; var11 < 4; var11++) {
         this.method11217(var1, var4.up(var11), Blocks.BEDROCK.getDefaultState());
      }

      BlockPos var12 = var4.up(2);

      for (Direction var14 : Direction.Plane.HORIZONTAL) {
         this.method11217(var1, var12.offset(var14), Blocks.WALL_TORCH.getDefaultState().with(Class3382.field18985, var14));
      }

      return true;
   }
}

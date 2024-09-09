package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;

public class Class4228 extends Class4167 {
   private static String[] field20559;

   public Class4228(int var1, Class9764 var2, Direction var3) {
      super(Class7792.field33442, var1);
      this.method12939(var3);
      this.field20444 = var2;
   }

   public Class4228(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33442, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12903((Class4175)var1, var2, var3, 6, 2, false);
   }

   public static Class4228 method13020(List<Class4178> var0, int var1, int var2, int var3, int var4, Direction var5) {
      Class9764 var8 = Class9764.method38388(var1, var2, var3, -2, 0, 0, 7, 11, 7, var5);
      return method12904(var8) && Class4178.method12918(var0, var8) == null ? new Class4228(var4, var8, var5) : null;
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      this.method12927(var1, var5, 0, 0, 0, 6, 1, 6, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 2, 0, 6, 10, 6, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12927(var1, var5, 0, 2, 0, 1, 8, 0, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 5, 2, 0, 6, 8, 0, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 2, 1, 0, 8, 6, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 6, 2, 1, 6, 8, 6, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 2, 6, 5, 8, 6, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      BlockState var10 = Blocks.NETHER_BRICK_FENCE
         .method11579()
         .method23465(Class3239.field18683, Boolean.valueOf(true))
         .method23465(Class3239.field18681, Boolean.valueOf(true));
      BlockState var11 = Blocks.NETHER_BRICK_FENCE
         .method11579()
         .method23465(Class3239.field18680, Boolean.valueOf(true))
         .method23465(Class3239.field18682, Boolean.valueOf(true));
      this.method12927(var1, var5, 0, 3, 2, 0, 5, 4, var11, var11, false);
      this.method12927(var1, var5, 6, 3, 2, 6, 5, 2, var11, var11, false);
      this.method12927(var1, var5, 6, 3, 4, 6, 5, 4, var11, var11, false);
      this.method12923(var1, Blocks.NETHER_BRICKS.method11579(), 5, 2, 5, var5);
      this.method12927(var1, var5, 4, 2, 5, 4, 3, 5, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 3, 2, 5, 3, 4, 5, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 2, 2, 5, 2, 5, 5, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 2, 5, 1, 6, 5, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 7, 1, 5, 7, 4, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 6, 8, 2, 6, 8, 4, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12927(var1, var5, 2, 6, 0, 4, 8, 0, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 2, 5, 0, 4, 5, 0, var10, var10, false);

      for (int var12 = 0; var12 <= 6; var12++) {
         for (int var13 = 0; var13 <= 6; var13++) {
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var12, -1, var13, var5);
         }
      }

      return true;
   }
}

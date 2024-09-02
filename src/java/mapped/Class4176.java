package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;

public class Class4176 extends Class4167 {
   private static String[] field20441;

   public Class4176(int var1, Class9764 var2, Direction var3) {
      super(Class7792.field33432, var1);
      this.method12939(var3);
      this.field20444 = var2;
   }

   public Class4176(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33432, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12901((Class4175)var1, var2, var3, 1, 0, true);
   }

   public static Class4176 method12912(List<Class4178> var0, int var1, int var2, int var3, Direction var4, int var5) {
      Class9764 var8 = Class9764.method38388(var1, var2, var3, -1, -7, 0, 5, 14, 10, var4);
      return method12904(var8) && Class4178.method12918(var0, var8) == null ? new Class4176(var5, var8, var4) : null;
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      BlockState var10 = Blocks.NETHER_BRICK_STAIRS.method11579().method23465(Class3421.field19131, Direction.SOUTH);
      BlockState var11 = Blocks.NETHER_BRICK_FENCE
         .method11579()
         .method23465(Class3239.field18680, Boolean.valueOf(true))
         .method23465(Class3239.field18682, Boolean.valueOf(true));

      for (int var12 = 0; var12 <= 9; var12++) {
         int var13 = Math.max(1, 7 - var12);
         int var14 = Math.min(Math.max(var13 + 5, 14 - var12), 13);
         int var15 = var12;
         this.method12927(var1, var5, 0, 0, var12, 4, var13, var12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
         this.method12927(var1, var5, 1, var13 + 1, var12, 3, var14 - 1, var12, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
         if (var12 <= 6) {
            this.method12923(var1, var10, 1, var13 + 1, var12, var5);
            this.method12923(var1, var10, 2, var13 + 1, var12, var5);
            this.method12923(var1, var10, 3, var13 + 1, var12, var5);
         }

         this.method12927(var1, var5, 0, var14, var12, 4, var14, var12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
         this.method12927(var1, var5, 0, var13 + 1, var12, 0, var14 - 1, var12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
         this.method12927(var1, var5, 4, var13 + 1, var12, 4, var14 - 1, var12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
         if ((var12 & 1) == 0) {
            this.method12927(var1, var5, 0, var13 + 2, var12, 0, var13 + 3, var12, var11, var11, false);
            this.method12927(var1, var5, 4, var13 + 2, var12, 4, var13 + 3, var12, var11, var11, false);
         }

         for (int var16 = 0; var16 <= 4; var16++) {
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var16, -1, var15, var5);
         }
      }

      return true;
   }
}

package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;

public class Class4170 extends Class4167 {
   private static String[] field20432;

   public Class4170(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33434, var1);
      this.method12939(var4);
      this.field20444 = var3;
   }

   public Class4170(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33434, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12901((Class4175)var1, var2, var3, 5, 3, true);
   }

   public static Class4170 method12907(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -5, -3, 0, 13, 14, 13, var5);
      return method12904(var9) && Class4178.method12918(var0, var9) == null ? new Class4170(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12927(var1, var5, 0, 3, 0, 12, 4, 12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 5, 0, 12, 13, 12, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12927(var1, var5, 0, 5, 0, 1, 12, 12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 11, 5, 0, 12, 12, 12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 2, 5, 11, 4, 12, 12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 8, 5, 11, 10, 12, 12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 5, 9, 11, 7, 12, 12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 2, 5, 0, 4, 12, 1, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 8, 5, 0, 10, 12, 1, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 5, 9, 0, 7, 12, 1, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 2, 11, 2, 10, 12, 10, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 5, 8, 0, 7, 8, 0, Blocks.NETHER_BRICK_FENCE.method11579(), Blocks.NETHER_BRICK_FENCE.method11579(), false);
      BlockState var10 = Blocks.NETHER_BRICK_FENCE
         .method11579()
         .method23465(Class3239.field18683, Boolean.valueOf(true))
         .method23465(Class3239.field18681, Boolean.valueOf(true));
      BlockState var11 = Blocks.NETHER_BRICK_FENCE
         .method11579()
         .method23465(Class3239.field18680, Boolean.valueOf(true))
         .method23465(Class3239.field18682, Boolean.valueOf(true));

      for (int var12 = 1; var12 <= 11; var12 += 2) {
         this.method12927(var1, var5, var12, 10, 0, var12, 11, 0, var10, var10, false);
         this.method12927(var1, var5, var12, 10, 12, var12, 11, 12, var10, var10, false);
         this.method12927(var1, var5, 0, 10, var12, 0, 11, var12, var11, var11, false);
         this.method12927(var1, var5, 12, 10, var12, 12, 11, var12, var11, var11, false);
         this.method12923(var1, Blocks.NETHER_BRICKS.method11579(), var12, 13, 0, var5);
         this.method12923(var1, Blocks.NETHER_BRICKS.method11579(), var12, 13, 12, var5);
         this.method12923(var1, Blocks.NETHER_BRICKS.method11579(), 0, 13, var12, var5);
         this.method12923(var1, Blocks.NETHER_BRICKS.method11579(), 12, 13, var12, var5);
         if (var12 != 11) {
            this.method12923(var1, var10, var12 + 1, 13, 0, var5);
            this.method12923(var1, var10, var12 + 1, 13, 12, var5);
            this.method12923(var1, var11, 0, 13, var12 + 1, var5);
            this.method12923(var1, var11, 12, 13, var12 + 1, var5);
         }
      }

      this.method12923(
         var1,
         Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18680, Boolean.valueOf(true)).method23465(Class3239.field18681, Boolean.valueOf(true)),
         0,
         13,
         0,
         var5
      );
      this.method12923(
         var1,
         Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18682, Boolean.valueOf(true)).method23465(Class3239.field18681, Boolean.valueOf(true)),
         0,
         13,
         12,
         var5
      );
      this.method12923(
         var1,
         Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18682, Boolean.valueOf(true)).method23465(Class3239.field18683, Boolean.valueOf(true)),
         12,
         13,
         12,
         var5
      );
      this.method12923(
         var1,
         Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18680, Boolean.valueOf(true)).method23465(Class3239.field18683, Boolean.valueOf(true)),
         12,
         13,
         0,
         var5
      );

      for (int var14 = 3; var14 <= 9; var14 += 2) {
         this.method12927(
            var1,
            var5,
            1,
            7,
            var14,
            1,
            8,
            var14,
            var11.method23465(Class3239.field18683, Boolean.valueOf(true)),
            var11.method23465(Class3239.field18683, Boolean.valueOf(true)),
            false
         );
         this.method12927(
            var1,
            var5,
            11,
            7,
            var14,
            11,
            8,
            var14,
            var11.method23465(Class3239.field18681, Boolean.valueOf(true)),
            var11.method23465(Class3239.field18681, Boolean.valueOf(true)),
            false
         );
      }

      this.method12927(var1, var5, 4, 2, 0, 8, 2, 12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 2, 4, 12, 2, 8, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 4, 0, 0, 8, 1, 3, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 4, 0, 9, 8, 1, 12, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 0, 4, 3, 1, 8, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 9, 0, 4, 12, 1, 8, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);

      for (int var15 = 4; var15 <= 8; var15++) {
         for (int var13 = 0; var13 <= 2; var13++) {
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var15, -1, var13, var5);
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var15, -1, 12 - var13, var5);
         }
      }

      for (int var16 = 0; var16 <= 2; var16++) {
         for (int var18 = 4; var18 <= 8; var18++) {
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var16, -1, var18, var5);
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), 12 - var16, -1, var18, var5);
         }
      }

      this.method12927(var1, var5, 5, 5, 5, 7, 5, 7, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 6, 1, 6, 6, 4, 6, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12923(var1, Blocks.NETHER_BRICKS.method11579(), 6, 0, 6, var5);
      this.method12923(var1, Blocks.LAVA.method11579(), 6, 5, 6, var5);
      BlockPos var17 = new BlockPos(this.method12920(6, 6), this.method12921(5), this.method12922(6, 6));
      if (var5.method38396(var17)) {
         var1.method6861().method20726(var17, Class9479.field44068, 0);
      }

      return true;
   }
}

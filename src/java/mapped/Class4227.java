package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.List;
import java.util.Random;

public class Class4227 extends Class4167 {
   private boolean field20558;

   public Class4227(int var1, Class9764 var2, Direction var3) {
      super(Class7792.field33440, var1);
      this.method12939(var3);
      this.field20444 = var2;
   }

   public Class4227(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33440, var2);
      this.field20558 = var2.getBoolean("Mob");
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putBoolean("Mob", this.field20558);
   }

   public static Class4227 method13019(List<Class4178> var0, int var1, int var2, int var3, int var4, Direction var5) {
      Class9764 var8 = Class9764.method38388(var1, var2, var3, -2, 0, 0, 7, 8, 9, var5);
      return method12904(var8) && Class4178.method12918(var0, var8) == null ? new Class4227(var4, var8, var5) : null;
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12927(var1, var5, 0, 2, 0, 6, 7, 7, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12927(var1, var5, 1, 0, 0, 5, 1, 7, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 2, 1, 5, 2, 7, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 3, 2, 5, 3, 7, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 4, 3, 5, 4, 7, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 2, 0, 1, 4, 2, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 5, 2, 0, 5, 4, 2, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 5, 2, 1, 5, 3, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 5, 5, 2, 5, 5, 3, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 5, 3, 0, 5, 8, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 6, 5, 3, 6, 5, 8, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 5, 8, 5, 5, 8, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      BlockState var10 = Blocks.NETHER_BRICK_FENCE
         .method11579()
         .method23465(Class3239.field18683, Boolean.valueOf(true))
         .method23465(Class3239.field18681, Boolean.valueOf(true));
      BlockState var11 = Blocks.NETHER_BRICK_FENCE
         .method11579()
         .method23465(Class3239.field18680, Boolean.valueOf(true))
         .method23465(Class3239.field18682, Boolean.valueOf(true));
      this.method12923(var1, Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18683, Boolean.valueOf(true)), 1, 6, 3, var5);
      this.method12923(var1, Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18681, Boolean.valueOf(true)), 5, 6, 3, var5);
      this.method12923(
         var1,
         Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18681, Boolean.valueOf(true)).method23465(Class3239.field18680, Boolean.valueOf(true)),
         0,
         6,
         3,
         var5
      );
      this.method12923(
         var1,
         Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18683, Boolean.valueOf(true)).method23465(Class3239.field18680, Boolean.valueOf(true)),
         6,
         6,
         3,
         var5
      );
      this.method12927(var1, var5, 0, 6, 4, 0, 6, 7, var11, var11, false);
      this.method12927(var1, var5, 6, 6, 4, 6, 6, 7, var11, var11, false);
      this.method12923(
         var1,
         Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18681, Boolean.valueOf(true)).method23465(Class3239.field18682, Boolean.valueOf(true)),
         0,
         6,
         8,
         var5
      );
      this.method12923(
         var1,
         Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18683, Boolean.valueOf(true)).method23465(Class3239.field18682, Boolean.valueOf(true)),
         6,
         6,
         8,
         var5
      );
      this.method12927(var1, var5, 1, 6, 8, 5, 6, 8, var10, var10, false);
      this.method12923(var1, Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18681, Boolean.valueOf(true)), 1, 7, 8, var5);
      this.method12927(var1, var5, 2, 7, 8, 4, 7, 8, var10, var10, false);
      this.method12923(var1, Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18683, Boolean.valueOf(true)), 5, 7, 8, var5);
      this.method12923(var1, Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18681, Boolean.valueOf(true)), 2, 8, 8, var5);
      this.method12923(var1, var10, 3, 8, 8, var5);
      this.method12923(var1, Blocks.NETHER_BRICK_FENCE.method11579().method23465(Class3239.field18683, Boolean.valueOf(true)), 4, 8, 8, var5);
      if (!this.field20558) {
         BlockPos var12 = new BlockPos(this.method12920(3, 5), this.method12921(5), this.method12922(3, 5));
         if (var5.method38396(var12)) {
            this.field20558 = true;
            var1.setBlockState(var12, Blocks.field36532.method11579(), 2);
            TileEntity var13 = var1.getTileEntity(var12);
            if (var13 instanceof Class960) {
               ((Class960)var13).method3911().method24790(EntityType.field41010);
            }
         }
      }

      for (int var14 = 0; var14 <= 6; var14++) {
         for (int var15 = 0; var15 <= 6; var15++) {
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var14, -1, var15, var5);
         }
      }

      return true;
   }
}

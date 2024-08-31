package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public class Class4226 extends Class4167 {
   private static String[] field20557;

   public Class4226(int var1, Class9764 var2, Direction var3) {
      super(Class7792.field33437, var1);
      this.method12939(var3);
      this.field20444 = var2;
   }

   public Class4226(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33437, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12901((Class4175)var1, var2, var3, 1, 0, true);
   }

   public static Class4226 method13018(List<Class4178> var0, int var1, int var2, int var3, Direction var4, int var5) {
      Class9764 var8 = Class9764.method38388(var1, var2, var3, -1, 0, 0, 5, 7, 5, var4);
      return method12904(var8) && Class4178.method12918(var0, var8) == null ? new Class4226(var5, var8, var4) : null;
   }

   @Override
   public boolean method12896(Class1658 var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, Class7481 var6, BlockPos var7) {
      this.method12927(var1, var5, 0, 0, 0, 4, 1, 4, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 2, 0, 4, 5, 4, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      BlockState var10 = Blocks.NETHER_BRICK_FENCE
         .method11579()
         .method23465(Class3239.field18680, Boolean.valueOf(true))
         .method23465(Class3239.field18682, Boolean.valueOf(true));
      this.method12927(var1, var5, 0, 2, 0, 0, 5, 4, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 4, 2, 0, 4, 5, 4, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 3, 1, 0, 4, 1, var10, var10, false);
      this.method12927(var1, var5, 0, 3, 3, 0, 4, 3, var10, var10, false);
      this.method12927(var1, var5, 4, 3, 1, 4, 4, 1, var10, var10, false);
      this.method12927(var1, var5, 4, 3, 3, 4, 4, 3, var10, var10, false);
      this.method12927(var1, var5, 0, 6, 0, 4, 6, 4, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);

      for (int var11 = 0; var11 <= 4; var11++) {
         for (int var12 = 0; var12 <= 4; var12++) {
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var11, -1, var12, var5);
         }
      }

      return true;
   }
}

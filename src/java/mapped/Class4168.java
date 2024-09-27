package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public class Class4168 extends Class4167 {
   private static String[] field20430;

   public Class4168(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33431, var1);
      this.method12939(var4);
      this.field20444 = var3;
   }

   public Class4168(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33431, var2);
   }

   @Override
   public void method12894(Class4178 var1, List<Class4178> var2, Random var3) {
      this.method12901((Class4175)var1, var2, var3, 1, 3, false);
   }

   public static Class4168 method12905(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -1, -3, 0, 5, 10, 19, var5);
      return method12904(var9) && Class4178.method12918(var0, var9) == null ? new Class4168(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      this.method12927(var1, var5, 0, 3, 0, 4, 4, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 1, 5, 0, 3, 7, 18, Blocks.AIR.method11579(), Blocks.AIR.method11579(), false);
      this.method12927(var1, var5, 0, 5, 0, 0, 5, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 4, 5, 0, 4, 5, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 2, 0, 4, 2, 5, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 2, 13, 4, 2, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 0, 0, 4, 1, 3, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);
      this.method12927(var1, var5, 0, 0, 15, 4, 1, 18, Blocks.NETHER_BRICKS.method11579(), Blocks.NETHER_BRICKS.method11579(), false);

      for (int var10 = 0; var10 <= 4; var10++) {
         for (int var11 = 0; var11 <= 2; var11++) {
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var10, -1, var11, var5);
            this.method12932(var1, Blocks.NETHER_BRICKS.method11579(), var10, -1, 18 - var11, var5);
         }
      }

      BlockState var13 = Blocks.NETHER_BRICK_FENCE
         .method11579()
         .method23465(Class3239.field18680, Boolean.valueOf(true))
         .method23465(Class3239.field18682, Boolean.valueOf(true));
      BlockState var14 = var13.method23465(Class3239.field18681, Boolean.valueOf(true));
      BlockState var12 = var13.method23465(Class3239.field18683, Boolean.valueOf(true));
      this.method12927(var1, var5, 0, 1, 1, 0, 4, 1, var14, var14, false);
      this.method12927(var1, var5, 0, 3, 4, 0, 4, 4, var14, var14, false);
      this.method12927(var1, var5, 0, 3, 14, 0, 4, 14, var14, var14, false);
      this.method12927(var1, var5, 0, 1, 17, 0, 4, 17, var14, var14, false);
      this.method12927(var1, var5, 4, 1, 1, 4, 4, 1, var12, var12, false);
      this.method12927(var1, var5, 4, 3, 4, 4, 4, 4, var12, var12, false);
      this.method12927(var1, var5, 4, 3, 14, 4, 4, 14, var12, var12, false);
      this.method12927(var1, var5, 4, 1, 17, 4, 4, 17, var12, var12, false);
      return true;
   }
}

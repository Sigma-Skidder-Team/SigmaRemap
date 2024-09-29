package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public class Class4171 extends Class4167 {
   private final int field20433;

   public Class4171(int var1, Random var2, Class9764 var3, Direction var4) {
      super(Class7792.field33430, var1);
      this.method12939(var4);
      this.field20444 = var3;
      this.field20433 = var2.nextInt();
   }

   public Class4171(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33430, var2);
      this.field20433 = var2.getInt("Seed");
   }

   public static Class4171 method12908(List<Class4178> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      Class9764 var9 = Class9764.method38388(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return method12904(var9) && Class4178.method12918(var0, var9) == null ? new Class4171(var6, var1, var9, var5) : null;
   }

   @Override
   public void method12897(CompoundNBT var1) {
      super.method12897(var1);
      var1.putInt("Seed", this.field20433);
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      Random var10 = new Random((long)this.field20433);

      for (int var11 = 0; var11 <= 4; var11++) {
         for (int var12 = 3; var12 <= 4; var12++) {
            int var13 = var10.nextInt(8);
            this.method12927(var1, var5, var11, var12, 0, var11, var12, var13, Blocks.NETHER_BRICKS.getDefaultState(), Blocks.NETHER_BRICKS.getDefaultState(), false);
         }
      }

      int var15 = var10.nextInt(8);
      this.method12927(var1, var5, 0, 5, 0, 0, 5, var15, Blocks.NETHER_BRICKS.getDefaultState(), Blocks.NETHER_BRICKS.getDefaultState(), false);
      var15 = var10.nextInt(8);
      this.method12927(var1, var5, 4, 5, 0, 4, 5, var15, Blocks.NETHER_BRICKS.getDefaultState(), Blocks.NETHER_BRICKS.getDefaultState(), false);

      for (int var17 = 0; var17 <= 4; var17++) {
         int var19 = var10.nextInt(5);
         this.method12927(var1, var5, var17, 2, 0, var17, 2, var19, Blocks.NETHER_BRICKS.getDefaultState(), Blocks.NETHER_BRICKS.getDefaultState(), false);
      }

      for (int var18 = 0; var18 <= 4; var18++) {
         for (int var20 = 0; var20 <= 1; var20++) {
            int var14 = var10.nextInt(3);
            this.method12927(var1, var5, var18, var20, 0, var18, var20, var14, Blocks.NETHER_BRICKS.getDefaultState(), Blocks.NETHER_BRICKS.getDefaultState(), false);
         }
      }

      return true;
   }
}

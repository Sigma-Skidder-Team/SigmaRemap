package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class4179 extends Class4178 {
   private static String[] field20451;

   public Class4179(BlockPos var1) {
      super(Class7792.field33477, 0);
      this.field20444 = new Class9764(var1.getX(), var1.getY(), var1.getZ(), var1.getX(), var1.getY(), var1.getZ());
   }

   public Class4179(Class8761 var1, CompoundNBT var2) {
      super(Class7792.field33477, var2);
   }

   @Override
   public void method12897(CompoundNBT var1) {
   }

   @Override
   public boolean method12896(ISeedReader var1, Class7480 var2, ChunkGenerator var3, Random var4, Class9764 var5, ChunkPos var6, BlockPos var7) {
      int var10 = var1.method6736(Class101.field297, this.field20444.field45678, this.field20444.field45680);
      BlockPos.Mutable var11 = new BlockPos.Mutable(this.field20444.field45678, var10, this.field20444.field45680);

      while (var11.getY() > 0) {
         BlockState var12 = var1.getBlockState(var11);
         BlockState var13 = var1.getBlockState(var11.down());
         if (var13 == Blocks.SANDSTONE.method11579()
            || var13 == Blocks.STONE.method11579()
            || var13 == Blocks.ANDESITE.method11579()
            || var13 == Blocks.GRANITE.method11579()
            || var13 == Blocks.DIORITE.method11579()) {
            BlockState var14 = !var12.isAir() && !this.method12942(var12) ? var12 : Blocks.SAND.method11579();

            for (Direction var18 : Direction.values()) {
               BlockPos var19 = var11.method8349(var18);
               BlockState var20 = var1.getBlockState(var19);
               if (var20.isAir() || this.method12942(var20)) {
                  BlockPos var21 = var19.down();
                  BlockState var22 = var1.getBlockState(var21);
                  if ((var22.isAir() || this.method12942(var22)) && var18 != Direction.field673) {
                     var1.setBlockState(var19, var13, 3);
                  } else {
                     var1.setBlockState(var19, var14, 3);
                  }
               }
            }

            this.field20444 = new Class9764(
               var11.getX(), var11.getY(), var11.getZ(), var11.getX(), var11.getY(), var11.getZ()
            );
            return this.method12935(var1, var5, var4, var11, Class8793.field39565, (BlockState)null);
         }

         var11.method8381(0, -1, 0);
      }

      return false;
   }

   private boolean method12942(BlockState var1) {
      return var1 == Blocks.WATER.method11579() || var1 == Blocks.LAVA.method11579();
   }
}

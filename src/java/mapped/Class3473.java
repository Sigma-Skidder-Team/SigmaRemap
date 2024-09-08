package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Random;

public class Class3473 extends Class3472 implements Class3196 {
   private static String[] field19322;

   public Class3473(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return var1.getBlockState(var2.up()).isAir();
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      BlockPos var7 = var3.up();
      BlockState var8 = Blocks.GRASS.method11579();

      label61:
      for (int var9 = 0; var9 < 128; var9++) {
         BlockPos var10 = var7;

         for (int var11 = 0; var11 < var9 / 16; var11++) {
            var10 = var10.method8336(var2.nextInt(3) - 1, (var2.nextInt(3) - 1) * var2.nextInt(3) / 2, var2.nextInt(3) - 1);
            if (!var1.getBlockState(var10.down()).method23448(this) || var1.getBlockState(var10).method23456(var1, var10)) {
               continue label61;
            }
         }

         BlockState var16 = var1.getBlockState(var10);
         if (var16.method23448(var8.getBlock()) && var2.nextInt(10) == 0) {
            ((Class3196)var8.getBlock()).method11488(var1, var2, var10, var16);
         }

         if (var16.isAir()) {
            BlockState var12;
            if (var2.nextInt(8) != 0) {
               var12 = var8;
            } else {
               List var13 = var1.getBiome(var10).method32507().method24280();
               if (var13.isEmpty()) {
                  continue;
               }

               Class7909 var14 = (Class7909)var13.get(0);
               Class2921 var15 = (Class2921)var14.field33886;
               var12 = var15.method11254(var2, var10, var14.method26519());
            }

            if (var12.method23443(var1, var10)) {
               var1.setBlockState(var10, var12, 3);
            }
         }
      }
   }
}

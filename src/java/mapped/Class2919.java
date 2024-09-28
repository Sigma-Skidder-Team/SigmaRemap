package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2919 extends Class2898<Class4712> {
   public Class2919(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      if (var4.getY() > var1.method6776() - 1) {
         return false;
      } else if (!var1.getBlockState(var4).isIn(Blocks.WATER) && !var1.getBlockState(var4.down()).isIn(Blocks.WATER)) {
         return false;
      } else {
         boolean var8 = false;

         for (Direction var12 : Direction.values()) {
            if (var12 != Direction.DOWN && var1.getBlockState(var4.offset(var12)).isIn(Blocks.PACKED_ICE)) {
               var8 = true;
               break;
            }
         }

         if (!var8) {
            return false;
         } else {
            var1.setBlockState(var4, Blocks.field37006.getDefaultState(), 2);

            for (int var19 = 0; var19 < 200; var19++) {
               int var20 = var3.nextInt(5) - var3.nextInt(6);
               int var21 = 3;
               if (var20 < 2) {
                  var21 += var20 / 2;
               }

               if (var21 >= 1) {
                  BlockPos var22 = var4.method8336(var3.nextInt(var21) - var3.nextInt(var21), var20, var3.nextInt(var21) - var3.nextInt(var21));
                  BlockState var13 = var1.getBlockState(var22);
                  if (var13.getMaterial() == Material.field38932
                     || var13.isIn(Blocks.WATER)
                     || var13.isIn(Blocks.PACKED_ICE)
                     || var13.isIn(Blocks.ICE)) {
                     for (Direction var17 : Direction.values()) {
                        BlockState var18 = var1.getBlockState(var22.offset(var17));
                        if (var18.isIn(Blocks.field37006)) {
                           var1.setBlockState(var22, Blocks.field37006.getDefaultState(), 2);
                           break;
                        }
                     }
                  }
               }
            }

            return true;
         }
      }
   }
}

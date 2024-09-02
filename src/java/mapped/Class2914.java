package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public abstract class Class2914 extends Class2898<Class4712> {
   public Class2914(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      BlockState var8 = BlockTags.field32783.method24919(var3).method11579();
      return this.method11249(var1, var3, var4, var8);
   }

   public abstract boolean method11249(Class1660 var1, Random var2, BlockPos var3, BlockState var4);

   public boolean method11250(Class1660 var1, Random var2, BlockPos var3, BlockState var4) {
      BlockPos var7 = var3.up();
      BlockState var8 = var1.getBlockState(var3);
      if ((var8.method23448(Blocks.WATER) || var8.method23446(BlockTags.field32786)) && var1.getBlockState(var7).method23448(Blocks.WATER)) {
         var1.setBlockState(var3, var4, 3);
         if (!(var2.nextFloat() < 0.25F)) {
            if (var2.nextFloat() < 0.05F) {
               var1.setBlockState(var7, Blocks.field37005.method11579().method23465(Class3195.field18472, Integer.valueOf(var2.nextInt(4) + 1)), 2);
            }
         } else {
            var1.setBlockState(var7, BlockTags.field32786.method24919(var2).method11579(), 2);
         }

         for (Direction var10 : Class76.field161) {
            if (var2.nextFloat() < 0.2F) {
               BlockPos var11 = var3.method8349(var10);
               if (var1.getBlockState(var11).method23448(Blocks.WATER)) {
                  BlockState var12 = BlockTags.field32784.method24919(var2).method11579().method23465(Class3229.field18669, var10);
                  var1.setBlockState(var11, var12, 2);
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}

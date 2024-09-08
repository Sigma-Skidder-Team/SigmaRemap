package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import javax.annotation.Nullable;
import java.util.Random;

public class Class2935 extends Class2898<Class4708> {
   private static final ImmutableList<Block> field18005 = ImmutableList.of(
      Blocks.LAVA,
      Blocks.BEDROCK,
      Blocks.field36890,
      Blocks.SOUL_SAND,
      Blocks.NETHER_BRICKS,
      Blocks.NETHER_BRICK_FENCE,
      Blocks.NETHER_BRICK_STAIRS,
      Blocks.NETHER_WART,
      Blocks.CHEST,
      Blocks.field36532
   );

   public Class2935(Codec<Class4708> var1) {
      super(var1);
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4708 var5) {
      int var8 = var2.method17807();
      if (method11274(var1, var8, var4.method8354())) {
         int var9 = var5.method14783().method27633(var3);
         boolean var10 = var3.nextFloat() < 0.9F;
         int var11 = Math.min(var9, !var10 ? 8 : 5);
         int var12 = !var10 ? 15 : 50;
         boolean var13 = false;

         for (BlockPos var15 : BlockPos.method8355(
            var3,
            var12,
            var4.getX() - var11,
            var4.getY(),
            var4.getZ() - var11,
            var4.getX() + var11,
            var4.getY(),
            var4.getZ() + var11
         )) {
            int var16 = var9 - var15.method8321(var4);
            if (var16 >= 0) {
               var13 |= this.method11272(var1, var8, var15, var16, var5.method14782().method27633(var3));
            }
         }

         return var13;
      } else {
         return false;
      }
   }

   private boolean method11272(Class1660 var1, int var2, BlockPos var3, int var4, int var5) {
      boolean var8 = false;

      for (BlockPos var10 : BlockPos.method8364(
         var3.getX() - var5, var3.getY(), var3.getZ() - var5, var3.getX() + var5, var3.getY(), var3.getZ() + var5
      )) {
         int var11 = var10.method8321(var3);
         BlockPos var12 = !method11276(var1, var2, var10) ? method11275(var1, var10.method8354(), var11) : method11273(var1, var2, var10.method8354(), var11);
         if (var12 != null) {
            int var13 = var4 - var11 / 2;

            for (BlockPos.Mutable var14 = var12.method8354(); var13 >= 0; var13--) {
               if (!method11276(var1, var2, var14)) {
                  if (!var1.getBlockState(var14).method23448(Blocks.BASALT)) {
                     break;
                  }

                  var14.method8379(Direction.field673);
               } else {
                  this.method11217(var1, var14, Blocks.BASALT.method11579());
                  var14.method8379(Direction.field673);
                  var8 = true;
               }
            }
         }
      }

      return var8;
   }

   @Nullable
   private static BlockPos method11273(Class1660 var0, int var1, BlockPos.Mutable var2, int var3) {
      while (var2.getY() > 1 && var3 > 0) {
         var3--;
         if (method11274(var0, var1, var2)) {
            return var2;
         }

         var2.method8379(Direction.DOWN);
      }

      return null;
   }

   private static boolean method11274(Class1660 var0, int var1, BlockPos.Mutable var2) {
      if (!method11276(var0, var1, var2)) {
         return false;
      } else {
         BlockState var5 = var0.getBlockState(var2.method8379(Direction.DOWN));
         var2.method8379(Direction.field673);
         return !var5.isAir() && !field18005.contains(var5.getBlock());
      }
   }

   @Nullable
   private static BlockPos method11275(Class1660 var0, BlockPos.Mutable var1, int var2) {
      while (var1.getY() < var0.method7034() && var2 > 0) {
         var2--;
         BlockState var5 = var0.getBlockState(var1);
         if (!field18005.contains(var5.getBlock())) {
            if (!var5.isAir()) {
               var1.method8379(Direction.field673);
               continue;
            }

            return var1;
         }

         return null;
      }

      return null;
   }

   private static boolean method11276(Class1660 var0, int var1, BlockPos var2) {
      BlockState var5 = var0.getBlockState(var2);
      return var5.isAir() || var5.method23448(Blocks.LAVA) && var2.getY() <= var1;
   }
}

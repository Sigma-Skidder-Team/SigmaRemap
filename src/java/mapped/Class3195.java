package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3195 extends Class3194 implements Class3196, Class3207 {
   private static String[] field18471;
   public static final Class8554 field18472 = Class8820.field39758;
   public static final Class8551 field18473 = Class8820.field39710;
   public static final VoxelShape field18474 = Block.method11539(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
   public static final VoxelShape field18475 = Block.method11539(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
   public static final VoxelShape field18476 = Block.method11539(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
   public static final VoxelShape field18477 = Block.method11539(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

   public Class3195(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18472, Integer.valueOf(1)).method23465(field18473, Boolean.valueOf(true)));
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = var1.method18360().getBlockState(var1.method18345());
      if (!var4.isIn(this)) {
         FluidState var5 = var1.method18360().getFluidState(var1.method18345());
         boolean var6 = var5.method23472() == Class9479.field44066;
         return super.method11495(var1).method23465(field18473, Boolean.valueOf(var6));
      } else {
         return var4.method23465(field18472, Integer.valueOf(Math.min(4, var4.<Integer>method23463(field18472) + 1)));
      }
   }

   public static boolean method11496(BlockState var0) {
      return !var0.<Boolean>method23463(field18473);
   }

   @Override
   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return !var1.method23414(var2, var3).method19526(Direction.field673).method19516() || var1.method23454(var2, var3, Direction.field673);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.down();
      return this.method11490(var2.getBlockState(var6), var2, var6);
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.method23443(var4, var5)) {
         if (var1.<Boolean>method23463(field18473)) {
            var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
         }

         return super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         return Blocks.AIR.method11579();
      }
   }

   @Override
   public boolean method11497(BlockState var1, Class5909 var2) {
      return var2.method18357().getItem() == this.method11581() && var1.<Integer>method23463(field18472) < 4 ? true : super.method11497(var1, var2);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      switch (var1.<Integer>method23463(field18472)) {
         case 1:
         default:
            return field18474;
         case 2:
            return field18475;
         case 3:
            return field18476;
         case 4:
            return field18477;
      }
   }

   @Override
   public FluidState method11498(BlockState var1) {
      return !var1.<Boolean>method23463(field18473) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18472, field18473);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      if (!method11496(var4) && var1.getBlockState(var3.down()).method23446(BlockTags.field32783)) {
         byte var7 = 5;
         byte var8 = 1;
         byte var9 = 2;
         int var10 = 0;
         int var11 = var3.getX() - 2;
         int var12 = 0;

         for (int var13 = 0; var13 < 5; var13++) {
            for (int var14 = 0; var14 < var8; var14++) {
               int var15 = 2 + var3.getY() - 1;

               for (int var16 = var15 - 2; var16 < var15; var16++) {
                  BlockPos var17 = new BlockPos(var11 + var13, var16, var3.getZ() - var12 + var14);
                  if (var17 != var3 && var2.nextInt(6) == 0 && var1.getBlockState(var17).isIn(Blocks.WATER)) {
                     BlockState var18 = var1.getBlockState(var17.down());
                     if (var18.method23446(BlockTags.field32783)) {
                        var1.setBlockState(var17, Blocks.field37005.method11579().method23465(field18472, Integer.valueOf(var2.nextInt(4) + 1)), 3);
                     }
                  }
               }
            }

            if (var10 >= 2) {
               var8 -= 2;
               var12--;
            } else {
               var8 += 2;
               var12++;
            }

            var10++;
         }

         var1.setBlockState(var3, var4.method23465(field18472, Integer.valueOf(4)), 2);
      }
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}

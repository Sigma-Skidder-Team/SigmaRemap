package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class Class3455 extends Class3456 implements Class3449 {
   private static String[] field19273;
   public static final Class8552<Class84> field19274 = Class3456.field19276;
   public static final VoxelShape field19275 = Block.method11539(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public Class3455(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19275;
   }

   @Override
   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23454(var2, var3, Direction.field673) && !var1.isIn(Blocks.field36890);
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(Blocks.SEAGRASS);
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = super.method11495(var1);
      if (var4 != null) {
         FluidState var5 = var1.method18360().getFluidState(var1.method18345().up());
         if (var5.method23486(FluidTags.field40469) && var5.method23477() == 8) {
            return var4;
         }
      }

      return null;
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      if (var1.<Class84>method23463(field19274) != Class84.field209) {
         FluidState var7 = var2.getFluidState(var3);
         return super.method11492(var1, var2, var3) && var7.method23486(FluidTags.field40469) && var7.method23477() == 8;
      } else {
         BlockState var6 = var2.getBlockState(var3.down());
         return var6.isIn(this) && var6.<Class84>method23463(field19274) == Class84.field210;
      }
   }

   @Override
   public FluidState method11498(BlockState var1) {
      return Class9479.field44066.method25078(false);
   }

   @Override
   public boolean method11531(IBlockReader var1, BlockPos var2, BlockState var3, Fluid var4) {
      return false;
   }

   @Override
   public boolean method11532(Class1660 var1, BlockPos var2, BlockState var3, FluidState var4) {
      return false;
   }
}

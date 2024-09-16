package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3450 extends Class3194 implements Class3196, Class3449 {
   private static String[] field18470;
   public static final VoxelShape field19264 = Block.method11539(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   public Class3450(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19264;
   }

   @Override
   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.method23454(var2, var3, Direction.field673) && !var1.isIn(Blocks.field36890);
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      FluidState var4 = var1.method18360().getFluidState(var1.method18345());
      return var4.method23486(FluidTags.field40469) && var4.method23477() == 8 ? super.method11495(var1) : null;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      BlockState var9 = super.method11491(var1, var2, var3, var4, var5, var6);
      if (!var9.isAir()) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return var9;
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
   public FluidState method11498(BlockState var1) {
      return Class9479.field44066.method25078(false);
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      BlockState var7 = Blocks.TALL_SEAGRASS.method11579();
      BlockState var8 = var7.method23465(Class3455.field19274, Class84.field209);
      BlockPos var9 = var3.up();
      if (var1.getBlockState(var9).isIn(Blocks.WATER)) {
         var1.setBlockState(var3, var7, 2);
         var1.setBlockState(var9, var8, 2);
      }
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

package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3221 extends Block {
   private static String[] field18643;
   public static final IntegerProperty field18644 = BlockStateProperties.field39756;
   public static final VoxelShape field18645 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);

   public Class3221(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(field18644, Integer.valueOf(0)));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.UP && !var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.up());
      return !var6.getMaterial().isSolid() || var6.getBlock() instanceof FenceGateBlock || var6.getBlock() instanceof Class3356;
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23443(var1.method18360(), var1.method18345()) ? super.method11495(var1) : Blocks.field36396.method11579();
   }

   @Override
   public boolean method11534(BlockState var1) {
      return true;
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18645;
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         method11610(var1, var2, var3);
      }
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>get(field18644);
      if (!method11612(var2, var3) && !var2.isRainingAt(var3.up())) {
         if (var7 <= 0) {
            if (!method11611(var2, var3)) {
               method11610(var1, var2, var3);
            }
         } else {
            var2.setBlockState(var3, var1.with(field18644, Integer.valueOf(var7 - 1)), 2);
         }
      } else if (var7 < 7) {
         var2.setBlockState(var3, var1.with(field18644, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void onFallenUpon(World var1, BlockPos var2, Entity var3, float var4) {
      if (!var1.isRemote
         && var1.rand.nextFloat() < var4 - 0.5F
         && var3 instanceof LivingEntity
         && (var3 instanceof PlayerEntity || var1.getGameRules().getBoolean(Class5462.field24224))
         && var3.getWidth() * var3.getWidth() * var3.getHeight() > 0.512F) {
         method11610(var1.getBlockState(var2), var1, var2);
      }

      super.onFallenUpon(var1, var2, var3, var4);
   }

   public static void method11610(BlockState var0, World var1, BlockPos var2) {
      var1.setBlockState(var2, method11538(var0, Blocks.field36396.method11579(), var1, var2));
   }

   private static boolean method11611(IBlockReader var0, BlockPos var1) {
      Block var4 = var0.getBlockState(var1.up()).getBlock();
      return var4 instanceof Class3480 || var4 instanceof Class3486 || var4 instanceof Class3493;
   }

   private static boolean method11612(IWorldReader var0, BlockPos var1) {
      for (BlockPos var5 : BlockPos.method8359(var1.method8336(-4, 0, -4), var1.method8336(4, 1, 4))) {
         if (var0.getFluidState(var5).method23486(FluidTags.field40469)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18644);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}

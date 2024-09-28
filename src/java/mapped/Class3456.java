package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class3456 extends Class3194 {
   private static String[] field18470;
   public static final EnumProperty<DoubleBlockHalf> field19276 = BlockStateProperties.DOUBLE_BLOCK_HALF;

   public Class3456(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19276, DoubleBlockHalf.field210));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      DoubleBlockHalf var9 = var1.<DoubleBlockHalf>get(field19276);
      if (var2.getAxis() != Direction.Axis.Y
         || var9 == DoubleBlockHalf.field210 != (var2 == Direction.UP)
         || var3.isIn(this) && var3.<DoubleBlockHalf>get(field19276) != var9) {
         return var9 == DoubleBlockHalf.field210 && var2 == Direction.DOWN && !var1.method23443(var4, var5)
            ? Blocks.AIR.getDefaultState()
            : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
      } else {
         return Blocks.AIR.getDefaultState();
      }
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockPos var4 = var1.getPos();
      return var4.getY() < 255 && var1.getWorld().getBlockState(var4.up()).method23441(var1) ? super.getStateForPlacement(var1) : null;
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      var1.setBlockState(var2.up(), this.getDefaultState().with(field19276, DoubleBlockHalf.field209), 3);
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      if (var1.<DoubleBlockHalf>get(field19276) != DoubleBlockHalf.field209) {
         return super.method11492(var1, var2, var3);
      } else {
         BlockState var6 = var2.getBlockState(var3.down());
         return var6.isIn(this) && var6.<DoubleBlockHalf>get(field19276) == DoubleBlockHalf.field210;
      }
   }

   public void method12129(IWorld var1, BlockPos var2, int var3) {
      var1.setBlockState(var2, this.getDefaultState().with(field19276, DoubleBlockHalf.field210), var3);
      var1.setBlockState(var2.up(), this.getDefaultState().with(field19276, DoubleBlockHalf.field209), var3);
   }

   @Override
   public void onBlockHarvested(World var1, BlockPos var2, BlockState var3, PlayerEntity var4) {
      if (!var1.isRemote) {
         if (!var4.isCreative()) {
            spawnDrops(var3, var1, var2, (TileEntity)null, var4, var4.getHeldItemMainhand());
         } else {
            method12130(var1, var2, var3, var4);
         }
      }

      super.onBlockHarvested(var1, var2, var3, var4);
   }

   @Override
   public void method11562(World var1, PlayerEntity var2, BlockPos var3, BlockState var4, TileEntity var5, ItemStack var6) {
      super.method11562(var1, var2, var3, Blocks.AIR.getDefaultState(), var5, var6);
   }

   public static void method12130(World var0, BlockPos var1, BlockState var2, PlayerEntity var3) {
      DoubleBlockHalf var6 = var2.<DoubleBlockHalf>get(field19276);
      if (var6 == DoubleBlockHalf.field209) {
         BlockPos var7 = var1.down();
         BlockState var8 = var0.getBlockState(var7);
         if (var8.getBlock() == var2.getBlock() && var8.<DoubleBlockHalf>get(field19276) == DoubleBlockHalf.field210) {
            var0.setBlockState(var7, Blocks.AIR.getDefaultState(), 35);
            var0.method6869(var3, 2001, var7, Block.getStateId(var8));
         }
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19276);
   }

   @Override
   public Class2260 method11994() {
      return Class2260.field14703;
   }

   @Override
   public long method11691(BlockState var1, BlockPos var2) {
      return MathHelper.method37810(var2.getX(), var2.method8340(var1.get(field19276) != DoubleBlockHalf.field210 ? 1 : 0).getY(), var2.getZ());
   }
}

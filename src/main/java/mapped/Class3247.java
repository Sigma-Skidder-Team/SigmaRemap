package mapped;

import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public abstract class Class3247 extends HorizontalBlock {
   public static final VoxelShape field18707 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final BooleanProperty field18708 = BlockStateProperties.POWERED;

   public Class3247(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18707;
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return method11547(var2, var3.down());
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (!this.method11667(var2, var3, var1)) {
         boolean var7 = var1.<Boolean>get(field18708);
         boolean var8 = this.method11661(var2, var3, var1);
         if (var7 && !var8) {
            var2.setBlockState(var3, var1.with(field18708, Boolean.valueOf(false)), 2);
         } else if (!var7) {
            var2.setBlockState(var3, var1.with(field18708, Boolean.valueOf(true)), 2);
            if (!var8) {
               var2.getBlockTickScheduler().method20719(var3, this, this.method11658(var1), Class2199.field14368);
            }
         }
      }
   }

   @Override
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var1.method23402(var2, var3, var4);
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      if (var1.<Boolean>get(field18708)) {
         return var1.get(HORIZONTAL_FACING) != var4 ? 0 : this.method11659(var2, var3, var1);
      } else {
         return 0;
      }
   }

   @Override
   public void method11506(BlockState var1, World var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var1.isValidPosition(var2, var3)) {
         TileEntity var9 = !this.isTileEntityProvider() ? null : var2.getTileEntity(var3);
         method11555(var1, var2, var3, var9);
         var2.removeBlock(var3, false);

         for (Direction var13 : Direction.values()) {
            var2.notifyNeighborsOfStateChange(var3.offset(var13), this);
         }
      } else {
         this.method11664(var2, var3, var1);
      }
   }

   public void method11664(World var1, BlockPos var2, BlockState var3) {
      if (!this.method11667(var1, var2, var3)) {
         boolean var6 = var3.<Boolean>get(field18708);
         boolean var7 = this.method11661(var1, var2, var3);
         if (var6 != var7 && !var1.getBlockTickScheduler().method20720(var2, this)) {
            Class2199 var8 = Class2199.field14369;
            if (!this.method11673(var1, var2, var3)) {
               if (var6) {
                  var8 = Class2199.field14368;
               }
            } else {
               var8 = Class2199.field14367;
            }

            var1.getBlockTickScheduler().method20719(var2, this, this.method11658(var3), var8);
         }
      }
   }

   public boolean method11667(IWorldReader var1, BlockPos var2, BlockState var3) {
      return false;
   }

   public boolean method11661(World var1, BlockPos var2, BlockState var3) {
      return this.method11662(var1, var2, var3) > 0;
   }

   public int method11662(World var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>get(HORIZONTAL_FACING);
      BlockPos var7 = var2.offset(var6);
      int var8 = var1.method6779(var7, var6);
      if (var8 < 15) {
         BlockState var9 = var1.getBlockState(var7);
         return Math.max(var8, !var9.isIn(Blocks.REDSTONE_WIRE) ? 0 : var9.<Integer>get(RedstoneWireBlock.field18651));
      } else {
         return var8;
      }
   }

   public int method11668(IWorldReader var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>get(HORIZONTAL_FACING);
      Direction var7 = var6.rotateY();
      Direction var8 = var6.rotateYCCW();
      return Math.max(this.method11669(var1, var2.offset(var7), var7), this.method11669(var1, var2.offset(var8), var8));
   }

   public int method11669(IWorldReader var1, BlockPos var2, Direction var3) {
      BlockState var6 = var1.getBlockState(var2);
      if (!this.method11671(var6)) {
         return 0;
      } else if (!var6.isIn(Blocks.REDSTONE_BLOCK)) {
         return !var6.isIn(Blocks.REDSTONE_WIRE) ? var1.method7010(var2, var3) : var6.<Integer>get(RedstoneWireBlock.field18651);
      } else {
         return 15;
      }
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState().with(HORIZONTAL_FACING, var1.getPlacementHorizontalFacing().getOpposite());
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      if (this.method11661(var1, var2, var3)) {
         var1.getBlockTickScheduler().scheduleTick(var2, this, 1);
      }
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      this.method11670(var2, var3, var1);
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.isIn(var4.getBlock())) {
         super.onReplaced(var1, var2, var3, var4, var5);
         this.method11670(var2, var3, var1);
      }
   }

   public void method11670(World var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>get(HORIZONTAL_FACING);
      BlockPos var7 = var2.offset(var6.getOpposite());
      var1.neighborChanged(var7, this, var2);
      var1.notifyNeighborsOfStateExcept(var7, this, var6);
   }

   public boolean method11671(BlockState var1) {
      return var1.method23401();
   }

   public int method11659(IBlockReader var1, BlockPos var2, BlockState var3) {
      return 15;
   }

   public static boolean method11672(BlockState var0) {
      return var0.getBlock() instanceof Class3247;
   }

   public boolean method11673(IBlockReader var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>get(HORIZONTAL_FACING).getOpposite();
      BlockState var7 = var1.getBlockState(var2.offset(var6));
      return method11672(var7) && var7.<Direction>get(HORIZONTAL_FACING) != var6;
   }

   public abstract int method11658(BlockState var1);
}

package net.minecraft.block;

import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.List;
import java.util.Random;

public abstract class AbstractButtonBlock extends Class3200 {
   public static final BooleanProperty field18510 = BlockStateProperties.POWERED;
   public static final VoxelShape field18511 = Block.makeCuboidShape(6.0, 14.0, 5.0, 10.0, 16.0, 11.0);
   public static final VoxelShape field18512 = Block.makeCuboidShape(5.0, 14.0, 6.0, 11.0, 16.0, 10.0);
   public static final VoxelShape field18513 = Block.makeCuboidShape(6.0, 0.0, 5.0, 10.0, 2.0, 11.0);
   public static final VoxelShape field18514 = Block.makeCuboidShape(5.0, 0.0, 6.0, 11.0, 2.0, 10.0);
   public static final VoxelShape field18515 = Block.makeCuboidShape(5.0, 6.0, 14.0, 11.0, 10.0, 16.0);
   public static final VoxelShape field18516 = Block.makeCuboidShape(5.0, 6.0, 0.0, 11.0, 10.0, 2.0);
   public static final VoxelShape field18517 = Block.makeCuboidShape(14.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   public static final VoxelShape field18518 = Block.makeCuboidShape(0.0, 6.0, 5.0, 2.0, 10.0, 11.0);
   public static final VoxelShape field18519 = Block.makeCuboidShape(6.0, 15.0, 5.0, 10.0, 16.0, 11.0);
   public static final VoxelShape field18520 = Block.makeCuboidShape(5.0, 15.0, 6.0, 11.0, 16.0, 10.0);
   public static final VoxelShape field18521 = Block.makeCuboidShape(6.0, 0.0, 5.0, 10.0, 1.0, 11.0);
   public static final VoxelShape field18522 = Block.makeCuboidShape(5.0, 0.0, 6.0, 11.0, 1.0, 10.0);
   public static final VoxelShape field18523 = Block.makeCuboidShape(5.0, 6.0, 15.0, 11.0, 10.0, 16.0);
   public static final VoxelShape field18524 = Block.makeCuboidShape(5.0, 6.0, 0.0, 11.0, 10.0, 1.0);
   public static final VoxelShape field18525 = Block.makeCuboidShape(15.0, 6.0, 5.0, 16.0, 10.0, 11.0);
   public static final VoxelShape field18526 = Block.makeCuboidShape(0.0, 6.0, 5.0, 1.0, 10.0, 11.0);
   private final boolean field18527;

   public AbstractButtonBlock(boolean var1, Properties var2) {
      super(var2);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(HORIZONTAL_FACING, Direction.NORTH)
            .with(field18510, Boolean.valueOf(false))
            .with(field18500, AttachFace.field314)
      );
      this.field18527 = var1;
   }

   private int method11518() {
      return !this.field18527 ? 20 : 30;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      Direction var7 = var1.<Direction>get(HORIZONTAL_FACING);
      boolean var8 = var1.<Boolean>get(field18510);
      switch (Class6392.field27980[var1.<AttachFace>get(field18500).ordinal()]) {
         case 1:
            if (var7.getAxis() == Direction.Axis.X) {
               return var8 ? field18521 : field18513;
            }

            return var8 ? field18522 : field18514;
         case 2:
            switch (Class6392.field27979[var7.ordinal()]) {
               case 1:
                  return var8 ? field18526 : field18518;
               case 2:
                  return var8 ? field18525 : field18517;
               case 3:
                  return var8 ? field18524 : field18516;
               case 4:
               default:
                  return var8 ? field18523 : field18515;
            }
         case 3:
         default:
            if (var7.getAxis() == Direction.Axis.X) {
               return var8 ? field18519 : field18511;
            } else {
               return var8 ? field18520 : field18512;
            }
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var1.<Boolean>get(field18510)) {
         this.method11519(var1, var2, var3);
         this.method11520(var4, var2, var3, true);
         return ActionResultType.method9002(var2.isRemote);
      } else {
         return ActionResultType.field14819;
      }
   }

   public void method11519(BlockState var1, World var2, BlockPos var3) {
      var2.setBlockState(var3, var1.with(field18510, Boolean.valueOf(true)), 3);
      this.method11525(var1, var2, var3);
      var2.getBlockTickScheduler().scheduleTick(var3, this, this.method11518());
   }

   public void method11520(PlayerEntity var1, IWorld var2, BlockPos var3, boolean var4) {
      var2.playSound(!var4 ? null : var1, var3, this.getSoundEvent(var4), SoundCategory.field14732, 0.3F, !var4 ? 0.5F : 0.6F);
   }

   public abstract SoundEvent getSoundEvent(boolean var1);

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.isIn(var4.getBlock())) {
         if (var1.<Boolean>get(field18510)) {
            this.method11525(var1, var2, var3);
         }

         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>get(field18510) ? 0 : 15;
   }

   @Override
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>get(field18510) && method11509(var1) == var4 ? 15 : 0;
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>get(field18510)) {
         if (!this.field18527) {
            var2.setBlockState(var3, var1.with(field18510, Boolean.valueOf(false)), 3);
            this.method11525(var1, var2, var3);
            this.method11520((PlayerEntity)null, var2, var3, false);
         } else {
            this.method11524(var1, var2, var3);
         }
      }
   }

   @Override
   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.isRemote && this.field18527 && !var1.<Boolean>get(field18510)) {
         this.method11524(var1, var2, var3);
      }
   }

   private void method11524(BlockState var1, World var2, BlockPos var3) {
      List var6 = var2.<AbstractArrowEntity>getEntitiesWithinAABB(AbstractArrowEntity.class, var1.getShape(var2, var3).getBoundingBox().offset(var3));
      boolean var7 = !var6.isEmpty();
      boolean var8 = var1.<Boolean>get(field18510);
      if (var7 != var8) {
         var2.setBlockState(var3, var1.with(field18510, Boolean.valueOf(var7)), 3);
         this.method11525(var1, var2, var3);
         this.method11520((PlayerEntity)null, var2, var3, var7);
      }

      if (var7) {
         var2.getBlockTickScheduler().scheduleTick(new BlockPos(var3), this, this.method11518());
      }
   }

   private void method11525(BlockState var1, World var2, BlockPos var3) {
      var2.notifyNeighborsOfStateChange(var3, this);
      var2.notifyNeighborsOfStateChange(var3.offset(method11509(var1).getOpposite()), this);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(HORIZONTAL_FACING, field18510, field18500);
   }
}

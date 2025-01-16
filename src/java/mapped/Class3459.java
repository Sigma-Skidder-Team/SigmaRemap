package mapped;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import com.google.common.base.MoreObjects;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3459 extends Block {
   private static String[] field19280;
   public static final DirectionProperty field19281 = HorizontalBlock.HORIZONTAL_FACING;
   public static final BooleanProperty field19282 = BlockStateProperties.POWERED;
   public static final BooleanProperty field19283 = BlockStateProperties.ATTACHED;
   public static final VoxelShape field19284 = Block.makeCuboidShape(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
   public static final VoxelShape field19285 = Block.makeCuboidShape(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
   public static final VoxelShape field19286 = Block.makeCuboidShape(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
   public static final VoxelShape field19287 = Block.makeCuboidShape(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

   public Class3459(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(field19281, Direction.NORTH)
            .with(field19282, Boolean.valueOf(false))
            .with(field19283, Boolean.valueOf(false))
      );
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      switch (Class7594.field32602[var1.<Direction>get(field19281).ordinal()]) {
         case 1:
         default:
            return field19287;
         case 2:
            return field19286;
         case 3:
            return field19285;
         case 4:
            return field19284;
      }
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      Direction var6 = var1.<Direction>get(field19281);
      BlockPos var7 = var3.offset(var6.getOpposite());
      BlockState var8 = var2.getBlockState(var7);
      return var6.getAxis().isHorizontal() && var8.method23454(var2, var7, var6);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var2.getOpposite() == var1.get(field19281) && !var1.isValidPosition(var4, var5)
         ? Blocks.AIR.getDefaultState()
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = this.getDefaultState().with(field19282, Boolean.valueOf(false)).with(field19283, Boolean.valueOf(false));
      World var5 = var1.getWorld();
      BlockPos var6 = var1.getPos();
      Direction[] var7 = var1.method18349();

      for (Direction var11 : var7) {
         if (var11.getAxis().isHorizontal()) {
            Direction var12 = var11.getOpposite();
            var4 = var4.with(field19281, var12);
            if (var4.isValidPosition(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      this.method12134(var1, var2, var3, false, false, -1, (BlockState)null);
   }

   public void method12134(World var1, BlockPos var2, BlockState var3, boolean var4, boolean var5, int var6, BlockState var7) {
      Direction var10 = var3.<Direction>get(field19281);
      boolean var11 = var3.<Boolean>get(field19283);
      boolean var12 = var3.<Boolean>get(field19282);
      boolean var13 = !var4;
      boolean var14 = false;
      int var15 = 0;
      BlockState[] var16 = new BlockState[42];

      for (int var17 = 1; var17 < 42; var17++) {
         BlockPos var18 = var2.method8350(var10, var17);
         BlockState var19 = var1.getBlockState(var18);
         if (var19.isIn(Blocks.TRIPWIRE_HOOK)) {
            if (var19.<Direction>get(field19281) == var10.getOpposite()) {
               var15 = var17;
            }
            break;
         }

         if (!var19.isIn(Blocks.TRIPWIRE) && var17 != var6) {
            var16[var17] = null;
            var13 = false;
         } else {
            if (var17 == var6) {
               var19 = (BlockState)MoreObjects.firstNonNull(var7, var19);
            }

            boolean var20 = !var19.<Boolean>get(Class3425.field19165);
            boolean var21 = var19.<Boolean>get(Class3425.field19163);
            var14 |= var20 && var21;
            var16[var17] = var19;
            if (var17 == var6) {
               var1.getBlockTickScheduler().scheduleTick(var2, this, 10);
               var13 &= var20;
            }
         }
      }

      var13 &= var15 > 1;
      var14 &= var13;
      BlockState var24 = this.getDefaultState().with(field19283, Boolean.valueOf(var13)).with(field19282, Boolean.valueOf(var14));
      if (var15 > 0) {
         BlockPos var25 = var2.method8350(var10, var15);
         Direction var27 = var10.getOpposite();
         var1.setBlockState(var25, var24.with(field19281, var27), 3);
         this.method12136(var1, var25, var27);
         this.method12135(var1, var25, var13, var14, var11, var12);
      }

      this.method12135(var1, var2, var13, var14, var11, var12);
      if (!var4) {
         var1.setBlockState(var2, var24.with(field19281, var10), 3);
         if (var5) {
            this.method12136(var1, var2, var10);
         }
      }

      if (var11 != var13) {
         for (int var26 = 1; var26 < var15; var26++) {
            BlockPos var28 = var2.method8350(var10, var26);
            BlockState var29 = var16[var26];
            if (var29 != null) {
               var1.setBlockState(var28, var29.with(field19283, Boolean.valueOf(var13)), 3);
               if (var1.getBlockState(var28).isAir()) {
               }
            }
         }
      }
   }

   @Override
   public void tick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      this.method12134(var2, var3, var1, false, true, -1, (BlockState)null);
   }

   private void method12135(World var1, BlockPos var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      if (var4 && !var6) {
         var1.playSound((PlayerEntity)null, var2, SoundEvents.field27158, SoundCategory.field14732, 0.4F, 0.6F);
      } else if (!var4 && var6) {
         var1.playSound((PlayerEntity)null, var2, SoundEvents.field27157, SoundCategory.field14732, 0.4F, 0.5F);
      } else if (var3 && !var5) {
         var1.playSound((PlayerEntity)null, var2, SoundEvents.field27156, SoundCategory.field14732, 0.4F, 0.7F);
      } else if (!var3 && var5) {
         var1.playSound((PlayerEntity)null, var2, SoundEvents.field27159, SoundCategory.field14732, 0.4F, 1.2F / (var1.rand.nextFloat() * 0.2F + 0.9F));
      }
   }

   private void method12136(World var1, BlockPos var2, Direction var3) {
      var1.notifyNeighborsOfStateChange(var2, this);
      var1.notifyNeighborsOfStateChange(var2.offset(var3.getOpposite()), this);
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.isIn(var4.getBlock())) {
         boolean var8 = var1.<Boolean>get(field19283);
         boolean var9 = var1.<Boolean>get(field19282);
         if (var8 || var9) {
            this.method12134(var2, var3, var1, true, false, -1, (BlockState)null);
         }

         if (var9) {
            var2.notifyNeighborsOfStateChange(var3, this);
            var2.notifyNeighborsOfStateChange(var3.offset(var1.<Direction>get(field19281).getOpposite()), this);
         }

         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>get(field19282) ? 0 : 15;
   }

   @Override
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      if (var1.<Boolean>get(field19282)) {
         return var1.get(field19281) != var4 ? 0 : 15;
      } else {
         return 0;
      }
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field19281, var2.rotate(var1.<Direction>get(field19281)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field19281)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19281, field19282, field19283);
   }
}

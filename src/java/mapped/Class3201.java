package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class Class3201 extends Class3200 {
   private static String[] field18499;
   public static final BooleanProperty field18501 = BlockStateProperties.POWERED;
   public static final VoxelShape field18502 = Block.makeCuboidShape(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   public static final VoxelShape field18503 = Block.makeCuboidShape(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   public static final VoxelShape field18504 = Block.makeCuboidShape(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   public static final VoxelShape field18505 = Block.makeCuboidShape(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   public static final VoxelShape field18506 = Block.makeCuboidShape(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   public static final VoxelShape field18507 = Block.makeCuboidShape(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   public static final VoxelShape field18508 = Block.makeCuboidShape(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   public static final VoxelShape field18509 = Block.makeCuboidShape(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   public Class3201(Properties var1) {
      super(var1);
      this.setDefaultState(
         this.stateContainer
            .getBaseState()
            .with(HORIZONTAL_FACING, Direction.NORTH)
            .with(field18501, Boolean.valueOf(false))
            .with(field18500, AttachFace.field314)
      );
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      switch (Class6596.field29026[var1.<AttachFace>get(field18500).ordinal()]) {
         case 1:
            switch (Class6596.field29024[var1.<Direction>get(HORIZONTAL_FACING).getAxis().ordinal()]) {
               case 1:
                  return field18507;
               case 2:
               default:
                  return field18506;
            }
         case 2:
            switch (Class6596.field29025[var1.<Direction>get(HORIZONTAL_FACING).ordinal()]) {
               case 1:
                  return field18505;
               case 2:
                  return field18504;
               case 3:
                  return field18503;
               case 4:
               default:
                  return field18502;
            }
         case 3:
         default:
            switch (Class6596.field29024[var1.<Direction>get(HORIZONTAL_FACING).getAxis().ordinal()]) {
               case 1:
                  return field18509;
               case 2:
               default:
                  return field18508;
            }
      }
   }

   @Override
   public ActionResultType onBlockActivated(BlockState var1, World var2, BlockPos var3, PlayerEntity var4, Hand var5, BlockRayTraceResult var6) {
      if (!var2.isRemote) {
         BlockState var11 = this.method11510(var1, var2, var3);
         float var10 = !var11.<Boolean>get(field18501) ? 0.5F : 0.6F;
         var2.playSound((PlayerEntity)null, var3, SoundEvents.field26730, SoundCategory.field14732, 0.3F, var10);
         return ActionResultType.field14819;
      } else {
         BlockState var9 = var1.method23459(field18501);
         if (var9.<Boolean>get(field18501)) {
            method11511(var9, var2, var3, 1.0F);
         }

         return ActionResultType.SUCCESS;
      }
   }

   public BlockState method11510(BlockState var1, World var2, BlockPos var3) {
      var1 = var1.method23459(field18501);
      var2.setBlockState(var3, var1, 3);
      this.method11517(var1, var2, var3);
      return var1;
   }

   private static void method11511(BlockState var0, IWorld var1, BlockPos var2, float var3) {
      Direction var6 = var0.<Direction>get(HORIZONTAL_FACING).getOpposite();
      Direction var7 = method11509(var0).getOpposite();
      double var8 = (double)var2.getX() + 0.5 + 0.1 * (double)var6.getXOffset() + 0.2 * (double)var7.getXOffset();
      double var10 = (double)var2.getY() + 0.5 + 0.1 * (double)var6.getYOffset() + 0.2 * (double)var7.getYOffset();
      double var12 = (double)var2.getZ() + 0.5 + 0.1 * (double)var6.getZOffset() + 0.2 * (double)var7.getZOffset();
      var1.addParticle(new RedstoneParticleData(1.0F, 0.0F, 0.0F, var3), var8, var10, var12, 0.0, 0.0, 0.0);
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>get(field18501) && var4.nextFloat() < 0.25F) {
         method11511(var1, var2, var3, 0.5F);
      }
   }

   @Override
   public void onReplaced(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (!var5 && !var1.isIn(var4.getBlock())) {
         if (var1.<Boolean>get(field18501)) {
            this.method11517(var1, var2, var3);
         }

         super.onReplaced(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return !var1.<Boolean>get(field18501) ? 0 : 15;
   }

   @Override
   public int method11515(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>get(field18501) && method11509(var1) == var4 ? 15 : 0;
   }

   @Override
   public boolean method11516(BlockState var1) {
      return true;
   }

   private void method11517(BlockState var1, World var2, BlockPos var3) {
      var2.notifyNeighborsOfStateChange(var3, this);
      var2.notifyNeighborsOfStateChange(var3.offset(method11509(var1).getOpposite()), this);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18500, HORIZONTAL_FACING, field18501);
   }
}

package mapped;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.particles.IParticleData;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;

public class Class3382 extends Class3381 {
   private static String[] field18982;
   public static final DirectionProperty field18985 = HorizontalBlock.HORIZONTAL_FACING;
   private static final Map<Direction, VoxelShape> field18986 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.makeCuboidShape(5.5, 3.0, 11.0, 10.5, 13.0, 16.0),
         Direction.SOUTH,
         Block.makeCuboidShape(5.5, 3.0, 0.0, 10.5, 13.0, 5.0),
         Direction.WEST,
         Block.makeCuboidShape(11.0, 3.0, 5.5, 16.0, 13.0, 10.5),
         Direction.EAST,
         Block.makeCuboidShape(0.0, 3.0, 5.5, 5.0, 13.0, 10.5)
      )
   );

   public Class3382(Properties var1, IParticleData var2) {
      super(var1, var2);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18985, Direction.NORTH));
   }

   @Override
   public String getTranslationKey() {
      return this.method11581().getTranslationKey();
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return method11980(var1);
   }

   public static VoxelShape method11980(BlockState var0) {
      return field18986.get(var0.<Direction>get(field18985));
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      Direction var6 = var1.<Direction>get(field18985);
      BlockPos var7 = var3.offset(var6.getOpposite());
      BlockState var8 = var2.getBlockState(var7);
      return var8.method23454(var2, var7, var6);
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = this.getDefaultState();
      World var5 = var1.getWorld();
      BlockPos var6 = var1.getPos();
      Direction[] var7 = var1.method18349();

      for (Direction var11 : var7) {
         if (var11.getAxis().isHorizontal()) {
            Direction var12 = var11.getOpposite();
            var4 = var4.with(field18985, var12);
            if (var4.isValidPosition(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var2.getOpposite() == var1.get(field18985) && !var1.isValidPosition(var4, var5) ? Blocks.AIR.getDefaultState() : var1;
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      Direction var7 = var1.<Direction>get(field18985);
      double var8 = (double)var3.getX() + 0.5;
      double var10 = (double)var3.getY() + 0.7;
      double var12 = (double)var3.getZ() + 0.5;
      double var14 = 0.22;
      double var16 = 0.27;
      Direction var18 = var7.getOpposite();
      var2.addParticle(ParticleTypes.field34092, var8 + 0.27 * (double)var18.getXOffset(), var10 + 0.22, var12 + 0.27 * (double)var18.getZOffset(), 0.0, 0.0, 0.0);
      var2.addParticle(this.field18984, var8 + 0.27 * (double)var18.getXOffset(), var10 + 0.22, var12 + 0.27 * (double)var18.getZOffset(), 0.0, 0.0, 0.0);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18985, var2.rotate(var1.<Direction>get(field18985)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18985)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18985);
   }
}

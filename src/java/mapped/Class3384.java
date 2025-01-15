package mapped;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3384 extends Class3383 {
   private static String[] field18989;
   public static final DirectionProperty field18990 = HorizontalBlock.HORIZONTAL_FACING;
   public static final BooleanProperty field18991 = Class3383.field18987;

   public Class3384(Properties var1) {
      super(var1);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18990, Direction.NORTH).with(field18991, Boolean.valueOf(true)));
   }

   @Override
   public String getTranslationKey() {
      return this.asItem().getTranslationKey();
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return Class3382.method11980(var1);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return Blocks.WALL_TORCH.isValidPosition(var1, var2, var3);
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return Blocks.WALL_TORCH.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      BlockState var4 = Blocks.WALL_TORCH.getStateForPlacement(var1);
      return var4 != null ? this.getDefaultState().with(field18990, var4.<Direction>get(field18990)) : null;
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var1.<Boolean>get(field18991)) {
         Direction var7 = var1.<Direction>get(field18990).getOpposite();
         double var8 = 0.27;
         double var10 = (double)var3.getX() + 0.5 + (var4.nextDouble() - 0.5) * 0.2 + 0.27 * (double)var7.getXOffset();
         double var12 = (double)var3.getY() + 0.7 + (var4.nextDouble() - 0.5) * 0.2 + 0.22;
         double var14 = (double)var3.getZ() + 0.5 + (var4.nextDouble() - 0.5) * 0.2 + 0.27 * (double)var7.getZOffset();
         var2.addParticle(this.field18984, var10, var12, var14, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public boolean method11981(World var1, BlockPos var2, BlockState var3) {
      Direction var6 = var3.<Direction>get(field18990).getOpposite();
      return var1.method6778(var2.offset(var6), var6);
   }

   @Override
   public int method11514(BlockState var1, IBlockReader var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>get(field18991) && var1.get(field18990) != var4 ? 15 : 0;
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return Blocks.WALL_TORCH.rotate(var1, var2);
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return Blocks.WALL_TORCH.mirror(var1, var2);
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18990, field18991);
   }
}

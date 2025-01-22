package mapped;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

import java.util.Map;

public class BannerBlock extends Class3359 {
   private static String[] field18905;
   public static final IntegerProperty field18906 = BlockStateProperties.ROTATION;
   private static final Map<DyeColor, Block> field18907 = Maps.newHashMap();
   private static final VoxelShape field18908 = Block.makeCuboidShape(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   public BannerBlock(DyeColor var1, Properties var2) {
      super(var1, var2);
      this.setDefaultState(this.stateContainer.getBaseState().with(field18906, Integer.valueOf(0)));
      field18907.put(var1, this);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return var2.getBlockState(var3.down()).getMaterial().isSolid();
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18908;
   }

   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      return this.getDefaultState()
         .with(field18906, Integer.valueOf(MathHelper.floor((double)((180.0F + var1.method18352()) * 16.0F / 360.0F) + 0.5) & 15));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !var1.isValidPosition(var4, var5)
         ? Blocks.AIR.getDefaultState()
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18906, Integer.valueOf(var2.rotate(var1.<Integer>get(field18906), 16)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.with(field18906, Integer.valueOf(var2.method8748(var1.<Integer>get(field18906), 16)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field18906);
   }

   public static Block method11937(DyeColor var0) {
      return field18907.getOrDefault(var0, Blocks.WHITE_BANNER);
   }
}

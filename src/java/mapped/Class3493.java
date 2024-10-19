package mapped;

import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.state.DirectionProperty;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;

import java.util.Map;

public class Class3493 extends BushBlock {
   private static String[] field18470;
   public static final DirectionProperty field19361 = HorizontalBlock.HORIZONTAL_FACING;
   private final Class3462 field19362;
   private static final Map<Direction, VoxelShape> field19363 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.SOUTH,
         Block.makeCuboidShape(6.0, 0.0, 6.0, 10.0, 10.0, 16.0),
         Direction.WEST,
         Block.makeCuboidShape(0.0, 0.0, 6.0, 10.0, 10.0, 10.0),
         Direction.NORTH,
         Block.makeCuboidShape(6.0, 0.0, 0.0, 10.0, 10.0, 10.0),
         Direction.EAST,
         Block.makeCuboidShape(6.0, 0.0, 6.0, 16.0, 10.0, 10.0)
      )
   );

   public Class3493(Class3462 var1, Properties var2) {
      super(var2);
      this.setDefaultState(this.stateContainer.getBaseState().with(field19361, Direction.NORTH));
      this.field19362 = var1;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19363.get(var1.<Direction>get(field19361));
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return !var3.isIn(this.field19362) && var2 == var1.get(field19361)
         ? this.field19362.method12146().getDefaultState().with(Class3486.field19347, Integer.valueOf(7))
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      return state.isIn(Blocks.FARMLAND);
   }

   public Item method12188() {
      if (this.field19362 != Blocks.PUMPKIN) {
         return this.field19362 != Blocks.MELON ? Items.AIR : Items.field37960;
      } else {
         return Items.field37959;
      }
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      return new ItemStack(this.method12188());
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field19361, var2.rotate(var1.<Direction>get(field19361)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field19361)));
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19361);
   }
}

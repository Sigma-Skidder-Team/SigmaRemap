package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class Class3482 extends Class3480 {
   private static String[] field19333;
   public static final IntegerProperty field19337 = BlockStateProperties.field39740;
   private static final VoxelShape[] field19338 = new VoxelShape[]{
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   public Class3482(Properties var1) {
      super(var1);
   }

   @Override
   public IntegerProperty method12175() {
      return field19337;
   }

   @Override
   public int method12176() {
      return 3;
   }

   @Override
   public IItemProvider method12183() {
      return Items.field38112;
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var4.nextInt(3) != 0) {
         super.randomTick(var1, var2, var3, var4);
      }
   }

   @Override
   public int method12181(World var1) {
      return super.method12181(var1) / 3;
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19337);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19338[var1.<Integer>get(this.method12175())];
   }
}

package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;
import javax.annotation.Nullable;

public class Class3486 extends Class3194 implements Class3196 {
   private static String[] field18470;
   public static final IntegerProperty field19347 = BlockStateProperties.field39742;
   public static final VoxelShape[] field19348 = new VoxelShape[]{
      Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      Block.makeCuboidShape(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final Class3462 field19349;

   public Class3486(Class3462 var1, Properties var2) {
      super(var2);
      this.field19349 = var1;
      this.setDefaultState(this.stateContainer.getBaseState().with(field19347, Integer.valueOf(0)));
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19348[var1.<Integer>get(field19347)];
   }

   @Override
   public boolean method11490(BlockState var1, IBlockReader var2, BlockPos var3) {
      return var1.isIn(Blocks.FARMLAND);
   }

   @Override
   public void randomTick(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.method7021(var3, 0) >= 9) {
         float var7 = Class3480.method12182(this, var2, var3);
         if (var4.nextInt((int)(25.0F / var7) + 1) == 0) {
            int var8 = var1.<Integer>get(field19347);
            if (var8 >= 7) {
               Direction var9 = Direction.Plane.HORIZONTAL.method247(var4);
               BlockPos var10 = var3.offset(var9);
               BlockState var11 = var2.getBlockState(var10.down());
               if (var2.getBlockState(var10).isAir()
                  && (
                     var11.isIn(Blocks.FARMLAND)
                        || var11.isIn(Blocks.field36396)
                        || var11.isIn(Blocks.field36397)
                        || var11.isIn(Blocks.field36398)
                        || var11.isIn(Blocks.field36395)
                  )) {
                  var2.setBlockState(var10, this.field19349.getDefaultState());
                  var2.setBlockState(var3, this.field19349.method12147().getDefaultState().with(HorizontalBlock.HORIZONTAL_FACING, var9));
               }
            } else {
               var1 = var1.with(field19347, Integer.valueOf(var8 + 1));
               var2.setBlockState(var3, var1, 2);
            }
         }
      }
   }

   @Nullable
   public Item method12184() {
      if (this.field19349 != Blocks.PUMPKIN) {
         return this.field19349 != Blocks.MELON ? null : Items.field37960;
      } else {
         return Items.field37959;
      }
   }

   @Override
   public ItemStack getItem(IBlockReader var1, BlockPos var2, BlockState var3) {
      Item var6 = this.method12184();
      return var6 != null ? new ItemStack(var6) : ItemStack.EMPTY;
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return var3.<Integer>get(field19347) != 7;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      int var7 = Math.min(7, var4.<Integer>get(field19347) + MathHelper.method37782(var1.rand, 2, 5));
      BlockState var8 = var4.with(field19347, Integer.valueOf(var7));
      var1.setBlockState(var3, var8, 2);
      if (var7 == 7) {
         var8.method23431(var1, var3, var1.rand);
      }
   }

   @Override
   public void fillStateContainer(StateContainer.Builder<Block, BlockState> var1) {
      var1.add(field19347);
   }

   public Class3462 method12185() {
      return this.field19349;
   }
}

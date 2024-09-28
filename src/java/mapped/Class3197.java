package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3197 extends HorizontalBlock implements Class3196 {
   private static String[] field18478;
   public static final IntegerProperty field18479 = BlockStateProperties.field39739;
   public static final VoxelShape[] field18480 = new VoxelShape[]{
      Block.makeCuboidShape(11.0, 7.0, 6.0, 15.0, 12.0, 10.0),
      Block.makeCuboidShape(9.0, 5.0, 5.0, 15.0, 12.0, 11.0),
      Block.makeCuboidShape(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   public static final VoxelShape[] field18481 = new VoxelShape[]{
      Block.makeCuboidShape(1.0, 7.0, 6.0, 5.0, 12.0, 10.0),
      Block.makeCuboidShape(1.0, 5.0, 5.0, 7.0, 12.0, 11.0),
      Block.makeCuboidShape(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   public static final VoxelShape[] field18482 = new VoxelShape[]{
      Block.makeCuboidShape(6.0, 7.0, 1.0, 10.0, 12.0, 5.0),
      Block.makeCuboidShape(5.0, 5.0, 1.0, 11.0, 12.0, 7.0),
      Block.makeCuboidShape(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   public static final VoxelShape[] field18483 = new VoxelShape[]{
      Block.makeCuboidShape(6.0, 7.0, 11.0, 10.0, 12.0, 15.0),
      Block.makeCuboidShape(5.0, 5.0, 9.0, 11.0, 12.0, 15.0),
      Block.makeCuboidShape(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public Class3197(Properties var1) {
      super(var1);
      this.method11578(this.field18612.method35393().with(HORIZONTAL_FACING, Direction.NORTH).with(field18479, Integer.valueOf(0)));
   }

   @Override
   public boolean method11499(BlockState var1) {
      return var1.<Integer>get(field18479) < 2;
   }

   @Override
   public void method11484(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      if (var2.rand.nextInt(5) == 0) {
         int var7 = var1.<Integer>get(field18479);
         if (var7 < 2) {
            var2.setBlockState(var3, var1.with(field18479, Integer.valueOf(var7 + 1)), 2);
         }
      }
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      Block var6 = var2.getBlockState(var3.method8349(var1.<Direction>get(HORIZONTAL_FACING))).getBlock();
      return var6.isIn(BlockTags.field32756);
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      int var7 = var1.<Integer>get(field18479);
      switch (Class9737.field45471[var1.<Direction>get(HORIZONTAL_FACING).ordinal()]) {
         case 1:
            return field18483[var7];
         case 2:
         default:
            return field18482[var7];
         case 3:
            return field18481[var7];
         case 4:
            return field18480[var7];
      }
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = this.method11579();
      World var5 = var1.method18360();
      BlockPos var6 = var1.method18345();

      for (Direction var10 : var1.method18349()) {
         if (var10.getAxis().method324()) {
            var4 = var4.with(HORIZONTAL_FACING, var10);
            if (var4.method23443(var5, var6)) {
               return var4;
            }
         }
      }

      return null;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == var1.get(HORIZONTAL_FACING) && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11486(IBlockReader var1, BlockPos var2, BlockState var3, boolean var4) {
      return var3.<Integer>get(field18479) < 2;
   }

   @Override
   public boolean method11487(World var1, Random var2, BlockPos var3, BlockState var4) {
      return true;
   }

   @Override
   public void method11488(ServerWorld var1, Random var2, BlockPos var3, BlockState var4) {
      var1.setBlockState(var3, var4.with(field18479, Integer.valueOf(var4.<Integer>get(field18479) + 1)), 2);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(HORIZONTAL_FACING, field18479);
   }

   @Override
   public boolean method11494(BlockState var1, IBlockReader var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}

package mapped;

import net.minecraft.block.HorizontalBlock;
import net.minecraft.state.DirectionProperty;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import java.util.Map;
import javax.annotation.Nullable;

public class Class3375 extends Class3373 {
   private static String[] field18971;
   public static final DirectionProperty field18972 = HorizontalBlock.HORIZONTAL_FACING;
   private static final Map<Direction, VoxelShape> field18973 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.NORTH,
         Block.makeCuboidShape(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         Direction.SOUTH,
         Block.makeCuboidShape(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         Direction.EAST,
         Block.makeCuboidShape(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         Direction.WEST,
         Block.makeCuboidShape(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   public Class3375(Properties var1, Class9673 var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().with(field18972, Direction.NORTH).with(field18966, Boolean.valueOf(false)));
   }

   @Override
   public String getTranslationKey() {
      return this.method11581().getTranslationKey();
   }

   @Override
   public VoxelShape method11483(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18973.get(var1.<Direction>get(field18972));
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      return var2.getBlockState(var3.method8349(var1.<Direction>get(field18972).getOpposite())).getMaterial().isSolid();
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      BlockState var4 = this.method11579();
      FluidState var5 = var1.method18360().getFluidState(var1.method18345());
      World var6 = var1.method18360();
      BlockPos var7 = var1.method18345();
      Direction[] var8 = var1.method18349();

      for (Direction var12 : var8) {
         if (var12.getAxis().method324()) {
            Direction var13 = var12.getOpposite();
            var4 = var4.with(field18972, var13);
            if (var4.method23443(var6, var7)) {
               return var4.with(field18966, Boolean.valueOf(var5.method23472() == Class9479.field44066));
            }
         }
      }

      return null;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2.getOpposite() == var1.get(field18972) && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public BlockState rotate(BlockState var1, Rotation var2) {
      return var1.with(field18972, var2.rotate(var1.<Direction>get(field18972)));
   }

   @Override
   public BlockState mirror(BlockState var1, Mirror var2) {
      return var1.rotate(var2.toRotation(var1.<Direction>get(field18972)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18972, field18966);
   }
}

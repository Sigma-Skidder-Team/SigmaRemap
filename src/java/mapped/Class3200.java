package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.AttachFace;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

import javax.annotation.Nullable;

public class Class3200 extends HorizontalBlock {
   private static String[] field18499;
   public static final EnumProperty<AttachFace> field18500 = BlockStateProperties.FACE;

   public Class3200(Properties var1) {
      super(var1);
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return method11508(var2, var3, method11509(var1).getOpposite());
   }

   public static boolean method11508(IWorldReader var0, BlockPos var1, Direction var2) {
      BlockPos var5 = var1.offset(var2);
      return var0.getBlockState(var5).method23454(var0, var5, var2.getOpposite());
   }

   @Nullable
   @Override
   public BlockState getStateForPlacement(BlockItemUseContext var1) {
      for (Direction var7 : var1.method18349()) {
         BlockState var8;
         if (var7.getAxis() != Direction.Axis.Y) {
            var8 = this.getDefaultState().with(field18500, AttachFace.field314).with(HORIZONTAL_FACING, var7.getOpposite());
         } else {
            var8 = this.getDefaultState()
               .with(field18500, var7 != Direction.UP ? AttachFace.field313 : AttachFace.field315)
               .with(HORIZONTAL_FACING, var1.getPlacementHorizontalFacing());
         }

         if (var8.isValidPosition(var1.getWorld(), var1.getPos())) {
            return var8;
         }
      }

      return null;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return method11509(var1).getOpposite() == var2 && !var1.isValidPosition(var4, var5)
         ? Blocks.AIR.getDefaultState()
         : super.updatePostPlacement(var1, var2, var3, var4, var5, var6);
   }

   public static Direction method11509(BlockState var0) {
      switch (Class7785.field33410[var0.<AttachFace>get(field18500).ordinal()]) {
         case 1:
            return Direction.DOWN;
         case 2:
            return Direction.UP;
         default:
            return var0.<Direction>get(HORIZONTAL_FACING);
      }
   }
}

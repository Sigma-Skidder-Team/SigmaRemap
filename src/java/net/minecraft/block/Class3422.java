package net.minecraft.block;

import net.minecraft.item.DyeColor;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;

public class Class3422 extends Block {
   private static String[] field19150;
   public static final VoxelShape field19151 = Block.makeCuboidShape(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private final DyeColor field19152;

   public Class3422(DyeColor var1, Properties var2) {
      super(var2);
      this.field19152 = var1;
   }

   public DyeColor method12077() {
      return this.field19152;
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field19151;
   }

   @Override
   public BlockState updatePostPlacement(BlockState var1, Direction var2, BlockState var3, IWorld var4, BlockPos var5, BlockPos var6) {
      return var1.isValidPosition(var4, var5) ? super.updatePostPlacement(var1, var2, var3, var4, var5, var6) : Blocks.AIR.getDefaultState();
   }

   @Override
   public boolean isValidPosition(BlockState var1, IWorldReader var2, BlockPos var3) {
      return !var2.method7007(var3.down());
   }
}

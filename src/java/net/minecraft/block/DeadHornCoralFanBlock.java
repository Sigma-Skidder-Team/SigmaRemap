package net.minecraft.block;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class DeadHornCoralFanBlock extends Class3224 {
   private static String[] field18662;
   private static final VoxelShape field18664 = Block.makeCuboidShape(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   public DeadHornCoralFanBlock(Properties var1) {
      super(var1);
   }

   @Override
   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return field18664;
   }
}
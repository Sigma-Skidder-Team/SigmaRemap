package net.minecraft.block;

import net.minecraft.entity.item.BoatEntity;
import mapped.VoxelShape;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class LilyPadBlock extends BushBlock {
   public static final VoxelShape LILY_PAD_AABB = Block.makeCuboidShape(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   public LilyPadBlock(Properties var1) {
      super(var1);
   }

   public void onEntityCollision(BlockState var1, World var2, BlockPos var3, Entity var4) {
      super.onEntityCollision(var1, var2, var3, var4);
      if (var2 instanceof ServerWorld && var4 instanceof BoatEntity) {
         var2.destroyBlock(new BlockPos(var3), true, var4);
      }
   }

   public VoxelShape getShape(BlockState var1, IBlockReader var2, BlockPos var3, ISelectionContext var4) {
      return LILY_PAD_AABB;
   }

   public boolean isValidGround(BlockState state, IBlockReader var2, BlockPos var3) {
      FluidState var6 = var2.getFluidState(var3);
      FluidState var7 = var2.getFluidState(var3.up());
      return (var6.getFluid() == Fluids.WATER || state.getMaterial() == Material.ICE) && var7.getFluid() == Fluids.EMPTY;
   }
}

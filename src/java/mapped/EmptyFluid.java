package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;

public class EmptyFluid extends Fluid {
   private static String[] field32711;

   @Override
   public Item method25050() {
      return Items.AIR;
   }

   @Override
   public boolean method25055(FluidState var1, IBlockReader var2, BlockPos var3, Fluid var4, Direction var5) {
      return true;
   }

   @Override
   public Vector3d method25056(IBlockReader var1, BlockPos var2, FluidState var3) {
      return Vector3d.ZERO;
   }

   @Override
   public int getTickRate(IWorldReader var1) {
      return 0;
   }

   @Override
   public boolean method25059() {
      return true;
   }

   @Override
   public float method25060() {
      return 0.0F;
   }

   @Override
   public float method25061(FluidState var1, IBlockReader var2, BlockPos var3) {
      return 0.0F;
   }

   @Override
   public float method25062(FluidState var1) {
      return 0.0F;
   }

   @Override
   public BlockState method25063(FluidState var1) {
      return Blocks.AIR.getDefaultState();
   }

   @Override
   public boolean method25064(FluidState var1) {
      return false;
   }

   @Override
   public int method25065(FluidState var1) {
      return 0;
   }

   @Override
   public VoxelShape method25068(FluidState var1, IBlockReader var2, BlockPos var3) {
      return VoxelShapes.empty();
   }
}

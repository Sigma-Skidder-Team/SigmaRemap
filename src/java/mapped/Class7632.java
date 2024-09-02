package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

public class Class7632 extends Fluid {
   private static String[] field32711;

   @Override
   public Item method25050() {
      return Items.field37222;
   }

   @Override
   public boolean method25055(FluidState var1, Class1665 var2, BlockPos var3, Fluid var4, Direction var5) {
      return true;
   }

   @Override
   public Vector3d method25056(Class1665 var1, BlockPos var2, FluidState var3) {
      return Vector3d.ZERO;
   }

   @Override
   public int method25057(Class1662 var1) {
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
   public float method25061(FluidState var1, Class1665 var2, BlockPos var3) {
      return 0.0F;
   }

   @Override
   public float method25062(FluidState var1) {
      return 0.0F;
   }

   @Override
   public BlockState method25063(FluidState var1) {
      return Blocks.AIR.method11579();
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
   public VoxelShape method25068(FluidState var1, Class1665 var2, BlockPos var3) {
      return VoxelShapes.method27425();
   }
}

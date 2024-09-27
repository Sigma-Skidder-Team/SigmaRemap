package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;

public class Class3374 extends Class3373 {
   private static String[] field18969;
   public static final Class8554 field18970 = Class8820.field39763;

   public Class3374(AbstractBlock var1, Class9673 var2) {
      super(var1, var2);
      this.method11578(this.field18612.method35393().method23465(field18970, Integer.valueOf(0)).method23465(field18966, Boolean.valueOf(false)));
   }

   @Override
   public boolean method11492(BlockState var1, IWorldReader var2, BlockPos var3) {
      return var2.getBlockState(var3.down()).getMaterial().isSolid();
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      FluidState var4 = var1.method18360().getFluidState(var1.method18345());
      return this.method11579()
         .method23465(field18970, Integer.valueOf(MathHelper.floor((double)((180.0F + var1.method18352()) * 16.0F / 360.0F) + 0.5) & 15))
         .method23465(field18966, Boolean.valueOf(var4.method23472() == Class9479.field44066));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.DOWN && !this.method11492(var1, var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public BlockState method11500(BlockState var1, Rotation var2) {
      return var1.method23465(field18970, Integer.valueOf(var2.method253(var1.<Integer>method23463(field18970), 16)));
   }

   @Override
   public BlockState method11501(BlockState var1, Class2089 var2) {
      return var1.method23465(field18970, Integer.valueOf(var2.method8748(var1.<Integer>method23463(field18970), 16)));
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18970, field18966);
   }
}

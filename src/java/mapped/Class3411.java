package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.Random;

public class Class3411 extends Block {
   private static String[] field19094;
   public static final VoxelShape field19095 = Class3221.field18645;

   public Class3411(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public boolean method11534(BlockState var1) {
      return true;
   }

   @Override
   public BlockState method11495(Class5909 var1) {
      return this.method11579().method23443(var1.method18360(), var1.method18345())
         ? super.method11495(var1)
         : Block.method11538(this.method11579(), Blocks.field36396.method11579(), var1.method18360(), var1.method18345());
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.field673 && !var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11522(BlockState var1, ServerWorld var2, BlockPos var3, Random var4) {
      Class3221.method11610(var1, var2, var3);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockState var6 = var2.getBlockState(var3.up());
      return !var6.method23384().method31086() || var6.getBlock() instanceof Class3199;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return field19095;
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}

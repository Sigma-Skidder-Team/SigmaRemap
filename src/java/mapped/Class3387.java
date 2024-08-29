package mapped;

import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;

public class Class3387 extends Class3386 implements Class3207 {
   private static String[] field18993;
   public static final Class8551 field18995 = Class8820.field39710;
   public static final VoxelShape field18996 = Block.method11539(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final VoxelShape field18997 = Block.method11539(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   public static final VoxelShape field18998 = Block.method11539(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public Class3387(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18995, Boolean.valueOf(false)).method23465(field18994, Class113.field414));
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      switch (Class9607.field44929[var1.<Class113>method23463(field18994).ordinal()]) {
         case 1:
         default:
            return field18998;
         case 2:
            return field18997;
         case 3:
            return field18996;
      }
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      FluidState var4 = var1.method18360().getFluidState(var1.method18345());
      boolean var5 = var4.method23472() == Class9479.field44066;
      return super.method11495(var1).method23465(field18995, Boolean.valueOf(var5));
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18995)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18995).method24737(field18994);
   }

   @Override
   public FluidState method11498(BlockState var1) {
      return !var1.<Boolean>method23463(field18995) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}

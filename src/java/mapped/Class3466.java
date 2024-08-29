package mapped;

import javax.annotation.Nullable;

public class Class3466 extends Block implements Class3207 {
   private static String[] field19307;
   public static final Class8551 field19308 = Class8820.field39691;
   public static final Class8551 field19309 = Class8820.field39710;
   public static final VoxelShape field19310 = VoxelShapes.method27431(
      Block.method11539(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), Block.method11539(6.0, 7.0, 6.0, 10.0, 9.0, 10.0)
   );
   public static final VoxelShape field19311 = VoxelShapes.method27431(
      Block.method11539(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), Block.method11539(6.0, 8.0, 6.0, 10.0, 10.0, 10.0)
   );

   public Class3466(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19308, Boolean.valueOf(false)).method23465(field19309, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      Class7379 var4 = var1.method18360().method6739(var1.method18345());

      for (Direction var8 : var1.method18349()) {
         if (var8.method544() == Class113.field414) {
            BlockState var9 = this.method11579().method23465(field19308, Boolean.valueOf(var8 == Direction.field673));
            if (var9.method23443(var1.method18360(), var1.method18345())) {
               return var9.method23465(field19309, Boolean.valueOf(var4.method23472() == Class9479.field44066));
            }
         }
      }

      return null;
   }

   @Override
   public VoxelShape method11483(BlockState var1, Class1665 var2, BlockPos var3, ISelectionContext var4) {
      return !var1.<Boolean>method23463(field19308) ? field19310 : field19311;
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field19308, field19309);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      Direction var6 = method12151(var1).method536();
      return Block.method11548(var2, var3.method8349(var6), var6.method536());
   }

   public static Direction method12151(BlockState var0) {
      return !var0.<Boolean>method23463(field19308) ? Direction.field673 : Direction.DOWN;
   }

   @Override
   public Class2315 method11689(BlockState var1) {
      return Class2315.field15863;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field19309)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return method12151(var1).method536() == var2 && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public Class7379 method11498(BlockState var1) {
      return !var1.<Boolean>method23463(field19309) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public boolean method11494(BlockState var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}

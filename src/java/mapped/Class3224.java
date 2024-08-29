package mapped;

import javax.annotation.Nullable;

public class Class3224 extends Block implements Class3207 {
   private static String[] field18662;
   public static final Class8551 field18663 = Class8820.field39710;
   private static final Class6408 field18664 = Block.method11539(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   public Class3224(AbstractBlock var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18663, Boolean.valueOf(true)));
   }

   public void method11632(BlockState var1, Class1660 var2, BlockPos var3) {
      if (!method11633(var1, var2, var3)) {
         var2.method6860().method20726(var3, this, 60 + var2.method6814().nextInt(40));
      }
   }

   public static boolean method11633(BlockState var0, Class1665 var1, BlockPos var2) {
      if (var0.<Boolean>method23463(field18663)) {
         return true;
      } else {
         for (Direction var8 : Direction.values()) {
            if (var1.method6739(var2.method8349(var8)).method23486(Class8953.field40469)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public BlockState method11495(Class5909 var1) {
      Class7379 var4 = var1.method18360().method6739(var1.method18345());
      return this.method11579().method23465(field18663, Boolean.valueOf(var4.method23486(Class8953.field40469) && var4.method23477() == 8));
   }

   @Override
   public Class6408 method11483(BlockState var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field18664;
   }

   @Override
   public BlockState method11491(BlockState var1, Direction var2, BlockState var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method23463(field18663)) {
         var4.method6861().method20726(var5, Class9479.field44066, Class9479.field44066.method25057(var4));
      }

      return var2 == Direction.DOWN && !this.method11492(var1, var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(BlockState var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.method8313();
      return var2.getBlockState(var6).method23454(var2, var6, Direction.field673);
   }

   @Override
   public void method11489(Class7558<Block, BlockState> var1) {
      var1.method24737(field18663);
   }

   @Override
   public Class7379 method11498(BlockState var1) {
      return !var1.<Boolean>method23463(field18663) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }
}

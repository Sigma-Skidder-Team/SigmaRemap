package mapped;

import java.util.Random;

public class Class3411 extends Class3209 {
   private static String[] field19094;
   public static final Class6408 field19095 = Class3221.field18645;

   public Class3411(Class7929 var1) {
      super(var1);
   }

   @Override
   public boolean method11534(Class7380 var1) {
      return true;
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23443(var1.method18360(), var1.method18345())
         ? super.method11495(var1)
         : Class3209.method11538(this.method11579(), Class8487.field36396.method11579(), var1.method18360(), var1.method18345());
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var2 == Direction.field673 && !var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      Class3221.method11610(var1, var2, var3);
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      Class7380 var6 = var2.method6738(var3.method8311());
      return !var6.method23384().method31086() || var6.method23383() instanceof Class3199;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19095;
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}

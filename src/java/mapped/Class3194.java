package mapped;

public class Class3194 extends Class3209 {
   private static String[] field18470;

   public Class3194(Class7929 var1) {
      super(var1);
   }

   public boolean method11490(Class7380 var1, Class1665 var2, BlockPos var3) {
      return var1.method23448(Class8487.field36395)
         || var1.method23448(Class8487.field36396)
         || var1.method23448(Class8487.field36397)
         || var1.method23448(Class8487.field36398)
         || var1.method23448(Class8487.field36540);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var1.method23443(var4, var5) ? super.method11491(var1, var2, var3, var4, var5, var6) : Class8487.field36387.method11579();
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.method8313();
      return this.method11490(var2.method6738(var6), var2, var6);
   }

   @Override
   public boolean method11493(Class7380 var1, Class1665 var2, BlockPos var3) {
      return var1.method23449().method23474();
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return var4 == Class1947.field12616 && !this.field19005 ? true : super.method11494(var1, var2, var3, var4);
   }
}

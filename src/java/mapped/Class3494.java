package mapped;

public class Class3494 extends Class3194 {
   private static String[] field18470;
   public static final Class6408 field19364 = Block.method11539(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   public Class3494(Class7929 var1) {
      super(var1);
   }

   @Override
   public void method11523(Class7380 var1, Class1655 var2, BlockPos var3, Entity var4) {
      super.method11523(var1, var2, var3, var4);
      if (var2 instanceof Class1657 && var4 instanceof Class1002) {
         var2.method7180(new BlockPos(var3), true, var4);
      }
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19364;
   }

   @Override
   public boolean method11490(Class7380 var1, Class1665 var2, BlockPos var3) {
      Class7379 var6 = var2.method6739(var3);
      Class7379 var7 = var2.method6739(var3.method8311());
      return (var6.method23472() == Class9479.field44066 || var1.method23384() == Class8649.field38964) && var7.method23472() == Class9479.field44064;
   }
}

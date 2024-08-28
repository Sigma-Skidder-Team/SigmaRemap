package mapped;

import javax.annotation.Nullable;

public class Class3455 extends Class3456 implements Class3449 {
   private static String[] field19273;
   public static final Class8552<Class84> field19274 = Class3456.field19276;
   public static final Class6408 field19275 = Class3209.method11539(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public Class3455(Class7929 var1) {
      super(var1);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return field19275;
   }

   @Override
   public boolean method11490(Class7380 var1, Class1665 var2, BlockPos var3) {
      return var1.method23454(var2, var3, Direction.field673) && !var1.method23448(Class8487.field36890);
   }

   @Override
   public Class8848 method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return new Class8848(Class8487.field36485);
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = super.method11495(var1);
      if (var4 != null) {
         Class7379 var5 = var1.method18360().method6739(var1.method18345().method8311());
         if (var5.method23486(Class8953.field40469) && var5.method23477() == 8) {
            return var4;
         }
      }

      return null;
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      if (var1.<Class84>method23463(field19274) != Class84.field209) {
         Class7379 var7 = var2.method6739(var3);
         return super.method11492(var1, var2, var3) && var7.method23486(Class8953.field40469) && var7.method23477() == 8;
      } else {
         Class7380 var6 = var2.method6738(var3.method8313());
         return var6.method23448(this) && var6.<Class84>method23463(field19274) == Class84.field210;
      }
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return Class9479.field44066.method25078(false);
   }

   @Override
   public boolean method11531(Class1665 var1, BlockPos var2, Class7380 var3, Class7631 var4) {
      return false;
   }

   @Override
   public boolean method11532(Class1660 var1, BlockPos var2, Class7380 var3, Class7379 var4) {
      return false;
   }
}

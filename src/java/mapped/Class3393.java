package mapped;

import java.util.Random;

public class Class3393 extends Class3392 {
   private static String[] field19027;

   public Class3393(Class7929 var1) {
      super(0.3125F, var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field19019, Boolean.valueOf(false))
            .method23465(field19020, Boolean.valueOf(false))
            .method23465(field19021, Boolean.valueOf(false))
            .method23465(field19022, Boolean.valueOf(false))
            .method23465(field19023, Boolean.valueOf(false))
            .method23465(field19024, Boolean.valueOf(false))
      );
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method12004(var1.method18360(), var1.method18345());
   }

   public Class7380 method12004(Class1665 var1, BlockPos var2) {
      Class3209 var5 = var1.method6738(var2.method8313()).method23383();
      Class3209 var6 = var1.method6738(var2.method8311()).method23383();
      Class3209 var7 = var1.method6738(var2.method8341()).method23383();
      Class3209 var8 = var1.method6738(var2.method8347()).method23383();
      Class3209 var9 = var1.method6738(var2.method8343()).method23383();
      Class3209 var10 = var1.method6738(var2.method8345()).method23383();
      return this.method11579()
         .method23465(field19024, Boolean.valueOf(var5 == this || var5 == Class8487.field36879 || var5 == Class8487.field36651))
         .method23465(field19023, Boolean.valueOf(var6 == this || var6 == Class8487.field36879))
         .method23465(field19019, Boolean.valueOf(var7 == this || var7 == Class8487.field36879))
         .method23465(field19020, Boolean.valueOf(var8 == this || var8 == Class8487.field36879))
         .method23465(field19021, Boolean.valueOf(var9 == this || var9 == Class8487.field36879))
         .method23465(field19022, Boolean.valueOf(var10 == this || var10 == Class8487.field36879));
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (!var1.method23443(var4, var5)) {
         var4.method6860().method20726(var5, this, 1);
         return super.method11491(var1, var2, var3, var4, var5, var6);
      } else {
         boolean var9 = var3.method23383() == this
            || var3.method23448(Class8487.field36879)
            || var2 == Direction.field672 && var3.method23448(Class8487.field36651);
         return var1.method23465(field19025.get(var2), Boolean.valueOf(var9));
      }
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      Class7380 var6 = var2.method6738(var3.method8313());
      boolean var7 = !var2.method6738(var3.method8311()).method23393() && !var6.method23393();

      for (Direction var9 : Class76.field161) {
         BlockPos var10 = var3.method8349(var9);
         Class3209 var11 = var2.method6738(var10).method23383();
         if (var11 == this) {
            if (var7) {
               return false;
            }

            Class3209 var12 = var2.method6738(var10.method8313()).method23383();
            if (var12 == this || var12 == Class8487.field36651) {
               return true;
            }
         }
      }

      Class3209 var13 = var6.method23383();
      return var13 == this || var13 == Class8487.field36651;
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field19019, field19020, field19021, field19022, field19023, field19024);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}

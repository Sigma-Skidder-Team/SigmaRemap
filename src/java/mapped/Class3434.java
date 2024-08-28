package mapped;

import java.util.Random;

public class Class3434 extends Class3433 {
   private static String[] field19199;
   public static final Class8551 field19200 = Class8820.field39704;

   public Class3434(Class7929 var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field19198, Direction.SOUTH).method23465(field19200, Boolean.valueOf(false)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field19198, field19200);
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field19198, var2.method252(var1.<Direction>method23463(field19198)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field19198)));
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (!var1.<Boolean>method23463(field19200)) {
         var2.method6725(var3, var1.method23465(field19200, Boolean.valueOf(true)), 2);
         var2.method6860().method20726(var3, this, 2);
      } else {
         var2.method6725(var3, var1.method23465(field19200, Boolean.valueOf(false)), 2);
      }

      this.method12101(var2, var3, var1);
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Direction>method23463(field19198) == var2 && !var1.<Boolean>method23463(field19200)) {
         this.method12100(var4, var5);
      }

      return super.method11491(var1, var2, var3, var4, var5, var6);
   }

   private void method12100(Class1660 var1, BlockPos var2) {
      if (!var1.method6714() && !var1.method6860().method20718(var2, this)) {
         var1.method6860().method20726(var2, this, 2);
      }
   }

   public void method12101(Class1655 var1, BlockPos var2, Class7380 var3) {
      Direction var6 = var3.<Direction>method23463(field19198);
      BlockPos var7 = var2.method8349(var6.method536());
      var1.method6735(var7, this, var2);
      var1.method6734(var7, this, var6);
   }

   @Override
   public boolean method11516(Class7380 var1) {
      return true;
   }

   @Override
   public int method11515(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var1.method23402(var2, var3, var4);
   }

   @Override
   public int method11514(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var1.<Boolean>method23463(field19200) && var1.method23463(field19198) == var4 ? 15 : 0;
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383()) && !var2.method6714() && var1.<Boolean>method23463(field19200) && !var2.method6860().method20718(var3, this)) {
         Class7380 var8 = var1.method23465(field19200, Boolean.valueOf(false));
         var2.method6725(var3, var8, 18);
         this.method12101(var2, var3, var8);
      }
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383()) && !var2.field9020 && var1.<Boolean>method23463(field19200) && var2.method6860().method20718(var3, this)) {
         this.method12101(var2, var3, var1.method23465(field19200, Boolean.valueOf(false)));
      }
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field19198, var1.method18348().method536().method536());
   }
}

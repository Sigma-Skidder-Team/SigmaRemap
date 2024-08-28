package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3242 extends Class3241 {
   private static String[] field18692;
   public static final Class8553 field18693 = Class8820.field39720;
   public static final Class8551 field18694 = Class8820.field39702;

   public Class3242(Class7929 var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18693, Direction.NORTH).method23465(field18694, Boolean.valueOf(false)));
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         Class944 var9 = var2.method6759(var3);
         if (var9 instanceof Class973) {
            var4.method2766((Class973)var9);
            var4.method2911(Class8876.field40164);
            Class4388.method13832(var4, true);
         }

         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383())) {
         Class944 var8 = var2.method6759(var3);
         if (var8 instanceof Class920) {
            Class7236.method22721(var2, var3, (Class920)var8);
            var2.method6806(var3, this);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      Class944 var7 = var2.method6759(var3);
      if (var7 instanceof Class973) {
         ((Class973)var7).method4025();
      }
   }

   @Nullable
   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class973();
   }

   @Override
   public Class1855 method11526(Class7380 var1) {
      return Class1855.field9887;
   }

   @Override
   public void method11563(Class1655 var1, BlockPos var2, Class7380 var3, Class880 var4, Class8848 var5) {
      if (var5.method32152()) {
         Class944 var8 = var1.method6759(var2);
         if (var8 instanceof Class973) {
            ((Class973)var8).method3695(var5.method32149());
         }
      }
   }

   @Override
   public boolean method11648(Class7380 var1) {
      return true;
   }

   @Override
   public int method11649(Class7380 var1, Class1655 var2, BlockPos var3) {
      return Class5812.method18151(var2.method6759(var3));
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18693, var2.method252(var1.<Direction>method23463(field18693)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18693)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18693, field18694);
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field18693, var1.method18348().method536());
   }
}

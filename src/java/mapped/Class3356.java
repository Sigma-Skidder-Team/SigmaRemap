package mapped;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class Class3356 extends Class3241 {
   private static String[] field18895;
   public static final Class8553 field18896 = Class3436.field19198;
   public static final Class8552<Class180> field18897 = Class3436.field19211;

   public Class3356(Class7929 var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18896, Direction.NORTH).method23465(field18897, Class180.field638));
   }

   @Nullable
   @Override
   public Class944 method11646(Class1665 var1) {
      return null;
   }

   public static Class944 method11929(Class7380 var0, Direction var1, boolean var2, boolean var3) {
      return new Class955(var0, var1, var2, var3);
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var1.method23448(var4.method23383())) {
         Class944 var8 = var2.method6759(var3);
         if (var8 instanceof Class955) {
            ((Class955)var8).method3865();
         }
      }
   }

   @Override
   public void method11551(Class1660 var1, BlockPos var2, Class7380 var3) {
      BlockPos var6 = var2.method8349(var3.<Direction>method23463(field18896).method536());
      Class7380 var7 = var1.method6738(var6);
      if (var7.method23383() instanceof Class3435 && var7.<Boolean>method23463(Class3435.field19202)) {
         var1.method6728(var6, false);
      }
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020 && var2.method6759(var3) == null) {
         var2.method6728(var3, false);
         return Class2274.field14819;
      } else {
         return Class2274.field14820;
      }
   }

   @Override
   public List<Class8848> method11697(Class7380 var1, Class9464 var2) {
      Class955 var5 = this.method11930(var2.method36457(), new BlockPos(var2.<Vector3d>method36458(Class9525.field44335)));
      return var5 != null ? var5.method3864().method23434(var2) : Collections.<Class8848>emptyList();
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return Class8022.method27425();
   }

   @Override
   public Class6408 method11502(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      Class955 var7 = this.method11930(var2, var3);
      return var7 == null ? Class8022.method27425() : var7.method3866(var2, var3);
   }

   @Nullable
   private Class955 method11930(Class1665 var1, BlockPos var2) {
      Class944 var5 = var1.method6759(var2);
      return !(var5 instanceof Class955) ? null : (Class955)var5;
   }

   @Override
   public Class8848 method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return Class8848.field39973;
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18896, var2.method252(var1.<Direction>method23463(field18896)));
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      return var1.method23395(var2.method8749(var1.<Direction>method23463(field18896)));
   }

   @Override
   public void method11489(Class7558<Block, Class7380> var1) {
      var1.method24737(field18896, field18897);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }
}

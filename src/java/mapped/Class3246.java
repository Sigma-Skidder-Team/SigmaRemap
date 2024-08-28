package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class Class3246 extends Class3247 implements Class3245 {
   private static String[] field18705;
   public static final Class8552<Class105> field18706 = Class8820.field39766;

   public Class3246(Class7929 var1) {
      super(var1);
      this.method11578(
         this.field18612
            .method35393()
            .method23465(field18484, Direction.NORTH)
            .method23465(field18708, Boolean.valueOf(false))
            .method23465(field18706, Class105.field325)
      );
   }

   @Override
   public int method11658(Class7380 var1) {
      return 2;
   }

   @Override
   public int method11659(Class1665 var1, BlockPos var2, Class7380 var3) {
      Class944 var6 = var1.method6759(var2);
      return !(var6 instanceof Class963) ? 0 : ((Class963)var6).method3930();
   }

   private int method11660(Class1655 var1, BlockPos var2, Class7380 var3) {
      return var3.method23463(field18706) != Class105.field326
         ? this.method11662(var1, var2, var3)
         : Math.max(this.method11662(var1, var2, var3) - this.method11668(var1, var2, var3), 0);
   }

   @Override
   public boolean method11661(Class1655 var1, BlockPos var2, Class7380 var3) {
      int var6 = this.method11662(var1, var2, var3);
      if (var6 != 0) {
         int var7 = this.method11668(var1, var2, var3);
         return var6 > var7 ? true : var6 == var7 && var3.<Class105>method23463(field18706) == Class105.field325;
      } else {
         return false;
      }
   }

   @Override
   public int method11662(Class1655 var1, BlockPos var2, Class7380 var3) {
      int var6 = super.method11662(var1, var2, var3);
      Direction var7 = var3.<Direction>method23463(field18484);
      BlockPos var8 = var2.method8349(var7);
      Class7380 var9 = var1.method6738(var8);
      if (!var9.method23403()) {
         if (var6 < 15 && var9.method23400(var1, var8)) {
            var8 = var8.method8349(var7);
            var9 = var1.method6738(var8);
            Class997 var10 = this.method11663(var1, var7, var8);
            int var11 = Math.max(var10 != null ? var10.method4096() : Integer.MIN_VALUE, !var9.method23403() ? Integer.MIN_VALUE : var9.method23404(var1, var8));
            if (var11 != Integer.MIN_VALUE) {
               var6 = var11;
            }
         }
      } else {
         var6 = var9.method23404(var1, var8);
      }

      return var6;
   }

   @Nullable
   private Class997 method11663(Class1655 var1, Direction var2, BlockPos var3) {
      List var6 = var1.<Class997>method6772(
         Class997.class,
         new Class6488(
            (double)var3.method8304(),
            (double)var3.getY(),
            (double)var3.method8306(),
            (double)(var3.method8304() + 1),
            (double)(var3.getY() + 1),
            (double)(var3.method8306() + 1)
         ),
         var1x -> var1x != null && var1x.method3386() == var2
      );
      return var6.size() != 1 ? null : (Class997)var6.get(0);
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (var4.field4919.field29610) {
         var1 = var1.method23459(field18706);
         float var9 = var1.method23463(field18706) != Class105.field326 ? 0.5F : 0.55F;
         var2.method6742(var4, var3, Class6067.field26462, Class2266.field14732, 0.3F, var9);
         var2.method6725(var3, var1, 2);
         this.method11665(var2, var3, var1);
         return Class2274.method9002(var2.field9020);
      } else {
         return Class2274.field14820;
      }
   }

   @Override
   public void method11664(Class1655 var1, BlockPos var2, Class7380 var3) {
      if (!var1.method6860().method20720(var2, this)) {
         int var6 = this.method11660(var1, var2, var3);
         Class944 var7 = var1.method6759(var2);
         int var8 = !(var7 instanceof Class963) ? 0 : ((Class963)var7).method3930();
         if (var6 != var8 || var3.<Boolean>method23463(field18708) != this.method11661(var1, var2, var3)) {
            Class2199 var9 = !this.method11673(var1, var2, var3) ? Class2199.field14370 : Class2199.field14369;
            var1.method6860().method20719(var2, this, 2, var9);
         }
      }
   }

   private void method11665(Class1655 var1, BlockPos var2, Class7380 var3) {
      int var6 = this.method11660(var1, var2, var3);
      Class944 var7 = var1.method6759(var2);
      int var8 = 0;
      if (var7 instanceof Class963) {
         Class963 var9 = (Class963)var7;
         var8 = var9.method3930();
         var9.method3931(var6);
      }

      if (var8 != var6 || var3.<Class105>method23463(field18706) == Class105.field325) {
         boolean var11 = this.method11661(var1, var2, var3);
         boolean var10 = var3.<Boolean>method23463(field18708);
         if (var10 && !var11) {
            var1.method6725(var2, var3.method23465(field18708, Boolean.valueOf(false)), 2);
         } else if (!var10 && var11) {
            var1.method6725(var2, var3.method23465(field18708, Boolean.valueOf(true)), 2);
         }

         this.method11670(var1, var2, var3);
      }
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      this.method11665(var2, var3, var1);
   }

   @Override
   public boolean method11647(Class7380 var1, Class1655 var2, BlockPos var3, int var4, int var5) {
      super.method11647(var1, var2, var3, var4, var5);
      Class944 var8 = var2.method6759(var3);
      return var8 != null && var8.method3751(var4, var5);
   }

   @Override
   public Class944 method11646(Class1665 var1) {
      return new Class963();
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field18484, field18706, field18708);
   }
}

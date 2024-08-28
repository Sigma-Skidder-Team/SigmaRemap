package mapped;

public class Class7880 {
   private static String[] field33822;
   private static Class7202 field33823 = null;

   public static void method26418() {
      field33823 = Class7944.method26860().method1553().method806().method38153(Blocks.SNOW.method11579());
   }

   public static Class7202 method26419() {
      return field33823;
   }

   public static Class7380 method26420() {
      return Blocks.SNOW.method11579();
   }

   public static boolean method26421(Class1663 var0, Class7380 var1, BlockPos var2) {
      if (var0 instanceof Class1665) {
         return method26423(var0, var1, var2) ? method26422(var0, var2) : false;
      } else {
         return false;
      }
   }

   private static boolean method26422(Class1665 var0, BlockPos var1) {
      Block var4 = Blocks.SNOW;
      if (var0.method6738(var1.method8341()).method23383() == var4
         || var0.method6738(var1.method8343()).method23383() == var4
         || var0.method6738(var1.method8345()).method23383() == var4
         || var0.method6738(var1.method8347()).method23383() == var4) {
         Class7380 var5 = var0.method6738(var1.method8313());
         if (var5.method23409(var0, var1)) {
            return true;
         }

         Block var6 = var5.method23383();
         if (var6 instanceof Class3421) {
            return var5.<Class99>method23463(Class3421.field19132) == Class99.field270;
         }

         if (var6 instanceof Class3208) {
            return var5.<Class86>method23463(Class3208.field18605) == Class86.field218;
         }
      }

      return false;
   }

   private static boolean method26423(Class1665 var0, Class7380 var1, BlockPos var2) {
      if (!var1.method23409(var0, var2)) {
         Block var5 = var1.method23383();
         if (var5 == Blocks.SNOW_BLOCK) {
            return false;
         } else if (!(var5 instanceof Class3194)
            || !(var5 instanceof Class3456)
               && !(var5 instanceof Class3490)
               && !(var5 instanceof Class3479)
               && !(var5 instanceof Class3193)
               && !(var5 instanceof Class3487)) {
            if (var5 instanceof Class3239
               || var5 instanceof Class3199
               || var5 instanceof Class3460
               || var5 instanceof Class3238
               || var5 instanceof Class3408
               || var5 instanceof Class3415) {
               return true;
            } else if (var5 instanceof Class3383) {
               return true;
            } else if (var5 instanceof Class3421) {
               return var1.<Class99>method23463(Class3421.field19132) == Class99.field270;
            } else if (var5 instanceof Class3208) {
               return var1.<Class86>method23463(Class3208.field18605) == Class86.field218;
            } else if (var5 instanceof Class3202) {
               return var1.<Class103>method23463(Class3202.field18500) != Class103.field313;
            } else if (var5 instanceof Class3362) {
               return true;
            } else if (var5 instanceof Class3423) {
               return true;
            } else if (var5 instanceof Class3201) {
               return true;
            } else {
               return !(var5 instanceof Class3441) ? var5 instanceof Class3402 : true;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }
}

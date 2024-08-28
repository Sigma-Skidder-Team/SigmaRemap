package mapped;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class Class9324 {
   private static String[] field43282;

   public static <S extends Class944> Class7995<S> method35243(
      Class4387<S> var0,
      Function<Class7380, Class1895> var1,
      Function<Class7380, Direction> var2,
      Class8553 var3,
      Class7380 var4,
      Class1660 var5,
      BlockPos var6,
      BiPredicate<Class1660, BlockPos> var7
   ) {
      Class944 var10 = var0.method13797(var5, var6);
      if (var10 != null) {
         if (!var7.test(var5, var6)) {
            Class1895 var11 = (Class1895)var1.apply(var4);
            boolean var12 = var11 == Class1895.field11109;
            boolean var13 = var11 == Class1895.field11110;
            if (!var12) {
               BlockPos var14 = var6.method8349((Direction)var2.apply(var4));
               Class7380 var15 = var5.method6738(var14);
               if (var15.method23448(var4.method23383())) {
                  Class1895 var16 = (Class1895)var1.apply(var15);
                  if (var16 != Class1895.field11109 && var11 != var16 && var15.<Direction>method23463(var3) == var4.<Direction>method23463(var3)) {
                     if (var7.test(var5, var14)) {
                        return Class6139::method19041;
                     }

                     Class944 var17 = var0.method13797(var5, var14);
                     if (var17 != null) {
                        Class944 var18 = !var13 ? var17 : var10;
                        Class944 var19 = !var13 ? var10 : var17;
                        return new Class7996<S>((S)var18, (S)var19);
                     }
                  }
               }

               return new Class7994<S>((S)var10);
            } else {
               return new Class7994<S>((S)var10);
            }
         } else {
            return Class6139::method19041;
         }
      } else {
         return Class6139::method19041;
      }
   }
}

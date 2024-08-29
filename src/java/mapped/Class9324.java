package mapped;

import net.minecraft.util.math.BlockPos;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class Class9324 {
   private static String[] field43282;

   public static <S extends TileEntity> Class7995<S> method35243(
      Class4387<S> var0,
      Function<BlockState, Class1895> var1,
      Function<BlockState, Direction> var2,
      Class8553 var3,
      BlockState var4,
      Class1660 var5,
      BlockPos var6,
      BiPredicate<Class1660, BlockPos> var7
   ) {
      TileEntity var10 = var0.method13797(var5, var6);
      if (var10 != null) {
         if (!var7.test(var5, var6)) {
            Class1895 var11 = (Class1895)var1.apply(var4);
            boolean var12 = var11 == Class1895.field11109;
            boolean var13 = var11 == Class1895.field11110;
            if (!var12) {
               BlockPos var14 = var6.method8349((Direction)var2.apply(var4));
               BlockState var15 = var5.getBlockState(var14);
               if (var15.method23448(var4.getBlock())) {
                  Class1895 var16 = (Class1895)var1.apply(var15);
                  if (var16 != Class1895.field11109 && var11 != var16 && var15.<Direction>method23463(var3) == var4.<Direction>method23463(var3)) {
                     if (var7.test(var5, var14)) {
                        return Class6139::method19041;
                     }

                     TileEntity var17 = var0.method13797(var5, var14);
                     if (var17 != null) {
                        TileEntity var18 = !var13 ? var17 : var10;
                        TileEntity var19 = !var13 ? var10 : var17;
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

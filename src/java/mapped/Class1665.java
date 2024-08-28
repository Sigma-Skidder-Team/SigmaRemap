package mapped;

import javax.annotation.Nullable;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Class1665 {
   @Nullable
   Class944 method6759(BlockPos var1);

   Class7380 method6738(BlockPos var1);

   Class7379 method6739(BlockPos var1);

   default int method7032(BlockPos var1) {
      return this.method6738(var1).method23392();
   }

   default int method7033() {
      return 15;
   }

   default int method7034() {
      return 256;
   }

   default Stream<Class7380> method7035(Class6488 var1) {
      return BlockPos.method8362(var1).<Class7380>map(this::method6738);
   }

   default Class8711 method7036(Class6809 var1) {
      return method7040(
         var1,
         (var1x, var2) -> {
            Class7380 var5 = this.method6738(var2);
            Class7379 var6 = this.method6739(var2);
            Vector3d var7 = var1x.method20745();
            Vector3d var8 = var1x.method20744();
            Class6408 var9 = var1x.method20746(var5, this, var2);
            Class8711 var10 = this.method7037(var7, var8, var2, var9, var5);
            Class6408 var11 = var1x.method20747(var6, this, var2);
            Class8711 var12 = var11.method19525(var7, var8, var2);
            double var13 = var10 != null ? var1x.method20745().method11342(var10.method31419()) : Double.MAX_VALUE;
            double var15 = var12 != null ? var1x.method20745().method11342(var12.method31419()) : Double.MAX_VALUE;
            return !(var13 <= var15) ? var12 : var10;
         },
         var0 -> {
            Vector3d var3 = var0.method20745().method11336(var0.method20744());
            return Class8711.method31420(
               var0.method20744(), Direction.method553(var3.field18048, var3.field18049, var3.field18050), new BlockPos(var0.method20744())
            );
         }
      );
   }

   @Nullable
   default Class8711 method7037(Vector3d var1, Vector3d var2, BlockPos var3, Class6408 var4, Class7380 var5) {
      Class8711 var8 = var4.method19525(var1, var2, var3);
      if (var8 != null) {
         Class8711 var9 = var5.method23418(this, var3).method19525(var1, var2, var3);
         if (var9 != null && var9.method31419().method11336(var1).method11349() < var8.method31419().method11336(var1).method11349()) {
            return var8.method31421(var9.method31424());
         }
      }

      return var8;
   }

   default double method7038(Class6408 var1, Supplier<Class6408> var2) {
      if (var1.method19516()) {
         double var5 = ((Class6408)var2.get()).method19513(Class113.field414);
         return !(var5 >= 1.0) ? Double.NEGATIVE_INFINITY : var5 - 1.0;
      } else {
         return var1.method19513(Class113.field414);
      }
   }

   default double method7039(BlockPos var1) {
      return this.method7038(this.method6738(var1).method23414(this, var1), () -> {
         BlockPos var4 = var1.method8313();
         return this.method6738(var4).method23414(this, var4);
      });
   }

   static <T> T method7040(Class6809 var0, BiFunction<Class6809, BlockPos, T> var1, Function<Class6809, T> var2) {
      Vector3d var5 = var0.method20745();
      Vector3d var6 = var0.method20744();
      if (!var5.equals(var6)) {
         double var7 = MathHelper.method37822(-1.0E-7, var6.field18048, var5.field18048);
         double var9 = MathHelper.method37822(-1.0E-7, var6.field18049, var5.field18049);
         double var11 = MathHelper.method37822(-1.0E-7, var6.field18050, var5.field18050);
         double var13 = MathHelper.method37822(-1.0E-7, var5.field18048, var6.field18048);
         double var15 = MathHelper.method37822(-1.0E-7, var5.field18049, var6.field18049);
         double var17 = MathHelper.method37822(-1.0E-7, var5.field18050, var6.field18050);
         int var19 = MathHelper.method37769(var13);
         int var20 = MathHelper.method37769(var15);
         int var21 = MathHelper.method37769(var17);
         Mutable var22 = new Mutable(var19, var20, var21);
         Object var23 = var1.apply(var0, var22);
         if (var23 == null) {
            double var24 = var7 - var13;
            double var26 = var9 - var15;
            double var28 = var11 - var17;
            int var30 = MathHelper.method37826(var24);
            int var31 = MathHelper.method37826(var26);
            int var32 = MathHelper.method37826(var28);
            double var33 = var30 != 0 ? (double)var30 / var24 : Double.MAX_VALUE;
            double var35 = var31 != 0 ? (double)var31 / var26 : Double.MAX_VALUE;
            double var37 = var32 != 0 ? (double)var32 / var28 : Double.MAX_VALUE;
            double var39 = var33 * (var30 <= 0 ? MathHelper.method37808(var13) : 1.0 - MathHelper.method37808(var13));
            double var41 = var35 * (var31 <= 0 ? MathHelper.method37808(var15) : 1.0 - MathHelper.method37808(var15));
            double var43 = var37 * (var32 <= 0 ? MathHelper.method37808(var17) : 1.0 - MathHelper.method37808(var17));

            while (var39 <= 1.0 || var41 <= 1.0 || var43 <= 1.0) {
               if (!(var39 < var41)) {
                  if (!(var41 < var43)) {
                     var21 += var32;
                     var43 += var37;
                  } else {
                     var20 += var31;
                     var41 += var35;
                  }
               } else if (!(var39 < var43)) {
                  var21 += var32;
                  var43 += var37;
               } else {
                  var19 += var30;
                  var39 += var33;
               }

               Object var45 = var1.apply(var0, var22.method8372(var19, var20, var21));
               if (var45 != null) {
                  return (T)var45;
               }
            }

            return (T)var2.apply(var0);
         } else {
            return (T)var23;
         }
      } else {
         return (T)var2.apply(var0);
      }
   }
}

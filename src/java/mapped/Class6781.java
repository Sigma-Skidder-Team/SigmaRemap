package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;

public class Class6781 extends Class6768<Class8278> {
   private static final Class7380 field29573 = Class8487.field37012.method11579();
   private static final Class7380 field29490 = Class8487.field36417.method11579();
   private static final Class7380 field29574 = Class8487.field36581.method11579();
   public long field29575;
   public Class7689 field29576;

   public Class6781(Codec<Class8278> var1) {
      super(var1);
   }

   public void method20654(
      Random var1,
      Class1670 var2,
      Class8907 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      Class7380 var9,
      Class7380 var10,
      int var11,
      long var12,
      Class8278 var14
   ) {
      int var17 = var11;
      int var18 = var4 & 15;
      int var19 = var5 & 15;
      double var20 = 0.03125;
      boolean var22 = this.field29576.method25310((double)var4 * 0.03125, (double)var5 * 0.03125, 0.0) * 75.0 + var1.nextDouble() > 0.0;
      boolean var23 = this.field29576.method25310((double)var4 * 0.03125, 109.0, (double)var5 * 0.03125) * 75.0 + var1.nextDouble() > 0.0;
      int var24 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      Mutable var25 = new Mutable();
      int var26 = -1;
      Class7380 var27 = var14.method28934();
      Class7380 var28 = var14.method28935();

      for (int var29 = 127; var29 >= 0; var29--) {
         var25.method8372(var18, var29, var19);
         Class7380 var30 = var2.method6738(var25);
         if (!var30.method23393()) {
            if (var30.method23448(var9.method23383())) {
               if (var26 != -1) {
                  if (var26 > 0) {
                     var26--;
                     var2.method7061(var25, var28, false);
                  }
               } else {
                  boolean var31 = false;
                  if (var24 > 0) {
                     if (var29 >= var17 - 4 && var29 <= var17 + 1) {
                        var27 = var14.method28934();
                        var28 = var14.method28935();
                        if (var23) {
                           var27 = field29490;
                           var28 = var14.method28935();
                        }

                        if (var22) {
                           var27 = field29574;
                           var28 = field29574;
                        }
                     }
                  } else {
                     var31 = true;
                     var28 = var14.method28935();
                  }

                  if (var29 < var17 && var31) {
                     var27 = var10;
                  }

                  var26 = var24;
                  if (var29 < var17 - 1) {
                     var2.method7061(var25, var28, false);
                  } else {
                     var2.method7061(var25, var27, false);
                  }
               }
            }
         } else {
            var26 = -1;
         }
      }
   }

   @Override
   public void method20658(long var1) {
      if (this.field29575 != var1 || this.field29576 == null) {
         this.field29576 = new Class7689(new Class2420(var1), IntStream.rangeClosed(-3, 0));
      }

      this.field29575 = var1;
   }
}

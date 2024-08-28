package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6772 extends Class6768<Class8278> {
   private static final Class7380 field29546 = Blocks.field37012.method11579();
   public long field29547;
   private Class7689 field29548;

   public Class6772(Codec<Class8278> var1) {
      super(var1);
   }

   public void method20654(
      Random var1,
      Class1670 var2,
      Biome var3,
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
      double var20 = this.field29548.method25310((double)var4 * 0.1, (double)var11, (double)var5 * 0.1);
      boolean var22 = var20 > 0.15 + var1.nextDouble() * 0.35;
      double var23 = this.field29548.method25310((double)var4 * 0.1, 109.0, (double)var5 * 0.1);
      boolean var25 = var23 > 0.25 + var1.nextDouble() * 0.9;
      int var26 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      Mutable var27 = new Mutable();
      int var28 = -1;
      Class7380 var29 = var14.method28935();

      for (int var30 = 127; var30 >= 0; var30--) {
         var27.method8372(var18, var30, var19);
         Class7380 var31 = var14.method28934();
         Class7380 var32 = var2.method6738(var27);
         if (!var32.method23393()) {
            if (var32.method23448(var9.method23383())) {
               if (var28 != -1) {
                  if (var28 > 0) {
                     var28--;
                     var2.method7061(var27, var29, false);
                  }
               } else {
                  boolean var33 = false;
                  if (var26 <= 0) {
                     var33 = true;
                     var29 = var14.method28935();
                  }

                  if (!var22) {
                     if (var25) {
                        var31 = var14.method28936();
                     }
                  } else {
                     var31 = var14.method28935();
                  }

                  if (var30 < var17 && var33) {
                     var31 = var10;
                  }

                  var28 = var26;
                  if (var30 < var17 - 1) {
                     var2.method7061(var27, var29, false);
                  } else {
                     var2.method7061(var27, var31, false);
                  }
               }
            }
         } else {
            var28 = -1;
         }
      }
   }

   @Override
   public void method20658(long var1) {
      if (this.field29547 != var1 || this.field29548 == null) {
         this.field29548 = new Class7689(new Class2420(var1), ImmutableList.of(0));
      }

      this.field29547 = var1;
   }
}

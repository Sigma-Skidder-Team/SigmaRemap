package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class class_2622 extends class_3133<class_5194> {
   private static final class_2522 field_12923 = class_4783.field_23765.method_29260();
   public long field_12924;
   private class_2439 field_12922;

   public class_2622(Codec<class_5194> var1) {
      super(var1);
   }

   public void method_11869(
      Random var1,
      class_5990 var2,
      class_6325 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      class_2522 var9,
      class_2522 var10,
      int var11,
      long var12,
      class_5194 var14
   ) {
      int var17 = var11;
      int var18 = var4 & 15;
      int var19 = var5 & 15;
      double var20 = this.field_12922.method_11112((double)var4 * 0.1, (double)var11, (double)var5 * 0.1);
      boolean var22 = var20 > 0.15 + var1.nextDouble() * 0.35;
      double var23 = this.field_12922.method_11112((double)var4 * 0.1, 109.0, (double)var5 * 0.1);
      boolean var25 = var23 > 0.25 + var1.nextDouble() * 0.9;
      int var26 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      class_2921 var27 = new class_2921();
      int var28 = -1;
      class_2522 var29 = var14.method_19216();

      for (int var30 = 127; var30 >= 0; var30--) {
         var27.method_13362(var18, var30, var19);
         class_2522 var31 = var14.method_19215();
         class_2522 var32 = var2.method_28262(var27);
         if (!var32.method_8345()) {
            if (var32.method_8350(var9.method_8360())) {
               if (var28 != -1) {
                  if (var28 > 0) {
                     var28--;
                     var2.method_27348(var27, var29, false);
                  }
               } else {
                  boolean var33 = false;
                  if (var26 <= 0) {
                     var33 = true;
                     var29 = var14.method_19216();
                  }

                  if (!var22) {
                     if (var25) {
                        var31 = var14.method_23858();
                     }
                  } else {
                     var31 = var14.method_19216();
                  }

                  if (var30 < var17 && var33) {
                     var31 = var10;
                  }

                  var28 = var26;
                  if (var30 < var17 - 1) {
                     var2.method_27348(var27, var29, false);
                  } else {
                     var2.method_27348(var27, var31, false);
                  }
               }
            }
         } else {
            var28 = -1;
         }
      }
   }

   @Override
   public void method_14499(long var1) {
      if (this.field_12924 != var1 || this.field_12922 == null) {
         this.field_12922 = new class_2439(new class_8679(var1), ImmutableList.of(0));
      }

      this.field_12924 = var1;
   }
}

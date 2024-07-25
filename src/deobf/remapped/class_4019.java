package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;

public class class_4019 extends class_3133<class_5194> {
   private static final class_2522 field_19506 = class_4783.field_23765.method_29260();
   private static final class_2522 field_19504 = class_4783.field_23709.method_29260();
   private static final class_2522 field_19507 = class_4783.field_23784.method_29260();
   public long field_19503;
   public class_2439 field_19505;

   public class_4019(Codec<class_5194> var1) {
      super(var1);
   }

   public void method_18513(
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
      double var20 = 0.03125;
      boolean var22 = this.field_19505.method_11112((double)var4 * 0.03125, (double)var5 * 0.03125, 0.0) * 75.0 + var1.nextDouble() > 0.0;
      boolean var23 = this.field_19505.method_11112((double)var4 * 0.03125, 109.0, (double)var5 * 0.03125) * 75.0 + var1.nextDouble() > 0.0;
      int var24 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      class_2921 var25 = new class_2921();
      int var26 = -1;
      class_2522 var27 = var14.method_19215();
      class_2522 var28 = var14.method_19216();

      for (int var29 = 127; var29 >= 0; var29--) {
         var25.method_13362(var18, var29, var19);
         class_2522 var30 = var2.method_28262(var25);
         if (!var30.method_8345()) {
            if (var30.method_8350(var9.method_8360())) {
               if (var26 != -1) {
                  if (var26 > 0) {
                     var26--;
                     var2.method_27348(var25, var28, false);
                  }
               } else {
                  boolean var31 = false;
                  if (var24 > 0) {
                     if (var29 >= var17 - 4 && var29 <= var17 + 1) {
                        var27 = var14.method_19215();
                        var28 = var14.method_19216();
                        if (var23) {
                           var27 = field_19504;
                           var28 = var14.method_19216();
                        }

                        if (var22) {
                           var27 = field_19507;
                           var28 = field_19507;
                        }
                     }
                  } else {
                     var31 = true;
                     var28 = var14.method_19216();
                  }

                  if (var29 < var17 && var31) {
                     var27 = var10;
                  }

                  var26 = var24;
                  if (var29 < var17 - 1) {
                     var2.method_27348(var25, var28, false);
                  } else {
                     var2.method_27348(var25, var27, false);
                  }
               }
            }
         } else {
            var26 = -1;
         }
      }
   }

   @Override
   public void method_14499(long var1) {
      if (this.field_19503 != var1 || this.field_19505 == null) {
         this.field_19505 = new class_2439(new class_8679(var1), IntStream.rangeClosed(-3, 0));
      }

      this.field_19503 = var1;
   }
}

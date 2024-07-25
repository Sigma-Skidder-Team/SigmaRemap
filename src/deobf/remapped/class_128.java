package remapped;

import java.util.Random;

public class class_128 extends class_3599 {
   private static String[] field_317;
   private final class_6174 field_318;
   private int field_316;

   public class_128(class_6174 var1) {
      this.field_318 = var1;
   }

   public void method_395() {
      if (this.field_316 == 0) {
         this.field_316 = 20;
      }
   }

   @Override
   public boolean method_16795() {
      return this.field_316 > 0;
   }

   @Override
   public void method_16794() {
      this.field_316--;
      if (this.field_316 <= 0) {
         class_6486 var3 = this.field_318.field_41768;
         Random var4 = this.field_318.method_26594();
         class_1331 var5 = this.field_318.method_37075();

         for (int var6 = 0; var6 <= 5 && var6 >= -5; var6 = (var6 > 0 ? 0 : 1) - var6) {
            for (int var7 = 0; var7 <= 10 && var7 >= -10; var7 = (var7 > 0 ? 0 : 1) - var7) {
               for (int var8 = 0; var8 <= 10 && var8 >= -10; var8 = (var8 > 0 ? 0 : 1) - var8) {
                  class_1331 var9 = var5.method_6104(var7, var6, var8);
                  class_2522 var10 = var3.method_28262(var9);
                  class_6414 var11 = var10.method_8360();
                  if (var11 instanceof class_6598) {
                     if (!var3.method_29537().method_1285(class_291.field_1047)) {
                        var3.method_7513(var9, ((class_6598)var11).method_30381().method_29260(), 3);
                     } else {
                        var3.method_7511(var9, true, this.field_318);
                     }

                     if (var4.nextBoolean()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }
}

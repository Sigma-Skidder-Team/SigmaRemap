package remapped;

public class class_8348 implements class_4617 {
   private static String[] field_42757;
   public int field_42756;
   public int field_42758;

   public class_8348(int var1) {
      this(var1, 0);
   }

   public class_8348(int var1, int var2) {
      this.field_42756 = var1;
      this.field_42758 = var2;
   }

   private class_7038 method_38441(class_7038[] var1) {
      class_7038 var4 = var1[0];

      for (class_7038 var8 : var1) {
         if (var8.method_32137() > var4.method_32137()) {
            var4 = var8;
         }
      }

      return var4;
   }

   @Override
   public void method_21389(class_7038 var1) {
      if (var1.method_32134().size() > 0) {
         int var4 = 0;

         while (var4 < var1.method_32134().size()) {
            class_7038 var5 = var1.method_32134().get(var4);
            if (var4 > 0 && var4 % this.field_42756 == 0) {
               class_7038[] var6 = new class_7038[this.field_42756];

               for (int var7 = 0; var7 < this.field_42756; var7++) {
                  var6[var7] = var1.method_32134().get(var4 - this.field_42756 + var7);
               }

               class_7038 var9 = this.method_38441(var6);
               var5.method_32135((var2, var3) -> var2.method_32117(var9.method_32173() + var2.method_32137() + this.field_42758));
            }

            class_7038[] var8 = new class_7038[this.field_42756];
            var8[0] = var5;

            for (int var10 = 1; var10 < this.field_42756; var10++) {
               var8[var10] = var1.method_32134().get(var4 + var10);
               this.method_38441(var8).method_32135((var1x, var2) -> var1x.method_32117(var5.method_32173() + var5.method_32137() / 2));
            }

            var4 += this.field_42756;
         }
      }
   }
}

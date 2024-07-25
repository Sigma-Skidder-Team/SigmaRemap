package remapped;

public class class_5050 extends class_4382 {
   private static String[] field_26092;

   public class_5050(class_5855 var1, class_6943... var2) {
      super(var1, class_8718.field_44694, var2);
   }

   @Override
   public int method_20433(int var1) {
      return var1 * 10;
   }

   @Override
   public int method_20437(int var1) {
      return this.method_20433(var1) + 15;
   }

   @Override
   public boolean method_20429() {
      return true;
   }

   @Override
   public int method_20417() {
      return 2;
   }

   public static void method_23231(class_5834 var0, class_6486 var1, class_1331 var2, int var3) {
      if (var0.method_37360()) {
         class_2522 var6 = class_4783.field_23320.method_29260();
         float var7 = (float)Math.min(16, 2 + var3);
         class_2921 var8 = new class_2921();

         for (class_1331 var10 : class_1331.method_6076(
            var2.method_6103((double)(-var7), -1.0, (double)(-var7)), var2.method_6103((double)var7, -1.0, (double)var7)
         )) {
            if (var10.method_12170(var0.method_37245(), (double)var7)) {
               var8.method_13362(var10.method_12173(), var10.method_12165() + 1, var10.method_12185());
               class_2522 var11 = var1.method_28262(var8);
               if (var11.method_8345()) {
                  class_2522 var12 = var1.method_28262(var10);
                  if (var12.method_8362() == class_5371.field_27439
                     && var12.<Integer>method_10313(class_7855.field_39806) == 0
                     && var6.method_8309(var1, var10)
                     && var1.method_6671(var6, var10, class_214.method_928())) {
                     var1.method_29594(var10, var6);
                     var1.method_43367().method_14011(var10, class_4783.field_23320, class_9299.method_42824(var0.method_26594(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean method_20426(class_4382 var1) {
      return super.method_20426(var1) && var1 != class_3668.field_17869;
   }
}

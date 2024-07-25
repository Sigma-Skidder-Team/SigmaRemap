package remapped;

import java.util.Random;

public class class_305 extends class_6414 {
   private static String[] field_1123;

   public class_305(class_3073 var1) {
      super(var1);
   }

   @Override
   public void method_10760(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      var2.method_43367().method_14011(var3, this, this.method_1363());
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      var4.method_43367().method_14011(var5, this, this.method_1363());
      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (method_1361(var2.method_28262(var3.method_6100())) && var3.method_12165() >= 0) {
         class_1453 var7 = new class_1453(
            var2, (double)var3.method_12173() + 0.5, (double)var3.method_12165(), (double)var3.method_12185() + 0.5, var2.method_28262(var3)
         );
         this.method_1359(var7);
         var2.method_7509(var7);
      }
   }

   public void method_1359(class_1453 var1) {
   }

   public int method_1363() {
      return 2;
   }

   public static boolean method_1361(class_2522 var0) {
      class_5371 var3 = var0.method_8362();
      return var0.method_8345() || var0.method_8349(class_2351.field_11771) || var3.method_24494() || var3.method_24497();
   }

   public void method_1360(World var1, class_1331 var2, class_2522 var3, class_2522 var4, class_1453 var5) {
   }

   public void method_1362(World var1, class_1331 var2, class_1453 var3) {
   }

   @Override
   public void method_29280(class_2522 var1, World var2, class_1331 var3, Random var4) {
      if (var4.nextInt(16) == 0) {
         class_1331 var7 = var3.method_6100();
         if (method_1361(var2.method_28262(var7))) {
            double var8 = (double)var3.method_12173() + var4.nextDouble();
            double var10 = (double)var3.method_12165() - 0.05;
            double var12 = (double)var3.method_12185() + var4.nextDouble();
            var2.method_43361(new class_7110(class_3090.field_15371, var1), var8, var10, var12, 0.0, 0.0, 0.0);
         }
      }
   }

   public int method_1358(class_2522 var1, class_6163 var2, class_1331 var3) {
      return -16777216;
   }
}

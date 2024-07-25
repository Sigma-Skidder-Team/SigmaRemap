package remapped;

import java.util.Random;

public class class_8890 extends class_8543 {
   private static String[] field_45605;

   public class_8890(class_1425 var1, class_3073 var2) {
      super(var1, 8, var2);
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, class_1331 var3) {
      return super.method_12870(var1, var2, var3)
         || var1.method_8350(class_4783.field_23700)
         || var1.method_8350(class_4783.field_23784)
         || var1.method_8350(class_4783.field_23531);
   }

   @Override
   public void method_29280(class_2522 var1, class_6486 var2, class_1331 var3, Random var4) {
      class_4190 var7 = this.method_10769(var1, var2, var3, class_214.method_928());
      class_1343 var8 = var7.method_19483().method_18926();
      double var9 = (double)var3.method_12173() + var8.field_7336;
      double var11 = (double)var3.method_12185() + var8.field_7334;

      for (int var13 = 0; var13 < 3; var13++) {
         if (var4.nextBoolean()) {
            var2.method_43361(
               class_3090.field_15376,
               var9 + var4.nextDouble() / 5.0,
               (double)var3.method_12165() + (0.5 - var4.nextDouble()),
               var11 + var4.nextDouble() / 5.0,
               0.0,
               0.0,
               0.0
            );
         }
      }
   }

   @Override
   public void method_10784(class_2522 var1, class_6486 var2, class_1331 var3, class_8145 var4) {
      if (!var2.field_33055 && var2.method_43370() != class_423.field_1790 && var4 instanceof class_5834) {
         class_5834 var7 = (class_5834)var4;
         if (!var7.method_37180(class_6199.field_31669)) {
            var7.method_26558(new class_2250(class_4054.field_19725, 40));
         }
      }
   }
}

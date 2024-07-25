package remapped;

import java.util.Random;

public class class_3724 extends class_250 {
   private static String[] field_18227;

   public class_3724(class_3073 var1) {
      super(var1);
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      super.method_29280(var1, var2, var3, var4);
      if (var4.nextInt(10) == 0) {
         var2.method_43361(
            class_3090.field_15328,
            (double)var3.method_12173() + var4.nextDouble(),
            (double)var3.method_12165() + 1.1,
            (double)var3.method_12185() + var4.nextDouble(),
            0.0,
            0.0,
            0.0
         );
      }
   }
}

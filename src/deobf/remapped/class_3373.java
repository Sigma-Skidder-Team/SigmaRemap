package remapped;

import java.util.Random;

public class class_3373 extends class_6414 {
   private static String[] field_16639;

   public class_3373(class_3073 var1) {
      super(var1);
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (var2.method_22572().method_40242()) {
         var2.method_7513(var3, class_4783.field_23626.method_29260(), 3);
         var2.method_43364(2009, var3, 0);
         var2.method_43359((class_704)null, var3, class_463.field_2472, class_562.field_3322, 1.0F, (1.0F + var2.method_43360().nextFloat() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      Direction var7 = Direction.method_1039(var4);
      if (var7 != Direction.field_817) {
         BlockPos var8 = var3.method_6098(var7);
         class_2522 var9 = var2.method_28262(var8);
         if (!var1.method_8302() || !var9.method_8308(var2, var8, var7.method_1046())) {
            double var10 = (double)var3.method_12173();
            double var12 = (double)var3.method_12165();
            double var14 = (double)var3.method_12185();
            if (var7 != Direction.field_802) {
               var12 += var4.nextDouble() * 0.8;
               if (var7.method_1029() != class_9249.field_47215) {
                  var10 += var4.nextDouble();
                  if (var7 != Direction.field_800) {
                     var14 += 0.05;
                  } else {
                     var14++;
                  }
               } else {
                  var14 += var4.nextDouble();
                  if (var7 != Direction.field_804) {
                     var10 += 0.05;
                  } else {
                     var10++;
                  }
               }
            } else {
               var12 -= 0.05;
               var10 += var4.nextDouble();
               var14 += var4.nextDouble();
            }

            var2.method_43361(class_3090.field_15358, var10, var12, var14, 0.0, 0.0, 0.0);
         }
      }
   }
}

package remapped;

import java.util.List;

public class class_8899 extends class_2451 {
   private static String[] field_45639;

   public class_8899(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      if (!var6.method_8350(class_4783.field_23881) && !var6.method_8350(class_4783.field_23433)) {
         return class_6910.field_35517;
      } else {
         BlockPos var7 = var5.method_6081();
         if (var4.method_22548(var7)) {
            double var8 = (double)var7.getX();
            double var10 = (double)var7.method_12165();
            double var12 = (double)var7.method_12185();
            List var14 = var4.method_25870((Entity)null, new Box(var8, var10, var12, var8 + 1.0, var10 + 2.0, var12 + 1.0));
            if (var14.isEmpty()) {
               if (var4 instanceof class_6331) {
                  class_3577 var15 = new class_3577(var4, var8 + 0.5, var10, var12 + 0.5);
                  var15.method_16627(false);
                  var4.method_7509(var15);
                  class_2810 var16 = ((class_6331)var4).method_28967();
                  if (var16 != null) {
                     var16.method_12774();
                  }
               }

               var1.method_21867().method_27970(1);
               return class_6910.method_31659(var4.field_33055);
            } else {
               return class_6910.field_35517;
            }
         } else {
            return class_6910.field_35517;
         }
      }
   }

   @Override
   public boolean method_11252(ItemStack var1) {
      return true;
   }
}

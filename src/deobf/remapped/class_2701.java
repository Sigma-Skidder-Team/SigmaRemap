package remapped;

public class class_2701 extends class_2451 {
   private static String[] field_13234;

   public class_2701(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      class_704 var4 = var1.method_21868();
      World var5 = var1.method_21862();
      BlockPos var6 = var1.method_21858();
      class_2522 var7 = var5.method_28262(var6);
      if (!class_8474.method_39007(var7)) {
         BlockPos var8 = var6.method_6098(var1.method_21857());
         if (!class_9476.method_43769(var5, var8, var1.method_21863())) {
            return class_6910.field_35517;
         } else {
            var5.method_43359(var4, var8, class_463.field_2235, class_562.field_3322, 1.0F, field_12172.nextFloat() * 0.4F + 0.8F);
            class_2522 var9 = class_9476.method_43768(var5, var8);
            var5.method_7513(var8, var9, 11);
            ItemStack var10 = var1.method_21867();
            if (var4 instanceof class_9359) {
               class_8807.field_45052.method_10661((class_9359)var4, var8, var10);
               var10.method_28003(1, var4, var1x -> var1x.method_26447(var1.method_21860()));
            }

            return class_6910.method_31659(var5.method_22567());
         }
      } else {
         var5.method_43359(var4, var6, class_463.field_2235, class_562.field_3322, 1.0F, field_12172.nextFloat() * 0.4F + 0.8F);
         var5.method_7513(var6, var7.method_10308(class_6023.field_30732, Boolean.valueOf(true)), 11);
         if (var4 != null) {
            var1.method_21867().method_28003(1, var4, var1x -> var1x.method_26447(var1.method_21860()));
         }

         return class_6910.method_31659(var5.method_22567());
      }
   }
}

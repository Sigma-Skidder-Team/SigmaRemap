package remapped;

public class class_5295 extends class_2451 {
   private static String[] field_27049;

   public class_5295(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      boolean var7 = false;
      if (!class_8474.method_39007(var6)) {
         var5 = var5.method_6098(var1.method_21857());
         if (class_9476.method_43769(var4, var5, var1.method_21863())) {
            this.method_24144(var4, var5);
            var4.method_29594(var5, class_9476.method_43768(var4, var5));
            var7 = true;
         }
      } else {
         this.method_24144(var4, var5);
         var4.method_29594(var5, var6.method_10308(class_8474.field_43423, Boolean.valueOf(true)));
         var7 = true;
      }

      if (!var7) {
         return class_6910.field_35517;
      } else {
         var1.method_21867().method_27970(1);
         return class_6910.method_31659(var4.field_33055);
      }
   }

   private void method_24144(World var1, BlockPos var2) {
      var1.method_43359(
         (class_704)null, var2, class_463.field_2446, class_562.field_3322, 1.0F, (field_12172.nextFloat() - field_12172.nextFloat()) * 0.2F + 1.0F
      );
   }
}

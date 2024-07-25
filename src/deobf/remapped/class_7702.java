package remapped;

public class class_7702 extends class_2451 {
   public class_7702(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      class_2522 var6 = var4.method_28262(var5);
      if (!var6.method_8350(class_4783.field_23566)) {
         return class_6910.field_35521;
      } else {
         return !class_2013.method_9334(var4, var5, var6, var1.method_21867()) ? class_6910.field_35521 : class_6910.method_31659(var4.field_33055);
      }
   }

   @Override
   public class_954<ItemStack> method_11231(World var1, class_704 var2, Hand var3) {
      ItemStack var6 = var2.method_26617(var3);
      var2.method_3174(var6, var3);
      var2.method_3211(class_6234.field_31907.method_43790(this));
      return class_954.<ItemStack>method_4208(var6, var1.method_22567());
   }

   public static boolean method_34884(CompoundNBT var0) {
      if (var0 == null) {
         return false;
      } else if (!var0.contains("pages", 9)) {
         return false;
      } else {
         class_3416 var3 = var0.method_25927("pages", 8);

         for (int var4 = 0; var4 < var3.size(); var4++) {
            String var5 = var3.method_15770(var4);
            if (var5.length() > 32767) {
               return false;
            }
         }

         return true;
      }
   }
}

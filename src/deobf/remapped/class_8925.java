package remapped;

public final class class_8925 extends class_8085 {
   private static String[] field_45758;
   private final class_9446 field_45759 = new class_9446();

   private ItemStack method_41030(class_8743 var1, ItemStack var2, ItemStack var3) {
      var2.method_27970(1);
      if (!var2.method_28022()) {
         if (var1.<class_7434>method_40143().method_33832(var3.method_27973()) < 0) {
            this.field_45759.method_28324(var1, var3.method_27973());
         }

         return var2;
      } else {
         return var3.method_27973();
      }
   }

   @Override
   public ItemStack method_43688(class_8743 var1, ItemStack var2) {
      this.method_36717(false);
      class_6331 var5 = var1.method_40140();
      BlockPos var6 = var1.method_40142().method_6098(var1.method_40141().<Direction>method_10313(class_6451.field_32900));
      class_2522 var7 = var5.method_28262(var6);
      if (var7.method_8329(class_2351.field_11727, var0 -> var0.method_10307(class_4745.field_22992))
         && var7.<Integer>method_10313(class_4745.field_22992) >= 5) {
         ((class_4745)var7.method_8360()).method_21920(var5, var7, var6, (class_704)null, class_8771.field_44898);
         this.method_36717(true);
         return this.method_41030(var1, var2, new ItemStack(class_4897.field_24773));
      } else if (!var5.method_28258(var6).method_22007(class_6503.field_33094)) {
         return super.method_43688(var1, var2);
      } else {
         this.method_36717(true);
         return this.method_41030(var1, var2, class_9541.method_43999(new ItemStack(class_4897.field_25157), class_3697.field_18108));
      }
   }
}

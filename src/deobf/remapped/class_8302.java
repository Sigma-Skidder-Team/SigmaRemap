package remapped;

public class class_8302 extends class_7934 {
   private static String[] field_42538;

   public class_8302(class_338 var1, class_6867 var2, int var3, int var4, int var5, class_9210 var6) {
      super(var2, var3, var4, var5);
      this.field_42536 = var1;
      this.field_42537 = var6;
   }

   @Override
   public boolean method_35889(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method_35892(class_704 var1, ItemStack var2) {
      var2.method_27964(var1.world, var1, var2.method_27997());
      class_338.method_1560(this.field_42536).method_41424(var1);
      ItemStack var5 = this.field_42536.field_1266.method_35899(1);
      if (!var5.method_28022()) {
         class_338.method_1569(this.field_42536);
      }

      this.field_42537.method_42533((var1x, var2x) -> {
         long var5x = var1x.method_29546();
         if (class_338.method_1559(this.field_42536) != var5x) {
            var1x.method_43359((class_704)null, var2x, class_463.field_2682, class_562.field_3322, 1.0F, 1.0F);
            class_338.method_1564(this.field_42536, var5x);
         }
      });
      return super.method_35892(var1, var2);
   }
}

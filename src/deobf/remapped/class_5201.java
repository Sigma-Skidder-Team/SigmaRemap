package remapped;

public class class_5201 extends class_7934 {
   private static String[] field_26741;

   public class_5201(class_3973 var1, class_6867 var2, int var3, int var4, int var5, class_9210 var6) {
      super(var2, var3, var4, var5);
      this.field_26740 = var1;
      this.field_26742 = var6;
   }

   @Override
   public boolean method_35889(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method_35892(class_704 var1, ItemStack var2) {
      this.field_26740.field_19926.get(0).method_35899(1);
      this.field_26740.field_19926.get(1).method_35899(1);
      var2.method_27960().method_11236(var2, var1.field_41768, var1);
      this.field_26742.method_42533((var1x, var2x) -> {
         long var5 = var1x.method_29546();
         if (class_3973.method_18343(this.field_26740) != var5) {
            var1x.method_43359((class_704)null, var2x, class_463.field_2627, class_562.field_3322, 1.0F, 1.0F);
            class_3973.method_18345(this.field_26740, var5);
         }
      });
      return super.method_35892(var1, var2);
   }
}

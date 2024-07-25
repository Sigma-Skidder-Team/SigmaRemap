package remapped;

public class class_873 extends class_7934 {
   private static String[] field_4516;

   public class_873(class_2875 var1, class_6867 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field_4515 = var1;
   }

   @Override
   public boolean method_35889(ItemStack var1) {
      return false;
   }

   @Override
   public boolean method_35895(PlayerEntity var1) {
      return this.field_4515.method_13210(var1, this.method_35884());
   }

   @Override
   public ItemStack method_35892(PlayerEntity var1, ItemStack var2) {
      return this.field_4515.method_13209(var1, var2);
   }
}

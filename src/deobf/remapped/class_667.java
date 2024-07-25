package remapped;

public class class_667 implements class_8932<class_6867> {
   private static String[] field_3699;
   private final class_8137 field_3695;
   private final class_8137 field_3697;
   private final ItemStack field_3698;
   private final Identifier field_3696;

   public class_667(Identifier var1, class_8137 var2, class_8137 var3, ItemStack var4) {
      this.field_3696 = var1;
      this.field_3695 = var2;
      this.field_3697 = var3;
      this.field_3698 = var4;
   }

   @Override
   public boolean method_41052(class_6867 var1, World var2) {
      return this.field_3695.test(var1.method_31498(0)) && this.field_3697.test(var1.method_31498(1));
   }

   @Override
   public ItemStack method_41042(class_6867 var1) {
      ItemStack var4 = this.field_3698.method_27973();
      CompoundNBT var5 = var1.method_31498(0).method_27990();
      if (var5 != null) {
         var4.method_27965(var5.method_25944());
      }

      return var4;
   }

   @Override
   public boolean method_41047(int var1, int var2) {
      return var1 * var2 >= 2;
   }

   @Override
   public ItemStack method_41044() {
      return this.field_3698;
   }

   public boolean method_3043(ItemStack var1) {
      return this.field_3697.test(var1);
   }

   @Override
   public ItemStack method_41049() {
      return new ItemStack(class_4783.field_23646);
   }

   @Override
   public Identifier method_41050() {
      return this.field_3696;
   }

   @Override
   public class_2994<?> method_41048() {
      return class_2994.field_14719;
   }

   @Override
   public class_1510<?> method_41045() {
      return class_1510.field_7998;
   }
}

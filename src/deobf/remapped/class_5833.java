package remapped;

public class class_5833 extends class_7934 {
   private static String[] field_29596;
   private final class_704 field_29594;
   private int field_29595;

   public class_5833(class_704 var1, class_6867 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field_29594 = var1;
   }

   @Override
   public boolean method_35889(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method_35899(int var1) {
      if (this.method_35884()) {
         this.field_29595 = this.field_29595 + Math.min(var1, this.method_35898().method_27997());
      }

      return super.method_35899(var1);
   }

   @Override
   public ItemStack method_35892(class_704 var1, ItemStack var2) {
      this.method_35893(var2);
      super.method_35892(var1, var2);
      return var2;
   }

   @Override
   public void method_35894(ItemStack var1, int var2) {
      this.field_29595 += var2;
      this.method_35893(var1);
   }

   @Override
   public void method_35893(ItemStack var1) {
      var1.method_27964(this.field_29594.field_41768, this.field_29594, this.field_29595);
      if (!this.field_29594.field_41768.field_33055 && this.field_40591 instanceof class_7933) {
         ((class_7933)this.field_40591).method_35869(this.field_29594);
      }

      this.field_29595 = 0;
   }
}

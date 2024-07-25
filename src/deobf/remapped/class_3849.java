package remapped;

public class class_3849 extends class_7934 {
   private static String[] field_18780;

   public class_3849(class_7741 var1, class_6867 var2, int var3, int var4, int var5, class_4109 var6) {
      super(var2, var3, var4, var5);
      this.field_18782 = var1;
      this.field_18781 = var6;
   }

   @Override
   public boolean method_35889(ItemStack var1) {
      return var1.method_27960() == class_4897.field_24836 && !this.method_35884() && this.field_18781.method_43356();
   }

   @Override
   public boolean method_35886() {
      return this.field_18781.method_43356();
   }
}

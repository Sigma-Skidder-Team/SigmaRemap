package remapped;

public class class_8146 extends class_2451 {
   private static String[] field_41775;

   public class_8146(class_317 var1) {
      super(var1);
   }

   @Override
   public boolean method_11209(ItemStack var1, World var2, class_2522 var3, BlockPos var4, class_5834 var5) {
      if (!var2.field_33055 && !var3.method_8360().method_29299(class_2351.field_11771)) {
         var1.method_28003(1, var5, var0 -> var0.method_26448(class_6943.field_35707));
      }

      return !var3.method_8349(class_2351.field_11737)
            && !var3.method_8350(class_4783.field_23718)
            && !var3.method_8350(class_4783.field_23868)
            && !var3.method_8350(class_4783.field_23616)
            && !var3.method_8350(class_4783.field_23254)
            && !var3.method_8350(class_4783.field_23323)
            && !var3.method_8350(class_4783.field_23460)
            && !var3.method_8349(class_2351.field_11738)
         ? super.method_11209(var1, var2, var3, var4, var5)
         : true;
   }

   @Override
   public boolean method_11222(class_2522 var1) {
      return var1.method_8350(class_4783.field_23718) || var1.method_8350(class_4783.field_23349) || var1.method_8350(class_4783.field_23460);
   }

   @Override
   public float method_11235(ItemStack var1, class_2522 var2) {
      if (!var2.method_8350(class_4783.field_23718) && !var2.method_8349(class_2351.field_11737)) {
         return !var2.method_8349(class_2351.field_11738) ? super.method_11235(var1, var2) : 5.0F;
      } else {
         return 15.0F;
      }
   }
}

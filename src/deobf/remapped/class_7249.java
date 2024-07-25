package remapped;

public class class_7249 extends class_4088 {
   private static String[] field_37160;
   private final class_6867 field_37159;

   public class_7249(int var1, class_7051 var2) {
      this(var1, var2, new class_4657(9));
   }

   public class_7249(int var1, class_7051 var2, class_6867 var3) {
      super(class_4165.field_20244, var1);
      method_18858(var3, 9);
      this.field_37159 = var3;
      var3.method_31501(var2.field_36409);

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 3; var7++) {
            this.method_18885(new class_7934(var3, var7 + var6 * 3, 62 + var7 * 18, 17 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.method_18885(new class_7934(var2, var10 + var8 * 9 + 9, 8 + var10 * 18, 84 + var8 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.method_18885(new class_7934(var2, var9, 8 + var9 * 18, 142));
      }
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return this.field_37159.method_31502(var1);
   }

   @Override
   public ItemStack method_18874(class_704 var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         ItemStack var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 >= 9) {
            if (!this.method_18892(var7, 0, 9, false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.method_18892(var7, 9, 45, true)) {
            return ItemStack.EMPTY;
         }

         if (!var7.method_28022()) {
            var6.method_35887();
         } else {
            var6.method_35896(ItemStack.EMPTY);
         }

         if (var7.method_27997() == var5.method_27997()) {
            return ItemStack.EMPTY;
         }

         var6.method_35892(var1, var7);
      }

      return var5;
   }

   @Override
   public void method_18876(class_704 var1) {
      super.method_18876(var1);
      this.field_37159.method_31499(var1);
   }
}

package remapped;

public abstract class class_8383 extends class_3954<class_6867> {
   private final class_6867 field_42898;
   private final class_6844 field_42896;
   public final World field_42895;
   private final class_1510<? extends class_3151> field_42897;
   private final class_4269 field_42894;

   public class_8383(class_4165<?> var1, class_1510<? extends class_3151> var2, class_4269 var3, int var4, class_7051 var5) {
      this(var1, var2, var3, var4, var5, new class_4657(3), new class_4799(4));
   }

   public class_8383(class_4165<?> var1, class_1510<? extends class_3151> var2, class_4269 var3, int var4, class_7051 var5, class_6867 var6, class_6844 var7) {
      super(var1, var4);
      this.field_42897 = var2;
      this.field_42894 = var3;
      method_18858(var6, 3);
      method_18867(var7, 4);
      this.field_42898 = var6;
      this.field_42896 = var7;
      this.field_42895 = var5.field_36409.world;
      this.method_18885(new class_7934(var6, 0, 56, 17));
      this.method_18885(new class_5040(this, var6, 1, 56, 53));
      this.method_18885(new class_5833(var5.field_36409, var6, 2, 116, 35));

      for (int var10 = 0; var10 < 3; var10++) {
         for (int var11 = 0; var11 < 9; var11++) {
            this.method_18885(new class_7934(var5, var11 + var10 * 9 + 9, 8 + var11 * 18, 84 + var10 * 18));
         }
      }

      for (int var12 = 0; var12 < 9; var12++) {
         this.method_18885(new class_7934(var5, var12, 8 + var12 * 18, 142));
      }

      this.method_18859(var7);
   }

   @Override
   public void method_18269(class_534 var1) {
      if (this.field_42898 instanceof class_3957) {
         ((class_3957)this.field_42898).method_18279(var1);
      }
   }

   @Override
   public void method_18270() {
      this.field_42898.method_24975();
   }

   @Override
   public void method_18264(boolean var1, class_8932<?> var2, class_9359 var3) {
      new class_5245<class_6867>(this).method_39713(var3, var2, var1);
   }

   @Override
   public boolean method_18267(class_8932<? super class_6867> var1) {
      return var1.method_41052(this.field_42898, this.field_42895);
   }

   @Override
   public int method_18262() {
      return 2;
   }

   @Override
   public int method_18268() {
      return 1;
   }

   @Override
   public int method_18266() {
      return 1;
   }

   @Override
   public int method_18265() {
      return 3;
   }

   @Override
   public boolean method_18861(class_704 var1) {
      return this.field_42898.method_31502(var1);
   }

   @Override
   public ItemStack method_18874(class_704 var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         ItemStack var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 != 2) {
            if (var2 != 1 && var2 != 0) {
               if (!this.method_38633(var7)) {
                  if (!this.method_38634(var7)) {
                     if (var2 >= 3 && var2 < 30) {
                        if (!this.method_18892(var7, 30, 39, false)) {
                           return ItemStack.EMPTY;
                        }
                     } else if (var2 >= 30 && var2 < 39 && !this.method_18892(var7, 3, 30, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (!this.method_18892(var7, 1, 2, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (!this.method_18892(var7, 0, 1, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method_18892(var7, 3, 39, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.method_18892(var7, 3, 39, true)) {
               return ItemStack.EMPTY;
            }

            var6.method_35888(var7, var5);
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

   public boolean method_38633(ItemStack var1) {
      return this.field_42895.method_29549().method_23138(this.field_42897, new class_4657(var1), this.field_42895).isPresent();
   }

   public boolean method_38634(ItemStack var1) {
      return class_7933.method_35873(var1);
   }

   public int method_38637() {
      int var3 = this.field_42896.method_31408(2);
      int var4 = this.field_42896.method_31408(3);
      return var4 != 0 && var3 != 0 ? var3 * 24 / var4 : 0;
   }

   public int method_38636() {
      int var3 = this.field_42896.method_31408(1);
      if (var3 == 0) {
         var3 = 200;
      }

      return this.field_42896.method_31408(0) * 13 / var3;
   }

   public boolean method_38635() {
      return this.field_42896.method_31408(0) > 0;
   }

   @Override
   public class_4269 method_18263() {
      return this.field_42894;
   }
}

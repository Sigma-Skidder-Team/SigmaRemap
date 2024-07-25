package remapped;

public class class_3973 extends class_4088 {
   private final class_9210 field_19280;
   private long field_19278;
   public final class_6867 field_19279 = new class_9645(this, 2);
   private final class_7143 field_19281 = new class_8487(this);

   public class_3973(int var1, class_7051 var2) {
      this(var1, var2, class_9210.field_47106);
   }

   public class_3973(int var1, class_7051 var2, class_9210 var3) {
      super(class_4165.field_20248, var1);
      this.field_19280 = var3;
      this.method_18885(new class_5266(this, this.field_19279, 0, 15, 15));
      this.method_18885(new class_8049(this, this.field_19279, 1, 15, 52));
      this.method_18885(new class_5201(this, this.field_19281, 2, 145, 39, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method_18885(new class_7934(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method_18885(new class_7934(var2, var8, 8 + var8 * 18, 142));
      }
   }

   @Override
   public boolean method_18861(PlayerEntity var1) {
      return method_18872(this.field_19280, var1, class_4783.field_23431);
   }

   @Override
   public void method_18853(class_6867 var1) {
      ItemStack var4 = this.field_19279.method_31498(0);
      ItemStack var5 = this.field_19279.method_31498(1);
      ItemStack var6 = this.field_19281.method_31498(2);
      if (var6.method_28022() || !var4.method_28022() && !var5.method_28022()) {
         if (!var4.method_28022() && !var5.method_28022()) {
            this.method_18344(var4, var5, var6);
         }
      } else {
         this.field_19281.method_31507(2);
      }
   }

   private void method_18344(ItemStack var1, ItemStack var2, ItemStack var3) {
      this.field_19280.method_42533((var4, var5) -> {
         class_2451 var8 = var2.method_27960();
         class_2134 var9 = class_2143.method_10012(var1, var4);
         if (var9 != null) {
            ItemStack var10;
            if (var8 == class_4897.field_24622 && !var9.field_10686 && var9.field_10678 < 4) {
               var10 = var1.method_27973();
               var10.method_28017(1);
               var10.method_27994().method_25931("map_scale_direction", 1);
               this.method_18877();
            } else if (var8 == class_4897.field_24799 && !var9.field_10686) {
               var10 = var1.method_27973();
               var10.method_28017(1);
               var10.method_27994().putBoolean("map_to_lock", true);
               this.method_18877();
            } else {
               if (var8 != class_4897.field_25113) {
                  this.field_19281.method_31507(2);
                  this.method_18877();
                  return;
               }

               var10 = var1.method_27973();
               var10.method_28017(2);
               this.method_18877();
            }

            if (!ItemStack.method_27982(var10, var3)) {
               this.field_19281.method_31503(2, var10);
               this.method_18877();
            }
         }
      });
   }

   @Override
   public boolean method_18873(ItemStack var1, class_7934 var2) {
      return var2.field_40591 != this.field_19281 && super.method_18873(var1, var2);
   }

   @Override
   public ItemStack method_18874(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         ItemStack var7 = var6.method_35898();
         class_2451 var8 = var7.method_27960();
         var5 = var7.method_27973();
         if (var2 != 2) {
            if (var2 != 1 && var2 != 0) {
               if (var8 != class_4897.field_25262) {
                  if (var8 != class_4897.field_24622 && var8 != class_4897.field_25113 && var8 != class_4897.field_24799) {
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
            var8.method_11236(var7, var1.world, var1);
            if (!this.method_18892(var7, 3, 39, true)) {
               return ItemStack.EMPTY;
            }

            var6.method_35888(var7, var5);
         }

         if (var7.method_28022()) {
            var6.method_35896(ItemStack.EMPTY);
         }

         var6.method_35887();
         if (var7.method_27997() == var5.method_27997()) {
            return ItemStack.EMPTY;
         }

         var6.method_35892(var1, var7);
         this.method_18877();
      }

      return var5;
   }

   @Override
   public void method_18876(PlayerEntity var1) {
      super.method_18876(var1);
      this.field_19281.method_31507(2);
      this.field_19280.method_42533((var2, var3) -> this.method_18887(var1, var1.world, this.field_19279));
   }
}

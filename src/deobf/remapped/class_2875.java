package remapped;

public abstract class class_2875 extends class_4088 {
   public final class_7143 field_14087 = new class_7143();
   public final class_6867 field_14085 = new class_484(this, 2);
   public final class_9210 field_14086;
   public final PlayerEntity field_14088;

   public abstract boolean method_13210(PlayerEntity var1, boolean var2);

   public abstract ItemStack method_13209(PlayerEntity var1, ItemStack var2);

   public abstract boolean method_13212(class_2522 var1);

   public class_2875(class_4165<?> var1, int var2, class_7051 var3, class_9210 var4) {
      super(var1, var2);
      this.field_14086 = var4;
      this.field_14088 = var3.field_36409;
      this.method_18885(new class_7934(this.field_14085, 0, 27, 47));
      this.method_18885(new class_7934(this.field_14085, 1, 76, 47));
      this.method_18885(new class_873(this, this.field_14087, 2, 134, 47));

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.method_18885(new class_7934(var3, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.method_18885(new class_7934(var3, var9, 8 + var9 * 18, 142));
      }
   }

   public abstract void method_13213();

   @Override
   public void method_18853(class_6867 var1) {
      super.method_18853(var1);
      if (var1 == this.field_14085) {
         this.method_13213();
      }
   }

   @Override
   public void method_18876(PlayerEntity var1) {
      super.method_18876(var1);
      this.field_14086.method_42533((var2, var3) -> this.method_18887(var1, var2, this.field_14085));
   }

   @Override
   public boolean method_18861(PlayerEntity var1) {
      return this.field_14086
         .<Boolean>method_42532(
            (var2, var3) -> this.method_13212(var2.method_28262(var3))
                  ? var1.method_37273((double)var3.method_12173() + 0.5, (double)var3.method_12165() + 0.5, (double)var3.method_12185() + 0.5) <= 64.0
                  : false,
            true
         );
   }

   public boolean method_13211(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method_18874(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      class_7934 var6 = this.field_19926.get(var2);
      if (var6 != null && var6.method_35884()) {
         ItemStack var7 = var6.method_35898();
         var5 = var7.method_27973();
         if (var2 != 2) {
            if (var2 != 0 && var2 != 1) {
               if (var2 >= 3 && var2 < 39) {
                  int var8 = !this.method_13211(var5) ? 0 : 1;
                  if (!this.method_18892(var7, var8, 2, false)) {
                     return ItemStack.EMPTY;
                  }
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
}

package remapped;

import javax.annotation.Nullable;

public class class_1459 implements class_6867 {
   private static String[] field_7858;
   private final class_233 field_7862;
   private final class_2831<ItemStack> field_7863 = class_2831.<ItemStack>method_12872(3, ItemStack.EMPTY);
   private class_8014 field_7859;
   private int field_7861;
   private int field_7860;

   public class_1459(class_233 var1) {
      this.field_7862 = var1;
   }

   @Override
   public int method_31505() {
      return this.field_7863.size();
   }

   @Override
   public boolean method_31495() {
      for (ItemStack var4 : this.field_7863) {
         if (!var4.method_28022()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack method_31498(int var1) {
      return this.field_7863.get(var1);
   }

   @Override
   public ItemStack method_31497(int var1, int var2) {
      ItemStack var5 = this.field_7863.get(var1);
      if (var1 == 2 && !var5.method_28022()) {
         return class_3037.method_13881(this.field_7863, var1, var5.method_27997());
      } else {
         ItemStack var6 = class_3037.method_13881(this.field_7863, var1, var2);
         if (!var6.method_28022() && this.method_6756(var1)) {
            this.method_6758();
         }

         return var6;
      }
   }

   private boolean method_6756(int var1) {
      return var1 == 0 || var1 == 1;
   }

   @Override
   public ItemStack method_31507(int var1) {
      return class_3037.method_13880(this.field_7863, var1);
   }

   @Override
   public void method_31503(int var1, ItemStack var2) {
      this.field_7863.set(var1, var2);
      if (!var2.method_28022() && var2.method_27997() > this.method_31506()) {
         var2.method_28017(this.method_31506());
      }

      if (this.method_6756(var1)) {
         this.method_6758();
      }
   }

   @Override
   public boolean method_31502(PlayerEntity var1) {
      return this.field_7862.method_978() == var1;
   }

   @Override
   public void method_17407() {
      this.method_6758();
   }

   public void method_6758() {
      this.field_7859 = null;
      ItemStack var3;
      ItemStack var4;
      if (!this.field_7863.get(0).method_28022()) {
         var3 = this.field_7863.get(0);
         var4 = this.field_7863.get(1);
      } else {
         var3 = this.field_7863.get(1);
         var4 = ItemStack.EMPTY;
      }

      if (!var3.method_28022()) {
         class_2795 var5 = this.field_7862.method_974();
         if (!var5.isEmpty()) {
            class_8014 var6 = var5.method_12710(var3, var4, this.field_7861);
            if (var6 == null || var6.method_36378()) {
               this.field_7859 = var6;
               var6 = var5.method_12710(var4, var3, this.field_7861);
            }

            if (var6 != null && !var6.method_36378()) {
               this.field_7859 = var6;
               this.method_31503(2, var6.method_36371());
               this.field_7860 = var6.method_36363();
            } else {
               this.method_31503(2, ItemStack.EMPTY);
               this.field_7860 = 0;
            }
         }

         this.field_7862.method_979(this.method_31498(2));
      } else {
         this.method_31503(2, ItemStack.EMPTY);
         this.field_7860 = 0;
      }
   }

   @Nullable
   public class_8014 method_6755() {
      return this.field_7859;
   }

   public void method_6757(int var1) {
      this.field_7861 = var1;
      this.method_6758();
   }

   @Override
   public void method_24975() {
      this.field_7863.clear();
   }

   public int method_6754() {
      return this.field_7860;
   }
}

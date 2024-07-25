package remapped;

import javax.annotation.Nullable;

public class class_7143 implements class_6867, class_9031 {
   private static String[] field_36796;
   private final class_2831<ItemStack> field_36795 = class_2831.<ItemStack>method_12872(1, ItemStack.EMPTY);
   private class_8932<?> field_36797;

   @Override
   public int method_31505() {
      return 1;
   }

   @Override
   public boolean method_31495() {
      for (ItemStack var4 : this.field_36795) {
         if (!var4.method_28022()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack method_31498(int var1) {
      return this.field_36795.get(0);
   }

   @Override
   public ItemStack method_31497(int var1, int var2) {
      return class_3037.method_13880(this.field_36795, 0);
   }

   @Override
   public ItemStack method_31507(int var1) {
      return class_3037.method_13880(this.field_36795, 0);
   }

   @Override
   public void method_31503(int var1, ItemStack var2) {
      this.field_36795.set(0, var2);
   }

   @Override
   public void method_17407() {
   }

   @Override
   public boolean method_31502(PlayerEntity var1) {
      return true;
   }

   @Override
   public void method_24975() {
      this.field_36795.clear();
   }

   @Override
   public void method_41427(class_8932<?> var1) {
      this.field_36797 = var1;
   }

   @Nullable
   @Override
   public class_8932<?> method_41426() {
      return this.field_36797;
   }
}

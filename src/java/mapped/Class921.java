package mapped;

import net.minecraft.entity.player.PlayerEntity;

import javax.annotation.Nullable;

public class Class921 implements Class920, Class923 {
   private static String[] field5240;
   private final NonNullList<ItemStack> field5241 = NonNullList.<ItemStack>method68(1, ItemStack.EMPTY);
   private Class4843<?> field5242;

   @Override
   public int method3629() {
      return 1;
   }

   @Override
   public boolean method3617() {
      for (ItemStack var4 : this.field5241) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack method3618(int var1) {
      return this.field5241.get(0);
   }

   @Override
   public ItemStack method3619(int var1, int var2) {
      return Class7920.method26564(this.field5241, 0);
   }

   @Override
   public ItemStack method3620(int var1) {
      return Class7920.method26564(this.field5241, 0);
   }

   @Override
   public void method3621(int var1, ItemStack var2) {
      this.field5241.set(0, var2);
   }

   @Override
   public void method3622() {
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return true;
   }

   @Override
   public void method3625() {
      this.field5241.clear();
   }

   @Override
   public void method3636(Class4843<?> var1) {
      this.field5242 = var1;
   }

   @Nullable
   @Override
   public Class4843<?> method3637() {
      return this.field5242;
   }
}

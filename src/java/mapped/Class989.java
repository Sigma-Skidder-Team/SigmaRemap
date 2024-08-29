package mapped;

public class Class989 implements Class920 {
   private static String[] field5472;
   public final Class948 field5473;

   public Class989(Class948 var1) {
      this.field5473 = var1;
   }

   @Override
   public int method3629() {
      return 1;
   }

   @Override
   public boolean method3617() {
      return Class948.method3815(this.field5473).isEmpty();
   }

   @Override
   public ItemStack method3618(int var1) {
      return var1 != 0 ? ItemStack.EMPTY : Class948.method3815(this.field5473);
   }

   @Override
   public ItemStack method3619(int var1, int var2) {
      if (var1 != 0) {
         return ItemStack.EMPTY;
      } else {
         ItemStack var5 = Class948.method3815(this.field5473).method32106(var2);
         if (Class948.method3815(this.field5473).isEmpty()) {
            Class948.method3816(this.field5473);
         }

         return var5;
      }
   }

   @Override
   public ItemStack method3620(int var1) {
      if (var1 != 0) {
         return ItemStack.EMPTY;
      } else {
         ItemStack var4 = Class948.method3815(this.field5473);
         Class948.method3817(this.field5473, ItemStack.EMPTY);
         Class948.method3816(this.field5473);
         return var4;
      }
   }

   @Override
   public void method3621(int var1, ItemStack var2) {
   }

   @Override
   public int method3630() {
      return 1;
   }

   @Override
   public void method3622() {
      this.field5473.method3622();
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      if (this.field5473.field5324.getTileEntity(this.field5473.field5325) == this.field5473) {
         return !(
               var1.method3276(
                     (double)this.field5473.field5325.getX() + 0.5,
                     (double)this.field5473.field5325.getY() + 0.5,
                     (double)this.field5473.field5325.getZ() + 0.5
                  )
                  > 64.0
            )
            ? this.field5473.method3806()
            : false;
      } else {
         return false;
      }
   }

   @Override
   public boolean method3633(int var1, ItemStack var2) {
      return false;
   }

   @Override
   public void method3625() {
   }
}

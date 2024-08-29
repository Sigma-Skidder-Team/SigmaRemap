package mapped;

public class Class926 implements Class920, Class925 {
   private static String[] field5255;
   private final NonNullList<ItemStack> field5256;
   private final int field5257;
   private final int field5258;
   private final Class5812 field5259;

   public Class926(Class5812 var1, int var2, int var3) {
      this.field5256 = NonNullList.<ItemStack>method68(var2 * var3, ItemStack.EMPTY);
      this.field5259 = var1;
      this.field5257 = var2;
      this.field5258 = var3;
   }

   @Override
   public int method3629() {
      return this.field5256.size();
   }

   @Override
   public boolean method3617() {
      for (ItemStack var4 : this.field5256) {
         if (!var4.isEmpty()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ItemStack method3618(int var1) {
      return var1 < this.method3629() ? this.field5256.get(var1) : ItemStack.EMPTY;
   }

   @Override
   public ItemStack method3620(int var1) {
      return Class7920.method26564(this.field5256, var1);
   }

   @Override
   public ItemStack method3619(int var1, int var2) {
      ItemStack var5 = Class7920.method26563(this.field5256, var1, var2);
      if (!var5.isEmpty()) {
         this.field5259.method18106(this);
      }

      return var5;
   }

   @Override
   public void method3621(int var1, ItemStack var2) {
      this.field5256.set(var1, var2);
      this.field5259.method18106(this);
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
      this.field5256.clear();
   }

   public int method3670() {
      return this.field5258;
   }

   public int method3671() {
      return this.field5257;
   }

   @Override
   public void method3659(Class6207 var1) {
      for (ItemStack var5 : this.field5256) {
         var1.method19116(var5);
      }
   }
}

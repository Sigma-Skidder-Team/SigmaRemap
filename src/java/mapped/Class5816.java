package mapped;

public class Class5816 extends Class5812 {
   private static String[] field25486;
   private final Class920 field25487;

   public Class5816(int var1, PlayerInventory var2) {
      this(var1, var2, new Class927(5));
   }

   public Class5816(int var1, PlayerInventory var2, Class920 var3) {
      super(Class8298.field35663, var1);
      this.field25487 = var3;
      method18122(var3, 5);
      var3.method3631(var2.field5444);
      byte var6 = 51;

      for (int var7 = 0; var7 < 5; var7++) {
         this.method18124(new Class5839(var3, var7, 44 + var7 * 18, 20));
      }

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.method18124(new Class5839(var2, var8 + var9 * 9 + 9, 8 + var8 * 18, var9 * 18 + 51));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.method18124(new Class5839(var2, var10, 8 + var10 * 18, 109));
      }
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return this.field25487.method3623(var1);
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         if (var2 >= this.field25487.method3629()) {
            if (!this.method18142(var7, 0, this.field25487.method3629(), false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.method18142(var7, this.field25487.method3629(), this.field25468.size(), true)) {
            return ItemStack.EMPTY;
         }

         if (!var7.isEmpty()) {
            var6.method18268();
         } else {
            var6.method18267(ItemStack.EMPTY);
         }
      }

      return var5;
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25487.method3632(var1);
   }
}

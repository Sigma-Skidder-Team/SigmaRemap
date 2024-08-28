package mapped;

public abstract class Class5823 extends Class5812 {
   public final Class921 field25512 = new Class921();
   public final Class920 field25513 = new Class928(this, 2);
   public final Class8786 field25514;
   public final PlayerEntity field25515;

   public abstract boolean method18189(PlayerEntity var1, boolean var2);

   public abstract ItemStack method18190(PlayerEntity var1, ItemStack var2);

   public abstract boolean method18191(Class7380 var1);

   public Class5823(Class8298<?> var1, int var2, Class974 var3, Class8786 var4) {
      super(var1, var2);
      this.field25514 = var4;
      this.field25515 = var3.field5444;
      this.method18124(new Class5839(this.field25513, 0, 27, 47));
      this.method18124(new Class5839(this.field25513, 1, 76, 47));
      this.method18124(new Class5841(this, this.field25512, 2, 134, 47));

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.method18124(new Class5839(var3, var8 + var7 * 9 + 9, 8 + var8 * 18, 84 + var7 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.method18124(new Class5839(var3, var9, 8 + var9 * 18, 142));
      }
   }

   public abstract void method18192();

   @Override
   public void method18106(Class920 var1) {
      super.method18106(var1);
      if (var1 == this.field25513) {
         this.method18192();
      }
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25514.method31716((var2, var3) -> this.method18135(var1, var2, this.field25513));
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return this.field25514
         .<Boolean>method31715(
            (var2, var3) -> this.method18191(var2.method6738(var3))
                  ? var1.method3276((double)var3.method8304() + 0.5, (double)var3.getY() + 0.5, (double)var3.method8306() + 0.5) <= 64.0
                  : false,
            true
         );
   }

   public boolean method18193(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         if (var2 != 2) {
            if (var2 != 0 && var2 != 1) {
               if (var2 >= 3 && var2 < 39) {
                  int var8 = !this.method18193(var5) ? 0 : 1;
                  if (!this.method18142(var7, var8, 2, false)) {
                     return ItemStack.EMPTY;
                  }
               }
            } else if (!this.method18142(var7, 3, 39, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.method18142(var7, 3, 39, true)) {
               return ItemStack.EMPTY;
            }

            var6.method18260(var7, var5);
         }

         if (!var7.method32105()) {
            var6.method18268();
         } else {
            var6.method18267(ItemStack.EMPTY);
         }

         if (var7.method32179() == var5.method32179()) {
            return ItemStack.EMPTY;
         }

         var6.method18264(var1, var7);
      }

      return var5;
   }
}

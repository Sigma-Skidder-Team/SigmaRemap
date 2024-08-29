package mapped;

public class Class5827 extends Class5812 {
   private static String[] field25531;
   private final Class920 field25532;
   private final AbstractHorseEntity field25533;

   public Class5827(int var1, PlayerInventory var2, Class920 var3, AbstractHorseEntity var4) {
      super((Class8298<?>)null, var1);
      this.field25532 = var3;
      this.field25533 = var4;
      var3.method3631(var2.field5444);
      this.method18124(new Class5859(this, var3, 0, 8, 18, var4));
      this.method18124(new Class5860(this, var3, 1, 8, 36, var4));
      if (var4 instanceof Class1066 && ((Class1066)var4).method4927()) {
         for (int var9 = 0; var9 < 3; var9++) {
            for (int var10 = 0; var10 < ((Class1066)var4).method4897(); var10++) {
               this.method18124(new Class5839(var3, 2 + var10 + var9 * ((Class1066)var4).method4897(), 80 + var10 * 18, 18 + var9 * 18));
            }
         }
      }

      for (int var11 = 0; var11 < 3; var11++) {
         for (int var13 = 0; var13 < 9; var13++) {
            this.method18124(new Class5839(var2, var13 + var11 * 9 + 9, 8 + var13 * 18, 102 + var11 * 18 + -18));
         }
      }

      for (int var12 = 0; var12 < 9; var12++) {
         this.method18124(new Class5839(var2, var12, 8 + var12 * 18, 142));
      }
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return this.field25532.method3623(var1) && this.field25533.method3066() && this.field25533.method3275(var1) < 8.0F;
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         int var8 = this.field25532.method3629();
         if (var2 >= var8) {
            if (this.method18131(1).method18259(var7) && !this.method18131(1).method18266()) {
               if (!this.method18142(var7, 1, 2, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method18131(0).method18259(var7)) {
               if (var8 <= 2 || !this.method18142(var7, 2, var8, false)) {
                  int var9 = var8 + 27;
                  int var10 = var9 + 9;
                  if (var2 >= var9 && var2 < var10) {
                     if (!this.method18142(var7, var8, var9, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (var2 >= var8 && var2 < var9) {
                     if (!this.method18142(var7, var9, var10, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (!this.method18142(var7, var9, var9, false)) {
                     return ItemStack.EMPTY;
                  }

                  return ItemStack.EMPTY;
               }
            } else if (!this.method18142(var7, 0, 1, false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.method18142(var7, var8, this.field25468.size(), true)) {
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
      this.field25532.method3632(var1);
   }
}

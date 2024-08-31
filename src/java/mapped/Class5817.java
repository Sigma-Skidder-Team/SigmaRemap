package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class5817 extends Class5812 {
   private static String[] field25488;
   private final Class920 field25489;

   public Class5817(int var1, PlayerInventory var2) {
      this(var1, var2, new Class927(9));
   }

   public Class5817(int var1, PlayerInventory var2, Class920 var3) {
      super(Class8298.field35654, var1);
      method18122(var3, 9);
      this.field25489 = var3;
      var3.method3631(var2.field5444);

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 3; var7++) {
            this.method18124(new Class5839(var3, var7 + var6 * 3, 62 + var7 * 18, 17 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.method18124(new Class5839(var2, var10 + var8 * 9 + 9, 8 + var10 * 18, 84 + var8 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.method18124(new Class5839(var2, var9, 8 + var9 * 18, 142));
      }
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return this.field25489.method3623(var1);
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         if (var2 >= 9) {
            if (!this.method18142(var7, 0, 9, false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.method18142(var7, 9, 45, true)) {
            return ItemStack.EMPTY;
         }

         if (!var7.isEmpty()) {
            var6.method18268();
         } else {
            var6.method18267(ItemStack.EMPTY);
         }

         if (var7.getCount() == var5.getCount()) {
            return ItemStack.EMPTY;
         }

         var6.method18264(var1, var7);
      }

      return var5;
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25489.method3632(var1);
   }
}

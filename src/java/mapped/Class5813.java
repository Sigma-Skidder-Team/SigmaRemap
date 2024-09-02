package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;

public class Class5813 extends Class5812 {
   private static String[] field25478;
   private final Class920 field25479;
   private final int field25480;

   private Class5813(Class8298<?> var1, int var2, PlayerInventory var3, int var4) {
      this(var1, var2, var3, new Class927(9 * var4), var4);
   }

   public static Class5813 method18156(int var0, PlayerInventory var1) {
      return new Class5813(Class8298.field35648, var0, var1, 1);
   }

   public static Class5813 method18157(int var0, PlayerInventory var1) {
      return new Class5813(Class8298.field35649, var0, var1, 2);
   }

   public static Class5813 method18158(int var0, PlayerInventory var1) {
      return new Class5813(Class8298.field35650, var0, var1, 3);
   }

   public static Class5813 method18159(int var0, PlayerInventory var1) {
      return new Class5813(Class8298.field35651, var0, var1, 4);
   }

   public static Class5813 method18160(int var0, PlayerInventory var1) {
      return new Class5813(Class8298.field35652, var0, var1, 5);
   }

   public static Class5813 method18161(int var0, PlayerInventory var1) {
      return new Class5813(Class8298.field35653, var0, var1, 6);
   }

   public static Class5813 method18162(int var0, PlayerInventory var1, Class920 var2) {
      return new Class5813(Class8298.field35650, var0, var1, var2, 3);
   }

   public static Class5813 method18163(int var0, PlayerInventory var1, Class920 var2) {
      return new Class5813(Class8298.field35653, var0, var1, var2, 6);
   }

   public Class5813(Class8298<?> var1, int var2, PlayerInventory var3, Class920 var4, int var5) {
      super(var1, var2);
      method18122(var4, var5 * 9);
      this.field25479 = var4;
      this.field25480 = var5;
      var4.method3631(var3.field5444);
      int var8 = (this.field25480 - 4) * 18;

      for (int var9 = 0; var9 < this.field25480; var9++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.method18124(new Class5839(var4, var10 + var9 * 9, 8 + var10 * 18, 18 + var9 * 18));
         }
      }

      for (int var11 = 0; var11 < 3; var11++) {
         for (int var13 = 0; var13 < 9; var13++) {
            this.method18124(new Class5839(var3, var13 + var11 * 9 + 9, 8 + var13 * 18, 103 + var11 * 18 + var8));
         }
      }

      for (int var12 = 0; var12 < 9; var12++) {
         this.method18124(new Class5839(var3, var12, 8 + var12 * 18, 161 + var8));
      }
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return this.field25479.method3623(var1);
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         if (var2 >= this.field25480 * 9) {
            if (!this.method18142(var7, 0, this.field25480 * 9, false)) {
               return ItemStack.EMPTY;
            }
         } else if (!this.method18142(var7, this.field25480 * 9, this.field25468.size(), true)) {
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
      this.field25479.method3632(var1);
   }

   public Class920 method18164() {
      return this.field25479;
   }

   public int method18165() {
      return this.field25480;
   }
}

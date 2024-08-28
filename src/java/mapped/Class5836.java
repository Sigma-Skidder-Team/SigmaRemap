package mapped;

public class Class5836 extends Class5812 {
   private final Class8786 field25560;
   private long field25561;
   public final Class920 field25562 = new Class981(this, 2);
   private final Class921 field25563 = new Class922(this);

   public Class5836(int var1, Class974 var2) {
      this(var1, var2, Class8786.field39521);
   }

   public Class5836(int var1, Class974 var2, Class8786 var3) {
      super(Class8298.field35670, var1);
      this.field25560 = var3;
      this.method18124(new Class5854(this, this.field25562, 0, 15, 15));
      this.method18124(new Class5857(this, this.field25562, 1, 15, 52));
      this.method18124(new Class5867(this, this.field25563, 2, 145, 39, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method18124(new Class5839(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method18124(new Class5839(var2, var8, 8 + var8 * 18, 142));
      }
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return method18121(this.field25560, var1, Blocks.field37058);
   }

   @Override
   public void method18106(Class920 var1) {
      ItemStack var4 = this.field25562.method3618(0);
      ItemStack var5 = this.field25562.method3618(1);
      ItemStack var6 = this.field25563.method3618(2);
      if (var6.method32105() || !var4.method32105() && !var5.method32105()) {
         if (!var4.method32105() && !var5.method32105()) {
            this.method18239(var4, var5, var6);
         }
      } else {
         this.field25563.method3620(2);
      }
   }

   private void method18239(ItemStack var1, ItemStack var2, ItemStack var3) {
      this.field25560.method31716((var4, var5) -> {
         Class3257 var8 = var2.method32107();
         Class7529 var9 = Class3316.method11860(var1, var4);
         if (var9 != null) {
            ItemStack var10;
            if (var8 == Class8514.field37899 && !var9.field32323 && var9.field32321 < 4) {
               var10 = var1.copy();
               var10.method32180(1);
               var10.method32143().method102("map_scale_direction", 1);
               this.method18130();
            } else if (var8 == Class8514.field37471 && !var9.field32323) {
               var10 = var1.copy();
               var10.method32180(1);
               var10.method32143().method115("map_to_lock", true);
               this.method18130();
            } else {
               if (var8 != Class8514.field38056) {
                  this.field25563.method3620(2);
                  this.method18130();
                  return;
               }

               var10 = var1.copy();
               var10.method32180(2);
               this.method18130();
            }

            if (!ItemStack.method32128(var10, var3)) {
               this.field25563.method3621(2, var10);
               this.method18130();
            }
         }
      });
   }

   @Override
   public boolean method18111(ItemStack var1, Class5839 var2) {
      return var2.field25578 != this.field25563 && super.method18111(var1, var2);
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         Class3257 var8 = var7.method32107();
         var5 = var7.copy();
         if (var2 != 2) {
            if (var2 != 1 && var2 != 0) {
               if (var8 != Class8514.field37955) {
                  if (var8 != Class8514.field37899 && var8 != Class8514.field38056 && var8 != Class8514.field37471) {
                     if (var2 >= 3 && var2 < 30) {
                        if (!this.method18142(var7, 30, 39, false)) {
                           return ItemStack.EMPTY;
                        }
                     } else if (var2 >= 30 && var2 < 39 && !this.method18142(var7, 3, 30, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (!this.method18142(var7, 1, 2, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (!this.method18142(var7, 0, 1, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method18142(var7, 3, 39, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            var8.method11725(var7, var1.field5024, var1);
            if (!this.method18142(var7, 3, 39, true)) {
               return ItemStack.EMPTY;
            }

            var6.method18260(var7, var5);
         }

         if (var7.method32105()) {
            var6.method18267(ItemStack.EMPTY);
         }

         var6.method18268();
         if (var7.method32179() == var5.method32179()) {
            return ItemStack.EMPTY;
         }

         var6.method18264(var1, var7);
         this.method18130();
      }

      return var5;
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25563.method3620(2);
      this.field25560.method31716((var2, var3) -> this.method18135(var1, var1.field5024, this.field25562));
   }

   // $VF: synthetic method
   public static long method18242(Class5836 var0) {
      return var0.field25561;
   }

   // $VF: synthetic method
   public static long method18243(Class5836 var0, long var1) {
      return var0.field25561 = var1;
   }
}

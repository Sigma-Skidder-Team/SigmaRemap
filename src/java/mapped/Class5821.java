package mapped;

import javax.annotation.Nullable;

public class Class5821 extends Class5812 {
   private static String[] field25499;
   private final Class920 field25500 = new Class984(this, 1);
   private final Class5845 field25501;
   private final Class8786 field25502;
   private final Class8202 field25503;

   public Class5821(int var1, Class920 var2) {
      this(var1, var2, new Class8206(3), Class8786.field39521);
   }

   public Class5821(int var1, Class920 var2, Class8202 var3, Class8786 var4) {
      super(Class8298.field35656, var1);
      method18123(var3, 3);
      this.field25503 = var3;
      this.field25502 = var4;
      this.field25501 = new Class5845(this, this.field25500, 0, 136, 110);
      this.method18124(this.field25501);
      this.method18126(var3);
      byte var7 = 36;
      short var8 = 137;

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.method18124(new Class5839(var2, var10 + var9 * 9 + 9, 36 + var10 * 18, 137 + var9 * 18));
         }
      }

      for (int var11 = 0; var11 < 9; var11++) {
         this.method18124(new Class5839(var2, var11, 36 + var11 * 18, 195));
      }
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      if (!var1.world.field9020) {
         ItemStack var4 = this.field25501.method18272(this.field25501.method18269());
         if (!var4.isEmpty()) {
            var1.method2882(var4, false);
         }
      }
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return method18121(this.field25502, var1, Blocks.BEACON);
   }

   @Override
   public void method18138(int var1, int var2) {
      super.method18138(var1, var2);
      this.method18130();
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         if (var2 != 0) {
            if (!this.field25501.method18266() && this.field25501.method18259(var7) && var7.getCount() == 1) {
               if (!this.method18142(var7, 0, 1, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var2 >= 1 && var2 < 28) {
               if (!this.method18142(var7, 28, 37, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var2 >= 28 && var2 < 37) {
               if (!this.method18142(var7, 1, 28, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method18142(var7, 1, 37, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.method18142(var7, 1, 37, true)) {
               return ItemStack.EMPTY;
            }

            var6.method18260(var7, var5);
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

   public int method18178() {
      return this.field25503.method28505(0);
   }

   @Nullable
   public Class7144 method18179() {
      return Class7144.method22287(this.field25503.method28505(1));
   }

   @Nullable
   public Class7144 method18180() {
      return Class7144.method22287(this.field25503.method28505(2));
   }

   public void method18181(int var1, int var2) {
      if (this.field25501.method18266()) {
         this.field25503.method28506(1, var1);
         this.field25503.method28506(2, var2);
         this.field25501.method18272(1);
      }
   }

   public boolean method18182() {
      return !this.field25500.method3618(0).isEmpty();
   }
}

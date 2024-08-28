package mapped;

import java.util.Optional;

public class Class5829 extends Class5828<Class926> {
   private static String[] field25534;
   private final Class926 field25535 = new Class926(this, 3, 3);
   private final Class921 field25536 = new Class921();
   private final Class8786 field25537;
   private final PlayerEntity field25538;

   public Class5829(int var1, Class974 var2) {
      this(var1, var2, Class8786.field39521);
   }

   public Class5829(int var1, Class974 var2, Class8786 var3) {
      super(Class8298.field35659, var1);
      this.field25537 = var3;
      this.field25538 = var2.field5444;
      this.method18124(new Class5856(var2.field5444, this.field25535, this.field25536, 0, 124, 35));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 3; var7++) {
            this.method18124(new Class5839(this.field25535, var7 + var6 * 3, 30 + var7 * 18, 17 + var6 * 18));
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

   public static void method18228(int var0, Class1655 var1, PlayerEntity var2, Class926 var3, Class921 var4) {
      if (!var1.field9020) {
         Class878 var7 = (Class878)var2;
         ItemStack var8 = ItemStack.EMPTY;
         Optional var9 = var1.method6715().method1407().<Class926, Class4842>method1030(Class7207.field30935, var3, var1);
         if (var9.isPresent()) {
            Class4842 var10 = (Class4842)var9.get();
            if (var4.method3639(var1, var7, var10)) {
               var8 = var10.method14962(var3);
            }
         }

         var4.method3621(0, var8);
         var7.field4855.sendPacket(new Class5501(var0, 0, var8));
      }
   }

   @Override
   public void method18106(Class920 var1) {
      this.field25537.method31716((var1x, var2) -> method18228(this.field25471, var1x, this.field25538, this.field25535, this.field25536));
   }

   @Override
   public void method18220(Class6207 var1) {
      this.field25535.method3659(var1);
   }

   @Override
   public void method18221() {
      this.field25535.method3625();
      this.field25536.method3625();
   }

   @Override
   public boolean method18222(Class4843<? super Class926> var1) {
      return var1.method14963(this.field25535, this.field25538.field5024);
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25537.method31716((var2, var3) -> this.method18135(var1, var2, this.field25535));
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return method18121(this.field25537, var1, Blocks.CRAFTING_TABLE);
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         if (var2 != 0) {
            if (var2 >= 10 && var2 < 46) {
               if (!this.method18142(var7, 1, 10, false)) {
                  if (var2 >= 37) {
                     if (!this.method18142(var7, 10, 37, false)) {
                        return ItemStack.EMPTY;
                     }
                  } else if (!this.method18142(var7, 37, 46, false)) {
                     return ItemStack.EMPTY;
                  }
               }
            } else if (!this.method18142(var7, 10, 46, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            this.field25537.method31716((var2x, var3) -> var7.method32107().method11725(var7, var2x, var1));
            if (!this.method18142(var7, 10, 46, true)) {
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

         ItemStack var8 = var6.method18264(var1, var7);
         if (var2 == 0) {
            var1.method2882(var8, false);
         }
      }

      return var5;
   }

   @Override
   public boolean method18111(ItemStack var1, Class5839 var2) {
      return var2.field25578 != this.field25536 && super.method18111(var1, var2);
   }

   @Override
   public int method18223() {
      return 0;
   }

   @Override
   public int method18224() {
      return this.field25535.method3671();
   }

   @Override
   public int method18225() {
      return this.field25535.method3670();
   }

   @Override
   public int method18226() {
      return 10;
   }

   @Override
   public Class1939 method18227() {
      return Class1939.field12599;
   }
}

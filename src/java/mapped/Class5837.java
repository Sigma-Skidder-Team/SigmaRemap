package mapped;

public class Class5837 extends Class5812 {
   private final Class8786 field25564;
   private final Class4923 field25565 = Class4923.method15238();
   private Runnable field25566 = () -> {
   };
   private final Class5839 field25567;
   private final Class5839 field25568;
   private final Class5839 field25569;
   private final Class5839 field25570;
   private long field25571;
   private final Class920 field25572 = new Class978(this, 3);
   private final Class920 field25573 = new Class979(this, 1);

   public Class5837(int var1, Class974 var2) {
      this(var1, var2, Class8786.field39521);
   }

   public Class5837(int var1, Class974 var2, Class8786 var3) {
      super(Class8298.field35665, var1);
      this.field25564 = var3;
      this.field25567 = this.method18124(new Class5844(this, this.field25572, 0, 13, 26));
      this.field25568 = this.method18124(new Class5851(this, this.field25572, 1, 33, 26));
      this.field25569 = this.method18124(new Class5849(this, this.field25572, 2, 23, 45));
      this.field25570 = this.method18124(new Class5866(this, this.field25573, 0, 143, 58, var3));

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.method18124(new Class5839(var2, var7 + var6 * 9 + 9, 8 + var7 * 18, 84 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 9; var8++) {
         this.method18124(new Class5839(var2, var8, 8 + var8 * 18, 142));
      }

      this.method18125(this.field25565);
   }

   public int method18244() {
      return this.field25565.method15234();
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return method18121(this.field25564, var1, Blocks.field37054);
   }

   @Override
   public boolean method18104(PlayerEntity var1, int var2) {
      if (var2 > 0 && var2 <= Class2154.field14126) {
         this.field25565.method15235(var2);
         this.method18246();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void method18106(Class920 var1) {
      ItemStack var4 = this.field25567.method18265();
      ItemStack var5 = this.field25568.method18265();
      ItemStack var6 = this.field25569.method18265();
      ItemStack var7 = this.field25570.method18265();
      if (var7.method32105()
         || !var4.method32105()
            && !var5.method32105()
            && this.field25565.method15234() > 0
            && (this.field25565.method15234() < Class2154.field14124 - Class2154.field14125 || !var6.method32105())) {
         if (!var6.method32105() && var6.method32107() instanceof Class3286) {
            Class39 var8 = var4.method32144("BlockEntityTag");
            boolean var9 = var8.method119("Patterns", 9) && !var4.method32105() && var8.method131("Patterns", 10).size() >= 6;
            if (!var9) {
               this.field25565.method15235(((Class3286)var6.method32107()).method11821().ordinal());
            } else {
               this.field25565.method15235(0);
            }
         }
      } else {
         this.field25570.method18267(ItemStack.EMPTY);
         this.field25565.method15235(0);
      }

      this.method18246();
      this.method18130();
   }

   public void method18245(Runnable var1) {
      this.field25566 = var1;
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         if (var2 != this.field25570.field25579) {
            if (var2 != this.field25568.field25579 && var2 != this.field25567.field25579 && var2 != this.field25569.field25579) {
               if (var7.method32107() instanceof Class3301) {
                  if (!this.method18142(var7, this.field25567.field25579, this.field25567.field25579 + 1, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (var7.method32107() instanceof Class3321) {
                  if (!this.method18142(var7, this.field25568.field25579, this.field25568.field25579 + 1, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (var7.method32107() instanceof Class3286) {
                  if (!this.method18142(var7, this.field25569.field25579, this.field25569.field25579 + 1, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (var2 >= 4 && var2 < 31) {
                  if (!this.method18142(var7, 31, 40, false)) {
                     return ItemStack.EMPTY;
                  }
               } else if (var2 >= 31 && var2 < 40 && !this.method18142(var7, 4, 31, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method18142(var7, 4, 40, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.method18142(var7, 4, 40, true)) {
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

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25564.method31716((var2, var3) -> this.method18135(var1, var1.field5024, this.field25572));
   }

   private void method18246() {
      if (this.field25565.method15234() > 0) {
         ItemStack var3 = this.field25567.method18265();
         ItemStack var4 = this.field25568.method18265();
         ItemStack var5 = ItemStack.EMPTY;
         if (!var3.method32105() && !var4.method32105()) {
            var5 = var3.copy();
            var5.method32180(1);
            Class2154 var6 = Class2154.values()[this.field25565.method15234()];
            Class112 var7 = ((Class3321)var4.method32107()).method11876();
            Class39 var8 = var5.method32144("BlockEntityTag");
            Class41 var9;
            if (!var8.method119("Patterns", 9)) {
               var9 = new Class41();
               var8.method99("Patterns", var9);
            } else {
               var9 = var8.method131("Patterns", 10);
            }

            Class39 var10 = new Class39();
            var10.method109("Pattern", var6.method8871());
            var10.method102("Color", var7.method309());
            var9.add(var10);
         }

         if (!ItemStack.method32128(var5, this.field25570.method18265())) {
            this.field25570.method18267(var5);
         }
      }
   }

   public Class5839 method18247() {
      return this.field25567;
   }

   public Class5839 method18248() {
      return this.field25568;
   }

   public Class5839 method18249() {
      return this.field25569;
   }

   public Class5839 method18250() {
      return this.field25570;
   }

   // $VF: synthetic method
   public static Runnable method18253(Class5837 var0) {
      return var0.field25566;
   }

   // $VF: synthetic method
   public static Class5839 method18254(Class5837 var0) {
      return var0.field25567;
   }

   // $VF: synthetic method
   public static Class5839 method18255(Class5837 var0) {
      return var0.field25568;
   }

   // $VF: synthetic method
   public static Class4923 method18256(Class5837 var0) {
      return var0.field25565;
   }

   // $VF: synthetic method
   public static long method18257(Class5837 var0) {
      return var0.field25571;
   }

   // $VF: synthetic method
   public static long method18258(Class5837 var0, long var1) {
      return var0.field25571 = var1;
   }
}

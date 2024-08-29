package mapped;

public class Class5830 extends Class5828<Class926> {
   public static final ResourceLocation field25539 = new ResourceLocation("textures/atlas/blocks.png");
   public static final ResourceLocation field25540 = new ResourceLocation("item/empty_armor_slot_helmet");
   public static final ResourceLocation field25541 = new ResourceLocation("item/empty_armor_slot_chestplate");
   public static final ResourceLocation field25542 = new ResourceLocation("item/empty_armor_slot_leggings");
   public static final ResourceLocation field25543 = new ResourceLocation("item/empty_armor_slot_boots");
   public static final ResourceLocation field25544 = new ResourceLocation("item/empty_armor_slot_shield");
   private static final ResourceLocation[] field25545 = new ResourceLocation[]{field25543, field25542, field25541, field25540};
   private static final Class2106[] field25546 = new Class2106[]{Class2106.field13736, Class2106.field13735, Class2106.field13734, Class2106.field13733};
   private final Class926 field25547 = new Class926(this, 2, 2);
   private final Class921 field25548 = new Class921();
   public final boolean field25549;
   private final PlayerEntity field25550;

   public Class5830(PlayerInventory var1, boolean var2, PlayerEntity var3) {
      super((Class8298<?>)null, 0);
      this.field25549 = var2;
      this.field25550 = var3;
      this.method18124(new Class5856(var1.field5444, this.field25547, this.field25548, 0, 154, 28));

      for (int var6 = 0; var6 < 2; var6++) {
         for (int var7 = 0; var7 < 2; var7++) {
            this.method18124(new Class5839(this.field25547, var7 + var6 * 2, 98 + var7 * 18, 18 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 4; var8++) {
         Class2106 var11 = field25546[var8];
         this.method18124(new Class5843(this, var1, 39 - var8, 8, 8 + var8 * 18, var11));
      }

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var12 = 0; var12 < 9; var12++) {
            this.method18124(new Class5839(var1, var12 + (var9 + 1) * 9, 8 + var12 * 18, 84 + var9 * 18));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.method18124(new Class5839(var1, var10, 8 + var10 * 18, 142));
      }

      this.method18124(new Class5852(this, var1, 40, 77, 62));
   }

   @Override
   public void method18220(Class6207 var1) {
      this.field25547.method3659(var1);
   }

   @Override
   public void method18221() {
      this.field25548.method3625();
      this.field25547.method3625();
   }

   @Override
   public boolean method18222(Class4843<? super Class926> var1) {
      return var1.method14963(this.field25547, this.field25550.world);
   }

   @Override
   public void method18106(Class920 var1) {
      Class5829.method18228(this.field25471, this.field25550.world, this.field25550, this.field25547, this.field25548);
   }

   @Override
   public void method18113(PlayerEntity var1) {
      super.method18113(var1);
      this.field25548.method3625();
      if (!var1.world.isRemote) {
         this.method18135(var1, var1.world, this.field25547);
      }
   }

   @Override
   public boolean method18103(PlayerEntity var1) {
      return true;
   }

   @Override
   public ItemStack method18112(PlayerEntity var1, int var2) {
      ItemStack var5 = ItemStack.EMPTY;
      Class5839 var6 = this.field25468.get(var2);
      if (var6 != null && var6.method18266()) {
         ItemStack var7 = var6.method18265();
         var5 = var7.copy();
         Class2106 var8 = Class1006.method4271(var5);
         if (var2 != 0) {
            if (var2 >= 1 && var2 < 5) {
               if (!this.method18142(var7, 9, 45, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var2 >= 5 && var2 < 9) {
               if (!this.method18142(var7, 9, 45, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var8.method8772() == Class1969.field12837 && !this.field25468.get(8 - var8.method8773()).method18266()) {
               int var9 = 8 - var8.method8773();
               if (!this.method18142(var7, var9, var9 + 1, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var8 == Class2106.field13732 && !this.field25468.get(45).method18266()) {
               if (!this.method18142(var7, 45, 46, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var2 >= 9 && var2 < 36) {
               if (!this.method18142(var7, 36, 45, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (var2 >= 36 && var2 < 45) {
               if (!this.method18142(var7, 9, 36, false)) {
                  return ItemStack.EMPTY;
               }
            } else if (!this.method18142(var7, 9, 45, false)) {
               return ItemStack.EMPTY;
            }
         } else {
            if (!this.method18142(var7, 9, 45, true)) {
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

         ItemStack var10 = var6.method18264(var1, var7);
         if (var2 == 0) {
            var1.method2882(var10, false);
         }
      }

      return var5;
   }

   @Override
   public boolean method18111(ItemStack var1, Class5839 var2) {
      return var2.field25578 != this.field25548 && super.method18111(var1, var2);
   }

   @Override
   public int method18223() {
      return 0;
   }

   @Override
   public int method18224() {
      return this.field25547.method3671();
   }

   @Override
   public int method18225() {
      return this.field25547.method3670();
   }

   @Override
   public int method18226() {
      return 5;
   }

   public Class926 method18232() {
      return this.field25547;
   }

   @Override
   public Class1939 method18227() {
      return Class1939.field12599;
   }

   // $VF: synthetic method
   public static ResourceLocation[] method18233() {
      return field25545;
   }
}

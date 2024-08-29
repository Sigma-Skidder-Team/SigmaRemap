package mapped;

public class Class5858 extends Class5839 {
   private static String[] field25618;
   private final Class5831 field25619;

   public Class5858(Class5831 var1, Class920 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25619 = var1;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return this.field25619.method18235(var1) || method18278(var1);
   }

   @Override
   public int method18270(ItemStack var1) {
      return !method18278(var1) ? super.method18270(var1) : 1;
   }

   public static boolean method18278(ItemStack var0) {
      return var0.getItem() == Items.field37882;
   }
}

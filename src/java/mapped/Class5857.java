package mapped;

public class Class5857 extends Class5839 {
   private static String[] field25616;
   public final Class5836 field25617;

   public Class5857(Class5836 var1, Class920 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25617 = var1;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      Item var4 = var1.getItem();
      return var4 == Items.field37899 || var4 == Items.field38056 || var4 == Items.field37471;
   }
}

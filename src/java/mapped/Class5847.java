package mapped;

import net.minecraft.item.ItemStack;

public class Class5847 extends Class5839 {
   private static String[] field25594;
   public final Class5815 field25595;

   public Class5847(Class5815 var1, Class920 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25595 = var1;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return var1.method32115() || var1.getItem() == Items.field38070 || var1.method32163();
   }
}

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class5865 extends Class5839 {
   private static String[] field25633;
   public final Class5822 field25634;

   public Class5865(Class5822 var1, Class920 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25634 = var1;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return var1.getItem() == Items.field37917;
   }
}

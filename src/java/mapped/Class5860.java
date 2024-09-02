package mapped;

import net.minecraft.item.ItemStack;

public class Class5860 extends Class5839 {
   private static String[] field25623;
   public final AbstractHorseEntity field25624;
   public final Class5827 field25625;

   public Class5860(Class5827 var1, Class920 var2, int var3, int var4, int var5, AbstractHorseEntity var6) {
      super(var2, var3, var4, var5);
      this.field25625 = var1;
      this.field25624 = var6;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return this.field25624.method4900(var1);
   }

   @Override
   public boolean method18274() {
      return this.field25624.method4898();
   }

   @Override
   public int method18269() {
      return 1;
   }
}

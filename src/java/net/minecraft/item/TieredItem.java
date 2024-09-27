package net.minecraft.item;

import mapped.Item;

public class TieredItem extends Item {
   private static String[] field18759;
   private final IItemTier field18760;

   public TieredItem(IItemTier var1, Properties var2) {
      super(var2.method17776(var1.method9010()));
      this.field18760 = var1;
   }

   public IItemTier method11783() {
      return this.field18760;
   }

   @Override
   public int method11736() {
      return this.field18760.method9014();
   }

   @Override
   public boolean method11699(ItemStack var1, ItemStack var2) {
      return this.field18760.method9015().test(var2) || super.method11699(var1, var2);
   }
}

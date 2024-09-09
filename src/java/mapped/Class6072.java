package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class6072 extends Class6069 {
   private static String[] field27312;

   public Class6072(Class1937 var1, EquipmentSlotType... var2) {
      super(var1, Class2242.field14676, var2);
   }

   @Override
   public int method18807(int var1) {
      return 1 + 10 * (var1 - 1);
   }

   @Override
   public int method18808(int var1) {
      return super.method18807(var1) + 50;
   }

   @Override
   public int method18809() {
      return 5;
   }

   @Override
   public boolean method18821(ItemStack var1) {
      return var1.getItem() != Items.field37956 ? super.method18821(var1) : true;
   }
}

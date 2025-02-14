package mapped;

import net.minecraft.item.ItemStack;

public class Class140 extends Class128 {
   private static String[] field469;
   private final Class6870 field470;

   public Class140(ILootCondition[] var1, Class6870 var2) {
      super(var1);
      this.field470 = var2;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.SET_COUNT;
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      var1.setCount(this.field470.method20914(var2.method26088()));
      return var1;
   }

   public static Class5876<?> method420(Class6870 var0) {
      return method372(var1 -> new Class140(var1, var0));
   }

   // $VF: synthetic method
   public static Class6870 method422(Class140 var0) {
      return var0.field470;
   }
}

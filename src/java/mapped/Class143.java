package mapped;

import net.minecraft.item.ItemStack;

import java.util.Random;

public class Class143 extends Class128 {
   private static String[] field483;
   private final Class6870 field484;
   private final boolean field485;

   public Class143(ILootCondition[] var1, Class6870 var2, boolean var3) {
      super(var1);
      this.field484 = var2;
      this.field485 = var3;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.ENCHANT_WITH_LEVELS;
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      Random var5 = var2.method26088();
      return EnchantmentHelper.method26342(var5, var1, this.field484.method20914(var5), this.field485);
   }

   public static Class5879 method439(Class6870 var0) {
      return new Class5879(var0);
   }

   // $VF: synthetic method
   public static Class6870 method440(Class143 var0) {
      return var0.field484;
   }

   // $VF: synthetic method
   public static boolean method441(Class143 var0) {
      return var0.field485;
   }
}

package mapped;

import net.minecraft.item.ItemStack;

import java.util.Random;

public class Class144 extends Class128 {
   private static String[] field486;

   public Class144(ILootCondition[] var1) {
      super(var1);
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.EXPLOSION_DECAY;
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      Float var5 = var2.<Float>method26081(Class9525.field44339);
      if (var5 != null) {
         Random var6 = var2.method26088();
         float var7 = 1.0F / var5;
         int var8 = var1.getCount();
         int var9 = 0;

         for (int var10 = 0; var10 < var8; var10++) {
            if (var6.nextFloat() <= var7) {
               var9++;
            }
         }

         var1.method32180(var9);
      }

      return var1;
   }

   public static Class5876<?> method442() {
      return method372(Class144::new);
   }
}

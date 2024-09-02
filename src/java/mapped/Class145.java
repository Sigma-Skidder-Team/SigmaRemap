package mapped;

import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class145 extends Class128 {
   private static final Logger field487 = LogManager.getLogger();
   private final Class6872 field488;

   public Class145(ILootCondition[] var1, Class6872 var2) {
      super(var1);
      this.field488 = var2;
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.SET_DAMAGE;
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      if (!var1.method32115()) {
         field487.warn("Couldn't set damage of loot item {}", var1);
      } else {
         float var5 = 1.0F - this.field488.method20924(var2.method26088());
         var1.method32118(MathHelper.method37767(var5 * (float)var1.method32119()));
      }

      return var1;
   }

   public static Class5876<?> method443(Class6872 var0) {
      return method372(var1 -> new Class145(var1, var0));
   }

   // $VF: synthetic method
   public static Class6872 method445(Class145 var0) {
      return var0.field488;
   }
}

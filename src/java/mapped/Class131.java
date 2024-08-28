package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class Class131 extends Class128 {
   private static final Logger field448 = LogManager.getLogger();

   public Class131(ILootCondition[] var1) {
      super(var1);
   }

   @Override
   public LootFunctionType getFunctionType() {
      return LootFunctionManager.FURNACE_SMELT;
   }

   @Override
   public ItemStack method371(ItemStack var1, LootContext var2) {
      if (!var1.method32105()) {
         Optional var5 = var2.method26090().method6816().<Class920, Class4849>method1030(Class7207.field30936, new Class927(var1), var2.method26090());
         if (var5.isPresent()) {
            ItemStack var6 = ((Class4849)var5.get()).method14966();
            if (!var6.method32105()) {
               ItemStack var7 = var6.copy();
               var7.method32180(var1.method32179());
               return var7;
            }
         }

         field448.warn("Couldn't smelt {} because there is no smelting recipe", var1);
         return var1;
      } else {
         return var1;
      }
   }

   public static Class5876<?> method383() {
      return method372(Class131::new);
   }
}

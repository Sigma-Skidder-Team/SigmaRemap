package mapped;

import net.minecraft.item.ItemStack;

import java.util.function.Consumer;

public class Class4694 extends Class4686 {
   private static String[] field22279;

   public Class4694(int var1, int var2, ILootCondition[] var3, ILootFunction[] var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public Class7131 method14694() {
      return Class8695.field39239;
   }

   @Override
   public void method14695(Consumer<ItemStack> var1, LootContext var2) {
   }

   public static Class5872<?> method14723() {
      return method14704(Class4694::new);
   }
}

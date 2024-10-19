package mapped;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;

import java.util.function.Consumer;

public class Class4695 extends Class4686 {
   private static String[] field22280;
   private final Item field22281;

   public Class4695(Item var1, int var2, int var3, ILootCondition[] var4, ILootFunction[] var5) {
      super(var2, var3, var4, var5);
      this.field22281 = var1;
   }

   @Override
   public Class7131 method14694() {
      return Class8695.field39240;
   }

   @Override
   public void method14695(Consumer<ItemStack> var1, LootContext var2) {
      var1.accept(new ItemStack(this.field22281));
   }

   public static Class5872<?> method14724(IItemProvider var0) {
      return method14704((var1, var2, var3, var4) -> new Class4695(var0.asItem(), var1, var2, var3, var4));
   }

   // $VF: synthetic method
   public static Item method14726(Class4695 var0) {
      return var0.field22281;
   }
}

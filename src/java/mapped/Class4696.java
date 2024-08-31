package mapped;

import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class Class4696 extends Class4686 {
   private static String[] field22282;
   private final ResourceLocation field22283;

   public Class4696(ResourceLocation var1, int var2, int var3, ILootCondition[] var4, ILootFunction[] var5) {
      super(var2, var3, var4, var5);
      this.field22283 = var1;
   }

   @Override
   public Class7131 method14694() {
      return Class8695.field39242;
   }

   @Override
   public void method14695(Consumer<ItemStack> var1, LootContext var2) {
      var2.method26080(this.field22283, var1);
   }

   public static Class5872<?> method14727(ResourceLocation var0) {
      return method14704((var1, var2, var3, var4) -> new Class4696(var0, var1, var2, var3, var4));
   }

   // $VF: synthetic method
   public static ResourceLocation method14729(Class4696 var0) {
      return var0.field22283;
   }
}

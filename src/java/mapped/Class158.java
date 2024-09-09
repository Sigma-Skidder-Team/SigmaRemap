package mapped;

import com.google.common.collect.ImmutableSet;
import net.minecraft.item.ItemStack;

import java.util.Set;

public class Class158 implements ILootCondition {
   private static String[] field514;
   private final Class6069 field515;
   private final float[] field516;

   public Class158(Class6069 var1, float[] var2) {
      this.field515 = var1;
      this.field516 = var2;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38604;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44338);
   }

   public boolean test(LootContext var1) {
      ItemStack var4 = var1.<ItemStack>method26081(Class9525.field44338);
      int var5 = var4 == null ? 0 : EnchantmentHelper.method26311(this.field515, var4);
      float var6 = this.field516[Math.min(var5, this.field516.length - 1)];
      return var1.method26088().nextFloat() < var6;
   }

   public static Class7519 method476(Class6069 var0, float... var1) {
      return () -> new Class158(var0, var1);
   }

   // $VF: synthetic method
   public static Class6069 method478(Class158 var0) {
      return var0.field515;
   }

   // $VF: synthetic method
   public static float[] method479(Class158 var0) {
      return var0.field516;
   }
}

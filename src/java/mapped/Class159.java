package mapped;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Class159 implements ILootCondition {
   private static String[] field517;
   private final Class8634 field518;

   public Class159(Class8634 var1) {
      this.field518 = var1;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38603;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44338);
   }

   public boolean test(LootContext var1) {
      ItemStack var4 = var1.<ItemStack>method26081(Class9525.field44338);
      return var4 != null && this.field518.method31016(var4);
   }

   public static Class7519 method480(Class9735 var0) {
      return () -> new Class159(var0.method38151());
   }

   // $VF: synthetic method
   public static Class8634 method482(Class159 var0) {
      return var0.field518;
   }
}

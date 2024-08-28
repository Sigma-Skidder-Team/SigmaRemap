package mapped;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Class163 implements ILootCondition {
   private static String[] field527;
   private static final Class163 field528 = new Class163();

   private Class163() {
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38600;
   }

   @Override
   public Set<Class9821<?>> method355() {
      return ImmutableSet.of(Class9525.field44331);
   }

   public boolean test(LootContext var1) {
      return var1.method26079(Class9525.field44331);
   }

   public static Class7519 method492() {
      return () -> field528;
   }

   // $VF: synthetic method
   public static Class163 method494() {
      return field528;
   }
}

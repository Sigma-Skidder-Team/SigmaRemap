package mapped;

import java.util.function.Predicate;

public class Class150 implements ILootCondition {
   private final ILootCondition[] field495;
   private final Predicate<LootContext> field496;

   public Class150(ILootCondition[] var1) {
      this.field495 = var1;
      this.field496 = Class8582.<LootContext>method30666(var1);
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38596;
   }

   public final boolean test(LootContext var1) {
      return this.field496.test(var1);
   }

   @Override
   public void method367(Class8478 var1) {
      ILootCondition.super.method367(var1);

      for (int var4 = 0; var4 < this.field495.length; var4++) {
         this.field495[var4].method367(var1.method29956(".term[" + var4 + "]"));
      }
   }

   public static Class7518 method454(Class7519... var0) {
      return new Class7518(var0);
   }

   // $VF: synthetic method
   public static ILootCondition[] method455(Class150 var0) {
      return var0.field495;
   }
}

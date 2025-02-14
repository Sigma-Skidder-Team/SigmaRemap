package mapped;

import java.util.function.Predicate;

public class Class125 implements ILootCondition {
   private final ILootCondition[] field439;
   private final Predicate<LootContext> field440;

   public Class125(ILootCondition[] var1) {
      this.field439 = var1;
      this.field440 = Class8582.<LootContext>method30665(var1);
   }

   public final boolean test(LootContext var1) {
      return this.field440.test(var1);
   }

   @Override
   public void method367(Class8478 var1) {
      ILootCondition.super.method367(var1);

      for (int var4 = 0; var4 < this.field439.length; var4++) {
         this.field439[var4].method367(var1.method29956(".term[" + var4 + "]"));
      }
   }

   @Override
   public Class7130 method354() {
      throw new UnsupportedOperationException();
   }
}

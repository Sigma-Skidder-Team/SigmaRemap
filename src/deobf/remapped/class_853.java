package remapped;

import java.util.function.Predicate;

public class class_853 implements Predicate<LivingEntity> {
   private static String[] field_4444;
   private final class_337 field_4445;

   public class_853(class_337 var1) {
      this.field_4445 = var1;
   }

   public boolean test(LivingEntity var1) {
      return (var1 instanceof PlayerEntity || var1 instanceof class_6011) && var1.method_37275(this.field_4445) > 9.0;
   }
}

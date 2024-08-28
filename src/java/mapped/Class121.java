package mapped;

import java.util.function.Predicate;

public class Class121 implements Predicate<Class880> {
   private static String[] field431;
   private final Class1105 field432;

   public Class121(Class1105 var1) {
      this.field432 = var1;
   }

   public boolean test(Class880 var1) {
      return (var1 instanceof PlayerEntity || var1 instanceof Class1055) && var1.method3277(this.field432) > 9.0;
   }
}

package mapped;

import java.util.function.Predicate;

public class Class118 implements Predicate<Class7380> {
   private static String[] field424;
   private final Class3209 field425;

   public Class118(Class3209 var1) {
      this.field425 = var1;
   }

   public static Class118 method331(Class3209 var0) {
      return new Class118(var0);
   }

   public boolean test(Class7380 var1) {
      return var1 != null && var1.method23448(this.field425);
   }
}

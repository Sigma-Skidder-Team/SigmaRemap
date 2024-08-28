package mapped;

import java.util.function.Predicate;

public class Class169 implements Predicate<Class8848> {
   private static String[] field544;
   private final Class3257 field545;
   private final Class39 field546;

   public Class169(Class3257 var1, Class39 var2) {
      this.field545 = var1;
      this.field546 = var2;
   }

   public boolean test(Class8848 var1) {
      return var1.method32107() == this.field545 && Class8354.method29280(this.field546, var1.method32142(), true);
   }
}

package mapped;

import java.util.function.Consumer;

public class Class7650 implements Class7651 {
   private final Class306 field32836 = new Class306("minecraft");

   @Override
   public void method25140(Consumer<Class1810> var1, Class9325 var2) {
      Class1810 var5 = Class1810.method7945("vanilla", false, () -> this.field32836, var2, Class1967.field12830, Class7725.field33171);
      if (var5 != null) {
         var1.accept(var5);
      }
   }
}

package mapped;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface Class4693 {
   Class4693 field22277 = (var0, var1) -> false;
   Class4693 field22278 = (var0, var1) -> true;

   boolean method14697(Class7812 var1, Consumer<Class6549> var2);

   default Class4693 method14717(Class4693 var1) {
      Objects.<Class4693>requireNonNull(var1);
      return (var2, var3) -> this.method14697(var2, var3) && var1.method14697(var2, var3);
   }

   default Class4693 method14718(Class4693 var1) {
      Objects.<Class4693>requireNonNull(var1);
      return (var2, var3) -> this.method14697(var2, var3) || var1.method14697(var2, var3);
   }
}

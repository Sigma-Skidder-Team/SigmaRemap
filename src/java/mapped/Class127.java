package mapped;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface Class127 extends Class126, BiFunction<Class8848, Class7812, Class8848> {
   Class7128 method368();

   static Consumer<Class8848> method369(BiFunction<Class8848, Class7812, Class8848> var0, Consumer<Class8848> var1, Class7812 var2) {
      return var3 -> var1.accept(var0.apply(var3, var2));
   }
}

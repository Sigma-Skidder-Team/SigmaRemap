package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public interface class_4530 {
   String method_21049();

   static <E extends Enum<E> & class_4530> Codec<E> method_21048(Supplier<E[]> var0, Function<? super String, ? extends E> var1) {
      Enum[] var4 = (Enum[])var0.get();
      return method_21050(Enum::ordinal, var1x -> (E)var4[var1x], var1);
   }

   static <E extends class_4530> Codec<E> method_21050(ToIntFunction<E> var0, IntFunction<E> var1, Function<? super String, ? extends E> var2) {
      return new class_7001(var0, var1, var2);
   }

   static Keyable method_21047(class_4530[] var0) {
      return new class_3656(var0);
   }
}

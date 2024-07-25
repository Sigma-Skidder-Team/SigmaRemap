package remapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public final class class_7001 implements Codec<E> {
   public class_7001(ToIntFunction var1, IntFunction var2, Function var3) {
      this.field_35927 = var1;
      this.field_35925 = var2;
      this.field_35928 = var3;
   }

   public <T> DataResult<T> encode(E var1, DynamicOps<T> var2, T var3) {
      return !var2.compressMaps()
         ? var2.mergeToPrimitive(var3, var2.createString(var1.method_21049()))
         : var2.mergeToPrimitive(var3, var2.createInt(this.field_35927.applyAsInt(var1)));
   }

   public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> var1, T var2) {
      return !var1.compressMaps()
         ? var1.getStringValue(var2)
            .flatMap(
               var1x -> Optional.<Object>ofNullable(var0.apply(var1x))
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error("Unknown element name: " + var1x))
            )
            .map(var1x -> Pair.of(var1x, var1.empty()))
         : var1.getNumberValue(var2)
            .flatMap(
               var1x -> Optional.<Object>ofNullable(var0.apply(var1x.intValue()))
                     .<DataResult>map(DataResult::success)
                     .orElseGet(() -> DataResult.error("Unknown element id: " + var1x))
            )
            .map(var1x -> Pair.of(var1x, var1.empty()));
   }

   @Override
   public String toString() {
      return "StringRepresentable[" + this.field_35927 + "]";
   }
}

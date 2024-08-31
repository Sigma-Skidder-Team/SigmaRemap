package mapped;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import net.minecraft.util.IStringSerializable;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public final class Class9099<E extends IStringSerializable> implements Codec<E> {
   public final ToIntFunction<E> field41626;
   public final IntFunction<E> field41627;
   public final Function<? super String, ? extends E> field41628;

   public Class9099(ToIntFunction var1, IntFunction var2, Function var3) {
      this.field41626 = var1;
      this.field41627 = var2;
      this.field41628 = var3;
   }

   public <T> DataResult<T> encode(E var1, DynamicOps<T> var2, T var3) {
      return !var2.compressMaps()
         ? var2.mergeToPrimitive(var3, var2.createString(var1.getString()))
         : var2.mergeToPrimitive(var3, var2.createInt(this.field41626.applyAsInt(var1)));
   }

   public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> var1, T var2) {
      return !var1.compressMaps()
         ? var1.getStringValue(var2)
            .flatMap(
               var1x -> Optional.ofNullable(field41628.apply(var1x))
                     .map(DataResult::success)
                     .orElseGet(() -> DataResult.error("Unknown element name: " + var1x))
            )
            .map(var1x -> Pair.of(var1x, var1.empty()))
         : var1.getNumberValue(var2)
            .flatMap(
               var1x -> Optional.ofNullable(field41627.apply(var1x.intValue()))
                     .map(DataResult::success)
                     .orElseGet(() -> DataResult.error("Unknown element id: " + var1x))
            )
            .map(var1x -> Pair.of(var1x, var1.empty()));
   }

   @Override
   public String toString() {
      return "StringRepresentable[" + this.field41626 + "]";
   }
}

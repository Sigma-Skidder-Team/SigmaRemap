package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class Class7617 {
   public static final Codec<Class7617> field32672 = Registry.field16134.dispatch(Class7617::method24952, Class7646::method25118);
   public final OptionalInt field32673;

   public static <S extends Class7617> RecordCodecBuilder<S, OptionalInt> method24958() {
      return Codec.intRange(0, 80)
         .optionalFieldOf("min_clipped_height")
         .xmap(
            var0 -> var0.<OptionalInt>map(OptionalInt::of).orElse(OptionalInt.empty()),
            var0 -> !var0.isPresent() ? Optional.empty() : Optional.<Integer>of(var0.getAsInt())
         )
         .forGetter(var0 -> var0.field32673);
   }

   public Class7617(OptionalInt var1) {
      this.field32673 = var1;
   }

   public abstract Class7646<?> method24952();

   public abstract int method24953(int var1, int var2);

   public OptionalInt method24959() {
      return this.field32673;
   }
}

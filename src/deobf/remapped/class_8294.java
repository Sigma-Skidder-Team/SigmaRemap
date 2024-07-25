package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class class_8294 {
   public static final Codec<class_8294> field_42499 = class_8669.field_44390.dispatch(class_8294::method_38258, class_2356::method_10807);
   public final OptionalInt field_42500;

   public static <S extends class_8294> RecordCodecBuilder<S, OptionalInt> method_38261() {
      return Codec.intRange(0, 80)
         .optionalFieldOf("min_clipped_height")
         .xmap(
            var0 -> var0.<OptionalInt>map(OptionalInt::of).orElse(OptionalInt.empty()),
            var0 -> !var0.isPresent() ? Optional.empty() : Optional.<Integer>of(var0.getAsInt())
         )
         .forGetter(var0 -> var0.field_42500);
   }

   public class_8294(OptionalInt var1) {
      this.field_42500 = var1;
   }

   public abstract class_2356<?> method_38258();

   public abstract int method_38262(int var1, int var2);

   public OptionalInt method_38259() {
      return this.field_42500;
   }
}

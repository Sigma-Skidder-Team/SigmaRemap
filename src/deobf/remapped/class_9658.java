package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class class_9658 implements class_6157 {
   public static final Codec<class_9658> field_49195 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_5927.field_30061.fieldOf("feature").forGetter(var0x -> var0x.field_49193),
               class_3010.field_14783.fieldOf("decorator").forGetter(var0x -> var0x.field_49196)
            )
            .apply(var0, class_9658::new)
   );
   public final Supplier<class_5927<?, ?>> field_49193;
   public final class_3010<?> field_49196;

   public class_9658(Supplier<class_5927<?, ?>> var1, class_3010<?> var2) {
      this.field_49193 = var1;
      this.field_49196 = var2;
   }

   @Override
   public String toString() {
      return String.format(
         "< %s [%s | %s] >", this.getClass().getSimpleName(), class_8669.field_44417.method_39797(this.field_49193.get().method_27103()), this.field_49196
      );
   }

   @Override
   public Stream<class_5927<?, ?>> method_28248() {
      return this.field_49193.get().method_27106();
   }
}

package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class class_6893 implements class_6157 {
   public static final Codec<class_6893> field_35455 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_5927.field_30061.fieldOf("feature_true").forGetter(var0x -> var0x.field_35454),
               class_5927.field_30061.fieldOf("feature_false").forGetter(var0x -> var0x.field_35456)
            )
            .apply(var0, class_6893::new)
   );
   public final Supplier<class_5927<?, ?>> field_35454;
   public final Supplier<class_5927<?, ?>> field_35456;

   public class_6893(Supplier<class_5927<?, ?>> var1, Supplier<class_5927<?, ?>> var2) {
      this.field_35454 = var1;
      this.field_35456 = var2;
   }

   @Override
   public Stream<class_5927<?, ?>> method_28248() {
      return Stream.<class_5927<?, ?>>concat(this.field_35454.get().method_27106(), this.field_35456.get().method_27106());
   }
}

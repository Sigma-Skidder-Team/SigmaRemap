package remapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class class_2984 implements class_6157 {
   public static final Codec<class_2984> field_14685 = class_5927.field_30067.fieldOf("features").xmap(class_2984::new, var0 -> var0.field_14684).codec();
   public final List<Supplier<class_5927<?, ?>>> field_14684;

   public class_2984(List<Supplier<class_5927<?, ?>>> var1) {
      this.field_14684 = var1;
   }

   @Override
   public Stream<class_5927<?, ?>> method_28248() {
      return this.field_14684.stream().<class_5927<?, ?>>flatMap(var0 -> var0.get().method_27106());
   }
}

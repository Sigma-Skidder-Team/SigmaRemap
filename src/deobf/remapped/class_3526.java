package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class class_3526 implements class_6157 {
   public static final Codec<class_3526> field_17276 = RecordCodecBuilder.create(
      var0 -> var0.apply2(
            class_3526::new,
            class_2642.field_13018.listOf().fieldOf("features").forGetter(var0x -> var0x.field_17278),
            class_5927.field_30061.fieldOf("default").forGetter(var0x -> var0x.field_17277)
         )
   );
   public final List<class_2642> field_17278;
   public final Supplier<class_5927<?, ?>> field_17277;

   public class_3526(List<class_2642> var1, class_5927<?, ?> var2) {
      this(var1, () -> var2);
   }

   private class_3526(List<class_2642> var1, Supplier<class_5927<?, ?>> var2) {
      this.field_17278 = var1;
      this.field_17277 = var2;
   }

   @Override
   public Stream<class_5927<?, ?>> method_28248() {
      return Stream.<class_5927<?, ?>>concat(
         this.field_17278.stream().flatMap(var0 -> var0.field_13015.get().method_27106()), this.field_17277.get().method_27106()
      );
   }
}

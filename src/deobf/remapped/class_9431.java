package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_9431 implements class_6157 {
   public static final Codec<class_9431> field_48172 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_3461.method_15933(0, 2, 1).fieldOf("reach").forGetter(var0x -> var0x.field_48173),
               class_3461.method_15933(1, 5, 5).fieldOf("height").forGetter(var0x -> var0x.field_48174)
            )
            .apply(var0, class_9431::new)
   );
   private final class_3461 field_48173;
   private final class_3461 field_48174;

   public class_9431(class_3461 var1, class_3461 var2) {
      this.field_48173 = var1;
      this.field_48174 = var2;
   }

   public class_3461 method_43650() {
      return this.field_48173;
   }

   public class_3461 method_43651() {
      return this.field_48174;
   }
}

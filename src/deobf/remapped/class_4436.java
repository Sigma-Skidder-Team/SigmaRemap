package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_4436 implements class_6157 {
   public static final Codec<class_4436> field_21649 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_2522.field_12489.fieldOf("target").forGetter(var0x -> var0x.field_21648),
               class_2522.field_12489.fieldOf("state").forGetter(var0x -> var0x.field_21650),
               class_3461.field_16960.fieldOf("radius").forGetter(var0x -> var0x.field_21651)
            )
            .apply(var0, class_4436::new)
   );
   public final class_2522 field_21648;
   public final class_2522 field_21650;
   private final class_3461 field_21651;

   public class_4436(class_2522 var1, class_2522 var2, class_3461 var3) {
      this.field_21648 = var1;
      this.field_21650 = var2;
      this.field_21651 = var3;
   }

   public class_3461 method_20590() {
      return this.field_21651;
   }
}

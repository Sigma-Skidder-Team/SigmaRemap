package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class class_2569 {
   public static final Codec<class_2569> field_12722 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_3090.field_15355.fieldOf("options").forGetter(var0x -> var0x.field_12721),
               Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.field_12720)
            )
            .apply(var0, class_2569::new)
   );
   private final class_5079 field_12721;
   private final float field_12720;

   public class_2569(class_5079 var1, float var2) {
      this.field_12721 = var1;
      this.field_12720 = var2;
   }

   public class_5079 method_11682() {
      return this.field_12721;
   }

   public boolean method_11683(Random var1) {
      return var1.nextFloat() <= this.field_12720;
   }
}

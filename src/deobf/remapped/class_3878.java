package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_3878 implements class_6157 {
   public static final Codec<class_3878> field_18879 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 255).fieldOf("height").forGetter(var0x -> var0x.field_18876),
               class_2522.field_12489.fieldOf("state").forGetter(var0x -> var0x.field_18877)
            )
            .apply(var0, class_3878::new)
   );
   public final int field_18876;
   public final class_2522 field_18877;

   public class_3878(int var1, class_2522 var2) {
      this.field_18876 = var1;
      this.field_18877 = var2;
   }
}

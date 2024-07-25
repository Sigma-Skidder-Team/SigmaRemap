package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_1926 implements class_6157 {
   public static final Codec<class_1926> field_9856 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_7732.field_39221.fieldOf("cap_provider").forGetter(var0x -> var0x.field_9855),
               class_7732.field_39221.fieldOf("stem_provider").forGetter(var0x -> var0x.field_9857),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter(var0x -> var0x.field_9859)
            )
            .apply(var0, class_1926::new)
   );
   public final class_7732 field_9855;
   public final class_7732 field_9857;
   public final int field_9859;

   public class_1926(class_7732 var1, class_7732 var2, int var3) {
      this.field_9855 = var1;
      this.field_9857 = var2;
      this.field_9859 = var3;
   }
}

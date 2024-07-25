package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_209 implements class_9793 {
   public static final Codec<class_209> field_706 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("noise_to_count_ratio").forGetter(var0x -> var0x.field_705),
               Codec.DOUBLE.fieldOf("noise_factor").forGetter(var0x -> var0x.field_707),
               Codec.DOUBLE.fieldOf("noise_offset").orElse(0.0).forGetter(var0x -> var0x.field_703)
            )
            .apply(var0, class_209::new)
   );
   public final int field_705;
   public final double field_707;
   public final double field_703;

   public class_209(int var1, double var2, double var4) {
      this.field_705 = var1;
      this.field_707 = var2;
      this.field_703 = var4;
   }
}

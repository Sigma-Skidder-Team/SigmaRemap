package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4717 implements Class4716 {
   public static final Codec<Class4717> field22362 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("noise_to_count_ratio").forGetter(var0x -> var0x.field22363),
               Codec.DOUBLE.fieldOf("noise_factor").forGetter(var0x -> var0x.field22364),
               Codec.DOUBLE.fieldOf("noise_offset").orElse(0.0).forGetter(var0x -> var0x.field22365)
            )
            .apply(var0, Class4717::new)
   );
   public final int field22363;
   public final double field22364;
   public final double field22365;

   public Class4717(int var1, double var2, double var4) {
      this.field22363 = var1;
      this.field22364 = var2;
      this.field22365 = var4;
   }
}

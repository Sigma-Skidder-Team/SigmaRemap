package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4719 implements Class4716 {
   public static final Codec<Class4719> field22369 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.DOUBLE.fieldOf("noise_level").forGetter(var0x -> var0x.field22370),
               Codec.INT.fieldOf("below_noise").forGetter(var0x -> var0x.field22371),
               Codec.INT.fieldOf("above_noise").forGetter(var0x -> var0x.field22372)
            )
            .apply(var0, Class4719::new)
   );
   public final double field22370;
   public final int field22371;
   public final int field22372;

   public Class4719(double var1, int var3, int var4) {
      this.field22370 = var1;
      this.field22371 = var3;
      this.field22372 = var4;
   }
}

package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4725 implements Class4716 {
   public static final Codec<Class4725> field22388 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("bottom_offset").orElse(0).forGetter(var0x -> var0x.field22389),
               Codec.INT.fieldOf("top_offset").orElse(0).forGetter(var0x -> var0x.field22390),
               Codec.INT.fieldOf("maximum").orElse(0).forGetter(var0x -> var0x.field22391)
            )
            .apply(var0, Class4725::new)
   );
   public final int field22389;
   public final int field22390;
   public final int field22391;

   public Class4725(int var1, int var2, int var3) {
      this.field22389 = var1;
      this.field22390 = var2;
      this.field22391 = var3;
   }
}

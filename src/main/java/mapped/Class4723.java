package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4723 implements Class4716 {
   public static final Codec<Class4723> field22382 = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("baseline").forGetter(var0x -> var0x.field22383), Codec.INT.fieldOf("spread").forGetter(var0x -> var0x.field22384))
            .apply(var0, Class4723::new)
   );
   public final int field22383;
   public final int field22384;

   public Class4723(int var1, int var2) {
      this.field22383 = var1;
      this.field22384 = var2;
   }
}

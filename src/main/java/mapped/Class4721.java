package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4721 implements Class4716 {
   public static final Codec<Class4721> field22376 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("count").forGetter(var0x -> var0x.field22377),
               Codec.FLOAT.fieldOf("extra_chance").forGetter(var0x -> var0x.field22378),
               Codec.INT.fieldOf("extra_count").forGetter(var0x -> var0x.field22379)
            )
            .apply(var0, Class4721::new)
   );
   public final int field22377;
   public final float field22378;
   public final int field22379;

   public Class4721(int var1, float var2, int var3) {
      this.field22377 = var1;
      this.field22378 = var2;
      this.field22379 = var3;
   }
}

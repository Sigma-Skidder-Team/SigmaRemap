package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class MineshaftConfig implements Class4698 {
   public static final Codec<MineshaftConfig> field22425 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.field22426),
               Class102.field309.fieldOf("type").forGetter(var0x -> var0x.field22427)
            )
            .apply(var0, MineshaftConfig::new)
   );
   public final float field22426;
   public final Class102 field22427;

   public MineshaftConfig(float var1, Class102 var2) {
      this.field22426 = var1;
      this.field22427 = var2;
   }
}

package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4711 implements Class4698 {
   public static final Codec<Class4711> field22344 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class110.field375.fieldOf("biome_temp").forGetter(var0x -> var0x.field22345),
               Codec.floatRange(0.0F, 1.0F).fieldOf("large_probability").forGetter(var0x -> var0x.field22346),
               Codec.floatRange(0.0F, 1.0F).fieldOf("cluster_probability").forGetter(var0x -> var0x.field22347)
            )
            .apply(var0, Class4711::new)
   );
   public final Class110 field22345;
   public final float field22346;
   public final float field22347;

   public Class4711(Class110 var1, float var2, float var3) {
      this.field22345 = var1;
      this.field22346 = var2;
      this.field22347 = var3;
   }
}

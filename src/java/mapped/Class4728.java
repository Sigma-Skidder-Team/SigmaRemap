package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4728 implements Class4729, Class4698 {
   public static final Codec<Class4728> field22398 = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.field22399)).apply(var0, Class4728::new)
   );
   public final float field22399;

   public Class4728(float var1) {
      this.field22399 = var1;
   }
}

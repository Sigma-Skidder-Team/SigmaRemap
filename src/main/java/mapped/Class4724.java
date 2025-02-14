package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4724 implements Class4716 {
   public static final Codec<Class4724> field22385 = RecordCodecBuilder.create(
      var0 -> var0.group(
               GenerationStageCarving.field261.fieldOf("step").forGetter(var0x -> var0x.field22386), Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.field22387)
            )
            .apply(var0, Class4724::new)
   );
   public final GenerationStageCarving field22386;
   public final float field22387;

   public Class4724(GenerationStageCarving var1, float var2) {
      this.field22386 = var1;
      this.field22387 = var2;
   }
}

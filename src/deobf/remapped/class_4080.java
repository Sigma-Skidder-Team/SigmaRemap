package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_4080 implements class_9472, class_6157 {
   public static final Codec<class_4080> field_19858 = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.field_19859)).apply(var0, class_4080::new)
   );
   public final float field_19859;

   public class_4080(float var1) {
      this.field_19859 = var1;
   }
}

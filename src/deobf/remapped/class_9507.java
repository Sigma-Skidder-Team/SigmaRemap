package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_9507 implements class_6157 {
   public static final Codec<class_9507> field_48407 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(var0x -> var0x.field_48405),
               class_1143.field_6468.fieldOf("type").forGetter(var0x -> var0x.field_48404)
            )
            .apply(var0, class_9507::new)
   );
   public final float field_48405;
   public final class_1143 field_48404;

   public class_9507(float var1, class_1143 var2) {
      this.field_48405 = var1;
      this.field_48404 = var2;
   }
}

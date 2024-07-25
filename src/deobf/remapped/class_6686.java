package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_6686 implements class_9793 {
   public static final Codec<class_6686> field_34549 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_6033.field_30810.fieldOf("step").forGetter(var0x -> var0x.field_34551),
               Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.field_34550)
            )
            .apply(var0, class_6686::new)
   );
   public final class_6033 field_34551;
   public final float field_34550;

   public class_6686(class_6033 var1, float var2) {
      this.field_34551 = var1;
      this.field_34550 = var2;
   }
}

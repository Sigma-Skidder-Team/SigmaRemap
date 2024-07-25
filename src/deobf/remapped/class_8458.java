package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_8458 implements class_9793 {
   public static final Codec<class_8458> field_43242 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("bottom_offset").orElse(0).forGetter(var0x -> var0x.field_43239),
               Codec.INT.fieldOf("top_offset").orElse(0).forGetter(var0x -> var0x.field_43240),
               Codec.INT.fieldOf("maximum").orElse(0).forGetter(var0x -> var0x.field_43241)
            )
            .apply(var0, class_8458::new)
   );
   public final int field_43239;
   public final int field_43240;
   public final int field_43241;

   public class_8458(int var1, int var2, int var3) {
      this.field_43239 = var1;
      this.field_43240 = var2;
      this.field_43241 = var3;
   }
}

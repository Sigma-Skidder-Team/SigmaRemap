package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_9865 implements class_9793 {
   public static final Codec<class_9865> field_49915 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("count").forGetter(var0x -> var0x.field_49911),
               Codec.FLOAT.fieldOf("extra_chance").forGetter(var0x -> var0x.field_49912),
               Codec.INT.fieldOf("extra_count").forGetter(var0x -> var0x.field_49913)
            )
            .apply(var0, class_9865::new)
   );
   public final int field_49911;
   public final float field_49912;
   public final int field_49913;

   public class_9865(int var1, float var2, int var3) {
      this.field_49911 = var1;
      this.field_49912 = var2;
      this.field_49913 = var3;
   }
}

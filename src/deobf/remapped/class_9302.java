package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_9302 implements class_9793 {
   public static final Codec<class_9302> field_47520 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.DOUBLE.fieldOf("noise_level").forGetter(var0x -> var0x.field_47523),
               Codec.INT.fieldOf("below_noise").forGetter(var0x -> var0x.field_47522),
               Codec.INT.fieldOf("above_noise").forGetter(var0x -> var0x.field_47521)
            )
            .apply(var0, class_9302::new)
   );
   public final double field_47523;
   public final int field_47522;
   public final int field_47521;

   public class_9302(double var1, int var3, int var4) {
      this.field_47523 = var1;
      this.field_47522 = var3;
      this.field_47521 = var4;
   }
}

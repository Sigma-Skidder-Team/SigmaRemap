package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_3891 implements class_9793 {
   public static final Codec<class_3891> field_18933 = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("baseline").forGetter(var0x -> var0x.field_18932), Codec.INT.fieldOf("spread").forGetter(var0x -> var0x.field_18934))
            .apply(var0, class_3891::new)
   );
   public final int field_18932;
   public final int field_18934;

   public class_3891(int var1, int var2) {
      this.field_18932 = var1;
      this.field_18934 = var2;
   }
}

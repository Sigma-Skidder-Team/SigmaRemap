package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public final class class_9010 {
   public static final Codec<class_9010> field_46105 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("spacing").forGetter(var0x -> var0x.field_46106),
               Codec.INT.fieldOf("separation").forGetter(var0x -> var0x.field_46104),
               Codec.INT.fieldOf("salt").forGetter(var0x -> var0x.field_46102)
            )
            .apply(var0, class_9010::new)
   );
   private final int field_46106;
   private final int field_46104;
   private final int field_46102;

   public class_9010(int var1, int var2, int var3) {
      this.field_46106 = var1;
      this.field_46104 = var2;
      this.field_46102 = var3;
   }

   public <T> Dynamic<T> method_41342(DynamicOps<T> var1) {
      return new Dynamic(var1, field_46105.encodeStart(var1, this).result().orElse(var1.emptyMap()));
   }
}

package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4727 implements Class4698 {
   public static final Codec<Class4727> field22394 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class6698.field29330.fieldOf("cap_provider").forGetter(var0x -> var0x.field22395),
               Class6698.field29330.fieldOf("stem_provider").forGetter(var0x -> var0x.field22396),
               Codec.INT.fieldOf("foliage_radius").orElse(2).forGetter(var0x -> var0x.field22397)
            )
            .apply(var0, Class4727::new)
   );
   public final Class6698 field22395;
   public final Class6698 field22396;
   public final int field22397;

   public Class4727(Class6698 var1, Class6698 var2, int var3) {
      this.field22395 = var1;
      this.field22396 = var2;
      this.field22397 = var3;
   }
}

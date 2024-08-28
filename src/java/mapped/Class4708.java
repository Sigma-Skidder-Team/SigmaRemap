package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4708 implements Class4698 {
   public static final Codec<Class4708> field22329 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class8045.method27630(0, 2, 1).fieldOf("reach").forGetter(var0x -> var0x.field22330),
               Class8045.method27630(1, 5, 5).fieldOf("height").forGetter(var0x -> var0x.field22331)
            )
            .apply(var0, Class4708::new)
   );
   private final Class8045 field22330;
   private final Class8045 field22331;

   public Class4708(Class8045 var1, Class8045 var2) {
      this.field22330 = var1;
      this.field22331 = var2;
   }

   public Class8045 method14782() {
      return this.field22330;
   }

   public Class8045 method14783() {
      return this.field22331;
   }
}

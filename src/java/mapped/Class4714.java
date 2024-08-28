package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class Class4714 implements Class4698 {
   public static final Codec<Class4714> field22354 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class7380.field31585.fieldOf("to_place").forGetter(var0x -> var0x.field22355),
               Class7380.field31585.listOf().fieldOf("place_on").forGetter(var0x -> var0x.field22356),
               Class7380.field31585.listOf().fieldOf("place_in").forGetter(var0x -> var0x.field22357),
               Class7380.field31585.listOf().fieldOf("place_under").forGetter(var0x -> var0x.field22358)
            )
            .apply(var0, Class4714::new)
   );
   public final Class7380 field22355;
   public final List<Class7380> field22356;
   public final List<Class7380> field22357;
   public final List<Class7380> field22358;

   public Class4714(Class7380 var1, List<Class7380> var2, List<Class7380> var3, List<Class7380> var4) {
      this.field22355 = var1;
      this.field22356 = var2;
      this.field22357 = var3;
      this.field22358 = var4;
   }
}

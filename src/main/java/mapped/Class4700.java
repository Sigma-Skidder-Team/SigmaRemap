package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;

public class Class4700 implements Class4698 {
   public static final Codec<Class4700> field22296 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class9369.field43492.fieldOf("start_pool").forGetter(Class4700::method14743),
               Codec.intRange(0, 7).fieldOf("size").forGetter(Class4700::method14742)
            )
            .apply(var0, Class4700::new)
   );
   private final Supplier<Class9369> field22297;
   private final int field22298;

   public Class4700(Supplier<Class9369> var1, int var2) {
      this.field22297 = var1;
      this.field22298 = var2;
   }

   public int method14742() {
      return this.field22298;
   }

   public Supplier<Class9369> method14743() {
      return this.field22297;
   }
}

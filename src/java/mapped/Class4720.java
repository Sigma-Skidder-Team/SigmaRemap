package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4720 implements Class4716 {
   public static final Codec<Class4720> field22373 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class7907.field33878.fieldOf("outer").forGetter(Class4720::method14817), Class7907.field33878.fieldOf("inner").forGetter(Class4720::method14818)
            )
            .apply(var0, Class4720::new)
   );
   private final Class7907<?> field22374;
   private final Class7907<?> field22375;

   public Class4720(Class7907<?> var1, Class7907<?> var2) {
      this.field22374 = var1;
      this.field22375 = var2;
   }

   public Class7907<?> method14817() {
      return this.field22374;
   }

   public Class7907<?> method14818() {
      return this.field22375;
   }
}

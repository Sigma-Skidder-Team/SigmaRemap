package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4732 implements Class4698 {
   public static final Codec<Class4732> field22407 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 255).fieldOf("height").forGetter(var0x -> var0x.field22408),
               Class7380.field31585.fieldOf("state").forGetter(var0x -> var0x.field22409)
            )
            .apply(var0, Class4732::new)
   );
   public final int field22408;
   public final Class7380 field22409;

   public Class4732(int var1, Class7380 var2) {
      this.field22408 = var1;
      this.field22409 = var2;
   }
}

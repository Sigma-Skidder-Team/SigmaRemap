package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4734 implements Class4698 {
   public static final Codec<Class4734> field22421 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class6434.field28272.fieldOf("target").forGetter(var0x -> var0x.field22422),
               Class7380.field31585.fieldOf("state").forGetter(var0x -> var0x.field22424),
               Codec.intRange(0, 64).fieldOf("size").forGetter(var0x -> var0x.field22423)
            )
            .apply(var0, Class4734::new)
   );
   public final Class6434 field22422;
   public final int field22423;
   public final Class7380 field22424;

   public Class4734(Class6434 var1, Class7380 var2, int var3) {
      this.field22423 = var3;
      this.field22424 = var2;
      this.field22422 = var1;
   }
}

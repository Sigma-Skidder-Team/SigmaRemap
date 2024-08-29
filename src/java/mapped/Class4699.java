package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class Class4699 implements Class4698 {
   public static final Codec<Class4699> field22291 = RecordCodecBuilder.create(
      var0 -> var0.group(
               BlockState.field31585.fieldOf("state").forGetter(var0x -> var0x.field22292),
               Class8045.method27630(0, 4, 4).fieldOf("radius").forGetter(var0x -> var0x.field22293),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(var0x -> var0x.field22294),
               BlockState.field31585.listOf().fieldOf("targets").forGetter(var0x -> var0x.field22295)
            )
            .apply(var0, Class4699::new)
   );
   public final BlockState field22292;
   public final Class8045 field22293;
   public final int field22294;
   public final List<BlockState> field22295;

   public Class4699(BlockState var1, Class8045 var2, int var3, List<BlockState> var4) {
      this.field22292 = var1;
      this.field22293 = var2;
      this.field22294 = var3;
      this.field22295 = var4;
   }
}

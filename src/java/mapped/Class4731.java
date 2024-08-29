package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class4731 implements Class4698 {
   public static final Codec<Class4731> field22404 = RecordCodecBuilder.create(
      var0 -> var0.group(
               BlockState.field31585.fieldOf("target").forGetter(var0x -> var0x.field22405),
               BlockState.field31585.fieldOf("state").forGetter(var0x -> var0x.field22406)
            )
            .apply(var0, Class4731::new)
   );
   public final BlockState field22405;
   public final BlockState field22406;

   public Class4731(BlockState var1, BlockState var2) {
      this.field22405 = var1;
      this.field22406 = var2;
   }
}

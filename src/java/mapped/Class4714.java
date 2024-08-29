package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class Class4714 implements Class4698 {
   public static final Codec<Class4714> field22354 = RecordCodecBuilder.create(
      var0 -> var0.group(
               BlockState.field31585.fieldOf("to_place").forGetter(var0x -> var0x.field22355),
               BlockState.field31585.listOf().fieldOf("place_on").forGetter(var0x -> var0x.field22356),
               BlockState.field31585.listOf().fieldOf("place_in").forGetter(var0x -> var0x.field22357),
               BlockState.field31585.listOf().fieldOf("place_under").forGetter(var0x -> var0x.field22358)
            )
            .apply(var0, Class4714::new)
   );
   public final BlockState field22355;
   public final List<BlockState> field22356;
   public final List<BlockState> field22357;
   public final List<BlockState> field22358;

   public Class4714(BlockState var1, List<BlockState> var2, List<BlockState> var3, List<BlockState> var4) {
      this.field22355 = var1;
      this.field22356 = var2;
      this.field22357 = var3;
      this.field22358 = var4;
   }
}

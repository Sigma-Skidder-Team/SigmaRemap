package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;

public class Class4738 implements Class4698 {
   public static final Codec<Class4738> field22433 = RecordCodecBuilder.create(
      var0 -> var0.group(
               BlockState.field31585.fieldOf("contents").forGetter(var0x -> var0x.field22434),
               BlockState.field31585.fieldOf("rim").forGetter(var0x -> var0x.field22435),
               Class8045.method27630(0, 8, 8).fieldOf("size").forGetter(var0x -> var0x.field22436),
               Class8045.method27630(0, 8, 8).fieldOf("rim_size").forGetter(var0x -> var0x.field22437)
            )
            .apply(var0, Class4738::new)
   );
   private final BlockState field22434;
   private final BlockState field22435;
   private final Class8045 field22436;
   private final Class8045 field22437;

   public Class4738(BlockState var1, BlockState var2, Class8045 var3, Class8045 var4) {
      this.field22434 = var1;
      this.field22435 = var2;
      this.field22436 = var3;
      this.field22437 = var4;
   }

   public BlockState method14874() {
      return this.field22434;
   }

   public BlockState method14875() {
      return this.field22435;
   }

   public Class8045 method14876() {
      return this.field22436;
   }

   public Class8045 method14877() {
      return this.field22437;
   }
}

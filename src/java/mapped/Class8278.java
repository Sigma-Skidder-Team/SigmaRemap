package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class8278 implements Class8277 {
   public static final Codec<Class8278> field35569 = RecordCodecBuilder.create(
      var0 -> var0.group(
               BlockState.field31585.fieldOf("top_material").forGetter(var0x -> var0x.field35570),
               BlockState.field31585.fieldOf("under_material").forGetter(var0x -> var0x.field35571),
               BlockState.field31585.fieldOf("underwater_material").forGetter(var0x -> var0x.field35572)
            )
            .apply(var0, Class8278::new)
   );
   private final BlockState field35570;
   private final BlockState field35571;
   private final BlockState field35572;

   public Class8278(BlockState var1, BlockState var2, BlockState var3) {
      this.field35570 = var1;
      this.field35571 = var2;
      this.field35572 = var3;
   }

   @Override
   public BlockState method28934() {
      return this.field35570;
   }

   @Override
   public BlockState method28935() {
      return this.field35571;
   }

   public BlockState method28936() {
      return this.field35572;
   }
}

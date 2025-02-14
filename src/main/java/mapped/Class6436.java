package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.BlockState;

import java.util.Random;

public class Class6436 extends Class6434 {
   public static final Codec<Class6436> field28276 = RecordCodecBuilder.create(
      var0 -> var0.group(
               BlockState.field31585.fieldOf("block_state").forGetter(var0x -> var0x.field28277),
               Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.field28278)
            )
            .apply(var0, Class6436::new)
   );
   private final BlockState field28277;
   private final float field28278;

   public Class6436(BlockState var1, float var2) {
      this.field28277 = var1;
      this.field28278 = var2;
   }

   @Override
   public boolean method19540(BlockState var1, Random var2) {
      return var1 == this.field28277 && var2.nextFloat() < this.field28278;
   }

   @Override
   public Class9277<?> method19541() {
      return Class9277.field42665;
   }
}

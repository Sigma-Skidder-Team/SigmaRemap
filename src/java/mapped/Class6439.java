package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;

import java.util.Random;

public class Class6439 extends Class6434 {
   public static final Codec<Class6439> field28283 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Registry.BLOCK.fieldOf("block").forGetter(var0x -> var0x.field28284),
               Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.field28285)
            )
            .apply(var0, Class6439::new)
   );
   private final Block field28284;
   private final float field28285;

   public Class6439(Block var1, float var2) {
      this.field28284 = var1;
      this.field28285 = var2;
   }

   @Override
   public boolean method19540(BlockState var1, Random var2) {
      return var1.isIn(this.field28284) && var2.nextFloat() < this.field28285;
   }

   @Override
   public Class9277<?> method19541() {
      return Class9277.field42664;
   }
}

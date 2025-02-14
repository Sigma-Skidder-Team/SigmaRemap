package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;

import java.util.Random;

public class Class6433 extends Class6434 {
   public static final Codec<Class6433> field28270 = BlockState.field31585.fieldOf("block_state").xmap(Class6433::new, var0 -> var0.field28271).codec();
   private final BlockState field28271;

   public Class6433(BlockState var1) {
      this.field28271 = var1;
   }

   @Override
   public boolean method19540(BlockState var1, Random var2) {
      return var1 == this.field28271;
   }

   @Override
   public Class9277<?> method19541() {
      return Class9277.field42662;
   }
}

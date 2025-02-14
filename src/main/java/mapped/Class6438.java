package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;

import java.util.Random;

public class Class6438 extends Class6434 {
   public static final Codec<Class6438> field28281 = Registry.BLOCK.fieldOf("block").xmap(Class6438::new, var0 -> var0.field28282).codec();
   private final Block field28282;

   public Class6438(Block var1) {
      this.field28282 = var1;
   }

   @Override
   public boolean method19540(BlockState var1, Random var2) {
      return var1.isIn(this.field28282);
   }

   @Override
   public Class9277<?> method19541() {
      return Class9277.field42661;
   }
}

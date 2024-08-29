package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6437 extends Class6434 {
   public static final Codec<Class6437> field28279 = Class7608.<Block>method24916(() -> Class9443.method36296().method32657())
      .fieldOf("tag")
      .xmap(Class6437::new, var0 -> var0.field28280)
      .codec();
   private final Class7608<Block> field28280;

   public Class6437(Class7608<Block> var1) {
      this.field28280 = var1;
   }

   @Override
   public boolean method19540(BlockState var1, Random var2) {
      return var1.method23446(this.field28280);
   }

   @Override
   public Class9277<?> method19541() {
      return Class9277.field42663;
   }
}

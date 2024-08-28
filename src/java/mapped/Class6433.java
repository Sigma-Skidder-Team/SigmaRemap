package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6433 extends Class6434 {
   public static final Codec<Class6433> field28270 = Class7380.field31585.fieldOf("block_state").xmap(Class6433::new, var0 -> var0.field28271).codec();
   private final Class7380 field28271;

   public Class6433(Class7380 var1) {
      this.field28271 = var1;
   }

   @Override
   public boolean method19540(Class7380 var1, Random var2) {
      return var1 == this.field28271;
   }

   @Override
   public Class9277<?> method19541() {
      return Class9277.field42662;
   }
}

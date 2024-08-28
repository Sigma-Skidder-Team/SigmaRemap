package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6438 extends Class6434 {
   public static final Codec<Class6438> field28281 = Class2348.field16072.fieldOf("block").xmap(Class6438::new, var0 -> var0.field28282).codec();
   private final Class3209 field28282;

   public Class6438(Class3209 var1) {
      this.field28282 = var1;
   }

   @Override
   public boolean method19540(Class7380 var1, Random var2) {
      return var1.method23448(this.field28282);
   }

   @Override
   public Class9277<?> method19541() {
      return Class9277.field42661;
   }
}

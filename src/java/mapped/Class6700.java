package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6700 extends Class6698 {
   public static final Codec<Class6700> field29333 = Class7380.field31585.fieldOf("state").xmap(Class6700::new, var0 -> var0.field29334).codec();
   private final Class7380 field29334;

   public Class6700(Class7380 var1) {
      this.field29334 = var1;
   }

   @Override
   public Class9654<?> method20423() {
      return Class9654.field45131;
   }

   @Override
   public Class7380 method20424(Random var1, BlockPos var2) {
      return this.field29334;
   }
}

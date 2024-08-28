package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6701 extends Class6698 {
   public static final Codec<Class6701> field29335 = Class7380.field31585
      .fieldOf("state")
      .xmap(Class7377::method23383, Block::method11579)
      .xmap(Class6701::new, var0 -> var0.field29336)
      .codec();
   private final Block field29336;

   public Class6701(Block var1) {
      this.field29336 = var1;
   }

   @Override
   public Class9654<?> method20423() {
      return Class9654.field45135;
   }

   @Override
   public Class7380 method20424(Random var1, BlockPos var2) {
      Class113 var5 = Class113.method325(var1);
      return this.field29336.method11579().method23465(Class3386.field18994, var5);
   }
}

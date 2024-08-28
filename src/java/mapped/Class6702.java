package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6702 extends Class6698 {
   private static String[] field29337;
   public static final Codec<Class6702> field29338 = Codec.unit(() -> Class6702.field29340);
   private static final Class7380[] field29339 = new Class7380[]{
      Class8487.field36506.method11579(),
      Class8487.field36507.method11579(),
      Class8487.field36509.method11579(),
      Class8487.field36510.method11579(),
      Class8487.field36511.method11579(),
      Class8487.field36512.method11579(),
      Class8487.field36513.method11579(),
      Class8487.field36514.method11579(),
      Class8487.field36515.method11579(),
      Class8487.field36516.method11579(),
      Class8487.field36518.method11579()
   };
   public static final Class6702 field29340 = new Class6702();

   @Override
   public Class9654<?> method20423() {
      return Class9654.field45134;
   }

   @Override
   public Class7380 method20424(Random var1, BlockPos var2) {
      double var5 = Class9679.method37778(
         (1.0 + Class8907.field40314.method25315((double)var2.method8304() / 48.0, (double)var2.method8306() / 48.0, false)) / 2.0, 0.0, 0.9999
      );
      return field29339[(int)(var5 * (double)field29339.length)];
   }
}

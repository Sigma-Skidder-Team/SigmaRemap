package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6697 extends Class6698 {
   private static String[] field29325;
   public static final Codec<Class6697> field29326 = Codec.unit(() -> Class6697.field29327);
   public static final Class6697 field29327 = new Class6697();
   private static final Class7380[] field29328 = new Class7380[]{
      Blocks.field36512.method11579(), Blocks.field36511.method11579(), Blocks.field36514.method11579(), Blocks.field36513.method11579()
   };
   private static final Class7380[] field29329 = new Class7380[]{
      Blocks.field36507.method11579(), Blocks.field36510.method11579(), Blocks.field36515.method11579(), Blocks.field36516.method11579()
   };

   @Override
   public Class9654<?> method20423() {
      return Class9654.field45133;
   }

   @Override
   public Class7380 method20424(Random var1, BlockPos var2) {
      double var5 = Class8907.field40314.method25315((double)var2.method8304() / 200.0, (double)var2.method8306() / 200.0, false);
      if (!(var5 < -0.8)) {
         return var1.nextInt(3) <= 0 ? Blocks.field36506.method11579() : Util.<Class7380>method38518(field29329, var1);
      } else {
         return Util.<Class7380>method38518(field29328, var1);
      }
   }
}

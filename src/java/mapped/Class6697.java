package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;

public class Class6697 extends Class6698 {
   private static String[] field29325;
   public static final Codec<Class6697> field29326 = Codec.unit(() -> Class6697.field29327);
   public static final Class6697 field29327 = new Class6697();
   private static final Class7380[] field29328 = new Class7380[]{
      Blocks.ORANGE_TULIP.method11579(), Blocks.RED_TULIP.method11579(), Blocks.PINK_TULIP.method11579(), Blocks.WHITE_TULIP.method11579()
   };
   private static final Class7380[] field29329 = new Class7380[]{
      Blocks.POPPY.method11579(), Blocks.AZURE_BLUET.method11579(), Blocks.OXEYE_DAISY.method11579(), Blocks.CORNFLOWER.method11579()
   };

   @Override
   public Class9654<?> method20423() {
      return Class9654.field45133;
   }

   @Override
   public Class7380 method20424(Random var1, BlockPos var2) {
      double var5 = Class8907.field40314.method25315((double)var2.method8304() / 200.0, (double)var2.method8306() / 200.0, false);
      if (!(var5 < -0.8)) {
         return var1.nextInt(3) <= 0 ? Blocks.DANDELION.method11579() : Util.<Class7380>method38518(field29329, var1);
      } else {
         return Util.<Class7380>method38518(field29328, var1);
      }
   }
}

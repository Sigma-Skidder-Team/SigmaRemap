package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class6275 extends Class6273<Class4717> {
   public Class6275(Codec<Class4717> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4717 var2, BlockPos var3) {
      double var6 = Biome.field40314.method25315((double)var3.method8304() / var2.field22364, (double)var3.method8306() / var2.field22364, false);
      int var8 = (int)Math.ceil((var6 + var2.field22365) * (double)var2.field22363);
      return IntStream.range(0, var8).<BlockPos>mapToObj(var1x -> var3);
   }
}

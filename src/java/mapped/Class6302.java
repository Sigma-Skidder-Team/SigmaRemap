package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class6302 extends Class6272<Class4719> {
   public Class6302(Codec<Class4719> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19240(Class9010 var1, Random var2, Class4719 var3, BlockPos var4) {
      double var7 = Biome.field40314.method25315((double)var4.method8304() / 200.0, (double)var4.method8306() / 200.0, false);
      int var9 = !(var7 < var3.field22370) ? var3.field22372 : var3.field22371;
      return IntStream.range(0, var9).<BlockPos>mapToObj(var1x -> var4);
   }
}

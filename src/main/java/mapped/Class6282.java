package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.Stream;

public class Class6282 extends Class6273<Class4718> {
   public Class6282(Codec<Class4718> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4718 var2, BlockPos var3) {
      Stream var6 = Stream.empty();
      if (var1.nextInt(14) != 0) {
         return Stream.<BlockPos>empty();
      } else {
         var6 = Stream.<BlockPos>concat(var6, Stream.of(var3.add(var1.nextInt(16), 55 + var1.nextInt(16), var1.nextInt(16))));
         if (var1.nextInt(4) == 0) {
            var6 = Stream.<BlockPos>concat(var6, Stream.of(var3.add(var1.nextInt(16), 55 + var1.nextInt(16), var1.nextInt(16))));
         }

         return var6;
      }
   }
}

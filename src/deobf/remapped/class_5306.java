package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_5306 extends class_1710<class_3966> {
   public class_5306(Codec<class_3966> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_24236(Random var1, class_3966 var2, BlockPos var3) {
      return !(var1.nextFloat() < 1.0F / (float)var2.field_19208) ? Stream.<BlockPos>empty() : Stream.<BlockPos>of(var3);
   }
}

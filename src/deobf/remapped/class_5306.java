package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_5306 extends class_1710<class_3966> {
   public class_5306(Codec<class_3966> var1) {
      super(var1);
   }

   public Stream<class_1331> method_24236(Random var1, class_3966 var2, class_1331 var3) {
      return !(var1.nextFloat() < 1.0F / (float)var2.field_19208) ? Stream.<class_1331>empty() : Stream.<class_1331>of(var3);
   }
}

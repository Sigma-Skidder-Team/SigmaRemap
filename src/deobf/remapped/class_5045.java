package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_5045 extends class_1710<class_9504> {
   public class_5045(Codec<class_9504> var1) {
      super(var1);
   }

   public Stream<class_1331> method_23224(Random var1, class_9504 var2, class_1331 var3) {
      int var6 = var1.nextInt(16) + var3.method_12173();
      int var7 = var1.nextInt(16) + var3.method_12185();
      int var8 = var3.method_12165();
      return Stream.<class_1331>of(new class_1331(var6, var8, var7));
   }
}

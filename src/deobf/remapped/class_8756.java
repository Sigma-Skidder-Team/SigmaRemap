package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_8756 extends class_1710<class_9504> {
   public class_8756(Codec<class_9504> var1) {
      super(var1);
   }

   public Stream<class_1331> method_40201(Random var1, class_9504 var2, class_1331 var3) {
      Stream var6 = Stream.empty();
      if (var1.nextInt(14) != 0) {
         return Stream.<class_1331>empty();
      } else {
         var6 = Stream.<class_1331>concat(var6, Stream.of(var3.method_6104(var1.nextInt(16), 55 + var1.nextInt(16), var1.nextInt(16))));
         if (var1.nextInt(4) == 0) {
            var6 = Stream.<class_1331>concat(var6, Stream.of(var3.method_6104(var1.nextInt(16), 55 + var1.nextInt(16), var1.nextInt(16))));
         }

         return var6;
      }
   }
}

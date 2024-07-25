package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_655 extends class_5788<class_2692> {
   public class_655(Codec<class_2692> var1) {
      super(var1);
   }

   public Stream<class_1331> method_3011(class_6680 var1, Random var2, class_2692 var3, class_1331 var4) {
      return var3.method_12078().method_13769(var1, var2, var4).<class_1331>flatMap(var3x -> var3.method_12079().method_13769(var1, var2, var3x));
   }
}

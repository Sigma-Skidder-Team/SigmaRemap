package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class_1649 extends class_5788<class_9302> {
   public class_1649(Codec<class_9302> var1) {
      super(var1);
   }

   public Stream<class_1331> method_7374(class_6680 var1, Random var2, class_9302 var3, class_1331 var4) {
      double var7 = class_6325.field_32304.method_31321((double)var4.method_12173() / 200.0, (double)var4.method_12185() / 200.0, false);
      int var9 = !(var7 < var3.field_47523) ? var3.field_47521 : var3.field_47522;
      return IntStream.range(0, var9).<class_1331>mapToObj(var1x -> var4);
   }
}

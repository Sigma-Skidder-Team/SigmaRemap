package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_1879 extends class_1710<class_8458> {
   public class_1879(Codec<class_8458> var1) {
      super(var1);
   }

   public Stream<class_1331> method_8416(Random var1, class_8458 var2, class_1331 var3) {
      int var6 = var3.method_12173();
      int var7 = var3.method_12185();
      int var8 = var1.nextInt(var2.field_43241 - var2.field_43240) + var2.field_43239;
      return Stream.<class_1331>of(new class_1331(var6, var8, var7));
   }
}

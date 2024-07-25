package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_2479<DC extends class_9793> extends class_5557<DC> {
   public class_2479(Codec<DC> var1) {
      super(var1);
   }

   @Override
   public class_3801 method_25255(DC var1) {
      return class_3801.field_18595;
   }

   @Override
   public Stream<class_1331> method_26185(class_6680 var1, Random var2, DC var3, class_1331 var4) {
      int var7 = var4.method_12173();
      int var8 = var4.method_12185();
      int var9 = var1.method_30648(this.method_25255((DC)var3), var7, var8);
      return var9 != 0 ? Stream.<class_1331>of(new class_1331(var7, var2.nextInt(var9 * 2), var8)) : Stream.<class_1331>of();
   }
}

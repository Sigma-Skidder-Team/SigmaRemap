package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class class_1710<DC extends class_9793> extends class_5788<DC> {
   public class_1710(Codec<DC> var1) {
      super(var1);
   }

   @Override
   public final Stream<class_1331> method_26185(class_6680 var1, Random var2, DC var3, class_1331 var4) {
      return this.method_7686(var2, (DC)var3, var4);
   }

   public abstract Stream<class_1331> method_7686(Random var1, DC var2, class_1331 var3);
}

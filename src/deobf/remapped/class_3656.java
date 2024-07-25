package remapped;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class class_3656 implements Keyable {
   private static String[] field_17813;

   public class_3656(class_4530[] var1) {
      this.field_17812 = var1;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return !var1.compressMaps()
         ? Arrays.<class_4530>stream(this.field_17812).<String>map(class_4530::method_21049).<T>map(var1::createString)
         : IntStream.range(0, this.field_17812.length).<T>mapToObj(var1::createInt);
   }
}

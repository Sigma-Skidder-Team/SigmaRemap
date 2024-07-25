package remapped;

import com.mojang.serialization.Codec;
import java.util.function.Function;

public final class class_1952 extends class_8583<T> {
   private static String[] field_9960;

   public class_1952(boolean var1, class_7981 var2, Function var3) {
      super(var1, var2);
      this.field_9959 = var3;
   }

   @Override
   public Codec<T> method_39481() {
      return (Codec<T>)this.field_9959.apply(this);
   }
}

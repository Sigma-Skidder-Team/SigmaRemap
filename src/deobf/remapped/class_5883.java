package remapped;

import java.util.Optional;
import java.util.function.BiFunction;

public final class class_5883 implements class_9210 {
   private static String[] field_29869;

   public class_5883(class_6486 var1, class_1331 var2) {
      this.field_29868 = var1;
      this.field_29867 = var2;
   }

   @Override
   public <T> Optional<T> method_42531(BiFunction<class_6486, class_1331, T> var1) {
      return Optional.<T>of((T)var1.apply(this.field_29868, this.field_29867));
   }
}

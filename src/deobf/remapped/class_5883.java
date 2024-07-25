package remapped;

import java.util.Optional;
import java.util.function.BiFunction;

public final class class_5883 implements class_9210 {
   private static String[] field_29869;

   public class_5883(World var1, BlockPos var2) {
      this.field_29868 = var1;
      this.field_29867 = var2;
   }

   @Override
   public <T> Optional<T> method_42531(BiFunction<World, BlockPos, T> var1) {
      return Optional.<T>of((T)var1.apply(this.field_29868, this.field_29867));
   }
}

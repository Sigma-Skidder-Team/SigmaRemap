package mapped;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Class4706 implements Class4698 {
   public static final Codec<Class4706> field22323 = Class7909.field33884.fieldOf("features").xmap(Class4706::new, var0 -> var0.field22324).codec();
   public final List<Supplier<Class7909<?, ?>>> field22324;

   public Class4706(List<Supplier<Class7909<?, ?>>> var1) {
      this.field22324 = var1;
   }

   @Override
   public Stream<Class7909<?, ?>> method14736() {
      return this.field22324.stream().<Class7909<?, ?>>flatMap(var0 -> var0.get().method26522());
   }
}

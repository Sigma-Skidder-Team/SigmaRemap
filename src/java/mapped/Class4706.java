package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Class4706 implements Class4698 {
   public static final Codec<Class4706> field22323 = ConfiguredFeature.field33884.fieldOf("features").xmap(Class4706::new, var0 -> var0.field22324).codec();
   public final List<Supplier<ConfiguredFeature<?, ?>>> field22324;

   public Class4706(List<Supplier<ConfiguredFeature<?, ?>>> var1) {
      this.field22324 = var1;
   }

   @Override
   public Stream<ConfiguredFeature<?, ?>> method14736() {
      return this.field22324.stream().<ConfiguredFeature<?, ?>>flatMap(var0 -> var0.get().method26522());
   }
}

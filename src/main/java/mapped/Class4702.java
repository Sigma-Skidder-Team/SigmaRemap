package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Class4702 implements Class4698 {
   public static final Codec<Class4702> field22302 = RecordCodecBuilder.create(
      var0 -> var0.group(
               ConfiguredFeature.field33883.fieldOf("feature_true").forGetter(var0x -> var0x.field22303),
               ConfiguredFeature.field33883.fieldOf("feature_false").forGetter(var0x -> var0x.field22304)
            )
            .apply(var0, Class4702::new)
   );
   public final Supplier<ConfiguredFeature<?, ?>> field22303;
   public final Supplier<ConfiguredFeature<?, ?>> field22304;

   public Class4702(Supplier<ConfiguredFeature<?, ?>> var1, Supplier<ConfiguredFeature<?, ?>> var2) {
      this.field22303 = var1;
      this.field22304 = var2;
   }

   @Override
   public Stream<ConfiguredFeature<?, ?>> method14736() {
      return Stream.<ConfiguredFeature<?, ?>>concat(this.field22303.get().method26522(), this.field22304.get().method26522());
   }
}

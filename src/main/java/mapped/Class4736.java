package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Class4736 implements Class4698 {
   public static final Codec<Class4736> field22428 = RecordCodecBuilder.create(
      var0 -> var0.apply2(
            Class4736::new,
            Class7758.field33328.listOf().fieldOf("features").forGetter(var0x -> var0x.field22429),
            ConfiguredFeature.field33883.fieldOf("default").forGetter(var0x -> var0x.field22430)
         )
   );
   public final List<Class7758> field22429;
   public final Supplier<ConfiguredFeature<?, ?>> field22430;

   public Class4736(List<Class7758> var1, ConfiguredFeature<?, ?> var2) {
      this(var1, () -> var2);
   }

   private Class4736(List<Class7758> var1, Supplier<ConfiguredFeature<?, ?>> var2) {
      this.field22429 = var1;
      this.field22430 = var2;
   }

   @Override
   public Stream<ConfiguredFeature<?, ?>> method14736() {
      return Stream.<ConfiguredFeature<?, ?>>concat(this.field22429.stream().flatMap(var0 -> var0.field33329.get().method26522()), this.field22430.get().method26522());
   }
}

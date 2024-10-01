package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Random;
import java.util.function.Supplier;

public class Class7758 {
   public static final Codec<Class7758> field33328 = RecordCodecBuilder.create(
      var0 -> var0.group(
               ConfiguredFeature.field33883.fieldOf("feature").forGetter(var0x -> var0x.field33329),
               Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter(var0x -> var0x.field33330)
            )
            .apply(var0, Class7758::new)
   );
   public final Supplier<ConfiguredFeature<?, ?>> field33329;
   public final float field33330;

   public Class7758(ConfiguredFeature<?, ?> var1, float var2) {
      this(() -> var1, var2);
   }

   private Class7758(Supplier<ConfiguredFeature<?, ?>> var1, float var2) {
      this.field33329 = var1;
      this.field33330 = var2;
   }

   public boolean method25722(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4) {
      return this.field33329.get().func_242765_a(var1, var2, var3, var4);
   }
}

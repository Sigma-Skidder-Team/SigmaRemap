package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.NetherBiomeProvider;

import java.util.Optional;

public final class Class9354 {
   public static final MapCodec<Class9354> field43409 = RecordCodecBuilder.mapCodec(
      builder -> builder.group(
               ResourceLocation.CODEC.flatXmap(id ->
                               Optional.ofNullable(NetherBiomeProviderPreset.method36971().get(id)).map(DataResult::success).orElseGet(() ->
                                       DataResult.error("Unknown preset: " + id)),
                     preset -> DataResult.success(NetherBiomeProviderPreset.method36970((NetherBiomeProviderPreset) preset))
                  )
                  .fieldOf("preset")
                  .stable()
                  .forGetter(Class9354::method35413),
               Class8611.method30859(Registry.BIOME_KEY).forGetter(Class9354::method35414),
               Codec.LONG.fieldOf("seed").stable().forGetter(Class9354::method35415)
            )
            .apply(builder, builder.stable((a, b, c) -> new Class9354((NetherBiomeProviderPreset) a, b, c)))
   );
   private final NetherBiomeProviderPreset field43410;
   private final Registry<Biome> field43411;
   private final long field43412;

   public Class9354(NetherBiomeProviderPreset var1, Registry<Biome> var2, long var3) {
      this.field43410 = var1;
      this.field43411 = var2;
      this.field43412 = var3;
   }

   public NetherBiomeProviderPreset method35413() {
      return this.field43410;
   }

   public Registry<Biome> method35414() {
      return this.field43411;
   }

   public long method35415() {
      return this.field43412;
   }

   public NetherBiomeProvider method35416() {
      return this.field43410.build(this.field43411, this.field43412);
   }
}

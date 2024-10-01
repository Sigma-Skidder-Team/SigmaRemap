package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.NetherBiomeProvider;

import java.util.Map;
import java.util.Optional;

public class NetherBiomeProviderPreset {
   private static final Map<ResourceLocation, NetherBiomeProviderPreset> field44450 = Maps.newHashMap();
   public static final NetherBiomeProviderPreset DEFAULT_NETHER_PROVIDER_PRESET = new NetherBiomeProviderPreset(
      new ResourceLocation("nether"),
      (var0, var1, var2) -> new NetherBiomeProvider(var2, ImmutableList.of(
               Pair.of(new Class7150(0.0F, 0.0F, 0.0F, 0.0F, 0.0F), () -> var1.getOrThrow(Biomes.NETHER_WASTES)),
               Pair.of(new Class7150(0.0F, -0.5F, 0.0F, 0.0F, 0.0F), () -> var1.getOrThrow(Biomes.field44196)),
               Pair.of(new Class7150(0.4F, 0.0F, 0.0F, 0.0F, 0.0F), () -> var1.getOrThrow(Biomes.field44197)),
               Pair.of(new Class7150(0.0F, 0.5F, 0.0F, 0.0F, 0.375F), () -> var1.getOrThrow(Biomes.field44198)),
               Pair.of(new Class7150(-0.5F, 0.0F, 0.0F, 0.0F, 0.175F), () -> var1.getOrThrow(Biomes.field44199))
            ), Optional.of(Pair.of(var1, var0))
         )
   );
   private final ResourceLocation field44452;
   private final Function3<NetherBiomeProviderPreset, Registry<Biome>, Long, NetherBiomeProvider> field44453;

   public NetherBiomeProviderPreset(ResourceLocation var1, Function3<NetherBiomeProviderPreset, Registry<Biome>, Long, NetherBiomeProvider> var2) {
      this.field44452 = var1;
      this.field44453 = var2;
      field44450.put(var1, this);
   }

   public NetherBiomeProvider build(Registry<Biome> var1, long var2) {
      return (NetherBiomeProvider)this.field44453.apply(this, var1, var2);
   }

   // $VF: synthetic method
   public static ResourceLocation method36970(NetherBiomeProviderPreset var0) {
      return var0.field44452;
   }

   // $VF: synthetic method
   public static Map method36971() {
      return field44450;
   }
}

package net.minecraft.world.biome.provider;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.biome.Biome;

import java.util.List;
import java.util.function.Supplier;

public class CheckerboardBiomeProvider extends BiomeProvider {
   public static final Codec<CheckerboardBiomeProvider> CODEC = RecordCodecBuilder.create(
      var0 -> var0.group(
               Biome.BIOMES_CODEC.fieldOf("biomes").forGetter(var0x -> var0x.field9179),
               Codec.intRange(0, 62).fieldOf("scale").orElse(2).forGetter(var0x -> var0x.field9181)
            )
            .apply(var0, CheckerboardBiomeProvider::new)
   );
   private final List<Supplier<Biome>> field9179;
   private final int field9180;
   private final int field9181;

   public CheckerboardBiomeProvider(List<Supplier<Biome>> var1, int var2) {
      super(var1.stream());
      this.field9179 = var1;
      this.field9180 = var2 + 2;
      this.field9181 = var2;
   }

   @Override
   public Codec<? extends BiomeProvider> getBiomeProviderCodec() {
      return CODEC;
   }

   @Override
   public BiomeProvider getBiomeProvider(long var1) {
      return this;
   }

   @Override
   public Biome getNoiseBiome(int var1, int var2, int var3) {
      return this.field9179.get(Math.floorMod((var1 >> this.field9180) + (var3 >> this.field9180), this.field9179.size())).get();
   }
}

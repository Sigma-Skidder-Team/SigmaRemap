package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.List;
import java.util.function.Supplier;

public class Class1689 extends BiomeProvider {
   public static final Codec<Class1689> field9184 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.LONG.fieldOf("seed").stable().forGetter(var0x -> var0x.field9187),
               Codec.BOOL.optionalFieldOf("legacy_biome_init_layer", false, Lifecycle.stable()).forGetter(var0x -> var0x.field9188),
               Codec.BOOL.fieldOf("large_biomes").orElse(false).stable().forGetter(var0x -> var0x.field9189),
               Class8611.<Biome>method30859(Registry.BIOME_KEY).forGetter(var0x -> var0x.field9190)
            )
            .apply(var0, var0.stable(Class1689::new))
   );
   private final Class7345 field9185;
   private static final List<RegistryKey<Biome>> field9186 = ImmutableList.of(
      Class9495.field44121,
      Class9495.field44122,
      Class9495.field44123,
      Class9495.field44124,
      Class9495.field44125,
      Class9495.field44126,
      Class9495.field44127,
      Class9495.field44128,
      Class9495.field44131,
      Class9495.field44132,
      Class9495.field44133,
      Class9495.field44134,
      new RegistryKey[]{
         Class9495.field44135,
         Class9495.field44136,
         Class9495.field44137,
         Class9495.field44138,
         Class9495.field44139,
         Class9495.field44140,
         Class9495.field44141,
         Class9495.field44142,
         Class9495.field44143,
         Class9495.field44144,
         Class9495.field44145,
         Class9495.field44146,
         Class9495.field44147,
         Class9495.field44148,
         Class9495.field44149,
         Class9495.field44150,
         Class9495.field44151,
         Class9495.field44152,
         Class9495.field44153,
         Class9495.field44154,
         Class9495.field44155,
         Class9495.field44156,
         Class9495.field44157,
         Class9495.field44158,
         Class9495.field44159,
         Class9495.field44160,
         Class9495.field44165,
         Class9495.field44166,
         Class9495.field44167,
         Class9495.field44168,
         Class9495.field44169,
         Class9495.field44170,
         Class9495.field44171,
         Class9495.field44173,
         Class9495.field44174,
         Class9495.field44175,
         Class9495.field44176,
         Class9495.field44177,
         Class9495.field44178,
         Class9495.field44179,
         Class9495.field44180,
         Class9495.field44181,
         Class9495.field44182,
         Class9495.field44183,
         Class9495.field44184,
         Class9495.field44185,
         Class9495.field44186,
         Class9495.field44187,
         Class9495.field44188,
         Class9495.field44189,
         Class9495.field44190,
         Class9495.field44191,
         Class9495.field44192,
         Class9495.field44193
      }
   );
   private final long field9187;
   private final boolean field9188;
   private final boolean field9189;
   private final Registry<Biome> field9190;

   public Class1689(long var1, boolean var3, boolean var4, Registry<Biome> var5) {
      super(field9186.stream().<Supplier<Biome>>map(var1x -> () -> var5.getOrThrow((RegistryKey<Biome>)var1x)));
      this.field9187 = var1;
      this.field9188 = var3;
      this.field9189 = var4;
      this.field9190 = var5;
      this.field9185 = Class9320.method35215(var1, var3, !var4 ? 4 : 6, 4);
   }

   @Override
   public Codec<? extends BiomeProvider> method7199() {
      return field9184;
   }

   @Override
   public BiomeProvider method7200(long var1) {
      return new Class1689(var1, this.field9188, this.field9189, this.field9190);
   }

   @Override
   public Biome getNoiseBiome(int var1, int var2, int var3) {
      return this.field9185.method23287(this.field9190, var1, var3);
   }
}

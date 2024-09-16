package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class Class1686 extends BiomeProvider {
   private static final Class6813 field9163 = new Class6813(-7, ImmutableList.of(1.0, 1.0));
   public static final MapCodec<Class1686> field9164 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Codec.LONG.fieldOf("seed").forGetter(var0x -> var0x.field9176),
               RecordCodecBuilder.<Pair<Class7150, Supplier<Biome>>>create(
                     var0x -> var0x.group(
                              Class7150.field30717.fieldOf("parameters").forGetter(Pair::getFirst),
                              Biome.field40309.fieldOf("biome").forGetter(Pair::getSecond)
                           )
                           .apply(var0x, Pair::of)
                  )
                  .listOf()
                  .fieldOf("biomes")
                  .forGetter(var0x -> var0x.field9174),
               Class6813.field29666.fieldOf("temperature_noise").forGetter(var0x -> var0x.field9166),
               Class6813.field29666.fieldOf("humidity_noise").forGetter(var0x -> var0x.field9167),
               Class6813.field29666.fieldOf("altitude_noise").forGetter(var0x -> var0x.field9168),
               Class6813.field29666.fieldOf("weirdness_noise").forGetter(var0x -> var0x.field9169)
            )
            .apply(var0, Class1686::new)
   );
   public static final Codec<Class1686> field9165 = Codec.mapEither(Class9354.field43409, field9164)
      .xmap(
         var0 -> (Class1686)var0.map(Class9354::method35416, Function.identity()),
         var0 -> var0.method7209().<Either>map(Either::left).orElseGet(() -> Either.right(var0))
      )
      .codec();
   private final Class6813 field9166;
   private final Class6813 field9167;
   private final Class6813 field9168;
   private final Class6813 field9169;
   private final Class9297 field9170;
   private final Class9297 field9171;
   private final Class9297 field9172;
   private final Class9297 field9173;
   private final List<Pair<Class7150, Supplier<Biome>>> field9174;
   private final boolean field9175;
   private final long field9176;
   private final Optional<Pair<Registry<Biome>, NetherBiomeProviderPreset>> field9177;

   public Class1686(long var1, List<Pair<Class7150, Supplier<Biome>>> var3, Optional<Pair<Registry<Biome>, NetherBiomeProviderPreset>> var4) {
      this(var1, var3, field9163, field9163, field9163, field9163, var4);
   }

   public Class1686(long var1, List<Pair<Class7150, Supplier<Biome>>> var3, Class6813 var4, Class6813 var5, Class6813 var6, Class6813 var7) {
      this(var1, var3, var4, var5, var6, var7, Optional.<Pair<Registry<Biome>, NetherBiomeProviderPreset>>empty());
   }

   private Class1686(
      long var1,
      List<Pair<Class7150, Supplier<Biome>>> var3,
      Class6813 var4,
      Class6813 var5,
      Class6813 var6,
      Class6813 var7,
      Optional<Pair<Registry<Biome>, NetherBiomeProviderPreset>> var8
   ) {
      super(var3.stream().<Supplier<Biome>>map(Pair::getSecond));
      this.field9176 = var1;
      this.field9177 = var8;
      this.field9166 = var4;
      this.field9167 = var5;
      this.field9168 = var6;
      this.field9169 = var7;
      this.field9170 = Class9297.method35044(new Class2420(var1), var4.method20760(), var4.method20761());
      this.field9171 = Class9297.method35044(new Class2420(var1 + 1L), var5.method20760(), var5.method20761());
      this.field9172 = Class9297.method35044(new Class2420(var1 + 2L), var6.method20760(), var6.method20761());
      this.field9173 = Class9297.method35044(new Class2420(var1 + 3L), var7.method20760(), var7.method20761());
      this.field9174 = var3;
      this.field9175 = false;
   }

   @Override
   public Codec<? extends BiomeProvider> method7199() {
      return field9165;
   }

   @Override
   public BiomeProvider method7200(long var1) {
      return new Class1686(var1, this.field9174, this.field9166, this.field9167, this.field9168, this.field9169, this.field9177);
   }

   private Optional<Class9354> method7209() {
      return this.field9177.<Class9354>map(var1 -> new Class9354(var1.getSecond(), var1.getFirst(), this.field9176));
   }

   @Override
   public Biome getNoiseBiome(int var1, int var2, int var3) {
      int var6 = !this.field9175 ? 0 : var2;
      Class7150 var7 = new Class7150(
         (float)this.field9170.method35046((double)var1, (double)var6, (double)var3),
         (float)this.field9171.method35046((double)var1, (double)var6, (double)var3),
         (float)this.field9172.method35046((double)var1, (double)var6, (double)var3),
         (float)this.field9173.method35046((double)var1, (double)var6, (double)var3),
         0.0F
      );
      return this.field9174
         .stream()
         .min(Comparator.comparing(var1x -> ((Class7150)var1x.getFirst()).method22304(var7)))
         .map(Pair::getSecond)
         .<Biome>map(Supplier::get)
         .orElse(Class8900.field40282);
   }

   public boolean method7210(long var1) {
      return this.field9176 == var1 && this.field9177.isPresent() && Objects.equals(this.field9177.get().getSecond(), NetherBiomeProviderPreset.DEFAULT_NETHER_PROVIDER_PRESET);
   }
}

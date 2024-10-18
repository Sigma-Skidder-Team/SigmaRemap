package net.minecraft.world.biome;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.client.audio.BackgroundMusicSelector;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.SoundEvent;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BiomeAmbience {
   public static final Codec<BiomeAmbience> CODEC = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("fog_color").forGetter(var0x -> var0x.field33279),
               Codec.INT.fieldOf("water_color").forGetter(var0x -> var0x.field33280),
               Codec.INT.fieldOf("water_fog_color").forGetter(var0x -> var0x.field33281),
               Codec.INT.fieldOf("sky_color").forGetter(var0x -> var0x.field33282),
               Codec.INT.optionalFieldOf("foliage_color").forGetter(var0x -> var0x.field33283),
               Codec.INT.optionalFieldOf("grass_color").forGetter(var0x -> var0x.field33284),
               GrassColorModifier.field234.optionalFieldOf("grass_color_modifier", GrassColorModifier.field230).forGetter(var0x -> var0x.field33285),
               ParticleEffectAmbience.field33229.optionalFieldOf("particle").forGetter(var0x -> var0x.field33286),
               SoundEvent.field43936.optionalFieldOf("ambient_sound").forGetter(var0x -> var0x.field33287),
               MoodSoundAmbience.field34223.optionalFieldOf("mood_sound").forGetter(var0x -> var0x.field33288),
               SoundAdditionsAmbience.field35292.optionalFieldOf("additions_sound").forGetter(var0x -> var0x.field33289),
               BackgroundMusicSelector.field19366.optionalFieldOf("music").forGetter(var0x -> var0x.field33290)
            )
            .apply(var0, BiomeAmbience::new)
   );
   private final int field33279;
   private final int field33280;
   private final int field33281;
   private final int field33282;
   private final Optional<Integer> field33283;
   private final Optional<Integer> field33284;
   private final GrassColorModifier field33285;
   private final Optional<ParticleEffectAmbience> field33286;
   private final Optional<SoundEvent> field33287;
   private final Optional<MoodSoundAmbience> field33288;
   private final Optional<SoundAdditionsAmbience> field33289;
   private final Optional<BackgroundMusicSelector> field33290;

   public BiomeAmbience(
           int var1,
           int var2,
           int var3,
           int var4,
           Optional<Integer> var5,
           Optional<Integer> var6,
           GrassColorModifier var7,
           Optional<ParticleEffectAmbience> var8,
           Optional<SoundEvent> var9,
           Optional<MoodSoundAmbience> var10,
           Optional<SoundAdditionsAmbience> var11,
           Optional<BackgroundMusicSelector> var12
   ) {
      this.field33279 = var1;
      this.field33280 = var2;
      this.field33281 = var3;
      this.field33282 = var4;
      this.field33283 = var5;
      this.field33284 = var6;
      this.field33285 = var7;
      this.field33286 = var8;
      this.field33287 = var9;
      this.field33288 = var10;
      this.field33289 = var11;
      this.field33290 = var12;
   }

   public int getFogColor() {
      return this.field33279;
   }

   public int getWaterColor() {
      return this.field33280;
   }

   public int getWaterFogColor() {
      return this.field33281;
   }

   public int getSkyColor() {
      return this.field33282;
   }

   public Optional<Integer> getFoliageColor() {
      return this.field33283;
   }

   public Optional<Integer> getGrassColor() {
      return this.field33284;
   }

   public GrassColorModifier getGrassColorModifier() {
      return this.field33285;
   }

   public Optional<ParticleEffectAmbience> getParticle() {
      return this.field33286;
   }

   public Optional<SoundEvent> getAmbientSound() {
      return this.field33287;
   }

   public Optional<MoodSoundAmbience> getMoodSound() {
      return this.field33288;
   }

   public Optional<SoundAdditionsAmbience> getAdditionsSound() {
      return this.field33289;
   }

   public Optional<BackgroundMusicSelector> getMusic() {
      return this.field33290;
   }

   public enum GrassColorModifier implements IStringSerializable {
      field230("none") {
         @Override
         public int getModifiedGrassColor(double d, double d2, int n) {
            return n;
         }
      },
      field231("dark_forest") {
         @Override
         public int getModifiedGrassColor(double d, double d2, int n) {
            return (n & 0xFEFEFE) + 2634762 >> 1;
         }
      },
      field232("swamp") {
         @Override
         public int getModifiedGrassColor(double d, double d2, int n) {
            double d3 = Biome.INFO_NOISE.noiseAt(d * 0.0225, d2 * 0.0225, false);
            return !(d3 < -0.1) ? 6975545 : 5011004;
         }
      };

      private final String field233;
      public static final Codec<GrassColorModifier> field234 = IStringSerializable.<GrassColorModifier>createEnumCodec(GrassColorModifier::values, GrassColorModifier::method267);
      private static final Map<String, GrassColorModifier> field235 = Arrays.<GrassColorModifier>stream(values()).collect(Collectors.toMap(GrassColorModifier::method266, var0 -> (GrassColorModifier)var0));
      private static final GrassColorModifier[] field236 = new GrassColorModifier[]{field230, field231, field232};

      public abstract int getModifiedGrassColor(double var1, double var3, int var5);

      private GrassColorModifier(String var3) {
         this.field233 = var3;
      }

      public String method266() {
         return this.field233;
      }

      @Override
      public String getString() {
         return this.field233;
      }

      public static GrassColorModifier method267(String var0) {
         return field235.get(var0);
      }
   }
}

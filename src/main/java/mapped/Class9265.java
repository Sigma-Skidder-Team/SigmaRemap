package mapped;

import net.minecraft.client.audio.BackgroundMusicSelector;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.biome.ParticleEffectAmbience;
import net.minecraft.world.biome.SoundAdditionsAmbience;

import java.util.Optional;
import java.util.OptionalInt;

public class Class9265 {
   private OptionalInt field42612 = OptionalInt.empty();
   private OptionalInt field42613 = OptionalInt.empty();
   private OptionalInt field42614 = OptionalInt.empty();
   private OptionalInt field42615 = OptionalInt.empty();
   private Optional<Integer> field42616 = Optional.<Integer>empty();
   private Optional<Integer> field42617 = Optional.<Integer>empty();
   private BiomeAmbience.GrassColorModifier field42618 = BiomeAmbience.GrassColorModifier.field230;
   private Optional<ParticleEffectAmbience> field42619 = Optional.<ParticleEffectAmbience>empty();
   private Optional<SoundEvent> field42620 = Optional.<SoundEvent>empty();
   private Optional<MoodSoundAmbience> field42621 = Optional.<MoodSoundAmbience>empty();
   private Optional<SoundAdditionsAmbience> field42622 = Optional.<SoundAdditionsAmbience>empty();
   private Optional<BackgroundMusicSelector> field42623 = Optional.<BackgroundMusicSelector>empty();

   public Class9265 method34868(int var1) {
      this.field42612 = OptionalInt.of(var1);
      return this;
   }

   public Class9265 method34869(int var1) {
      this.field42613 = OptionalInt.of(var1);
      return this;
   }

   public Class9265 method34870(int var1) {
      this.field42614 = OptionalInt.of(var1);
      return this;
   }

   public Class9265 method34871(int var1) {
      this.field42615 = OptionalInt.of(var1);
      return this;
   }

   public Class9265 method34872(int var1) {
      this.field42616 = Optional.<Integer>of(var1);
      return this;
   }

   public Class9265 method34873(int var1) {
      this.field42617 = Optional.<Integer>of(var1);
      return this;
   }

   public Class9265 method34874(BiomeAmbience.GrassColorModifier var1) {
      this.field42618 = var1;
      return this;
   }

   public Class9265 method34875(ParticleEffectAmbience var1) {
      this.field42619 = Optional.<ParticleEffectAmbience>of(var1);
      return this;
   }

   public Class9265 method34876(SoundEvent var1) {
      this.field42620 = Optional.<SoundEvent>of(var1);
      return this;
   }

   public Class9265 method34877(MoodSoundAmbience var1) {
      this.field42621 = Optional.<MoodSoundAmbience>of(var1);
      return this;
   }

   public Class9265 method34878(SoundAdditionsAmbience var1) {
      this.field42622 = Optional.<SoundAdditionsAmbience>of(var1);
      return this;
   }

   public Class9265 method34879(BackgroundMusicSelector var1) {
      this.field42623 = Optional.<BackgroundMusicSelector>of(var1);
      return this;
   }

   public BiomeAmbience method34880() {
      return new BiomeAmbience(
         this.field42612.orElseThrow(() -> new IllegalStateException("Missing 'fog' color.")),
         this.field42613.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")),
         this.field42614.orElseThrow(() -> new IllegalStateException("Missing 'water fog' color.")),
         this.field42615.orElseThrow(() -> new IllegalStateException("Missing 'sky' color.")),
         this.field42616,
         this.field42617,
         this.field42618,
         this.field42619,
         this.field42620,
         this.field42621,
         this.field42622,
         this.field42623
      );
   }
}

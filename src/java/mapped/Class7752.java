package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.SoundEvent;

import java.util.Optional;

public class Class7752 {
   public static final Codec<Class7752> field33278 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("fog_color").forGetter(var0x -> var0x.field33279),
               Codec.INT.fieldOf("water_color").forGetter(var0x -> var0x.field33280),
               Codec.INT.fieldOf("water_fog_color").forGetter(var0x -> var0x.field33281),
               Codec.INT.fieldOf("sky_color").forGetter(var0x -> var0x.field33282),
               Codec.INT.optionalFieldOf("foliage_color").forGetter(var0x -> var0x.field33283),
               Codec.INT.optionalFieldOf("grass_color").forGetter(var0x -> var0x.field33284),
               Class88.field234.optionalFieldOf("grass_color_modifier", Class88.field230).forGetter(var0x -> var0x.field33285),
               Class7737.field33229.optionalFieldOf("particle").forGetter(var0x -> var0x.field33286),
               SoundEvent.field43936.optionalFieldOf("ambient_sound").forGetter(var0x -> var0x.field33287),
               Class7959.field34223.optionalFieldOf("mood_sound").forGetter(var0x -> var0x.field33288),
               Class8217.field35292.optionalFieldOf("additions_sound").forGetter(var0x -> var0x.field33289),
               BackgroundMusicSelector.field19366.optionalFieldOf("music").forGetter(var0x -> var0x.field33290)
            )
            .apply(var0, Class7752::new)
   );
   private final int field33279;
   private final int field33280;
   private final int field33281;
   private final int field33282;
   private final Optional<Integer> field33283;
   private final Optional<Integer> field33284;
   private final Class88 field33285;
   private final Optional<Class7737> field33286;
   private final Optional<SoundEvent> field33287;
   private final Optional<Class7959> field33288;
   private final Optional<Class8217> field33289;
   private final Optional<BackgroundMusicSelector> field33290;

   public Class7752(
           int var1,
           int var2,
           int var3,
           int var4,
           Optional<Integer> var5,
           Optional<Integer> var6,
           Class88 var7,
           Optional<Class7737> var8,
           Optional<SoundEvent> var9,
           Optional<Class7959> var10,
           Optional<Class8217> var11,
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

   public int method25673() {
      return this.field33279;
   }

   public int method25674() {
      return this.field33280;
   }

   public int method25675() {
      return this.field33281;
   }

   public int method25676() {
      return this.field33282;
   }

   public Optional<Integer> method25677() {
      return this.field33283;
   }

   public Optional<Integer> method25678() {
      return this.field33284;
   }

   public Class88 method25679() {
      return this.field33285;
   }

   public Optional<Class7737> method25680() {
      return this.field33286;
   }

   public Optional<SoundEvent> method25681() {
      return this.field33287;
   }

   public Optional<Class7959> method25682() {
      return this.field33288;
   }

   public Optional<Class8217> method25683() {
      return this.field33289;
   }

   public Optional<BackgroundMusicSelector> method25684() {
      return this.field33290;
   }
}

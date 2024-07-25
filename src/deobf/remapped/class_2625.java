package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class class_2625 {
   public static final Codec<class_2625> field_12952 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.INT.fieldOf("fog_color").forGetter(var0x -> var0x.field_12950),
               Codec.INT.fieldOf("water_color").forGetter(var0x -> var0x.field_12945),
               Codec.INT.fieldOf("water_fog_color").forGetter(var0x -> var0x.field_12943),
               Codec.INT.fieldOf("sky_color").forGetter(var0x -> var0x.field_12941),
               Codec.INT.optionalFieldOf("foliage_color").forGetter(var0x -> var0x.field_12953),
               Codec.INT.optionalFieldOf("grass_color").forGetter(var0x -> var0x.field_12947),
               class_4184.field_20369.optionalFieldOf("grass_color_modifier", class_4184.field_20366).forGetter(var0x -> var0x.field_12951),
               class_2569.field_12722.optionalFieldOf("particle").forGetter(var0x -> var0x.field_12944),
               SoundEvent.field_43261.optionalFieldOf("ambient_sound").forGetter(var0x -> var0x.field_12942),
               class_3161.field_15713.optionalFieldOf("mood_sound").forGetter(var0x -> var0x.field_12940),
               class_3902.field_18965.optionalFieldOf("additions_sound").forGetter(var0x -> var0x.field_12948),
               class_75.field_117.optionalFieldOf("music").forGetter(var0x -> var0x.field_12949)
            )
            .apply(var0, class_2625::new)
   );
   private final int field_12950;
   private final int field_12945;
   private final int field_12943;
   private final int field_12941;
   private final Optional<Integer> field_12953;
   private final Optional<Integer> field_12947;
   private final class_4184 field_12951;
   private final Optional<class_2569> field_12944;
   private final Optional<SoundEvent> field_12942;
   private final Optional<class_3161> field_12940;
   private final Optional<class_3902> field_12948;
   private final Optional<class_75> field_12949;

   private class_2625(
      int var1,
      int var2,
      int var3,
      int var4,
      Optional<Integer> var5,
      Optional<Integer> var6,
      class_4184 var7,
      Optional<class_2569> var8,
      Optional<SoundEvent> var9,
      Optional<class_3161> var10,
      Optional<class_3902> var11,
      Optional<class_75> var12
   ) {
      this.field_12950 = var1;
      this.field_12945 = var2;
      this.field_12943 = var3;
      this.field_12941 = var4;
      this.field_12953 = var5;
      this.field_12947 = var6;
      this.field_12951 = var7;
      this.field_12944 = var8;
      this.field_12942 = var9;
      this.field_12940 = var10;
      this.field_12948 = var11;
      this.field_12949 = var12;
   }

   public int method_11888() {
      return this.field_12950;
   }

   public int method_11895() {
      return this.field_12945;
   }

   public int method_11896() {
      return this.field_12943;
   }

   public int method_11886() {
      return this.field_12941;
   }

   public Optional<Integer> method_11893() {
      return this.field_12953;
   }

   public Optional<Integer> method_11897() {
      return this.field_12947;
   }

   public class_4184 method_11892() {
      return this.field_12951;
   }

   public Optional<class_2569> method_11891() {
      return this.field_12944;
   }

   public Optional<SoundEvent> method_11894() {
      return this.field_12942;
   }

   public Optional<class_3161> method_11887() {
      return this.field_12940;
   }

   public Optional<class_3902> method_11898() {
      return this.field_12948;
   }

   public Optional<class_75> method_11890() {
      return this.field_12949;
   }
}
